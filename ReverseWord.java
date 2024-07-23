public class ReverseWord {
    public static void reverse(char[]ch,int i, int j){

        while(i<j){
            char temp = ch[i] ;
            ch[i]=ch[j];
            ch[j]= temp ;
            i++ ;
            j-- ;
        }
    }
    public static String reverseword(String s){
        char[]ch = s.toCharArray() ;
        reverse(ch, 0, ch.length-1);
        int start =0 ;
        int end = ch.length-1 ;

        for(int i=0; i<ch.length; i++){
            if(ch[i]=='.'){
                reverse(ch,start,i-1);
                start=i+1 ;

            }
            if(i==end){
                reverse(ch,start,end);
            }
        }
        String str="";
        for(int i=0; i<ch.length; i++){
            char sc= ch[i] ;
            str +=String.valueOf(sc);
        }
        return str ;
    }
    public static void main(String[] args) {
        String s= "pqr.mno" ;
        System.out.println(reverseword(s));
    }
}
