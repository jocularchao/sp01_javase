package top.jocularchao.g01grammar;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/6/13 16:50
 * @description: out err
 *
 * out 是输出调试信息的输出流
 * err 是错误信息的标准输出流
 */
public class G01Out {
    public static void main(String[] args) {
        System.out.println("main()开始");
        //输出错误信息
        System.err.println("运行期间输出一个错误信息");
        System.err.println("..............");
        System.out.println();
    }
}
