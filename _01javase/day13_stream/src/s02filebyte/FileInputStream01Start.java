package s02filebyte;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/22 23:46
 * @Description FileInputStream
 * 通过它来获取文件的输入流
 */
public class FileInputStream01Start {
    public static void main(String[] args) {
        try {  //IO相关操作会有很多影响因素，有可能出现异常，所以需要明确进行处理
            FileInputStream fileInputStream = new
                    FileInputStream("路径");
            //路径支持相对路径和绝对路径
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
