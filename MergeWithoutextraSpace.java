import java.util.Arrays;

public class MergeWithoutextraSpace {
    public static void swap(long[]arr1,long[]arr2, int i, int j){
              long temp = arr1[i] ;
              arr1[i] =arr2[j] ;
              arr2[j]= temp ;
    }
    public static void merge(long arr1[], long arr2[], int n, int m) {
          int i=0 ;
          int j=0 ;

          while(i<n && j<m){
              if(arr1[i]<arr2[j]){
                  i++ ;
              }
              else if(arr1[i]>arr2[j]){
                  swap(arr1,arr2,i,j)  ;
                  j++ ;
              }
          }
        Arrays.sort(arr2) ;
    }
    public static void main(String[] args) {
        long[]arr1= {1,3,5,7} ;
        long[]arr2= {0,2,6,8,9};
        int n= arr1.length ;
        int m= arr2.length ;
        merge(arr1,arr2,n,m);
//        long nums[]= new long [n+m] ;
//       merge(arr1, arr2, n, m,nums);
//       for( int i=0; i<(n+m)-1; i++){
//           System.out.println(nums[i]);
//       }
    }
}
