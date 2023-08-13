package top.jocularchao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/8/13 19:40
 * @Description 映射结果集
 */
public class JDBC04ResultSet {
    public static void main(String[] args) throws ClassNotFoundException {


        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jdbc_test?useSSL=false", "root", "123456");

             Statement statement = connection.createStatement()) {

            ResultSet set = statement.executeQuery("select * from student;");
            //把获取到的结果集映射到创建的Student类中
            //但该操作有局限性，就是需要判断数据类型，可以利用反射机制来解决看JDBC04ResultSet1类
            while (set.next()){
                Student student = new Student(set.getInt("id"), set.getString("name"), set.getInt("age"));
                System.out.println(student.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
