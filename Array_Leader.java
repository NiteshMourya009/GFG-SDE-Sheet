import java.util.ArrayList;
import java.util.* ;
public class Array_Leader {
    public static ArrayList<Integer> isLeader(int[]arr){
        ArrayList<Integer> list = new ArrayList<>();
        int n= arr.length ;
        int maxi = arr[n - 1];
        for( int i = n - 1; i>=0; i-- ){
            if( arr[i] >= maxi ){
                list.add(arr[i]);
                maxi = arr[i];
            }
            maxi = Math.max(maxi,arr[i]);
        }
        Collections.reverse(list);
        return list ;
    }
    public static void main(String[] args) {
        int []nums= {16,17,4,3,5,2} ;
        System.out.println(isLeader(nums));
    }
}
