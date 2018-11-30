package cn.edu.sicnu.cs.yuxin.exp8.infosytem;

import javax.swing.*;

public class mainFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("mainFrame");
        frame.setContentPane(new mainFrame().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(400, 320);
    }

    private JPanel mainPanel;
    private JTextField idCodeTextField;
    private JTextField nameTextField;
    private JButton submitButton;
    private JLabel idCodeLabel;
    private JLabel nameLabel;
}
