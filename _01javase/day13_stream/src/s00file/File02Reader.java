package s00file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/24 20:07
 * @Description 如果我们希望读取某个文件的内容，可以直接将File作为参数传入字节流或是字符流
 *
 */
public class File02Reader {
    public static void main(String[] args) {
        File file = new File("./day13_stream/file.txt");

        try(FileInputStream inputStream = new FileInputStream(file)){
            System.out.println(inputStream.available());

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
