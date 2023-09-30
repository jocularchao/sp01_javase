package com.test;

import java.util.Map;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/30 23:44
 * @Description 集合类新增工厂方法
 *
 */
public class MapDemo {
    public static void main(String[] args) {
        //如何快速创建一个Map
        //1 以往：
        //Map<String, Integer> map = new HashMap<>();

        //map.put()

        //2 工厂方法：
        Map<String, Integer> map = Map.of("AAA", 1, "BBB", 2);  //一句搞定

        System.out.println(map);
        //但不能进行修改,类似arrays.aslist
        map.put("BBB", 3);
    }
}
