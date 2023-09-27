package r02polymorphic;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/27 18:08
 * @Description 修改类的属性
 */
public class AttributeDemo {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Class<?> aClass = Class.forName("r02polymorphic.Teacher");

        Object instance = aClass.newInstance();

        Field field = aClass.getDeclaredField("id");
        field.set(instance, 100);

        Method method = aClass.getMethod("getId");

        method.invoke(instance);
    }
}

class Teacher {
    Integer id;
    String name;

    public Integer getId() {
        System.out.println(this.id);
        return id;
    }

    public String getName() {
        return name;
    }
}
