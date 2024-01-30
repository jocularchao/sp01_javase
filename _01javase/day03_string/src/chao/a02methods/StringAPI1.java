package chao.a02methods;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/4/24 12:24
 * @description:
 */
public class StringAPI1 {
    public static void main(String[] args) {

        String name = "jocularchao";
        //public int length()                                   返回此字符串的长度
        System.out.println(name.length());

        //public char charAt(int index)                         获取某个索引位置处的字符
        char o=name.charAt(10);
        System.out.println(o);

        //遍历字符串的每个字符
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i)+" ");
        }
        System.out.println();

        //public char[] toCharArray()：                          将当前字符串转换成字符数组返回
        char[] names = name.toCharArray();
        System.out.println(names);
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]+" ");
        }
        System.out.println();

        //public String substring(int beginIndex, int endIndex) 根据开始和结束索引进行截取，得到新的字符串（包前不包后）
        String name1 = name.substring(0, 2);
        System.out.println(name1);

        //public String substring(int beginIndex)               从传入的索引处截取，截取到末尾，得到新的字符串
        String name2 = name.substring(2);
        System.out.println(name2);

        //public String replace(CharSequence target,CharSequence replacement) 使用新值，将字符串中的旧值替换，得到新的字符串
        String name3 = name.replace("chao", "****");
        System.out.println(name3);

        //boolean contains(CharSequence s)   当且仅当此字符串包含指定的char值序列时才返回true。
        System.out.println(name.contains("chao"));
        System.out.println(name.contains("cho"));

        //boolean startsWith(String prefix)    测试此字符串是否以指定的前缀开头。
        System.out.println(name.startsWith("jo"));
        //boolean endsWith(String prefix)    测试此字符串是否以指定的前缀结尾。
        System.out.println(name.endsWith("ao"));

        //public String[] split(String regex)                   根据传入的规则切割字符串，得到字符串数组返回
        String name4 = "jocular,chao";
        String [] splits = name4.split(",");

        for (int i = 0; i < splits.length; i++) {
            System.out.print(splits[i]+" ");
        }
        System.out.println();
    }
}
