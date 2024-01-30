package m01hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/22 12:46
 * @Description HashMap，它的底层采用哈希表实现
 */
public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        map.put(1, "v1");   //使用put方法添加键值对
        map.put(2, "v2");

        System.out.println(map.get(2));//使用get方法根据键获取对应的值

        //1 map无法添加相同的键，同样的键只存在一个，会被覆盖
        map.put(1, "vv");
        System.out.println(map.get(1));

        //2 为了防止之前的被覆盖，我们可以使用putIfAbsent
        map.putIfAbsent(1, "v0");
        System.out.println(map.get(1));

        //3 我们在获取一个不存在的映射时，默认会返回null作为结果
        System.out.println(map.get(3));  //null

        //4 所以当map中不存在时，可以返回一个备选的返回值
        System.out.println(map.getOrDefault(3, "备胎"));   //Java8新增操作，当不存在对应的键值对时，返回备选方案

        //5 因为HashMap底层采用哈希表实现，所以不维护顺序
        //在获取所有键和所有值时，可能会是乱序的
        System.out.println(map.keySet());
        System.out.println(map.values());

        //6 连地址法解决因为哈希冲突，保存元素数量存在限制的问题 看源码
        //
    }
}
