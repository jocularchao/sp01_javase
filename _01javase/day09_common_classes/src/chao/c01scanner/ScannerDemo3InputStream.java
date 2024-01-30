package chao.c01scanner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/24 21:09
 * @Description 可以使用Scanner来扫描其他的输入流
 */
public class ScannerDemo3InputStream {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new FileInputStream(".."));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
