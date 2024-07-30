import java.util.HashMap;
import java.util.LinkedHashMap;

public class ReapeatedChar {
    public static char firstRepo(String s){
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>() ;
        for(int i=0; i<s.length(); i++){
            char ch= s.charAt(i) ;
            if(!map.containsKey(ch)){
                map.put(ch, 1) ;
            }
            else{
                map.put(ch, map.get(ch)+1) ;
            }
        }
        for(var e: map.entrySet()){
            int a= e.getValue();
            if(a>1){
                return e.getKey() ;
            }
        }
        return '#';
     }
    public static void main(String[] args) {
        String s ="geeksforgeeks" ;
        System.out.println(firstRepo(s));
    }
}
