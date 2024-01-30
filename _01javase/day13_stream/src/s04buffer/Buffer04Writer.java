package s04buffer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/24 20:41
 * @Description BufferedWriter 缓冲字符流
 */
public class Buffer04Writer {
    public static void main(String[] args) {
        try (BufferedWriter reader = new BufferedWriter(new
                FileWriter("./day13_stream/buf-out.txt"))){
            reader.newLine();   //使用newLine进行换行
            reader.write("汉堡做滴彳亍不彳亍");   //可以直接写入一个字符串
            reader.flush();   //清空缓冲区
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
