import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Stock_span_Problem {
    public static int[] calculateSpan(int price[], int n){
        Stack<Integer> st= new Stack<>() ;
        Queue<Integer> pq= new LinkedList<>() ;
        int[]arr= new int[price.length] ;
        int p= 1 ;
        int count =1 ;
        st.push(price[0]) ;
        arr[0]= 1 ;
        for(int i=1; i<price.length; i++){
            if(price[i]<st.peek()){
                arr[p++]= 1 ;
                st.push(price[i]);
            }
            else if(price[i]>st.peek()){
                while( !st.isEmpty() && st.peek() < price[i]   ){
                    count++ ;
                    pq.add(st.pop()) ;
                }
                while(!pq.isEmpty()){
                    st.push(pq.poll()) ;
                }
                st.push(price[i]);
                arr[p++]= count ;
                count =1 ;

            }
        }
        return arr ;
    }
    public static void main(String[] args) {
        int[]price ={100 ,80 ,60 ,70 ,60 ,75, 85} ;
        int[]arr=calculateSpan(price,price.length);
        for(int n:arr){
            System.out.println(n);
        }
    }
}
