package jcs;

/**
 * @author jocularchao
 * @date 2024-01-04 18:35
 * @description 输出字符串中连续重复出现次数最多的字符和次数
 */
public class JCS02 {
    public static void findMaxAndCount(String str) {
        int maxCount = 0;   //最大出现次数
        char maxChar='\0';  //最大出现字符   默认空
        char currentChar='\0';
        int currentCount = 0;

        System.out.println(maxChar);
        for (int i = 0; i < str.length(); i++) {  //遍历字符串
            if (i == 0) {
                currentChar = str.charAt(i);
                currentCount++;
            } else {
                if (str.charAt(i) == currentChar) {
                    currentCount++;
                } else {    //遇到不相同的字符
                    if (currentCount > maxCount) {  //赋值max 并继续判断
                        maxCount = currentCount;
                        maxChar = currentChar;
                    }
                    currentChar = str.charAt(i);
                    currentCount = 1;
                }
            }
        }

        if (currentCount > maxCount) {  //遍历完成，最后判断赋值
            maxCount = currentCount;
            maxChar = currentChar;
        }

        System.out.println("最多连续重复出现的字符：" + maxChar);
        System.out.println("出现次数：" + maxCount);
    }

    public static void main(String[] args) {

        findMaxAndCount("14444112442aa44442244311222222244445444243334444ccc4444");
    }
}
