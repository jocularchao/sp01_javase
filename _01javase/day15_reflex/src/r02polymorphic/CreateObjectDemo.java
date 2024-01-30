package r02polymorphic;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/27 12:15
 * @Description 创建类对象
 */
public class CreateObjectDemo {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //通过类对象来创建对象
        Class<Student> clazz = Student.class;

        //JDK9后不推荐
        //Student student = clazz.newInstance();

        //
        Student student1 = clazz.getConstructor(String.class,Integer.class).newInstance("S1", 27);

        System.out.println(student1.toString());

        //访问权限为非public时，就要用getDeclaredConstructor
        Constructor<Student> constructor = clazz.getDeclaredConstructor(String.class, Integer.class, Integer.class);

        constructor.setAccessible(true);

        Student student2 = constructor.newInstance("S2",28,1);

        System.out.println(student2.toString());


    }
}

class Student {
    String name;
    Integer age;

    private Integer sex;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, Integer age, Integer sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}

