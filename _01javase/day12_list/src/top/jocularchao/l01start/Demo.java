package top.jocularchao.l01start;

import java.util.ArrayList;
import java.util.List;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/8/25 21:31
 * @Description
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
