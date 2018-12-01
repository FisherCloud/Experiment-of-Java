package cn.edu.sicnu.cs.yuxin.exp9.secondTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class TextEditor extends JFrame {
    private JTextPane textPane;
    private JTextArea textArea;
    private JFileChooser fileChooser;

    public TextEditor() {
        fileChooser = new JFileChooser();

        Container container = this.getContentPane();
        container.setLayout(null);

        JLabel showLabel = new JLabel();
        showLabel.setBounds(10, 10, 80, 40);
        showLabel.setText("文件：");
        showLabel.setFont(new Font("宋体", Font.BOLD, 20));
        container.add(showLabel);

        JButton openButton = new JButton();
        openButton.setBounds(480, 10, 100, 40);
        openButton.setText("打开");
        openButton.setFont(new Font("宋体", Font.BOLD, 20));
        container.add(openButton);

        textPane = new JTextPane();
        textPane.setBounds(80, 10, openButton.getBounds().x - showLabel.getBounds().width - 20, 40);
        textPane.setFont(new Font("宋体", Font.BOLD, 16));
        container.add(this.textPane);

        textArea = new JTextArea();
        textArea.setBounds(10, 60, 570, 250);
        textArea.setColumns(10);
        textArea.setRows(5);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setFont(new Font("宋体", Font.BOLD, 16));
        container.add(textArea);

//        JScrollPane scrollPane = new JScrollPane(textArea);
//        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
//        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
//        //scrollPane.setViewportView(textArea);
//        container.add(scrollPane);

        JButton saveButton = new JButton();
        saveButton.setBounds(480, 320, 100, 40);
        saveButton.setText("保存");
        saveButton.setFont(new Font("宋体", Font.BOLD, 20));
        container.add(saveButton);

        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                btnOpenActionPerformed(actionEvent);
            }
        });
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                btnSaveActionPerformed(actionEvent);
            }
        });

        sizeWindowOnScreen(this, 0.6, 0.6);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
    }

    private void sizeWindowOnScreen(TextEditor textEditor, double widthRate,
                                    double heightRate) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        textEditor.setSize(new Dimension((int) (screenSize.width * widthRate),
                (int) (screenSize.height * heightRate)));

    }

    public void btnOpenActionPerformed(ActionEvent actionEvent) {
        try {
            File file;
            String fileName = textPane.getText();
            if (fileName.equals("")) {
                fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
                fileChooser.showDialog(new JLabel(), "选择");
                fileName = fileChooser.getSelectedFile().getAbsolutePath();
            }
            file = new File(fileName);
            if (!file.exists()) {
                JOptionPane.showMessageDialog(this, "文件不存在！");
                return;
            }
            if (!file.isFile()) {
                JOptionPane.showMessageDialog(this, "这不是一个文件");
                return;
            }
            String textContent = "";
            String textBuffer = "";
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while ((textBuffer = bufferedReader.readLine()) != null) {
                textContent += textBuffer + "\n";
            }
            bufferedReader.close();
            this.textArea.setText(textContent);
            textPane.setText(fileName);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    public void btnSaveActionPerformed(ActionEvent actionEvent) {
        try {
            File file;
            String fileName = textPane.getText();
            if (fileName.equals("")) {
                fileName = fileChooser.getSelectedFile().getAbsolutePath();
            }
            file = new File(fileName);
            String textContent = textArea.getText();
            if (textContent.equals("")) {
                JOptionPane.showMessageDialog(this, "请输入内容");
                return;
            }
            textContent = textContent.replace("\n", "\r\n");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write(textContent);
            bufferedWriter.close();
            textPane.setText(fileName);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    public static void main(String[] args) throws IOException {
        new TextEditor();
    }
}
