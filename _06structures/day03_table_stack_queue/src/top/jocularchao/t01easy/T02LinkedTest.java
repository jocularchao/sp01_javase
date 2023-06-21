package top.jocularchao.t01easy;

import java.util.Scanner;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/6/20 21:17
 * @description: 链表测试类
 */
public class T02LinkedTest {
    public static void main(String[] args) {
        int[] array = {6, 2, 3, 4, 5};
        T02EasyLinkedList operaList = new T02EasyLinkedList();
        System.out.print("原链表为：");
        operaList.createList(array);
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入插入位置(从0开始)ins=");
        int ins = scanner.nextInt();
        System.out.print("请输入待插元素值data=");
        int data = scanner.nextInt();
        /*int ins = 6;
        int data = 8;*/
        operaList.insertNode(ins, data);


        System.out.print("请输入待删节点数据域的值del=");
        int del = scanner.nextInt();
        /*int del = 8;*/
        operaList.deleteNode(del);


        System.out.print("请输入需要修改节点数据域的值(从0开始计数)pos=");
        int pos = scanner.nextInt();
        System.out.print("请输入修改后的值num=");
        int num = scanner.nextInt();
        /*int num = 12;
        int pos = 3;*/
        operaList.modifyList(pos, num);


        System.out.print("请输入要查找节点数据域的值val=");
        int val = scanner.nextInt();
        /*int val = 12;*/
        operaList.findList(val);
    }
}
