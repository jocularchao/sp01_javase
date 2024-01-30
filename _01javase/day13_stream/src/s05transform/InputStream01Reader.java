package s05transform;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/24 20:50
 * @Description Reader的子类InputStreamReader
 * 转换流
 *
 * 能够按字符的方式读取
 *
 */
public class InputStream01Reader {
    public static void main(String[] args) {
        try(InputStreamReader reader = new InputStreamReader(new FileInputStream("..."))){  //虽然给定的是FileInputStream，但是现在支持以Reader的方式进行读取
            System.out.println((char) reader.read());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
