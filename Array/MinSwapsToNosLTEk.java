package Array;

public class MinSwapsToNosLTEk {
    static int minSwap(int[] arr, int n, int k) {
        int good = 0 ;
        for (int x : arr) {
            if (x <= k) ++good;
        }
        int bad = 0;
        for (int i = 0 ; i<good; ++i) {
            if (arr[i] > k) ++bad;
        }
        int ans = bad;


        for (int j = good; j < n ; ++j) {
            int outIdx = j-good;
            int inIdx = j;
            if (arr[outIdx] > k) --bad;
            if (arr[inIdx] > k) ++bad;
            ans = Math.min(ans,bad);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,1,0,0,1};
        int n = arr1.length;
        int k = 5;
        System.out.println(minSwap(arr1, n, k));
    }
}
