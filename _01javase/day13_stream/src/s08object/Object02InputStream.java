package s08object;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/24 21:19
 * @Description  ObjectInputStream
 */
public class Object02InputStream {
    public static void main(String[] args) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("./day13_stream/object.txt"))){
            People people = (People) inputStream.readObject();
            System.out.println(people.name);
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
