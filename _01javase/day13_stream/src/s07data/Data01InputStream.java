package s07data;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/24 21:12
 * @Description DataInputStream
 * FilterInputStream的子类，同样采用装饰者模式
 * 最大的不同是它支持基本数据类型的直接读取
 */
public class Data01InputStream {
    public static void main(String[] args) {
        try (DataInputStream dataInputStream = new
                DataInputStream(new
                FileInputStream("..."))){
            System.out.println(dataInputStream.readBoolean());   //直接将数据读取为任意基本数据类型
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
