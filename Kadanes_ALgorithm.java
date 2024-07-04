public class Kadanes_ALgorithm {
    public static long maxSubarraySum(int[] arr) {
        long maxi = Long.MIN_VALUE;
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > maxi) {
                maxi = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int[]arr= {1,2,3,-5,9} ;
        System.out.println(maxSubarraySum(arr));
    }
}
