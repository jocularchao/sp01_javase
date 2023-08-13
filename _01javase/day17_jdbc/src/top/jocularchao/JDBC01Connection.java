package top.jocularchao;

import java.sql.*;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/8/12 18:38
 * @Description JDBC连接
 */
public class JDBC01Connection {
    public static void main(String[] args) throws ClassNotFoundException {

        //手动加载驱动 看版本
        //Class.forName("com.mysql.cj.jdbc.Driver");
        //1、通过DriverManager来获得数据库连接
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_test?useSSL=false", "root", "123456");
             //2、创建一个用于执行SQL的Statement对象
             Statement statement = connection.createStatement()) {
            //3、执行SQL语句，并得到结果
            ResultSet set = statement.executeQuery("select * from student;");
            //4、查看结果
            //首先明确select返回的数据类似于一个excel表格
            //每使用一次next（）就回向下移动一行,首次调用会移动到第一行
            while (set.next()){
                System.out.println(set.getInt("id"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
