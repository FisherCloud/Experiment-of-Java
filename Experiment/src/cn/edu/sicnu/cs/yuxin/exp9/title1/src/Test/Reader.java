package cn.edu.sicnu.cs.yuxin.exp9.title1.src.Test;

import cn.edu.sicnu.cs.yuxin.exp9.title1.src.frame.mainFrame;

import javax.swing.*;
import java.awt.*;

public class Reader {
    public static void main(String[] args) {
        //主视图
        JFrame mainframe = new JFrame("Reader");
        mainframe.setVisible(true);
        mainframe.setSize(800, 500);
        mainframe.setBackground(Color.white);
        mainframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //容器
        Container container = mainframe.getContentPane();       //创建容器到mainframe
        container.setLayout(null);

        //统计字数按钮
        JButton countWords = new JButton();
        countWords.setBounds(610 + 10, 10, 170, 50);
        countWords.setText("统计字数");
        countWords.setFont(new Font("宋体", Font.BOLD, 20));
        container.add(countWords);

/*
        //文本域
        JTextArea textArea = new JTextArea();                   //创建文本域
        textArea.setBounds(10, 10, mainframe.getSize().width - countWords.getBounds().width - 20, mainframe.getSize().height - 100);   //设置控件位置，大小
        textArea.setOpaque(true);                               //设置不透明
        textArea.setLineWrap(true);                             //设置自动换行
        container.add(textArea);                                //添加到容器
*/
        //标记位置按钮
        JButton markPosition = new JButton();
        markPosition.setBounds(countWords.getBounds().x, countWords.getBounds().y + countWords.getBounds().height + 10, countWords.getBounds().width, countWords.getBounds().height);
        markPosition.setText("标记位置");
        markPosition.setFont(new Font("宋体", Font.BOLD, 20));
        container.add(markPosition);

        //章节下拉框
        JComboBox<String> chapterComboBox = new JComboBox<String>();
        chapterComboBox.setBounds(countWords.getBounds().x, markPosition.getBounds().y + 200, countWords.getBounds().width, countWords.getBounds().height);
        chapterComboBox.addItem("第一章");
        chapterComboBox.setFont(new Font("宋体", Font.BOLD, 20));
        container.add(chapterComboBox);

        //跳转按钮
        JButton jump = new JButton();
        jump.setBounds(countWords.getBounds().x, chapterComboBox.getBounds().y + chapterComboBox.getBounds().height + 10, countWords.getBounds().width, countWords.getBounds().height);
        jump.setText("跳转");
        jump.setFont(new Font("宋体", Font.BOLD, 20));
        container.add(jump);


    }
}
