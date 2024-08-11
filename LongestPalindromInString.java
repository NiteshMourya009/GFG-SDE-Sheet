public class LongestPalindromInString {
    public static boolean isPalindrom(String s){
        int i=0;
        int j=s.length()-1 ;

        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false ;
            }
            i++ ;
            j-- ;
        }
        return true ;
    }
    public static String longestPalin(String s){
        String st="" ;
        int max =Integer.MIN_VALUE ;
        for(int i=0; i<s.length(); i++){
            String str="" ;
            for(int j=i; j<s.length(); j++){
                str= s.substring(i,j+1);
                if(isPalindrom(str)){
                    int sum=j-i+1 ;
                    if(sum>max){
                        max= sum ;
                        st = str ;
                    }

                }
            }
        }
        return st ;
    }
    public static void main(String[] args) {
        String s="abc" ;
        System.out.println(longestPalin(s));
    }
}
