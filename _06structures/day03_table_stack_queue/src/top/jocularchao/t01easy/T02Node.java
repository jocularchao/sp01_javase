package top.jocularchao.t01easy;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/6/20 13:57
 * @description:
 */
public class T02Node {
    int data;       //数据域
    T02Node next;   //地址域

    //构造方法

    public T02Node(int data) {
        this.data = data;
        this.next = null;
    }
}
