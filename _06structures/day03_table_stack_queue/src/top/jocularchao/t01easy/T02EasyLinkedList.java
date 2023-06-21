package top.jocularchao.t01easy;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/6/20 13:41
 * @description: 为避免插入和删除的线性开销，需要保证表可以不连续存储，即链表
 * <p>
 * 由一系列节点相连
 * 节点：表元素、到包含该元素后继元的节点的链 即next链 最后一个单元next链引用null
 * <p>
 * 功能上：
 * findKth 从表的第一个节点开始然后用后继的next链遍历该表 显然是线性时间的但常熟可能比数组是实现时要大，效率相对低
 * remove  修改一个next引用即可
 * insert  需要new操作符从系统取得一个新节点，再执行两次引用的调整
 * 插入和删除只涉及常数个节点链的改变
 */
public class T02EasyLinkedList {
    private int uSize;      //节点个数
    private T02Node head;   //头节点
    private T02Node ret;    //替head跑腿
    private T02Node reret;  //替head跑腿比ret慢一步

    //提供外部公共方法
    public int getuSize() {
        return uSize;
    }

    public void setuSize(int uSize) {
        this.uSize = uSize;
    }

    public T02Node getHead() {
        return head;
    }

    public void setHead(T02Node head) {
        this.head = head;
    }

    public T02Node getRet() {
        return ret;
    }

    public void setRet(T02Node ret) {
        this.ret = ret;
    }

    public T02Node getReret() {
        return reret;
    }

    public void setReret(T02Node reret) {
        this.reret = reret;
    }

    //打印链表
    public void printList() {
        //ret为临时节点，以this.ret.next遍历直到ret为空停止，打印每个节点相应信息
        for (this.ret = this.head; this.ret != null; this.ret = this.ret.next) {
            System.out.print(this.ret.data + " ");
        }
        System.out.println();
    }

    //创建链表
    //此方法用现成数组转换链表
    public void createList(int[] array) {
        //初始化节点个数
        uSize = 0;
        for (int i = 0; i < array.length; i++, this.uSize++) {
            T02Node node = new T02Node(array[i]);
            if (this.head == null) {
                this.head = node;
                this.ret = this.head;
            } else {
                this.ret.next = node;
                this.ret = node;
            }
        }
        this.printList();
    }

    //插入节点
    public void insertNode(int ins, int data) {
        T02Node node = new T02Node(data);
        if (ins == 0) {      //头插
            node.next = this.head;
            this.head = node;
        } else if (ins < 0 || ins > this.uSize) {
            System.out.println("插入位置异常");
            return;
        } else {
            int count = 0;
            for (this.ret = this.head; this.ret != null; this.reret = this.ret, this.ret = this.ret.next) {
                if (ins == count) {    //中间插
                    node.next = this.reret.next;
                    this.reret.next = node;

                }
                count++;
            }
            if (ins == this.uSize) {   //尾插
                this.reret.next = node;
            }
        }
        System.out.println("插入之后的链表为：");
        this.printList();
    }

    //删除节点
    public void deleteNode(int del) {
        if (this.head.data == del) {
            this.head = this.head.next;
            this.printList();
            return;
        } else {
            for (this.ret = this.head; this.ret != null; this.reret = this.ret, this.ret = this.ret.next) {
                if (this.ret.data == del) {
                    this.reret.next = this.ret.next;
                    System.out.println("删除后的链表:");
                    this.printList();
                    return;
                }
            }

        }
        System.out.println("链表中无此节点，无法删除");
    }


    //修改节点
    public void modifyList(int pos, int num) {
        for (this.ret = this.head; this.ret != null; this.ret = this.ret.next) {
            if (pos == this.ret.data) {
                this.ret.data = num;
                System.out.print("修改之后的链表为：");
                this.printList();
                return;
            }
        }
        System.out.println("无此节点，无法修改！");

    }
    //查找节点

    public void findList(int val){
        int count = 0;
        for (this.ret = this.head;this.ret != null;this.reret = this.ret,this.ret = this.ret.next) {
            if(this.ret.data == val){
                System.out.println("所查找的节点在第" + count + "位(从0开始计数)！");
                break;
            }
            count++;
        }
        if(this.ret == null){
            System.out.println("查找位置异常！");
        }
    }
}
