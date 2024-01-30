package s03filecharacter;

import java.io.FileReader;
import java.io.IOException;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/23 17:49
 * @Description FileReader
 * 字符流不同于字节，字符流是以一个具体的字符进行读取，因此它只适合读纯文本的文件，如果是其他类型的文件不适用
 */
public class Reader01FileReader {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("./day13_stream/filereader.txt")) {
            //reader.skip(1);
            //System.out.println((char) reader.read());  //现在是按字符进行读取，而不是字节，因此可以直接读取到中文字符
            //字符流只接受char[]类型进行存储：
            char[] str = new char[10];
            reader.read(str);
            System.out.println(str);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
