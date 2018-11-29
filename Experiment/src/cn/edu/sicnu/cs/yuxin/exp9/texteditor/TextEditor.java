package cn.edu.sicnu.cs.yuxin.exp9.texteditor;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;

public class TextEditor {
    private JFileChooser fileChooser;

    public TextEditor() {
        //创建文件选择器，设置文件描述和后缀
        fileChooser = new JFileChooser();
        FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("文本文档", "txt");
        fileChooser.setFileFilter(fileFilter);

        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        //设置label显示文本
        filePathLabel.setText("文件：");

        //设置按钮显示文本
        openButton.setText("打开");
        //添加按钮监视器
        openButton.addActionListener(this::openActionPerformed);

        //设置按钮显示文本
        saveButton.setText("保存");
        //添加按钮监视器
        saveButton.addActionListener(this::saveActionPerformed);
    }

    public void openActionPerformed(ActionEvent actionEvent) {
        try {
            // 设置文件路径和文件名
            String filename = filePathField.getText();
            if (filename.equals("")) {
                if (fileChooser.showOpenDialog(this.mainPanel) == JFileChooser.APPROVE_OPTION) {
                    filename = fileChooser.getSelectedFile().getAbsolutePath();
                } else {
                    return;
                }
            }
            //判断文件是否已存在
            File file = new File(filename);
            if (!file.exists()) {
                throw new Exception("文件不存在！");
            }
            //判断是否文件
            if (!file.isFile()) {
                throw new Exception("不是一个文件！");
            }
            //创建读取文件对象
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            //读取文件内所有内容
            String textBuffer = "";
            String textContent = "";
            while ((textBuffer = bufferedReader.readLine()) != null) {
                textContent += textBuffer + "\n";
            }
            //将文件内的所有内容写到文本域内
            textArea.setText(textContent);
            //关闭文件对象
            bufferedReader.close();
            //textField显示文件路径
            filePathField.setText(filename);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this.mainPanel, e.getMessage());
        }
    }

    public void saveActionPerformed(ActionEvent actionEvent) {
        try {
            //设置文件名和路径
            String fileName = filePathField.getText();
            if (fileName.equals("")) {
                if (fileChooser.showOpenDialog(this.mainPanel) == JFileChooser.APPROVE_OPTION) {
                    fileName = fileChooser.getSelectedFile().getAbsolutePath();
                } else {
                    return;
                }
            }
            //获取文本框内容
            String textContent = textArea.getText();
            if (textContent.equals("")) {
                throw new Exception("请输入内容");
            }
            //换行符替换为\r\n
            textContent = textContent.replace("\n", "\r\n");
            //创建写文件对象
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
            //写入到文件
            bufferedWriter.write(textContent);
            //关闭写文件对象
            bufferedWriter.close();
            //textField显示文件路径
            filePathField.setText(fileName);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this.mainPanel, e.getMessage());
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("TextEditor");
        frame.setContentPane(new TextEditor().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setMaximumSize(Toolkit.getDefaultToolkit().getScreenSize());
    }

    private JButton openButton;
    private JLabel filePathLabel;
    private JTextField filePathField;
    private JTextArea textArea;
    private JButton saveButton;
    private JPanel mainPanel;
}
