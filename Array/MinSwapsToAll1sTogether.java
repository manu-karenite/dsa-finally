package Array;

public class MinSwapsToAll1sTogether {
    static int minSwap(int[] arr, int n) {
        int good = 0 ;
        for (int x : arr) {
            if (x == 1) ++good;
        }
        int bad = 0;
        for (int i = 0 ; i<good; ++i) {
            if (arr[i] != 1) ++bad;
        }
        int ans = bad;
        for (int j = good; j < n ; ++j) {
            int outIdx = j-good;
            int inIdx = j;
            if (arr[outIdx] != 1) --bad;
            if (arr[inIdx] != 1) ++bad;
            ans = Math.min(ans,bad);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,1,0,0,1};
        int n = arr1.length;
        System.out.println(minSwap(arr1, n));
    }
}
