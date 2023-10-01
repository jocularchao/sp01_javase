package com.test;

import java.util.stream.Stream;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/30 23:59
 * @Description
 */
public class StreamAPIDemo {
    public static void main(String[] args) {
        Stream
                .of("A","B","C","C")
                .filter(s->s.equals("B"))
                .distinct()
                .forEach(System.out::println);

        //ofNullable 传入的空就是空，不报错
        Stream
                .ofNullable(null)
                .forEach(System.out::println);

        //of传入null会报错
        Stream
                .of(null)
                .forEach(System.out::println);
    }
}
