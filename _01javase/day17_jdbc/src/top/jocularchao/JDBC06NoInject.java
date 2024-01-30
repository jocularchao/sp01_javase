package top.jocularchao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/8/13 20:56
 * @Description SQL预编译防止sql注入
 */
public class JDBC06NoInject {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jdbc_test?useSSL=false", "root", "123456");

             PreparedStatement statement = connection.prepareStatement("select * from user where username=? and password = ?;")) {


            statement.setString(1, "test");
            //statement.setString(2, "123465");
            statement.setString(2, "1111' or 1=1 -- ");
            System.out.println(statement.toString());
            ResultSet set = statement.executeQuery();
            //把获取到的结果集映射到创建的Student类中
            //但该操作有局限性，就是需要判断数据类型，可以利用反射机制来解决看JDBC04ResultSet1类
            while (set.next()) {
                String username = set.getString(1);
                System.out.println(username+"登陆成功!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
