package zhouyichao;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/5/18 10:08
 * @description:
 */
public class OD_02string {
    public static void main(String[] args) {
        /*String s1;  //n1                ab
        String s2;  //n2  >=  n1+k      aabcd*/
        //s2 字串 n1+k  包含s1           1  0
        //s2 无法覆盖 s1  返回-1
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s1 = sc.next();  //ab
            String s2 = sc.next();  //aabcd
            int k = sc.nextInt();

            int n1 =s1.length();
            int n2 = s2.length();

            int startIndex=0;
            int endIndex=n1+k;
            if (n2 >= n1 + k && new OD_02string().isContains(s1, s2)) {
                while (startIndex>=0&&endIndex<=s2.length()-1){
                    if (! new OD_02string().isContains(s1, s2.substring(startIndex, endIndex))){
                        startIndex++;
                        endIndex++;
                    }else if (new OD_02string().isContains(s1, s2.substring(startIndex, endIndex))){
                        System.out.println(startIndex);
                        return;
                    }
                }
            } else {
                System.out.println(-1);
            }
        }
    }

    public boolean isContains(String s1, String s2) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < s2.length(); i++) {
            set.add(String.valueOf(s2.charAt(i)));
        }
        for (int j = 0; j < s1.length(); j++) {
            if (set.add(String.valueOf(s1.charAt(j)))) {
                return false;
            }
        }
        return true;
    }
}
