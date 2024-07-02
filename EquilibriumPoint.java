public class EquilibriumPoint {
    public static int equilibriumPoint(long nums[]) {
        int n= nums.length ;
        int[]pref= new int[n];
        int[]suff= new int[n] ;
        int sum1 =0 ;
        for(int i=0; i<n; i++){
            sum1 += nums[i] ;
            pref[i] =sum1 ;
        }
        int sum2 =0 ;
        for(int j=n-1; j>=0; j--){
            sum2 += nums[j] ;
            suff[j]= sum2 ;
        }
        for(int i=0; i<n; i++){
            if(pref[i]==suff[i]){
                return i+1 ;
            }
        }
        return -1 ;

    }
    public static void main(String[] args) {

        long[] nums= {1,7,3,6,5,6};
        System.out.println(equilibriumPoint(nums));
    }
}
