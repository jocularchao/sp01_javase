package top.jocularchao.s01easy;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/6/29 15:27
 * @Description
 */
public class E03InsertionSort {
    public static void sort(Comparable[]a){
        //升序
        for (int i = 1; i < a.length; i++) {
            //将a[i]输入到a[i-1]a[i-2]....之中
            for (int j = i; j >0&&less(a[j],a[j-1]) ; j--) {
                exch(a, j, j-1);
            }
        }
    }

    public static boolean less(Comparable v,Comparable w){
        return v.compareTo(w)<0;
    }
    public static void exch(Comparable[]a,int i ,int j){
        Comparable t = a[i];
        a[i]=a[j];
        a[j]= t;
    }

    public static void show(Comparable[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static boolean isSorted(Comparable[] a){
        for (int i = 1; i < a.length; i++) {
            if (less(a[i],a[i-1])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Integer a[] = {6,5,4,3,2,1};
        sort(a);
        assert isSorted(a);
        show(a);
    }
}
