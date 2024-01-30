package s03filecharacter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/24 12:13
 * @Description Reader和Writer来拷贝纯文本文件
 */
public class Writer02FileWriterCopy {
    public static void main(String[] args) {
        try (FileReader reader = new
                FileReader("./day13_stream/filereader.txt");
             FileWriter writer = new
                     FileWriter("./day13_stream/filwriter.txt");) {
            char[] arr = new char[10];

            reader.read(arr);
            System.out.println(arr);
            writer.write(new String(arr));
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
