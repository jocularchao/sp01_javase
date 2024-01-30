/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/12/5 13:03
 * @Description 二叉树
 */
public class BinaryTree<E> {
    public E e;

    public BinaryTree<E> left,right;

    public BinaryTree(E e) {
        this.e = e;
    }

    //前序遍历
    //a b d e c f ....
    private static <E> void preOrder(BinaryTree<E> root){
        if (root==null) return;
        System.out.print(root.e +" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    //中序遍历
    //a b c d e f
    private static <E> void inOrder(BinaryTree<E> root){
        if (root==null) return;
        inOrder(root.left);
        System.out.println(root.e);
        inOrder(root.right);
    }

    //后序遍历
    //d e b f c a   后序遍历左子树、后序遍历右子树、打印结点
    private static <E> void postOrder(BinaryTree<E> root){
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.e);
    }


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

        System.out.println(a.left.left.e);

        preOrder(a);
    }



}
