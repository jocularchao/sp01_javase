package s01hashset;

import java.util.HashSet;
import java.util.Set;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/22 11:27
 * @Description 底层就是采用哈希表实现
 */
public class HashSetDemo {
    public static void main(String[] args) {
        Set <String> set = new HashSet<>();
        System.out.println(set.add("SSS")); //这里我们连续插入两个相同的字符串
        System.out.println(set.add("SSS")); //这里我们连续插入两个相同的字符串

        System.out.println(set);  //结果只有一个

        //删除
        System.out.println(set.remove("SSS"));
        System.out.println(set);

        //由于底层是哈希表实现，所以无法维持插入元素的顺序
        //所以说hashset 是无序、不重复的


    }
}
