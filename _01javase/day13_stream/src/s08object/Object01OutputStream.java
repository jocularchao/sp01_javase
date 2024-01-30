package s08object;

import java.io.*;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/24 21:19
 * @Description ObjectOutputStream
 * 它不是继承自FilterInputStream的。
 * ObjectOutputStream不仅支持基本数据类型，通过对对象的序列化操作，以某种格式保存对象，来支持对象类型的IO.
 */
public class Object01OutputStream {
    public static void main(String[] args) {
        try (ObjectOutputStream outputStream = new
                ObjectOutputStream(
                        new FileOutputStream("./day13_stream/object.txt"));
             ){
            People people = new People("lbw");
            outputStream.writeObject(people);
            outputStream.flush();
            System.out.println(people.name);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }


}
class People implements Serializable {//必须实现Serializable接口才能被序列化
    String name;

    public People(String name) {
        this.name = name;
    }
}
