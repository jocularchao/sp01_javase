package top.jocularchao.g01grammar;

import java.util.Scanner;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/6/14 20:40
 * @description: scanner扫描器类 system的in输入流
 *
 *
 * InputStream输入流以字节为单位来获取数据 ，而且需要复杂的判断并创建字节数组为缓冲
 * 最主要的是字节转换为字符时容易出现中文乱码
 * 所以对于字符数据的读取应该用扫描器进行封装
 * 然后获取字符串类型的数据
 */
public class G02Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入");
        String line = sc.nextLine();
        System.out.println("长度"+line.length());
    }
}
