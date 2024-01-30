package s06print;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/24 21:02
 * @Description PrintStream 打印流
 *  FilterOutputStream的子类，因此依然是装饰我们传入的输出流，但是它存在自动刷新机制
 *  并且PrintStream也永远不会抛出异常，而是使用内部检查机制`checkError()`方法进行错误检查。
 *  最方便的是，它能够格式化任意的类型，将它们以字符串的形式写入到输出流。
 *  System.out 就是一个PrintStream:
 *      它会直接打印基本数据类型或是调用对象的`toString()`方法得到一个字符串，
 *      并将字符串转换为字符，放入缓冲区再经过转换流输出到给定的输出流上。
 *
 */
public class PrintStreamDemo {
    public static void main(String[] args) {
        try(PrintStream stream = new PrintStream(new
                FileOutputStream(".."))){
            stream.println("lbwnb");   //其实System.out就是一个PrintStream
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
