package compileride;

import java.awt.*;
import java.awt.event.*;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import javax.swing.*;
//import javax.swing.event.DocumentEvent;
//import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import  org.fife.ui.rtextarea.*;
import org.fife.ui.rsyntaxtextarea.*;


import grammar.DefPhaseSimpleJava;
import grammar.simpleJavaErrorListener;
import grammar.simpleJavaLexer;
import grammar.simpleJavaParser;

public class CompilerIDE extends JFrame implements ActionListener {

	private static final long serialVersionUID = 4650489160139037035L;
	
	private JTextPane console;
	StyledDocument consoleDoc;
	Style consoleStyle;
    private JMenuBar menuBar;
    private JMenu fileM, editM, viewM, runAsM;
    private JScrollPane scpane, scpane2;
    private JMenuItem exitI, cutI, copyI, pasteI, selectI, saveI, loadI, grammar1I;
    private JCheckBoxMenuItem showTreeI;
    private String pad;
    private JToolBar toolBar;
    private JFileChooser fc;
    private RSyntaxTextArea textArea;
    
    //private JTabbedPane tabbedPane;
    
    public static void main(String[] args) {
    	new CompilerIDE();
    }
    
    public CompilerIDE() {
        super("Compiler IDE");
        setSize(600, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container pane = getContentPane();
        pane.setLayout(new BorderLayout());
        
        textArea = new RSyntaxTextArea(20, 60);
        textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_JAVA);
        

        RTextScrollPane sp = new RTextScrollPane(textArea);
        
        
        pad = " ";
        console = new JTextPane();
        menuBar = new JMenuBar();
        fileM = new JMenu("File");
        editM = new JMenu("Edit");
        runAsM = new JMenu("Run As");
        viewM = new JMenu("View");
        scpane = new JScrollPane(sp);
        scpane2 = new JScrollPane(console);
        exitI = new JMenuItem("Exit");
        cutI = new JMenuItem("Cut");
        copyI = new JMenuItem("Copy");
        pasteI = new JMenuItem("Paste");
        selectI = new JMenuItem("Select All");
        saveI = new JMenuItem("Save");
        loadI = new JMenuItem("Load");
        grammar1I = new JMenuItem("Simple Java");
        showTreeI = new JCheckBoxMenuItem("Show Parser Tree");
        toolBar = new JToolBar();
        fc = new JFileChooser();
        
     //   textArea.getDocument().putProperty("caller", editor);
        
//        DocumentListener myDocumentListener = new DocumentListener(){

//			@Override
//			public void insertUpdate(DocumentEvent e) {
//				colorText(e);
//			}
//
//			@Override
//			public void removeUpdate(DocumentEvent e) {
//				colorText(e);
//			}
//
//			@Override
//			public void changedUpdate(DocumentEvent e) {
//				colorText(e);
//			}
//
//			public void colorText(DocumentEvent e){
//				JTextPane textPane = (JTextPane) e.getDocument().getProperty("caller");
//				if(textPane != null){
//					String text = textPane.getText();
//				}
//			}
//        	
//        };
//        
        	
//        	editor.getDocument().addDocumentListener(myDocumentListener);
        
        console.setEditable(false);
        console.setText("Results:\n\n");
        
        consoleDoc = console.getStyledDocument();
        consoleStyle = console.addStyle("consoleStyle", null);
        StyleConstants.setForeground(consoleStyle, Color.BLACK);
        
        scpane2.setPreferredSize(new Dimension(600,200));

        setJMenuBar(menuBar);
        menuBar.add(fileM);
        menuBar.add(editM);
        menuBar.add(runAsM);
        menuBar.add(viewM);

        fileM.add(saveI);
        fileM.add(loadI);
        fileM.add(exitI);

        editM.add(cutI);
        editM.add(copyI);
        editM.add(pasteI);
        editM.add(selectI);
        
        runAsM.add(grammar1I);
        
        showTreeI.setEnabled(true);
        showTreeI.setSelected(true);
        viewM.add(showTreeI);
        

    
        saveI.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        loadI.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        cutI.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        copyI.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        pasteI.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        selectI.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        grammar1I.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        
        
        
        pane.add(scpane, BorderLayout.CENTER);
        pane.add(toolBar, BorderLayout.SOUTH);
        pane.add(scpane2, BorderLayout.PAGE_END);
        
        saveI.addActionListener(this);
        loadI.addActionListener(this);
        exitI.addActionListener(this);
        cutI.addActionListener(this);
        copyI.addActionListener(this);
        pasteI.addActionListener(this);
        selectI.addActionListener(this);
        grammar1I.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JMenuItem choice = (JMenuItem) e.getSource();
        
        
        if (choice == loadI) {
        	 loadTextFromFile();
        } else if (choice == saveI) {
            saveToFile();
        } else if (choice == exitI) {
            System.exit(0);
        } else if (choice == cutI) {
            pad = textArea.getSelectedText();
           textArea.replaceSelection("");
        } else if (choice == copyI) {
            pad = textArea.getSelectedText();
        } else if (choice == pasteI) {  
            try {
				textArea.getDocument().insertString(textArea.getCaretPosition(), pad, null);
			} catch (BadLocationException e1) {
				printError(e1.toString());
			}
        } else if (choice == selectI) {
            textArea.selectAll();
        } else if (choice == grammar1I) {
        	console.setText("Results:\n\n");
        	runAsSimpleJava();
        }
    }
    
