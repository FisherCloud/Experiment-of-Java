package cn.edu.sicnu.cs.yuxin.exp9.title1.src.Test;

import cn.edu.sicnu.cs.yuxin.exp9.title1.src.frame.mainFrame;

import javax.swing.*;
import java.awt.*;

public class Reader {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            JFrame frame = new mainFrame();
            frame.setTitle("test");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
