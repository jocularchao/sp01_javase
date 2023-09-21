package top.jocularchao.l02iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/21 18:13
 * @Description 接口 ListIterator
 *
 * 主方法生成的这种迭代器因为能够双向遍历，所以说可以反复使用。
 * 而之前的迭代器都是一次性的
 */
public class IteratorDemoList1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("S", "B"));
        ListIterator<String> iterator = list.listIterator();

        iterator.next(); //此时得到S
        iterator.set("X"); //将S原本位置的上的元素设定为成新的
        System.out.println(list);
    }
}
