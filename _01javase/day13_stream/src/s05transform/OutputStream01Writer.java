package s05transform;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/24 20:50
 * @Description Writer的子类OutputStreamWriter
 * 转换流
 *
 * OutputStream又只支持byte类型,如果要往里面写入内容，进行数据转换就会很麻烦
 *
 */
public class OutputStream01Writer {
    public static void main(String[] args) {
        try(OutputStreamWriter writer = new
                OutputStreamWriter(new FileOutputStream(".."))){  //虽然给定的是FileOutputStream，但是现在支持以Writer的方式进行写入
            writer.write("lbwnb");   //以操作Writer的样子写入OutputStream
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
