package chao.c01scanner;

import java.io.Console;
import java.util.Scanner;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/1 17:56
 * @Description 键盘录入技术
 */
public class ScannerDemo1 {
    public static void main(String[] args) {
    //1得到一个键盘扫描器对象
        Scanner scanner = new Scanner(System.in); //System.in 标准输入流
        //2. 调用sc对象的功能等待接收用户输入数据
        //这个代码会等待用户输入数据，直到用户输入完数据并按了回车键就会把数据拿到
        System.out.println("请输入您的年龄");
        int age = scanner.nextInt();
        System.out.println("您的年龄是：" + age);

        System.out.println("请输入您的名称：");

        // String name = scanner.nextLine();  //包含空格使用该方法
        String name = scanner.next();  //不能包含空格 但可以用空格作为分隔符
        System.out.println("欢迎：" + name);


    }
}
