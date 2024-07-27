import java.util.Stack;

public class Next_LargerElement {
    public static long[] nextLarger(long [] arr){
        int n= arr.length ;
        Stack<Long> st= new Stack<>() ;
        long[] num= new long[n] ;
        st.push(arr[n-1]) ;
        num[n-1] =-1 ;
        for(int i=n-2; i>=0; i--){
            while (!st.isEmpty() && st.peek()<=arr[i]){
                st.pop() ;
            }
            if(st.isEmpty()){
                num[i]= -1 ;
            }
            else{
                num[i]= st.peek() ;
            }
            st.push(arr[i]) ;
        }
        return num ;

    }
    public static void main(String[] args) {
        long[] nums={1, 3, 2 ,4};
        long[]ans= nextLarger(nums);
        for(long i: ans ){
            System.out.print(i+" ");
        }
    }
}
