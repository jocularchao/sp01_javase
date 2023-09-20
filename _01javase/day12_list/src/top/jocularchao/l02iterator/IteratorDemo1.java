package top.jocularchao.l02iterator;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/8/29 12:39
 * @Description 迭代器具体实现
 */
public class IteratorDemo1 {
    public static void main(String[] args) {
        List<String> list = new
                LinkedList<>(Arrays.asList("A", "B", "C"));
        //这时foreach在编译阶段的代码
        //通过调用iterator方法快速获取当前集合的迭代器
        //Iterator迭代器本身也是一个接口，由具体的集合实现类来根据情况实现
        /*Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){ //每次循环一定要判断是否还有元素剩余
            System.out.println(iterator.next());//如果有就可以继续获取到下一个元素
        }*/

        for (String s : list) {
            System.out.println(s);
        }
    }

}
