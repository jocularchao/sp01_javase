package top.jocularchao.o01book;



/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/6/20 21:27
 * @description:
 */
public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("《java核心技术（第11版）》", "jocularchao", 190.0);

        System.out.println("书名："+book.getTitle());

    }
}
