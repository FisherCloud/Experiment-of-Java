package cn.edu.sicnu.cs.yuxin.exp8.infosytem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class mainFrame extends JFrame {
    public static void main(String[] args) {
        new mainFrame();
    }

    public mainFrame() {
        int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
        int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;

        idCodeLabel.setText("学校代码：");
        nameLabel.setText("学校名称：");

        setTitle("Information System");
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);//屏幕居中
        setVisible(true);
        setMinimumSize(new Dimension(screenWidth / 3 - 100, screenHeight / 3 - 50));
        setMaximumSize(new Dimension(screenWidth, screenHeight));
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                submitButtonActionPerformed(actionEvent);
            }
        });
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                searchButtonActionPerformed(actionEvent);
            }
        });
    }

    public void submitButtonActionPerformed(ActionEvent actionEvent) {
        String idCode = idCodeTextField.getText();
        String name = nameTextField.getText();
        if (idCode.equals("")) {
            JOptionPane.showMessageDialog(this, "请输入学校编号!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (idCode.length() > 10) {
            JOptionPane.showMessageDialog(this, "学校代码不合法!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (name.equals("")) {
            JOptionPane.showMessageDialog(this, "请输入学校名称!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        School school = new School(idCode.toCharArray(), name);
        SchoolDatabase database = new SchoolDatabase();
        if (database.connect()) {
            if (database.insert(school)) {
                JOptionPane.showMessageDialog(this, "添加成功！");
            } else {
                JOptionPane.showMessageDialog(this, "添加失败！");
                return;
            }
        } else {
            JOptionPane.showMessageDialog(this, "数据库连接失败！", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        database.close();
    }

    public void searchButtonActionPerformed(ActionEvent actionEvent) {
        ArrayList<School> schools;
        SchoolDatabase database = new SchoolDatabase();
        if (database.connect()) {
            schools = database.getAll();
            if (schools.isEmpty()) {
                JOptionPane.showMessageDialog(this, "数据库为空！");
                return;
            }
            for (School school : schools) {
                System.out.println(school.toString());
            }
        } else {
            JOptionPane.showMessageDialog(this, "数据库连接失败！", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        database.close();
    }

    private JPanel mainPanel;
    private JTextField idCodeTextField;
    private JTextField nameTextField;
    private JButton submitButton;
    private JLabel idCodeLabel;
    private JLabel nameLabel;
    private JTree infoTree;
    private JButton searchButton;
}
