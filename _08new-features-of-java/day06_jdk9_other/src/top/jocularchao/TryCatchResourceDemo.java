package top.jocularchao;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/10/1 0:07
 * @Description Try-Catch-Resource 做了简化
 */
public class TryCatchResourceDemo {
    public static void main(String[] args) throws IOException {
        //可以直接把变量丢进去不用把表达式整个写进去了
        InputStream inputStream = Files.newInputStream(Paths.get(""));
        try (inputStream){

        }
    }
}
