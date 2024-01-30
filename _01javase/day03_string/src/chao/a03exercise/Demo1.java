package chao.a03exercise;

import java.util.Random;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/4/24 18:37
 * @description: 使用String完成随机五位的验证码
 */
public class Demo1 {
    public static void main(String[] args) {
        //1、定义字典
        String datas="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*(){}:?>|";

        //2、从字典中随机抽取五个字符
        String code="";
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            char c = datas.charAt(random.nextInt(datas.length()));
            code+=c;
        }
        System.out.println(code);
    }
}
