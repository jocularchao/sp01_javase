package s02filebyte;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/23 17:38
 * @Description FileOutputStream实现文件拷贝
 */
public class FileOutputStream03Copy {
    public static void main(String[] args) {
        try(FileInputStream inputStream = new FileInputStream("./day13_stream/test.txt");
            FileOutputStream outputStream = new FileOutputStream("./day13_stream/fileoutput.txt")) {

            byte[] bytes = new byte[10];  //创建字节数组缓存区
            int temp; //创建临时变量用于存储本地读取字节数
            while ((temp = inputStream.read(bytes))!=-1){
                outputStream.write(bytes,0,temp);  ////写入对应长度的数据到输出流

            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
