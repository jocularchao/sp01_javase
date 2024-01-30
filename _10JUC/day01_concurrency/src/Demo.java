/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/10/16 18:47
 * @Description 用多线程代替数组的普通排序
 */
public class Demo {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2};

        for (int i : arr) {
            new Thread(() -> {
                try {
                    Thread.sleep(i * 1000);
                    System.out.println(i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }).start();
        }
    }
}
