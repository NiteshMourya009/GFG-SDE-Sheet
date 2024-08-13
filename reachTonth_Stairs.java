import java.util.Arrays;

public class reachTonth_Stairs {
    public static int climb(int n, int[]dp){
        if(dp[n] != -1){
            return dp[n] ;
        }
        int mod =1000000007;
        if(n<=1){
            return dp[n]=1 ;
        }
        dp[n]= (climb(n-1, dp)+ climb(n-1, dp)) % mod;
        return dp[n] ;
    }
    public static void main(String[] args) {
        int n=84 ;
        int[]dp= new int[n+1] ;
        Arrays.fill(dp, -1);
        System.out.println(climb(n, dp));

    }
}
