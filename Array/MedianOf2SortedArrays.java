package Array;

public class MedianOf2SortedArrays {
    static double medianOf2(int[] a, int[] b) {
        int n1 = a.length;
        int n2 = b.length;
        int curr = -1;
        int prev = -1;
        int i =0;
        int j = 0;
        for (int count = 0 ; count <= (n1+n2)/2 ; ++count) {
            prev = curr;
            if (i!=n1 && j!=n2) {
                curr = a[i] < b[j] ? a[i++] : b[j++];
            } else if (i < n1) {
                curr = a[i++];
            } else {
                curr = b[j++];
            }
        }
        if ((n1+n2) % 2 == 0) {
            return (prev +  curr)/2.0;
        }
        return curr;
    }
    public static void main(String[] args) {
        int[] arr1 = { 1, 12, 15, 26, 38 };
        int[] arr2 = { 2, 13, 17, 30, 45 };
        System.out.println(medianOf2(arr1, arr2));
    }
}
