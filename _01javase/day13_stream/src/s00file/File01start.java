package s00file;

import java.io.File;
import java.util.Arrays;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/24 20:00
 * @Description 文件对象file
 *
 */
public class File01start {
    public static void main(String[] args) {
        //直接创建文件对象
        File file = new
                File("./day13_stream/file.txt");

        System.out.println(file.exists());//此文件是否存在
        System.out.println(file.length());//获取文件的大小
        System.out.println(file.isDirectory());//是否为一个文件夹
        System.out.println(file.canRead());//是否可读
        System.out.println(file.canWrite());//是否可写
        System.out.println(file.canExecute()); //是否可执行

        //通过File对象，我们就能快速得到文件的所有信息，
        // 如果是文件夹，还可以获取文件夹内部的文件列表等内容
        File file1 = new File("./");
        System.out.println(Arrays.toString(file1.list()));//快速获取文件夹下的文件名称列表

        ////所有子文件的File对象
        for (File f : file1.listFiles()) {
            System.out.println(f.getAbsoluteFile());//获取文件的绝对路径
        }


    }
}
