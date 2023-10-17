package a02binary_search;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/10/17 11:53
 * @Description  有效的完全平方数
 */
public class SqrtDemo367 {

    public boolean isPerfectSquare(int num) {
        int l = 0;
        int r = num;

        while (l<=r) {
            int mid = l+((r - l)>>1);
            if ((long)mid*mid == num)
                return true;
            else if ((long)mid*mid<num) {
                l = mid+1;
            }else {
                r = mid -1;
            }
        }
        return false;
    }
}
