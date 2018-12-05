package cn.edu.sicnu.cs.yuxin.exp8.infosytem;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class mainFrame extends JFrame {
    public static void main(String[] args) {
        new mainFrame();
    }

    public mainFrame() {
        infoNode = new DefaultMutableTreeNode("00_学院信息");
        infoTree.setModel(new DefaultTreeModel(infoNode));
        loadInfo();

        int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
        int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;

        idCodeLabel.setText("学院代码：");
        nameLabel.setText("学院名称：");

        setTitle("Information System");
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);//屏幕居中
        setVisible(true);
        setMinimumSize(new Dimension(screenWidth / 3 - 100, screenHeight / 3 - 50));
        setMaximumSize(new Dimension(screenWidth, screenHeight));
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                saveButtonActionPerformed(actionEvent);
            }
        });
    }

    public void loadInfo() {
        SchoolDatabase database = new SchoolDatabase();
        ArrayList<School> schools;
        if (database.connect()) {
            schools = database.getAll();
            if (!schools.isEmpty()) {
                infoNode.removeAllChildren();
                for (School school : schools) {

                }
            }
            database.close();
        } else {
            JOptionPane.showMessageDialog(this, "数据库连接失败！", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void saveButtonActionPerformed(ActionEvent actionEvent) {
        String idCode = idCodeTextField.getText();
        String name = nameTextField.getText();
        int state = stateCheckBox.isBorderPaintedFlat() ? 1 : 0;
        if (idCode.equals("")) {
            JOptionPane.showMessageDialog(this, "请输入学院编号!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (idCode.length() > 10) {
            JOptionPane.showMessageDialog(this, "学院代码不合法!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (name.equals("")) {
            JOptionPane.showMessageDialog(this, "请输入学院名称!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        System.out.println(state);
        School school = new School(idCode.toCharArray(), name, state);
        SchoolDatabase database = new SchoolDatabase();
        if (database.connect()) {
            if (database.insert(school)) {
                JOptionPane.showMessageDialog(this, "添加成功！");
            } else {
                JOptionPane.showMessageDialog(this, "添加失败！");
                return;
            }
            database.close();
        } else {
            JOptionPane.showMessageDialog(this, "数据库连接失败！", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void addButtonActionPerformed(ActionEvent actionEvent) {

    }

    public void deleteButtonActionPerformed(ActionEvent actionEvent) {

    }

    private JPanel mainPanel;
    private JTextField idCodeTextField;
    private JTextField nameTextField;
    private JButton saveButton;
    private JLabel idCodeLabel;
    private JLabel nameLabel;
    private JTree infoTree;
    private JButton addButton;
    private JButton deleteButton;
    private JCheckBox stateCheckBox;
    private DefaultMutableTreeNode infoNode;
}
