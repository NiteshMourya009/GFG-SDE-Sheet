import java.util.ArrayList;
import java.util.Arrays;

public class MinimizeTheSumProduct {
    public static int minimumProduct(int[]arr1, int[]arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2) ;
        int sum= 0 ;
        int n= arr2.length-1 ;
        for(int i=0; i<arr1.length; i++){
            sum += arr1[i]*arr2[n] ;
            n-- ;
        }
        return sum ;
    }
    public static void main(String[] args) {
        int[]arr1= {6,5,4} ;
        int[]arr2= {3,1,1};
        System.out.println(minimumProduct(arr1,arr2));
    }
}
