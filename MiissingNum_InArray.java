public class MiissingNum_InArray {
    public static int missingNumber(int n, int arr[]) {

        int total = n*(n+1)/2 ;
        int sum =0 ;
        for(int i=0; i<arr.length; i++){
            sum+= arr[i] ;
        }
        return total-sum ;
    }
    public static void main(String[] args) {
        int[]nums={1,2,3,5} ;
        int k= 5 ;
        System.out.println(missingNumber(k,nums));
    }
}
