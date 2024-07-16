public class LongestCommonPrefixString {
    public static String longestCommonPrefix(int n, String arr[]) {
        //int n =arr.length ;
        String str="" ;
        if(arr.length==0){
            return "";
        }
        if(arr.length==1){
            return arr[0];
        }


        String s= arr[0] ;
        String p= arr[1] ;
        int a=s.length() ;
        int b= p.length() ;

        int i=0, j=0 ;

        while(i!=a && j!=b){
            if(s.charAt(i) == p.charAt(j)){
                str+= String.valueOf(s.charAt(i)) ;
                i++ ;
                j++ ;
            }
            else{
                break ;
            }
        }
        if(arr.length==2){
            return str  ;
        }
        int q= str.length() ;
        String v="";
        String z="";
        for(int x=2; x<arr.length; x++){
            String ptr= arr[x] ;
            int l=0 ;
            int g =ptr.length() ;
            while(q != 0 && g!=0  ){
                if(ptr.charAt(l)== str.charAt(l)){
                    v += String.valueOf(str.charAt(l));
                    l++ ;
                }
                else{
                    break;
                }
                g-- ;
                q-- ;
            }
            str =v ;
            z=v ;
            v="";
            q= str.length() ;
        }

        return z ;
    }
    public static void main(String[] args) {
    String[] arr = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(arr.length,arr));

   }
}