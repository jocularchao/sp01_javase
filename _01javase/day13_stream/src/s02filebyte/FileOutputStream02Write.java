package s02filebyte;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/23 17:32
 * @Description FileOutputStream的write方法
 */
public class FileOutputStream02Write {
    public static void main(String[] args) {
        try(FileOutputStream outputStream =
                    new FileOutputStream("./day13_stream/fileoutput.txt")) {
            outputStream.write('c');//同read一样，可以直接写入内容
            outputStream.write("write".getBytes());//也可以直接写入byte[]
            outputStream.flush();  //建议在最后执行一次刷新操作（强制写入）来保证数据正确写入到硬盘文件中
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
