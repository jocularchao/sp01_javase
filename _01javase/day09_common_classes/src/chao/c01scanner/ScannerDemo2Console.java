package chao.c01scanner;

import java.io.Console;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/1 18:17
 * @Description Console类 从控制台读取密码
 */
public class ScannerDemo2Console {
    public static void main(String[] args) {
        //因为输入是可见的
        //scanner类不适合用于从控制台读取密码，而Console类来实现这个目的
        Console cons = System.console();
        String username = cons.readLine("User name: ");
        System.out.println(username);
        char[] password = cons.readPassword("Password: ");
        System.out.println(new String(password));

        //该类不能直接运行需要用终端javac java 来运行

    }
}
