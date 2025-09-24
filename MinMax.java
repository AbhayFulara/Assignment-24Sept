public class MinMax{
    static int Check (int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        int maxOfRest = Check(arr, n - 1);

        if (arr[n - 1] > maxOfRest) {
            return arr[n - 1];
        } else {
            return maxOfRest;
        }
    }

    public static void main(String[] args) {
        int[] arr = {7,2,1,5,6,-1,10,11};
        int n=arr.length;
        int max = Check(arr, n);
        System.out.println(max);
    }
}