package t02method;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/25 12:08
 * @Description sleep 休眠
 *
 */
public class Thread01Sleep {

    public static void main(String[] args) throws InterruptedException {
        //1 调用`sleep()`方法来让当前线程休眠一段时间
        System.out.println("l");
        Thread.sleep(2000);
        System.out.println("bw");
        Thread.sleep(2000);
        System.out.println("nb");
    }
}
