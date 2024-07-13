import java.util.Arrays;
import java.util.HashMap;

public class LongestConsecutiveSubSequence {
    public static int findLongestConseqSubseq(int arr[], int N)
    {

        int[]nums= new int[100000];
        for(int i=0;i<N; i++){
            nums[arr[i]]++ ;
        }
        int max=Integer.MIN_VALUE;
        int cnt=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                cnt++ ;
                max= Math.max(max, cnt) ;
            }
            else{
                cnt =0 ;
            }
        }
        return max ;
    }
    public static void main(String[] args) {
        int[]a ={1,9,3,10,4,20,2} ;

        System.out.println(findLongestConseqSubseq(a , a.length));
    }
}