package top.jocularchao.a04synchronous_blocked;

import java.util.HashMap;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/6/5 21:49
 * @description: hashmap
 * 该数据结构不是线程安全的类，
 * 如果在多线程同时写操作的情况下不对其进行同步化封装，
 * 则很容易出现死循环引起的死锁
 *
 * 想要使用线程安全的map结构
 * ConcurrentHashMap
 * Collections.synchronizedMap
 */
public class T05DeadLock02 {
    private final HashMap<String,String> map = new HashMap<>();

    public void add(String key,String value){
        this.map.put(key, value);
    }

    public static void main(String[] args) {
        T05DeadLock02 hmd1 = new T05DeadLock02();
        for (int x = 0; x < 2; x++) {
            new Thread(()->{
                for (int i = 1; i < Integer.MAX_VALUE; i++) {
                    hmd1.add(String.valueOf(i), String.valueOf(i));
                }
            }).start();
        }
    }
}
