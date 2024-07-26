import java.util.Stack;

public class Parenthethis_Checker {
    public static boolean ispar(String s){
        Stack<Character> st=new Stack<Character>();
        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                st.push(s.charAt(i));
            }
            else if(st.empty()){
                return false;
            }
            else if (st.peek() == '{' && s.charAt(i) == '}' ) {
                st.pop();
            }
            else if (st.peek() == '(' && s.charAt(i) == ')' ) {
                st.pop();
            }
            else if (st.peek() == '[' && s.charAt(i) == ']' ) {
                st.pop();
            }
            else {
                return false;
            }
        }
        if( st.isEmpty()){
            return true ;
        }
        return false ;
    }
    public static void main(String[] args) {
        String s= "{([])}" ;
        System.out.println(ispar(s));
    }
}
