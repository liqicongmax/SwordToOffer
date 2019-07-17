package 头条算法;

/**
 * @author liqicong@myhexin.com
 * @date 2019/7/17 17:03
 */
public class 两个有序数组找中位数 {
    /**
     * TODO
     */
    private static int INT_MIN = Integer.MIN_VALUE;
    private static int INT_MAX = Integer.MAX_VALUE;

    static double findMid(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        if (n > m)   //保证数组1一定最短
            return findMid(nums2, nums1);
        int L1 = 0;
        int L2 = 2;
        int R1 = 0;
        int R2 = 0;
        int c1 = 0;
        int c2 = 0;
        int lo = 0, hi = 2 * n;  //我们目前是虚拟加了'#'所以数组1是2*n长度
        while (lo <= hi)   //二分
        {
            c1 = (lo + hi) / 2;  //c1是二分的结果
            c2 = m + n - c1;
            L1 = (c1 == 0) ? INT_MIN : nums1[(c1 - 1) / 2];   //map to original element
            R1 = (c1 == 2 * n) ? INT_MAX : nums1[c1 / 2];
            L2 = (c2 == 0) ? INT_MIN : nums2[(c2 - 1) / 2];
            R2 = (c2 == 2 * m) ? INT_MAX : nums2[c2 / 2];

            if (L1 > R2)
                hi = c1 - 1;
            else if (L2 > R1)
                lo = c1 + 1;
            else
                break;
        }
        return (Math.max(L1, L2) + Math.min(R1, R2)) / 2.0;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 8};
        int[] arr2 = {1, 3, 4};
        System.out.println(findMid(arr1, arr2));
    }
}
