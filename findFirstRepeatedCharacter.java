import java.util.LinkedHashMap;

public class findFirstRepeatedCharacter {
    public static String firstInd(String s){
        LinkedHashMap<Character, Integer> map= new LinkedHashMap<>() ;
        for(int i=0; i<s.length(); i++){
            char ch= s.charAt(i) ;
            if(!map.containsKey(ch)){
                map.put(ch,1) ;
            }
            else{
                map.put(ch, map.get(ch)+1) ;
            }
            if(map.get(ch)==2){
                return String.valueOf(ch) ;
            }
        }
        return "-1" ;
    }
    public static void main(String[] args) {
        String str= "geeksforgeeks" ;
        System.out.println(firstInd(str));
    }
}