    public void setText(String content) {
    	textArea.setText(content);
    }
    
    public void loadTextFromFile() {
    	int returnVal = fc.showOpenDialog(CompilerIDE.this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            String s, ext;
			try {
				ext = getExtension(file);
				if(ext.equals("txt")){
					s = new String(Files.readAllBytes(file.toPath()));
					setText(s);
				} else{
	    			printError("Arquivo não suportado. Utilize um arquivo com extensão \".txt\"\n");
	    		}
			} catch (IOException e1) {
				printError(e1.toString());
			}  
        }
    }
    
    public void saveToFile() {
    	int returnVal = fc.showSaveDialog(CompilerIDE.this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
        	try {
				FileWriter fw = new FileWriter(fc.getSelectedFile());
	            fw.write(getText());
	            fw.close();
            } catch (Exception ex) {
            	printError(ex.toString());
            }
        }
    }
    
    public static String getExtension(File f) {
        String ext = null;
        String s = f.getName();
        int i = s.lastIndexOf('.');

        if (i > 0 &&  i < s.length() - 1) {
            ext = s.substring(i+1).toLowerCase();
        }
        return ext;
    }
    
    public String getText() {
    	return textArea.getText();
    }
    
    public void printResults(String content) {
    	try {
        	StyleConstants.setForeground(consoleStyle, Color.BLACK);
			consoleDoc.insertString(consoleDoc.getLength(), content,consoleStyle);
		} catch (BadLocationException e) {
			printError(e.toString());
		}
    }
    
    public void printError(String content) {
        try {
        	content = content + '\n';
        	StyleConstants.setForeground(consoleStyle, Color.RED);
			consoleDoc.insertString(consoleDoc.getLength(), content,consoleStyle);
		} catch (BadLocationException e) {
			printError(e.toString());
		}
    }
    
    public void runAsSimpleJava() {
    	InputStream is = new ByteArrayInputStream(getText().getBytes(StandardCharsets.UTF_8));
        ANTLRInputStream input;
		try {
			input = new ANTLRInputStream(is);
			
			//Lexico
	        simpleJavaLexer lexer = new simpleJavaLexer(input);
	        CommonTokenStream tokens = new CommonTokenStream(lexer);
	        simpleJavaParser parser = new simpleJavaParser(tokens);
	        parser.removeErrorListeners();
	        parser.addErrorListener(new simpleJavaErrorListener(this));
	        ParseTree tree = parser.prog();
	        printResults("Done.\n\n");
	        
	        //Listener
	        ParseTreeWalker walker = new ParseTreeWalker();
	        //simpleJavaActions extractor = new simpleJavaActions(this, parser);
	        //walker.walk(extractor, tree);
	        
	        DefPhaseSimpleJava def = new DefPhaseSimpleJava(this, parser);
	        walker.walk(def, tree);
	        if(showTreeI.isSelected()){
		        printResults("Parse Tree:\n\n");
		        printResults(tree.toStringTree(parser));
	        }
		} catch (IOException e) {
			printError(e.toString());
		}
    }
}
