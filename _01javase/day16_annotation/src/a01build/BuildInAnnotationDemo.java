package a01build;

import java.util.ArrayList;
import java.util.List;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/27 20:16
 * @Description 内置注解
 */
public class BuildInAnnotationDemo extends Object{
    //1 重写父类的方法
    @Override
    public String toString() {
        return super.toString();
    }

    //2 标记过时方法。如果使用该方法，会报编译警告
    @Deprecated
    public static void stop() {

    }

    //3 编译器去忽略注解中声明的警告
    @SuppressWarnings("all")
    public void sw() {
        List lsit = new ArrayList<>();
    }

    public static void main(String[] args) {

        //4 标识一个匿名函数或函数式接口
        new Thread(()->{}).start();
    }
}
