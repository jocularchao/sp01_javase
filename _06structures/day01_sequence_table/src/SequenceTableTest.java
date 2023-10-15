/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/10/15 17:48
 * @Description
 */
public class SequenceTableTest {
    public static void main(String[] args) {
        SequenceTable<Integer> list = new SequenceTable<>();
        for (int i = 0; i < 20; i++) {
            list.add(i, i);
        }
        System.out.println(list.remove(19));
        System.out.println(list);
    }
}
