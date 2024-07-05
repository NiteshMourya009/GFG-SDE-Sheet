import java.util.* ;
public class appearsOnlyOnce {
    public static int findOnce(int arr[], int n) {
        HashMap<Integer, Integer> map= new HashMap<>() ;
        for(int ar: arr){
            if(!map.containsKey(ar)){
                map.put(ar,1) ;
            }
            else{
                map.put(ar, map.get(ar)+1) ;
            }
        }
        int max =0 ;
        for(var e: map.entrySet()){
            int key =e.getValue() ;
            if(key==1){
                max= e.getKey() ;
            }
        }
        return max ;
    }
    public static void main(String[] args) {
        int[] arr= {1,1,2,2,3,3,4,50,50,65,65} ;
        System.out.println(findOnce(arr, arr.length));
    }
}
