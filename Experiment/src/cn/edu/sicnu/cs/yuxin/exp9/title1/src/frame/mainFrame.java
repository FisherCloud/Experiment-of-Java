package cn.edu.sicnu.cs.yuxin.exp9.title1.src.frame;

import cn.edu.sicnu.cs.yuxin.exp9.title1.src.module.NovelReader;

import javax.swing.*;

public class mainFrame extends JFrame {
    public mainFrame() {
        add(new NovelReader());
        pack();
    }

    private void add(NovelReader novelReader) {
    }
}
