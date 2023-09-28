package a02meta;

import java.lang.annotation.*;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/27 20:25
 * @Description 自定义的注解
 */
//此注解作用在方法上，并保留到代码阶段
//Retention   代码阶段、编译阶段、运行时   SOURCE < CLASS < RUNTIME
//Target 作用域
@Target(value = {ElementType.METHOD,ElementType.TYPE})
@Retention(value = RetentionPolicy.SOURCE)
@Inherited
@Documented
public @interface MyAnnotation {
    //测试作用域了解@Retention的概念

}
