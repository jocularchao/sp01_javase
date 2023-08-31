package chao.a05unicode;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/3/26 20:34
 * @description: 详述 Unicode和char类型
 * unicode有时但一个字节，有时占两个字节
 * 现在Unicode字符超过了65536个，16位的char类型已经不能满足所有Unicode字符的需要
 * U+0041 就是拉丁字符A的码点  (0041  码点：十六进制表示) 码点分为十七个代码级别：
 *  第一个代码：基本的多语言级别      U+0000 - U+FFFF
 *  其余：U+10000 - U+10FFFF
 *
 *  学不下去了见核心技术p35
 */
public class CharDemo1 {
    public static void main(String[] args) {
        //哪些Unicode字符属于java中的字母，可以使用Character类的isJavaIdentifierStart和isJavaIdentifierPart方法来检查

        System.out.println(Character.isJavaIdentifierStart('鼳'));


        //虽然’$‘是一个合法的java字符，但不要在你自己的代码中使用这个字符。它只用在java编译器或其他工具生成的名字中。
        System.out.println(Character.isJavaIdentifierStart('$'));
        
    }
}
