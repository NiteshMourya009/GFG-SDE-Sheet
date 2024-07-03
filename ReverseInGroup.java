import java.util.ArrayList;

public class ReverseInGroup {
    public static void reverse(ArrayList<Long>arr, int i, int j){
        while(i<j){
            long temp= arr.get(i);
             arr.set(i,arr.get(j)) ;
            arr.set(j,temp);
            i++ ;
            j--;
        }
    }
    public static void main(String[] args) {
        ArrayList<Long> arr= new ArrayList<>() ;
        arr.add(1L);
        arr.add(2L);
        arr.add(3L);
        arr.add(4L);
        arr.add(5L);
        int k=3 ;
        int n=arr.size() ;

        for(int i=0; i< arr.size(); i=i+k) {
            int end =Math.min(i+k-1,n-1 ) ;
            reverse(arr,i,end);
        }
        for(long ar: arr){
            System.out.println(ar);
        }

    }
}
