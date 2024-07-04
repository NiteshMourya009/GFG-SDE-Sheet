import java.util.HashMap;

public class CheckEqualArrays {
    public static boolean check(int[]arr, int[]arr1){
        HashMap<Integer,Integer> map= new HashMap<>() ;
        HashMap<Integer,Integer> map1= new HashMap<>() ;
        for(int i: arr){
            if(!map.containsKey(i)){
                map.put(i,1) ;
            }
            else{
                map.put(i, map.get(i)+1) ;
            }
        }
        for(int i: arr1){
            if(!map1.containsKey(i)){
                map1.put(i,1) ;
            }
            else{
                map1.put(i, map1.get(i)+1) ;
            }
        }
         return  map.equals(map1) ;



    }
    public static void main(String[] args) {
        int[]arr1= {1,2,5,5,3};
        int[]arr2={2,3,5,5,1} ;

        System.out.println(check(arr1,arr2));
    }
}
