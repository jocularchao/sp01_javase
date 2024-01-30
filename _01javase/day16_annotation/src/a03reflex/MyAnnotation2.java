package a03reflex;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/28 11:55
 * @Description
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation2 {

    EnumDemo2 value() default EnumDemo2.DEMO1;

}

enum EnumDemo2 {
    DEMO1("demo1"),
    DEMO2("demo2");

    String value;

    EnumDemo2(String value) {
        this.value = value;
    }
}
