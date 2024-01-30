package s04buffer;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/24 20:22
 * @Description BufferedInputStream 类覆盖了被装饰的输入流的读数据行为，利用缓冲区来提高读
 * 数据的效率
 * 缓冲字节流
 *
 * 实际上进行I/O操作的并不是BufferedInputStream，而是我们传入的FileInputStream.
 * 而BufferedInputStream虽然有着同样的方法，但是进行了一些额外的处理然后再调用FileInputStream的同名方法，
 * 这样的写法称为`装饰者模式`，
 *
 * I/O操作一般不能重复读取内容,而缓冲流提供了缓冲机制，一部分内容可以被暂时保存
 */
public class Buffer01InputStream {
    public static void main(String[] args) {
        // 传入FileInputStream
        try(BufferedInputStream bufferedInputStream = new
                BufferedInputStream(new FileInputStream("./day13_stream/buf-in.txt"))){
            System.out.println((char) bufferedInputStream.read());
            bufferedInputStream.mark(1);
            System.out.println((char) bufferedInputStream.read());
            System.out.println((char) bufferedInputStream.read());
            bufferedInputStream.reset();
            System.out.println((char) bufferedInputStream.read());

            //因为`mark()`后保存的读取内容是取`readlimit`和BufferedInputStream类的缓冲区大小两者中的最大值，
            // 而并非完全由`readlimit`确定。因此我们限制一下缓冲区大小


        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
