import java.util.* ;
public class ArraySubset {
    public static String isSubset( long a1[], long a2[], long n, long m) {
        HashMap<Long, Integer> map =new HashMap<>() ;
        for(long num: a2){
            if(!map.containsKey(num)){
                map.put(num, 1) ;
            }
            else{
                map.put(num, map.get(num)+1) ;
            }
        }
        for(int i=0; i< a1.length; i++){
            if(map.containsKey(a1[i]) && map.get(a1[i])>0 ){
                map.put(a1[i], map.get(a1[i])-1) ;
            }
        }
        for(var e: map.entrySet()){
            if(e.getValue() != 0){
                return "NO";
            }
        }
        return "YES" ;
    }
    public static void main(String[] args) {
        long[]a= {1, 2, 3, 4, 4, 5, 6};
        long[]b= {1, 2, 4} ;
        System.out.println(isSubset(a,b,a.length,b.length));
    }
}
