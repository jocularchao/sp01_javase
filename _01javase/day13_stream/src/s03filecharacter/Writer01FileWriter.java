package s03filecharacter;

import java.io.FileWriter;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/23 17:50
 * @Description FileWriter
 */
public class Writer01FileWriter {
    public static void main(String[] args) {
        try(FileWriter writer = new
                FileWriter("./day13_stream/filwriter.txt")) {
            System.out.println(writer.getEncoding());
            writer.getEncoding();
            writer.write("牛");
            //append支持像StringBuilder那样的链式调用，返回的是Writer对象本身
            writer.append("牛");
            writer.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
