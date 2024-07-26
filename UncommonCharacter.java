import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UncommonCharacter {
    public static String UncommonChar(String a, String b){
        Set<Character>set= new HashSet<>();
        Set<Character>map= new HashSet<>() ;
        String str="" ;
        for(int i=0; i<a.length(); i++){
            if(!set.contains(a.charAt(i))){
                set.add(a.charAt(i)) ;
            }
        }
        for(int i=0; i<b.length(); i++){
            if(!set.contains(b.charAt(i))){
                str +=String.valueOf(b.charAt(i)) ;
            }
        }
        for(int i=0; i<b.length(); i++){
            if(!map.contains(b.charAt(i))){
                map.add(b.charAt(i)) ;
            }
        }
        for(int i=0; i<a.length(); i++){
            if(!map.contains(a.charAt(i))){
                str += String.valueOf(a.charAt(i)) ;
            }
        }
        char[]ch= str.toCharArray() ;
        Arrays.sort(ch);
        String ptr="" ;
        ptr= String.valueOf(ch[0]);
        for(int i=1; i<ch.length; i++){
            if(ch[i]!=ch[i-1]){
                ptr+=String.valueOf(ch[i]);
            }
        }

        return ptr ;

    }
    public static void main(String[] args) {
        String a= "characters" ;
        String b= "alphabets" ;
        System.out.println(UncommonChar(a,b));
    }
}
