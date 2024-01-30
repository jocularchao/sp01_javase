package chao.a02methods;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/4/24 17:56
 * @description: java字符串就是unicode字符序列，Java没有内置的字符串类型，二是在标准Java类库中提供了一个预定义类。
 * 字符串型变量为引用型数据变量
 */
public class StringAPI2 {
    public static void main(String[] args) {
        String a = "hello";

        //String concat(String str)          将指定的字符串连接到该字符串的末尾。
        String a1 = a.concat("1");
        System.out.println(a1);


        //int hashCode()                     返回此字符串的哈希码
        System.out.println(a.hashCode());


        //String intern()
        //返回字符串对象的规范表示。
        System.out.println(a.intern());

        //boolean isEmpty()
        //返回 true如果，且仅当 length()为 0 。
        System.out.println(a.isEmpty());

        //int indexOf(int ch)                返回指定字符第一次出现的字符串内的索引。
        //int indexOf(int ch, int fromIndex) 返回指定字符第一次出现的字符串内的索引，以指定的索引开始搜索。
        //indexOf(String str)                返回指定子字符串第一次出现的字符串内的索引。
        //int indexOf(String str, int fromIndex)返回指定子串的第一次出现的字符串中的索引，从指定的索引开始。


        System.out.println(a.indexOf("ello"));
        System.out.println(a.indexOf("l",3));


        //int lastIndexOf(int ch)                返回指定字符第最后一次出现的字符串内的索引。
        //int lastIndexOf(int ch, int fromIndex) 返回指定字符最后一次出现的字符串内的索引，以指定的索引开始搜索。
        //lastIndexOf(String str)                返回指定子字符串最后一次出现的字符串内的索引。
        //int lastIndexOf(String str, int fromIndex)返回指定子串的最后一次出现的字符串中的索引，从指定的索引开始。

        System.out.println(a.lastIndexOf("ello"));
        System.out.println(a.lastIndexOf("l",2));


        //String trim()                         返回一个字符串，其值为此字符串，并删除任何前导和尾随空格。
        String a2= " hello ";
        System.out.println(a2.trim());


        //static String     valueOf()
        System.out.println(String.valueOf(true));
        System.out.println(String.valueOf('1'));
        char []chars = {'1','2','3'};
        System.out.println(String.valueOf(chars));
        System.out.println(String.valueOf(chars,1,2));
        System.out.println(String.valueOf(3.14));
        System.out.println(String.valueOf(3.14f));
        System.out.println(String.valueOf(3));
        System.out.println(String.valueOf(3L));

        StringAPI2 stringOtherAPI2 = new StringAPI2();
        System.out.println(String.valueOf(stringOtherAPI2));

    }
}
