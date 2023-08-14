package top.jocularchao;

import java.sql.*;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/8/13 21:17
 * @Description 事务
 */
public class JDBC07Transactions {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jdbc_test?useSSL=false", "root", "123456");

             Statement statement = connection.createStatement();) {


            connection.setAutoCommit(false);   //关闭自动提交，现在变为手动提交
            statement.executeUpdate("insert into user values ('test1','1234567')");
            //Savepoint savepoint = connection.setSavepoint();//设置回滚点
            statement.executeUpdate("insert into user values ('test2','7654321')");
            System.out.println(statement.toString());


            //connection.rollback(savepoint); //回滚到回滚点
            //connection.rollback();//回滚

            connection.commit(); //提交
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
