package s02filebyte;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/23 0:09
 * @Description FileInputStream实例优化
 */
public class FileInputStream02Optimize1 {
    public static void main(String[] args) {
        FileInputStream inputStream = null;

        try {
            inputStream = new FileInputStream("");



        }catch (IOException e){
            e.printStackTrace();
        }finally {
            //建议在finally中进行，因为关闭流是任何情况都必须要执行的！
            try {
                if (inputStream!=null) inputStream.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
