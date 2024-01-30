package top.jocularchao.l02iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/20 23:02
 * @Description 在ArrayList和LinkedList中，迭代器的实现不同
 *
 * ArrayList是直接按下标访问
 * LinkedList就是不断向后寻找结点
 *
 * 但都是按照迭代器的标准进行实现，所以直接使用迭代器即可
 */
public class IteratorDemoList implements Iterable<String>{
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");

        for (String s : list) {
            System.out.print(s+" ");
        }

        //支持Lambda表达式的forEach方法，这个方法接受一个Consumer，也就是对遍历的每一个元素进行的操作
        list.forEach(System.out::print);

        IteratorDemoList test = new IteratorDemoList();
        for (String s : test) {
            System.out.println(s);
        }
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {//生成一个匿名的Iterator对象
            @Override
            public boolean hasNext() {//这里随便写的，直接返回true，这将会导致无限循环
                return true;
            }

            @Override
            public String next() {//每次就直接返回一个字符串吧
                return "测试";
            }
        };
    }
}
