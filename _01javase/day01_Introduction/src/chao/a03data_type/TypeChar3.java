package chao.a03data_type;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/4/9 18:12
 * @description: 有些Unicode字符可以用char描述 在a05包详述
 */
public class TypeChar3 {
    public static void main(String[] args) {
        //单引号 一个字符 占一个字节  其实占两位
        System.out.println('中');
        System.out.println('0');
        System.out.println('\n');
        System.out.println('\t');
        System.out.println('a');

        //除了转义字符\\u外还有一些表示特殊字符的转义字符
        System.out.println('\b');   //退格    \u0008
        System.out.println('\t');   //制表    \u0009
        System.out.println('\n');   //换行    \u000a
        System.out.println('\r');   //回车    \u000d
        System.out.println('\"');   //双引号   \u0022
        System.out.println('\'');   //单引号   \u0027
        System.out.println('\\');   //反斜杠   \u005c

        System.out.println(\u0022+\u0022);  //+
        System.out.println("\u0022+\u0022");  //""+"" 空串

    }
}
