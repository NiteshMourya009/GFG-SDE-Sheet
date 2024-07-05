import java.util.* ;
public class AtLeast_K_Occurence {
    public static int firstElementKTime(int n, int k, int[] arr) {
        HashMap<Integer, Integer> map= new HashMap<>() ;

        for(int ar: arr){
            if(!map.containsKey(ar)){
                map.put(ar,1) ;
            }
            else{
                map.put(ar, map.get(ar)+1) ;

                if(k==map.get(ar)){
                    return ar ;
                }
            }
        }
        return -1 ;

    }
    public static void main(String[] args) {
        int k=2 ;
        int[]nums= {1,7,4,3,4,8,7} ;
        System.out.println(firstElementKTime(nums.length,k,nums));
    }
}
