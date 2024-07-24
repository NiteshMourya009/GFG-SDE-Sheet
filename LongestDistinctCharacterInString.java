import java.util.* ;
public class LongestDistinctCharacterInString {
    public static int longestSubstrDistinctChars(String s){
        int max=0 ;
        int count=0 ;
        for(int i=0; i<s.length(); i++){
            ArrayList<Character> arr= new ArrayList<>() ;
            for(int j=i; j<s.length(); j++){
                if(!arr.contains(s.charAt(j))){
                    arr.add(s.charAt(j)) ;
                    max++ ;
                    count= Math.max(count, max) ;
                }
                else{
                    max=0 ;
                    max= max+1 ;
                    break ;
                }
            }
            max= 0 ;
            arr.clear();
        }
        return count ;
    }
    public static void main(String[] args) {
        String s= "geeksforgeeks" ;
        System.out.println(longestSubstrDistinctChars(s));
    }
}
