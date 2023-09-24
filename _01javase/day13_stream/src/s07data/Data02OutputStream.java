package s07data;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/24 21:12
 * @Description DataOutputStream
 * 写入基本数据类型
 * 写入的是二进制数据，并不是写入的字符串，使用DataInputStream可以读取，一般他们是配合一起使用的
 */
public class Data02OutputStream {
    public static void main(String[] args) {
        try (DataOutputStream dataOutputStream = new
                DataOutputStream(new
                FileOutputStream("...."))) {
            dataOutputStream.writeBoolean(false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
