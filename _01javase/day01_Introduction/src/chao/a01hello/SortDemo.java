package chao.a01hello;

/**
 * @author jocularchao
 * @date 2024-01-30 9:39
 * @description
 */
public class SortDemo {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,7,8,6};
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j< arr.length-i-1 ; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
