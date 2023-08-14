package top.jocularchao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/8/13 20:35
 * @Description SQL注入
 */
public class JDBC05SQLInject {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jdbc_test?useSSL=false", "root", "123456");

             Statement statement = connection.createStatement();
             Scanner sc = new Scanner(System.in);) {


            String sql = "select * from user where username='"+sc.nextLine()+"' and password='"+sc.nextLine()+"';";
            System.out.println(sql);
            ResultSet set = statement.executeQuery(sql);
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
