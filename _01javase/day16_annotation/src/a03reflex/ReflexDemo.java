package a03reflex;

import java.lang.annotation.Annotation;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/28 11:57
 * @Description 反射获得注解
 */
public class ReflexDemo {

    @MyAnnotation2
    public static void getAll() {

    }

    public static void main(String[] args) throws NoSuchMethodException {
        Class<ReflexDemo> clazz = ReflexDemo.class;

        System.out.println(clazz.getAnnotations());

        for (Annotation annotation : clazz.getMethod("getAll").getAnnotations()) {
            //获得类型
            System.out.println(annotation.annotationType());

            System.out.println(annotation instanceof MyAnnotation2);

            MyAnnotation2 a2 =(MyAnnotation2) annotation;

            System.out.println(a2.value());
        }
    }
}
