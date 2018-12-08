package cn.edu.sicnu.cs.yuxin.exp8;

import com.mysql.jdbc.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Mysqldb {
    private String URL = "jdbc:mysql://119.23.61.148:3306/scores";
    private String USER = "minecraft";
    private String PWD = "Woshiyuxin123.";
    //mysql driver
    private final static String Driver = "com.mysql.jdbc.Driver";
    private Connection connection;

    public Mysqldb() {
        try {
            Class.forName(Driver);
            connection = (Connection) DriverManager.getConnection(URL, USER, PWD);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Mysqldb(String URL, String USER, String PWD) {
        this.URL = URL;
        this.USER = USER;
        this.PWD = PWD;
        try {
            Class.forName(Driver);
            connection = (Connection) DriverManager.getConnection(URL, USER, PWD);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Mysqldb(String host, String port, String dbName, String user, String passwd) {
        this.URL = "jdbc:mysql://" + host + ":" + port + "/" + dbName;
        this.USER = user;
        this.PWD = passwd;
        try {
            Class.forName(Driver);
            connection = (Connection) DriverManager.getConnection(URL, USER, PWD);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     *  增加、删除、改变
     *  */
    public boolean updateSQL(String sql) {
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(sql);
            int rows = preparedStatement.executeUpdate();
            return rows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    /*
     *  查找
     *  */
    public ResultSet selectSQL(String sql) {
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet != null) {
                return resultSet;
            } else {
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /*
     *  关闭
     *  */
    public boolean close() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Mysqldb mysqldb = new Mysqldb();
        ResultSet rs = mysqldb.selectSQL("select * from student;");
        try {
            while (rs.next()) {
                System.out.println(rs.getString(1) + "," + rs.getString(2) + "," + rs.getString(3) + "," + rs.getString(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
