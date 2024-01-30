package top.jocularchao.l01start;

import java.util.ArrayList;
import java.util.List;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/8/25 21:31
 * @Description 顺序表
 * ArrayList 底层由数组实现，内部维护的是一个可动态进行扩容的数组，也就是我们之前所说的顺序表
 * 有序集合，插入元素默认是插入到尾部，按顺序从前往后存放，每个元素都有一个自己的下标位置
 * 列表中允许存在重复元素
 */
public class Demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("666");

        System.out.println(list);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(20);
        list1.remove((Integer) 20);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(new Integer(30));
        list2.remove(new Integer(30));


        List<String> list3 = new ArrayList<>();

    }

}
