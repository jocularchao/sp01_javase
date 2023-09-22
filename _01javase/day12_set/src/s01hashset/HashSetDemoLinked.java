package s01hashset;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/22 11:32
 * @Description LinkedHashSet
 */
public class HashSetDemoLinked {
    public static void main(String[] args) {
        //使用维持顺序的Set集合:LinkedHashSet
        //LinkedHashSet底层维护的不再是一个HashMap，而是LinkedHashMap，它能够在插入数据时利用链表自动维护顺序
        // 因此这样就能够保证我们插入顺序和最后的迭代顺序一致了。
        Set <Integer> set = new LinkedHashSet<>();

        set.addAll(Arrays.asList(1,2,3,4));

        System.out.println(set);
    }
}
