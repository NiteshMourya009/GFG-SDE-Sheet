import java.util.* ;
public class RearrangeArrayAlternately {
    public static void Rearrange(int[]arr, int n){
        int arr2[]=Arrays.copyOf(arr,n);

        int i=0;
        int j=arr.length-1;
        int k=0;
        while(i<=j){
            if(k%2==0){
                arr[k++]=arr2[j--];
            }
            else{
                arr[k++]=arr2[i++];
            }
        }
    }
    public static void main(String[] args) {
        int[]arr= {1,2,3,4,5,6};
        int n=arr.length ;
        Rearrange(arr,n);
        for(int ar: arr){
            System.out.println(ar);
        }
    }
}
