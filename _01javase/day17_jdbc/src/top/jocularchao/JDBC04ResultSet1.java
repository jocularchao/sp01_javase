package top.jocularchao;

import java.lang.reflect.Constructor;
import java.sql.*;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/8/13 19:47
 * @Description
 */
public class JDBC04ResultSet1 {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jdbc_test?useSSL=false", "root", "123456");

             Statement statement = connection.createStatement()) {

            ResultSet set = statement.executeQuery("select * from student;");
            //把获取到的结果集映射到创建的Student类中
            //但该操作有局限性，就是需要判断数据类型，可以利用反射机制来解决看JDBC04ResultSet1类
            while (set.next()) {
                Student student = convert(set, Student.class);
                System.out.println(student.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static <T> T convert(ResultSet set, Class<T> clazz) {
        try {
            Constructor<T> constructor = clazz.getConstructor(clazz.getConstructors()[0].getParameterTypes());   //获取定义的第一个参数列表
            Class<?>[] parameterTypes = constructor.getParameterTypes();    //获取参数列表
            Object[] object = new Object[parameterTypes.length]; //存放参数
            for (int i = 0; i < parameterTypes.length; i++) {
                object[i] = set.getObject(i + 1);
                //判断类型是否匹配
                if (object[i].getClass() != parameterTypes[i]) {
                    throw new SQLException("错误的类型转换" + object.getClass() + "->" + parameterTypes[i]);
                }
            }
            //返回该类型列表构造的对象
            return constructor.newInstance(object);
        } catch (SQLException | ReflectiveOperationException e) {
            e.printStackTrace();
            return null;
        }
    }
}
