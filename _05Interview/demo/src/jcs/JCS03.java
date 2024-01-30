package jcs;

import java.util.Stack;

/**
 * @author jocularchao
 * @date 2024-01-04 18:47
 * @description 二叉树的非递归后序遍历
 */
public class JCS03 {
    public static void main(String[] args) {
        BinaryTree<Character> a = new BinaryTree<>('A');
        BinaryTree<Character> b = new BinaryTree<>('B');
        BinaryTree<Character> c = new BinaryTree<>('C');
        BinaryTree<Character> d = new BinaryTree<>('D');
        BinaryTree<Character> e = new BinaryTree<>('E');
        BinaryTree<Character> f = new BinaryTree<>('F');

        a.left =b;
        a.right = c;
        b.left = d;
        b.right =e;
        c.left = f;
        BinaryTree.postOrder(a);


    }


}
class BinaryTree<E> {
    public E e;
    public BinaryTree<E> left,right;
    public BinaryTree(E e) {
        this.e = e;
    }

    //后序遍历
    //d e b f c a   后序遍历左子树、后序遍历右子树、打印结点
    public static <E> void postOrder(BinaryTree<E> root){
        if (root == null) return;   //非空判断
        //创建栈 完成元素的插入删除
        Stack<BinaryTree<E>> stack = new Stack<>();
        //
        BinaryTree<E> prev = null;
        BinaryTree<E> curr = root;

        while (curr != null | !stack.isEmpty()) {    //若cur过渡结点非空 或 栈非空
            while (curr!= null){    //遍历到最低层 左子树并赋值null
                stack.push(curr);
                curr = curr.left;
            }
            BinaryTree<E> temp = stack.peek().right;    //获取 最底层左子树的兄弟结点

            if (temp == null || temp == prev){  //若右子树为空 或 右子树有子节点
                BinaryTree<E> node = stack.pop();
                System.out.print(node.e + " ");
                prev = node;
            }else {
                curr = temp;
            }
        }
    }
}