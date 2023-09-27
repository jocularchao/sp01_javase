package r02polymorphic;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/27 13:08
 * @Description 调用方法
 */
public class MethodDemo {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<People> clazz = People.class;

        People people = clazz.newInstance();

        Method method = clazz.getMethod("test", String.class);

        method.invoke(people, "what");

        People people1 = clazz.newInstance();

        Method method1 = clazz.getDeclaredMethod("test1", int.class);

        method1.setAccessible(true);
        method1.invoke(people1, 1);
        System.out.println(method1.getName());
        System.out.println(method1.getReturnType());
    }
}

class People{
    String name;

    Integer age;

    public void test(String str) {
        System.out.println("萨日朗"+str);
    }

    private void test1(int i){
        System.out.println(i);
    }
}