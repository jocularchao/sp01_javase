package s04buffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/24 20:41
 * @Description BufferedReader 缓冲字符流
 */
public class Buffer03Reader {
    public static void main(String[] args) {
        try (BufferedReader reader = new
                BufferedReader(new FileReader("./day13_stream/buf-in.txt"))){
            //支持按行读取
            //读取后直接得到一个字符串
            System.out.println(reader.readLine());
            //还能把每一行内容依次转换为集合类提到的Stream流
            reader
                    .lines()
                    .limit(2)
                    .distinct()
                    .sorted()
                    .forEach(System.out::println);

            //同样也支持 mark() 和 reset() 操作


        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
