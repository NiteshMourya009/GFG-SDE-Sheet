import java.util.* ;
public class Anagram {
    public  static HashMap<Character, Integer> makefreqMap(String str){
        HashMap<Character, Integer> mp= new HashMap<>() ;
        for(int i=0; i< str.length(); i++){
            Character ch = str.charAt(i) ;
            if(! mp.containsKey(ch)){
                mp.put(ch, 1) ;
            }
            else{
                mp.put(ch, mp.get(ch)+1) ;
            }
        }
        return mp ;
    }
    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false ;

        HashMap<Character, Integer> mp= makefreqMap(s) ;
        for(int i=0; i< t.length(); i++){
            Character ch= t.charAt(i) ;
            if(! mp.containsKey(ch)) return false ;
            int currfreq= mp.get(ch) ;
            mp.put(ch, currfreq-1) ;
        }
        for(Integer i: mp.values()){
            if(i != 0) return false ;
        }
        return true ;
    }
    public static void main(String[] args) {
        String a="geeksforgeeks";
        String b= "forgeeksgeeks" ;
        System.out.println(isAnagram(a,b));

    }
}
