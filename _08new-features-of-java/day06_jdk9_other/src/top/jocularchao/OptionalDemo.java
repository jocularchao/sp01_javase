package top.jocularchao;

import java.util.Optional;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/10/4 11:46
 * @Description
 */
public class OptionalDemo {
    public static void main(String[] args) {
        String str = null;
        Optional
                .ofNullable(str)
                .ifPresentOrElse(s -> {
                    System.out.println(s);
                }, () -> {
                    System.out.println("null");
                });

        Optional
                .ofNullable(str)
                .or(()->Optional.of("AAA"))
                .ifPresent(System.out::println);
    }

}
