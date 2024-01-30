package top.jocularchao.s01easy;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/6/29 16:20
 * @Description 希尔排序
 */
public class E05ShellSort {

    public static void sort(Comparable[] a){
        //升序
        int h = 1;
        while (h<a.length/3){
            h=3*h+1;
        }
        while (h>=1){
            for (int i = h; i < a.length; i++) {
                for (int j = i; j >=h&& less(a[j],a[j-h]); j-=h) {
                    exch(a, j, j-h);
                }
            }
            h=h/3;
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
