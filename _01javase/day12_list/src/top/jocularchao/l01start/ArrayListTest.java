package top.jocularchao.l01start;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/20 13:06
 * @Description 顺序表
 */
public class ArrayListTest {
    public static void main(String[] args) {
        //在Arrays工具类中，我们可以快速生成一个只读的List
        List<String> list = Arrays.asList("A", "B", "C");

        System.out.println(list);

        //这个生成的List是只读的，不能进行修改操作，只能使用获取内容相关的方法，否则抛出UnsupportedOperationException
        //1 要想他正常使用可以把它当作一个参数传入
        List<String> list1 = new ArrayList<>(list);
        System.out.println(list1);

        //2 也可以利用静态代码块
        List<String> list2 = new ArrayList<String>(list) {{
            add("B");
            add("C");
            add("D");
        }};

        System.out.println(list2);


    }
}
