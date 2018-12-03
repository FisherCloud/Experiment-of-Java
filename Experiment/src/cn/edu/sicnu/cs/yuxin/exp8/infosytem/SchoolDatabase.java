package cn.edu.sicnu.cs.yuxin.exp8.infosytem;

import java.sql.*;
import java.util.ArrayList;

public class SchoolDatabase {
    private String URL = "jdbc:mysql://";
    private String HOST = "119.23.61.148";
    private String PORT = "3306";
    private String DATABASE = "javaTest";
    private final static String DRIVER = "com.mysql.jdbc.Driver";
    private String USER = "test";
    private String PASSWORD = "Java123456+";
    private Connection connection = null;

    SchoolDatabase() {
        URL = URL + HOST + ":" + PORT + "/" + DATABASE;
    }

    SchoolDatabase(String HOST, String DATABASE, String PORT, String USER, String PASSWORD) {
        this.HOST = HOST;
        this.DATABASE = DATABASE;
        this.PORT = PORT;
        this.USER = USER;
        this.PASSWORD = PASSWORD;
        this.URL = URL + HOST + ":" + PORT + "/" + DATABASE;
    }

    public boolean connect() {
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean insert(School school) {
        String sql = "insert into School(idCode, name) values(?,?,?);";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, String.valueOf(school.getIdentificationCode()));
            preparedStatement.setString(2, school.getName());
            preparedStatement.setString(3, String.valueOf(school.getState()));
            int rows = preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean update(School school) {
        //String sql = "update School set idCode ='"+String.valueOf(school.getIdentificationCode())+"'";
        return true;
    }

    public ArrayList<School> getAll() {
        String sql = "select * from School;";
        PreparedStatement preparedStatement;
        ArrayList<School> schools = new ArrayList<School>();
        try {
            preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                schools.add(new School(resultSet.getString(1).toCharArray(), resultSet.getString(2),resultSet.getBoolean(3)));
            }
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return schools;
    }

    public boolean delete(String idCode) {
        String sql = String.format("delete from School where idcode = '%s';", idCode);
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(sql);
            int rows = preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

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
        SchoolDatabase database = new SchoolDatabase();
        if (database.connect()) {
            System.out.println("连接成功！");
            database.close();
        } else {
            System.out.println("连接失败！");
        }
    }
}
