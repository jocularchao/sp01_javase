package top.jocularchao.t02api;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/6/22 18:42
 * @description:  提供了List的双链表实现
 *
 * 新项的插入和现有项的删除花销很少
 * 但不容易做索引 所以对get的调用花销大
 *
 * 末端添加 add(i)  O（1）
 * 首端添加 add(0,i) O(1)
 *
 * get(i) O(N)
 * 但是用增强for循环时 get在任意List的运行时间都是O(N)
 */
public class LinkedListTest {
}
