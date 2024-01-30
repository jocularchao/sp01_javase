package top.jocularchao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/8/12 21:41
 * @Description
 */
public class JDBC02DML {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_test", "root", "123456");
             Statement statement = connection.createStatement()
        ) {
            //int i = statement.executeUpdate("insert into `student` values (20230812,'十二',25)");

            //int i = statement.executeUpdate("update student set name = '十三' where id = 20230812");
            int i = statement.executeUpdate("truncate table student;");
            System.out.println("生效了："+i+"行");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
