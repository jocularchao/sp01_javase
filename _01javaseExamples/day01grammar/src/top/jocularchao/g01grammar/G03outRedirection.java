package top.jocularchao.g01grammar;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/6/14 20:48
 * @description: 重定向输出流实现程序日志
 * <p>
 * <p>
 * out是java的标准输出流 被定义为final类型 无法直接重新复制
 * 但可以通过setOut()方法设置新的输出流
 * 并将其指向一个文件输出流 来实现日志功能
 * <p>
 * setOut
 * <p>
 * setErr
 * <p>
 * setIn
 */
public class G03outRedirection {
    public static void main(String[] args) {
        try {
            PrintStream out = System.out;
            PrintStream ps = new PrintStream("./log.txt");
            System.setOut(ps);
            int age = 18;
            System.out.println("年龄变量成功定义，初始值为18");
            String sex = "女";
            System.out.println("性别变量成功定义，初始值为女");
            System.setOut(out);
            System.out.println("程序运行中，请查看日志文件");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
