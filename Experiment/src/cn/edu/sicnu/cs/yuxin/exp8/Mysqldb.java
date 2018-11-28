package cn.edu.sicnu.cs.yuxin.exp8;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mysqldb {
    private String URL = "jdbc:mysql://119.23.61.148:3306/scores";
    private String USER = "minecraft";
    private String PWD = "Woshiyuxin123.";
    private final static String Driver = "com.mysql.jdbc.Driver";
    private Connection connection;
    private PreparedStatement prepareStatement;
    private ResultSet resultSet;

    public Mysqldb() {
        try {
            Class.forName(Driver);
            connection = DriverManager.getConnection(URL, USER, PWD);
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
            connection = DriverManager.getConnection(URL, USER, PWD);
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
            connection = DriverManager.getConnection(URL, USER, PWD);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 多条查询
     *
     * @param sql
     * @param params
     * @return
     * @throws SQLException
     */
    public List<Map<String, Object>> findMoreByStatement(String sql, List<Object> params) throws SQLException {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        prepareStatement = connection.prepareStatement(sql);

        if (params != null && !params.isEmpty()) {
            for (int i = 0; i < params.size(); i++) {
                prepareStatement.setObject(i + 1, params.get(i));
            }
        }

        resultSet = prepareStatement.executeQuery();
        ResultSetMetaData rsmd = resultSet.getMetaData();
        while (resultSet.next()) {
            Map<String, Object> map = new HashMap<String, Object>();
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                String column_name = rsmd.getColumnName(i);
                Object column_value = resultSet.getObject(column_name);
                if (column_value == null) {
                    column_value = "";
                }
                map.put(column_name, column_value);
            }
            list.add(map);
        }

        return list;
    }

    /**
     * 单条查询
     *
     * @param sql
     * @param params
     * @return
     * @throws SQLException
     */
    public Map<String, Object> findByStatement(String sql, List<Object> params) throws SQLException {

        Map<String, Object> map = new HashMap<String, Object>();
        prepareStatement = connection.prepareStatement(sql);

        if (params != null && !params.isEmpty()) {
            for (int i = 0; i < params.size(); i++) {
                prepareStatement.setObject(i + 1, params.get(i));
            }
        }

        resultSet = prepareStatement.executeQuery();
        ResultSetMetaData rsmd = resultSet.getMetaData();
        while (resultSet.next()) {
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                String column_name = rsmd.getColumnName(i);
                Object column_value = resultSet.getObject(column_name);
                if (column_value == null) {
                    column_value = "";
                }
                map.put(column_name, column_value);
            }
        }
        return map;
    }

    /**
     * 反射单条查询
     *
     * @param sql
     * @param params
     * @param c
     * @return
     * @throws Exception
     */
    public <T> T findByStatement(String sql, List<Object> params, Class<T> c) throws Exception {

        T resultObj = null;
        prepareStatement = connection.prepareStatement(sql);

        if (params != null && !params.isEmpty()) {
            for (int i = 0; i < params.size(); i++) {
                prepareStatement.setObject(i + 1, params.get(i));
            }
        }

        resultSet = prepareStatement.executeQuery();
        ResultSetMetaData rsmd = resultSet.getMetaData();

        while (resultSet.next()) {
            resultObj = c.newInstance();
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                String column_name = rsmd.getColumnName(i);
                Object column_value = resultSet.getObject(column_name);
                if (column_value == null) {
                    column_value = "";
                }
                Field field = c.getDeclaredField(column_name);
                field.setAccessible(true);
                field.set(resultObj, column_value);
            }
        }
        return resultObj;
    }

    /**
     * 反射多条查询
     *
     * @param sql
     * @param params
     * @param c
     * @return
     * @throws Exception
     */
    public <T> List<T> findMoreByStatement(String sql, List<Object> params, Class<T> c) throws Exception {

        List<T> list = new ArrayList<T>();
        prepareStatement = connection.prepareStatement(sql);

        if (params != null && !params.isEmpty()) {
            for (int i = 0; i < params.size(); i++) {
                prepareStatement.setObject(i + 1, params.get(i));
            }
        }

        resultSet = prepareStatement.executeQuery();
        ResultSetMetaData rsmd = resultSet.getMetaData();
        while (resultSet.next()) {
            T resultObj = c.newInstance();
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                String column_name = rsmd.getColumnName(i);
                Object column_value = resultSet.getObject(column_name);
                if (column_value == null) {
                    column_value = "";
                }
                Field field = c.getDeclaredField(column_name);
                field.setAccessible(true);
                field.set(resultObj, column_value);
            }
            list.add(resultObj);
        }
        return list;
    }

    /**
     * 数据增删改
     *
     * @param sql
     * @param params
     * @return
     * @throws SQLException
     */
    public boolean updateByPrepareStatement(String sql, List<Object> params) throws SQLException {
        boolean flag = false;
        int result = -1;
        prepareStatement = connection.prepareStatement(sql);
        if (params != null && !params.isEmpty()) {
            for (int i = 0; i < params.size(); i++) {
                prepareStatement.setObject(i + 1, params.get(i));
            }
        }
        result = prepareStatement.executeUpdate();
        flag = result > 0;
        return flag;
    }

    /**
     * 资源释放
     */
    public void releaseConn() {
        if (prepareStatement != null) {
            try {
                connection.close();
                prepareStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

