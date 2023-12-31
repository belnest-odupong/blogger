/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import backend.backend;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import backend.*;

/**
 *
 * @author svc_mypc
 */
public class blogger extends javax.swing.JFrame {

    String demo = "./preview/preview.html";

    /**
     * Creates new form blogger
     */
    public blogger() throws IOException {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        BlogTool_Label = new javax.swing.JLabel();
        Description_Label = new javax.swing.JLabel();
        Name_Label = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        WebPageName_Field = new javax.swing.JTextField();
        Content_ScrollPane = new javax.swing.JScrollPane();
        Content_TextPane = new javax.swing.JTextPane();
        PostTitle_Label = new javax.swing.JLabel();
        PostTitle_Field = new javax.swing.JTextField();
        WindowTitle_Label = new javax.swing.JLabel();
        Sourcecode_ScrollPane = new javax.swing.JScrollPane();
        Sourcecode_TextArea = new javax.swing.JTextArea();
        Content_Label = new javax.swing.JLabel();
        SourceCode_Label = new javax.swing.JLabel();
        WindowTitle_Field = new javax.swing.JTextField();
        CopySourceCode_Button = new javax.swing.JButton();
        UPTAWT_Checkbox = new javax.swing.JCheckBox();
        OpenPreview_Button = new javax.swing.JButton();
        WebPageName_Label = new javax.swing.JLabel();
        Hyperlink_Label = new javax.swing.JLabel();
        Hyperlink_Scrollpane = new javax.swing.JScrollPane();
        Hyperlink_TextArea = new javax.swing.JTextArea();
        CopyHyperlink_Button = new javax.swing.JButton();
        MenuBar = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        Open = new javax.swing.JMenuItem();
        Save = new javax.swing.JMenuItem();
        SaveTo = new javax.swing.JMenuItem();
        Export = new javax.swing.JMenuItem();
        ExportTo  = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BlogTool_Label.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        BlogTool_Label.setText("blog tool.");

        Description_Label.setText("simplifies generating blog posts so I don't have to. and I can put it on my portfolio.");

        Name_Label.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        Name_Label.setText("by belnest odupong");

        WebPageName_Field.setText("webpage");
        WebPageName_Field.addActionListener(webpageFieldUpdated ->{
            generateHyperlink();
        });

        Content_TextPane.setText("This is a blog post.");
        Content_TextPane.setAutoscrolls(false);
        Content_ScrollPane.setViewportView(Content_TextPane);

        Content_TextPane.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                generateSourceCode();
            }
            public void focusLost(FocusEvent e) {
                generateSourceCode();
            }

        });

        PostTitle_Label.setText("Post Title");

        PostTitle_Field.setText("Blogpost");
        PostTitle_Field.addActionListener(blogpostFieldUpdated ->{
            checkCongruence();
            generateHyperlink();
            generateSourceCode();
        });

        WindowTitle_Label.setText("Window Title");

        Sourcecode_TextArea.setEditable(false);
        Sourcecode_TextArea.setColumns(20);
        Sourcecode_TextArea.setRows(5);
        Sourcecode_TextArea.setText("<html lang=\"en\">\n  <head>\n    <meta charset=\"utf-8\" />\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n    <link rel=\"icon\" href=\"ICON\" />\n    <title>Blogpost</title>\n\n    <link rel=\"stylesheet\" href=\"/style.css\" />\n    <main>\n      <h1>\n        Blogpost\n      </h1>\n      <fade>{DATE}</fade>\n      <p>\n        This is a blog post.\n      </p>\n    </main>\n    <sidebox>\n      <p>\n        <a href=\"/home.html\">home</a><br />\n        <a href=\"/blog.html\">back to blog</a><br />\n        <a href=\"/contact.html\">contact</a><br>\n        <a href=\"/changelog.html\">changelog</a>\n      </p>\n      <p>\n        :)\n      </p>\n    </sidebox>\n  </head>\n</html>\n");
        Sourcecode_ScrollPane.setViewportView(Sourcecode_TextArea);

        Content_Label.setText("Content:");

        SourceCode_Label.setText("Source Code");

        WindowTitle_Field.setText("Blogpost");

        CopySourceCode_Button.setText("Copy Source Code");
        CopySourceCode_Button.addActionListener(clicked ->{
            Toolkit.getDefaultToolkit()
                    .getSystemClipboard()
                    .setContents(new StringSelection(Sourcecode_TextArea.getText()), null);
        });

        UPTAWT_Checkbox.setText("Use Post Title as Window Title");
        UPTAWT_Checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCongruence();
                generateSourceCode();
            }
        });

        OpenPreview_Button.setText("Open Preview in Browser");
        OpenPreview_Button.addActionListener(clicked ->{
            backend.saveDemo(demo, Sourcecode_TextArea.getText().replaceAll("/style.css", "./preview_files/style.css"));
            try {
                Desktop.getDesktop().open(new File(demo));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        WebPageName_Label.setText("Webpage Name");

        Hyperlink_Label.setText("Hyperlink Code");

        Hyperlink_Scrollpane.setAutoscrolls(true);
        Hyperlink_Scrollpane.setHorizontalScrollBar(null);
        Hyperlink_Scrollpane.setWheelScrollingEnabled(false);

        Hyperlink_TextArea.setColumns(20);
        Hyperlink_TextArea.setRows(5);
        Hyperlink_TextArea.setText("<a href=\"blogposts/webpage.html\">Blogpost</a><br />");
        Hyperlink_Scrollpane.setViewportView(Hyperlink_TextArea);

        CopyHyperlink_Button.setText("Copy Hyperlink");
        CopyHyperlink_Button.addActionListener(clicked ->{
            Toolkit.getDefaultToolkit()
                    .getSystemClipboard()
                    .setContents(new StringSelection(Hyperlink_TextArea.getText()), null);
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addComponent(WindowTitle_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(UPTAWT_Checkbox, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(Content_ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(PostTitle_Label)
                                                        .addComponent(Content_Label))
                                                .addGap(18, 18, 18)
                                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(SourceCode_Label)
                                                        .addComponent(WebPageName_Label)
                                                        .addComponent(Sourcecode_ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                                .addComponent(CopySourceCode_Button)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(OpenPreview_Button))))
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                                .addComponent(PostTitle_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(WebPageName_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(WindowTitle_Label))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(Hyperlink_Scrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                                .addComponent(Hyperlink_Label)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addComponent(CopyHyperlink_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(PostTitle_Label)
                                        .addComponent(WebPageName_Label)
                                        .addComponent(Hyperlink_Label))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(PostTitle_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(WebPageName_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(Hyperlink_Scrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(CopyHyperlink_Button)
                                        .addComponent(WindowTitle_Label))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(WindowTitle_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(UPTAWT_Checkbox))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Content_Label)
                                        .addComponent(SourceCode_Label))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Content_ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Sourcecode_ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(CopySourceCode_Button)
                                        .addComponent(OpenPreview_Button))
                                .addGap(9, 9, 9))
        );

        FileMenu.setText("File");
        MenuBar.add(FileMenu);

        setJMenuBar(MenuBar);

        Open.setText("Open");
        FileMenu.add(Open);
        Open.addActionListener(clicked ->{
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
            FileNameExtensionFilter filter = new FileNameExtensionFilter("blog files", "blog");
            fileChooser.setFileFilter(filter);
            int result = fileChooser.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                loadBlogpost(backend.loadBlogpost(selectedFile));
            }
        });

        Save.setText("Save");
        FileMenu.add(Save);
        Save.addActionListener(clicked ->{
            if(saveFilepath.isBlank()){
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
                FileNameExtensionFilter filter = new FileNameExtensionFilter("blog files", "blog");
                fileChooser.setFileFilter(filter);
                int result = fileChooser.showSaveDialog(this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    backend.saveBlogpost(selectedFile.getAbsolutePath() + ".blog", generateBlogpost());
                    saveFilepath = selectedFile.getAbsolutePath();
                }
            } else {
                backend.saveBlogpost(saveFilepath, generateBlogpost());
            }
        });

        SaveTo.setText("Save To...");
        FileMenu.add(SaveTo);
        SaveTo.addActionListener(clicked ->{
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
            FileNameExtensionFilter filter = new FileNameExtensionFilter("blog files", "blog");
            fileChooser.setFileFilter(filter);
            int result = fileChooser.showSaveDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                backend.saveBlogpost(selectedFile.getAbsolutePath() + ".blog", generateBlogpost());
                saveFilepath = selectedFile.getAbsolutePath();
            }
        });

        Export.setText("Export");
        FileMenu.add(Export);
        Export.addActionListener(clicked ->{
            if(exportFilepath.isBlank()){
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
                FileNameExtensionFilter filter = new FileNameExtensionFilter("HTML Files", "html");
                fileChooser.setFileFilter(filter);
                int result = fileChooser.showSaveDialog(this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    backend.saveDemo(selectedFile.getAbsolutePath() + ".html", Sourcecode_TextArea.getText());
                    exportFilepath = selectedFile.getAbsolutePath();
                }
            } else {
                backend.saveDemo(exportFilepath, Sourcecode_TextArea.getText());
            }
        });

        ExportTo.setText("Export To...");
        FileMenu.add(ExportTo);
        ExportTo.addActionListener(clicked ->{
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
            FileNameExtensionFilter filter = new FileNameExtensionFilter("HTML Files", "html");
            fileChooser.setFileFilter(filter);
            int result = fileChooser.showSaveDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                backend.saveDemo(selectedFile.getAbsolutePath() + ".html", Sourcecode_TextArea.getText());
                exportFilepath = selectedFile.getAbsolutePath();
            }
        });



        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(BlogTool_Label)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(Name_Label))
                                                .addComponent(Description_Label))
                                        .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(BlogTool_Label)
                                        .addComponent(Name_Label))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Description_Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>




    public JTextPane getContent_TextPane() {
        return Content_TextPane;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            UIManager.setLookAndFeel( new com.formdev.flatlaf.themes.FlatMacLightLaf());
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new blogger().setVisible(true);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton CopyHyperlink_Button;
    private javax.swing.JMenu FileMenu;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JTextField PostTitle_Field;
    private javax.swing.JLabel PostTitle_Label;
    private javax.swing.JTextField WebPageName_Field;
    private javax.swing.JLabel WebPageName_Label;
    private javax.swing.JTextField WindowTitle_Field;
    private javax.swing.JLabel WindowTitle_Label;
    private javax.swing.JLabel BlogTool_Label;
    private javax.swing.JScrollPane Content_ScrollPane;
    private javax.swing.JTextPane Content_TextPane;
    private javax.swing.JLabel Description_Label;
    private javax.swing.JLabel Hyperlink_Label;
    private javax.swing.JButton CopySourceCode_Button;
    private javax.swing.JButton OpenPreview_Button;
    private javax.swing.JLabel SourceCode_Label;
    private javax.swing.JScrollPane Hyperlink_Scrollpane;
    private javax.swing.JTextArea Hyperlink_TextArea;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel Name_Label;
    private javax.swing.JLabel Content_Label;
    private javax.swing.JScrollPane Sourcecode_ScrollPane;
    private javax.swing.JTextArea Sourcecode_TextArea;
    private javax.swing.JCheckBox UPTAWT_Checkbox;
    private javax.swing.JMenuItem Open;
    private javax.swing.JMenuItem Save;
    private javax.swing.JMenuItem SaveTo;
    private javax.swing.JMenuItem Export;
    private javax.swing.JMenuItem ExportTo;
    // End of variables declaration

    public void generateSourceCode(){
        String sourcecode = backend.generateSourceCode(PostTitle_Field.getText(), WindowTitle_Field.getText(), Content_TextPane.getText());
        Sourcecode_TextArea.setText(sourcecode);
    }

    public void checkCongruence(){
        if(UPTAWT_Checkbox.isSelected()){
            WindowTitle_Field.setText(PostTitle_Field.getText());
            WindowTitle_Field.disable();
        } else {
            WindowTitle_Field.enable();
        }
    }

    public void generateHyperlink(){
        String hyperlink = backend.generateHyperlink(WebPageName_Field.getText(), PostTitle_Field.getText());
        Hyperlink_TextArea.setText(hyperlink);
    }

    public void loadBlogpost(blogpost b){
        PostTitle_Field.setText(b.title);
        WebPageName_Field.setText(b.webpageTitle);
        WindowTitle_Field.setText(b.windowTitle);
        Content_TextPane.setText(b.content);
        UPTAWT_Checkbox.setSelected(b.windowTitleIsPostTitle);
        checkCongruence();
        generateHyperlink();
        generateSourceCode();
    }

    public blogpost generateBlogpost(){
        return new blogpost(PostTitle_Field.getText(), WebPageName_Field.getText(), WindowTitle_Field.getText(), Content_TextPane.getText(), UPTAWT_Checkbox.isSelected());
    }

    String saveFilepath = "";
    String exportFilepath = "";
}
