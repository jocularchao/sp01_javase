package m03treemap;

import java.util.Map;
import java.util.TreeMap;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/22 18:37
 * @Description TreeMap
 * 它的内部直接维护了一个红黑树（没有使用哈希表）
 * 因为它会将我们插入的结点按照规则进行排序，所以说直接采用红黑树会更好，我们在创建时，直接给予一个比较规则即可，跟之前的TreeSet是一样的
 *
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new TreeMap<>((a,b)->b-a);

        map.put(0, "v0");
        map.put(1, "v1");
        map.put(2, "v2");

        System.out.println(map);
    }
}
