package com.test;

import java.util.List;
import java.util.Set;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/30 23:56
 * @Description
 */
public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = Set.of("BBB", "CCC", "DDD");

        List<Integer> list = List.of(1, 2, 3);

        System.out.println(set);
        System.out.println(list);
    }
}
