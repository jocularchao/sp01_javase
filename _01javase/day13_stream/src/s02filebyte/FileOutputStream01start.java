package s02filebyte;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/23 17:28
 * @Description FileOutputStream文件字节输出流
 */
public class FileOutputStream01start {
    public static void main(String[] args) {
        try(FileOutputStream outputStream =
                    new FileOutputStream("./day13_stream/fileoutput.txt")) {

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
