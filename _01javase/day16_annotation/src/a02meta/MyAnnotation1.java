package a02meta;

import java.lang.annotation.*;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/27 23:46
 * @Description 开始自定义注解
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation1 {
    ElementDemo[] value() default ElementDemo.TEST1;
}


enum ElementDemo {
    TEXT("test"),
    TEST1("test1");

    String str;
    ElementDemo(String str) {
        this.str = str;
    }
}
