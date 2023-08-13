package top.jocularchao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/8/13 19:19
 * @Description
 */
public class JDBC03BATCH {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jdbc_test","root", "123456");
             Statement statement = connection.createStatement()
        ){
            statement.addBatch("insert into student values (20230813,'十三',13)");
            statement.addBatch("insert into student values (20230814,'十四',14)");

            statement.executeBatch();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
