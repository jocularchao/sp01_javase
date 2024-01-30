package s02treeset;

import java.util.TreeSet;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/22 11:35
 * @Description TreeSet，它会在元素插入时进行排序
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        //当然顺序不是我们的插入顺序，而是按照数字的大小进行排列
        //我们也可以自定义排序规则
        TreeSet<Integer> set = new TreeSet<>(); //同样是一个Comparator
        set.add(1);
        set.add(3);
        set.add(2);
        System.out.println(set);
    }
}
