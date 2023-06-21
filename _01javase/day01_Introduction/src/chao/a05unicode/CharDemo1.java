package chao.a05unicode;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/3/26 20:34
 * @description: 详述 Unicode和char类型
 *
 * 有些Unicode可以用一个char值描述
 * 有些Unicode可以用两个char值描述
 *
 * 哪些Unicode字符属于java中的字母，可以使用Character类的isJavaIdentifierStart和isJavaIdentifierPart方法来检查
 *
 * 现在Unicode字符超过了65536个，16位的char类型已经不能满足所有Unicode字符的需要
 *
 * U+0041  (0041  码点：十六进制表示) 码点分为十七个代码级别：
 *  第一个代码：基本的多语言级别      U+0000 - U+FFFF
 *  其余：U+10000 - U+10FFFF
 *
 *  学不下去了见核心技术p35
 */
public class CharDemo1 {
    public static void main(String[] args) {


        
    }
}
