public class ImplementStrStr {
    public static int strstr(String s, String x)
    {
        int a= s.length() ;
        int b= x.length() ;

        for(int i=0; i<=a-b; i++){
            if(s.substring(i,i+b).equals(x)){
                return i ;
            }
        }
        return -1 ;
    }
    public static void main(String[] args) {
        String s=  "GeeksForGeeks" ;
        String x=  "For" ;
        System.out.println(strstr(s,x));
    }
}
