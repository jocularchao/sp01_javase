package s02filebyte;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/23 11:33
 * @Description FileInputStream的read方法
 * 读取文件里面的内容
 */
public class FileInputStream04Read {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new
                FileInputStream("./day13_stream/test.txt");){
            //1 available方法能查看当前可读的剩余字节数量
            //空格占1个字节
            System.out.println(fileInputStream.available());
            int temp;
            //2 read方法读取一个字节的数据
            //英文字母只占1字节，中文占2字节，字节读完后，再次读取就会返回-1
            /*while ((temp = fileInputStream.read()) != -1){
                System.out.println((char) temp);
            }*/
            //3 一次性读取
            /*byte[] bytes = new byte[fileInputStream.available()];
            System.out.println(fileInputStream.read(bytes));
            System.out.println(new String(bytes));*/

            //4 也可以控制读取数量
            /*byte[] bytes1 = new byte[fileInputStream.available()];
            System.out.println(fileInputStream.read(bytes1,0,2));
            System.out.println(new String(bytes1));*/
            //5 skip
            System.out.println(fileInputStream.skip(3));


            System.out.println((char)fileInputStream.read());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
