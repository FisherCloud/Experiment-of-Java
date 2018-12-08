package cn.edu.sicnu.cs.yuxin.exp8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentAchievementManagementSystem extends JFrame {

    private Mysqldb mysqldb = new Mysqldb();

    public StudentAchievementManagementSystem() {

        setTitle("学生成绩信息管理系统");
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(760, 440);
        setLocationRelativeTo(null);
        setVisible(true);

        saveStudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                saveStudentButtonActionPerformed(actionEvent);
            }
        });
        saveCourseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                saveCourseButtonActionPerformed(actionEvent);
            }
        });
        saveGradeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                saveGradeButtonActionPerformed(actionEvent);
            }
        });
    }

    public void saveStudentButtonActionPerformed(ActionEvent actionEvent) {
        String sNumber = sNumberTextField.getText();
        String sName = sNameTextField.getText();
        String sSex = sSexTextField.getText();
        String sBirthday = sBirthdayTextField.getText();
        String sql = "insert into student(number, name, sex, birthday) value('%s', '%s', '%s', '%s');";
        try {
            sql = String.format(sql, sNumber, sName, sSex, sBirthday);
            if (sNumber.equals("")) {
                JOptionPane.showMessageDialog(this, "学号不能为空！");
            } else if (sName.equals("")) {
                JOptionPane.showMessageDialog(this, "姓名不能为空！");
            } else if (sSex.equals("")) {
                JOptionPane.showMessageDialog(this, "性别不能为空！");
            } else if (sBirthday.equals("")) {
                JOptionPane.showMessageDialog(this, "生日不能为空！");
            } else {
                if (mysqldb.updateSQL(sql)) {
                    JOptionPane.showMessageDialog(this, "插入学生数据成功！");
                } else {
                    JOptionPane.showMessageDialog(this, "插入学生数据失败！");
                }
            }
            sNumberTextField.setText("");
            sNameTextField.setText("");
            sSexTextField.setText("");
            sBirthdayTextField.setText("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saveCourseButtonActionPerformed(ActionEvent actionEvent) {
        String cNumber = cNumberTextField.getText();
        String cName = cNameTextField.getText();
        String cCredit = cCreditTextField.getText();
        String sql = "insert into course(cNumber, cName, cCredit) value('%s', '%s', '%s');";
        try {
            sql = String.format(sql, cNumber, cName, cCredit);
            if (cNumber.equals("")) {
                JOptionPane.showMessageDialog(this, "课程编号不能为空！");
            } else if (cName.equals("")) {
                JOptionPane.showMessageDialog(this, "课程名称不能为空！");
            } else if (cCredit.equals("")) {
                JOptionPane.showMessageDialog(this, "课程学分不能为空！");
            } else {
                if (mysqldb.updateSQL(sql)) {
                    JOptionPane.showMessageDialog(this, "课程插入成功！");
                } else {
                    JOptionPane.showMessageDialog(this, "课程插入失败！");
                }
                cNumberTextField.setText("");
                cNameTextField.setText("");
                cCreditTextField.setText("");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saveGradeButtonActionPerformed(ActionEvent actionEvent) {
        String sNumber = SNTextField.getText();
        String cNumber = CNTextField.getText();
        String grade = GradeTextField.getText();
        String sql = "insert into grade(number, cNumber, grade) value('%s', '%s', '%s');";
        try {
            sql = String.format(sql, sNumber, cNumber, grade);
            if (sNumber.equals("")) {
                JOptionPane.showMessageDialog(this, "学生学号不能为空！");
            } else if (cNumber.equals("")) {
                JOptionPane.showMessageDialog(this, "课程编号不能为空！");
            } else if (grade.equals("")) {
                JOptionPane.showMessageDialog(this, "课程成绩不能为空！");
            } else {
                if (mysqldb.updateSQL(sql)) {
                    JOptionPane.showMessageDialog(this, "学生成绩录入成功！");
                } else {
                    JOptionPane.showMessageDialog(this, "学生成绩插入失败！");
                }
                SNTextField.setText("");
                CNTextField.setText("");
                GradeTextField.setText("");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new StudentAchievementManagementSystem();
    }

    private JPanel mainPanel;
    private JTextField sNumberTextField;
    private JTextField sNameTextField;
    private JTextField sSexTextField;
    private JTextField sBirthdayTextField;
    private JLabel sNumberLabel;
    private JLabel sNameLabel;
    private JLabel sSexLabel;
    private JLabel sBirthdayLabel;
    private JTextField cNumberTextField;
    private JTextField cNameTextField;
    private JTextField cCreditTextField;
    private JLabel cNumberLabel;
    private JLabel cNameLabel;
    private JLabel cCreditLabel;
    private JButton saveStudentButton;
    private JButton saveCourseButton;
    private JTextField SNTextField;
    private JTextField GradeTextField;
    private JTextField CNTextField;
    private JLabel SNLabel;
    private JLabel CNLabel;
    private JLabel GradeLabel;
    private JButton saveGradeButton;
}
