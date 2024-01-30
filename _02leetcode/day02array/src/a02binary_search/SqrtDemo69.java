package a02binary_search;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/10/17 9:25
 * @Description x的平方根
 */
public class SqrtDemo69 {
    public static void main(String[] args) {


    }

    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int ans = -1;

        while (left<=right) {
            int mid = left+((right-left)>>1);

            if ((long)mid*mid <=x) {
                ans = mid;
                left = mid+1;
            }else {
                right = mid -1;
            }
        }
        return  ans;
    }
}
