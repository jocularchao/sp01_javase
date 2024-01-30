package m02linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/22 16:29
 * @Description LinkedHashMap，它的内部对插入顺序进行了维护
 *
 * LinkedHashMap是直接继承自HashMap，具有HashMap的全部性质，
 * 同时得益于每一个节点都是一个双向链表，在插入键值对时，同时保存了插入顺序
 */
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();

        map.put(0, "v0");
        map.put(1, "v1");
        map.put(2, "v2");

        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}
