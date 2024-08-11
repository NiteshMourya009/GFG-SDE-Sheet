import java.util.* ;
public class minimumIndexedChar {
    public static int minIndexChar(String str, String patt)
    {
        HashSet <Character>hs=new HashSet<>();
        for(int i=0; i<patt.length(); i++){
            if(!hs.contains(patt.charAt(i))){
                hs.add(patt.charAt(i));
            }
        }
        for(int i=0; i<str.length(); i++){
            if(hs.contains(str.charAt(i))){
                return i ;
            }
        }
        return -1 ;
    }
    public static void main(String[] args) {
        String str= "geeksforgeeks";
        String patt="set" ;
        System.out.println(minIndexChar(str, patt));
    }
}
