package j02optional;

import java.util.Optional;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/30 16:21
 * @Description
 */
public class Main {
    public static void main(String[] args) {

    }

    //把传入的字符串转换为小写并打印
    public static void strToLower(String str) {
        //这里要做非空判断
        /*if (str!= null)
            System.out.println(str.toLowerCase());
        */
        Optional.ofNullable(str)
                .ifPresent(s -> {
                    System.out.println(s.toLowerCase());
                });
    }
}
