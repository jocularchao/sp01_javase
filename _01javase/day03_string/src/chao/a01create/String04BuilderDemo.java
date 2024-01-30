package chao.a01create;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/4/23 20:28
 * @description:
 * 当需要由较短的字符串构建字符串时，由于每次连接字符串都会构建一个新的String对象。既耗时，又浪费空间。
 */
public class String04BuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("1");
        sb.append("2");

        String sbString = sb.toString();
        System.out.println(sbString);
    }
}
