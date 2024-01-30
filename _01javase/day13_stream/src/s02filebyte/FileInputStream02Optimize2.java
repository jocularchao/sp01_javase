package s02filebyte;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/23 0:12
 * @Description FileInputStream实例再优化
 */
public class FileInputStream02Optimize2 {
    public static void main(String[] args) {
        //上次优化过于繁琐
        //注意，这种语法只支持实现了AutoCloseable接口的类！
        try(FileInputStream inputStream = new FileInputStream("路径")) {   //直接在try()中定义要在完成之后释放的资源

        } catch(IOException e){   //这里变成IOException是因为调用close()可能会出现，而FileNotFoundException是继承自IOException的
            e.printStackTrace();
        }
        //无需再编写finally语句块，因为在最后自动帮我们调用了close()
    }

}
