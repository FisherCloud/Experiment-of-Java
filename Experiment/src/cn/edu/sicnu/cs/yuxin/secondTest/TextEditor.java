package cn.edu.sicnu.cs.yuxin.secondTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class TextEditor extends JFrame implements ActionListener {
    public JButton openButton = null;
    public Container container = null;
    public JLabel showLabel = null;
    public JTextPane textPane = null;
    public JTextArea textArea = null;
    public JButton saveButton = null;
    public Font font = new Font("宋体", Font.BOLD, 20);
    public File file = null;
    public BufferedReader bufferedReader = null;
    public BufferedWriter bufferedWriter = null;
    public String textList = "";

    public TextEditor() {
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 400);

        container = this.getContentPane();
        container.setLayout(null);

        this.showLabel = new JLabel();
        this.showLabel.setBounds(10, 10, 80, 40);
        this.showLabel.setText("文件：");
        this.showLabel.setFont(font);
        this.add(this.showLabel);

        this.openButton = new JButton();
        this.openButton.setBounds(480, 10, 100, 40);
        this.openButton.setText("打开");
        this.openButton.setFont(font);
        this.add(this.openButton);

        this.textPane = new JTextPane();
        this.textPane.setBounds(80, 10, this.openButton.getBounds().x - this.showLabel.getBounds().width - 20, 40);
        this.textPane.setFont(new Font("宋体", Font.BOLD, 16));
        this.add(this.textPane);

        this.textArea = new JTextArea();
        this.textArea.setBounds(10, 60, 570, 250);
        this.textArea.setLineWrap(true);
        this.textArea.setWrapStyleWord(true);
        this.textArea.setFont(new Font("宋体", Font.BOLD, 16));
        this.add(textArea);

        this.saveButton = new JButton();
        this.saveButton.setBounds(480, 320, 100, 40);
        this.saveButton.setText("保存");
        this.saveButton.setFont(font);
        this.add(this.saveButton);

        this.openButton.addActionListener(this);
        this.saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.textArea.setText("");
        JFileChooser fileChooser = new JFileChooser();
        if (!this.textPane.getText().isEmpty()) {
            this.file = new File(this.textPane.getText());
            if (!this.file.exists()) {
                int n = JOptionPane.showConfirmDialog(this, "不存在这个文件或者目录，是否从文件夹选择？", "提示", JOptionPane.YES_NO_CANCEL_OPTION);
                this.textPane.setText("");
                if (n == 1) {
                    return;
                }
            }
        } else {
            fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            fileChooser.showDialog(new JLabel(), "选择");
            this.file = fileChooser.getSelectedFile();
        }
        if (file.isDirectory()) {
            //System.out.println("文件夹：" + this.file.getAbsolutePath());
            JOptionPane.showMessageDialog(this, "请选择普通文件！", "警告！", JOptionPane.WARNING_MESSAGE);
        } else {
            //System.out.println("文件：" + this.file.getAbsolutePath());
            this.textPane.setText(this.file.getAbsolutePath());

            String textBuffer = "";
            try {
                this.bufferedReader = new BufferedReader(new FileReader(this.file));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            while (true) {
                try {
                    if ((textBuffer = this.bufferedReader.readLine()) == null) break;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                this.textList = this.textList + textBuffer + "\n";
            }
            this.textArea.setText(textList);
        }
        System.out.println(fileChooser.getSelectedFile().getName());
        try {
            this.bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        TextEditor textEditor = new TextEditor();
    }
}
