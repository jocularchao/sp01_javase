package chao.a01create;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/4/23 20:10
 * @description:
 */
public class String02Char {
    public static void main(String[] args) {
        String greeting = "hello$";
        //length方法将返回采用UTF-16编码表示的给定字符串所需要的代码单元数量
        int n = greeting.length(); //5
        System.out.println(n);

        //要想得到实际长度，即码点数量，可以调用
        /**
         * int codePointCount(int beginIndex, int endIndex)   返回此 String指定文本范围内的Unicode代码点数。
         *
         * 文本范围始于指定beginIndex并延伸到char在索引endIndex - 1 。 因此，文本范围的长度（在char秒）为endIndex-beginIndex
         *
         * beginIndex - 索引到第一个 char的文本范围。
         * endIndex - 最后一个 char之后的索引。
         *
         */
        int cpCount = greeting.codePointCount(0, greeting.length());
        System.out.println(cpCount);

        //要想得到第i个码点
        /**
         * offsetByCodePoints(int index, int codePointOffset)   返回此 String内的指数，与 index codePointOffset代码点。
         * 参数 :
         * index - 要偏移的索引
         * codePointOffset - 代码点的偏移量
         * 结果 :
         * 这个指数在这个 String
         * 异常 :
         * IndexOutOfBoundsException -如果 index接着这个长度负或更大 String ，或如果 codePointOffset为正，并且开始与该子串
         * index有少于 codePointOffset代码点，或者如果 codePointOffset为负且前的子字符串 index具有比的绝对值较少的
         * codePointOffset代码点。
         *
         *
         *
         *
         * codePointAt(int index)
         * 返回指定索引处的字符（Unicode代码点）。
         * 该索引指的是char值（Unicode码单位），范围从0到length() - 1 。
         * 如果在给定索引处指定的char值处于高代理范围内，则以下指数小char值String的长度，并且下列指数的char值处于低代理范围，
         * 则补码代码相应的这个代理对被退回。 否则，返回给定索引处的char值。
         *
         * 参数
         * index - 指数为 char值
         * 结果
         * 字符的代码点值在 index
         * 异常
         * IndexOutOfBoundsException - 如果 index参数为负数或不小于此字符串的长度。
         */
        int index = greeting.offsetByCodePoints(0, 3);
        System.out.println(index);
        int cp = greeting.codePointAt(index);
        System.out.println(cp);


        //遍历字符串，并看到每一个码点   看不懂********************************************************************************

        for (int i = 0; i < greeting.length(); i++) {
            int cp1 = greeting.codePointAt(i);
            if (Character.isSupplementaryCodePoint(cp1)) {
                i += 2;
            } else {
                i++;
            }
        }

    }


}
