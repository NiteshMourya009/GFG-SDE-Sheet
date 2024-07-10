public class MergeWithoutextraSpace {
    public static void merge(long arr1[], long arr2[], int n, int m, long[] nums) {

       // long[] nums= new long[n+m] ;

        int i=0;
        int j=0 ;
        int k=0 ;
        int p=0 ;
        long[]num= new long[n+m-1] ;

        while(i<n && j<m){
            if(arr1[i]<=arr2[j]){
                
                num[k++]= arr1[i] ;

                i++ ;
            }
            else if(arr2[j]<arr1[i]){
                num[k++]= arr2[j] ;
                j++;

            }
        }
        if(i < n-1 ){
            while(i != n-1){
                arr1[k++] =arr1[i++] ;
                i++ ;
            }
        }
        else if(j < m-1){
            while(j != m-1){
                arr2[k++] =arr2[j] ;
                j++ ;
            }
        }
        int x=0 ;
        while (x<n){
            arr1[x++] =num[p];
            p++ ;
        }
        int y=0 ;
        while(y<m){
            arr2[y] =num[p++] ;
        }
    }
    public static void main(String[] args) {
        long[]arr1= {1,3,5,7} ;
        long[]arr2= {0,2,6,8,9};
        int n= arr1.length ;
        int m= arr2.length ;
        long nums[]= new long [n+m] ;
       merge(arr1, arr2, n, m,nums);
       for( int i=0; i<(n+m)-1; i++){
           System.out.println(nums[i]);
       }
    }
}
