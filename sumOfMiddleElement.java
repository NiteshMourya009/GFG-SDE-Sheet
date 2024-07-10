public class sumOfMiddleElement {
     public static int findMidSum(int[] ar1, int[] ar2, int n) {
        int[]nums= new int[n+n] ;
        int i=0;
        int j=0 ;
        int k=0 ;

        while(i<n && j<n){
            if(ar1[i]<=ar2[j]){
                nums[k++]= ar1[i++] ;
            }
            else if(ar2[j]<ar1[i]){
                nums[k++] =ar2[j++] ;
            }
        }

        if(i==n && j != n){
            while(j != n){
                nums[k++]= ar2[j++] ;
            }
        }
        if(i != n && j==n){
            while( i != n){
                nums[k++] =ar1[i++] ;
            }
        }
        int l =nums.length/2-1 ;
        int sum = nums[l] + nums[l+1] ;
        return sum ;

    }
    public static void main(String[] args) {
        int []ar1= {1, 12, 15, 26, 38} ;
        int []ar2={2, 13, 17, 30, 45} ;

        System.out.println(findMidSum(ar1,ar2, ar1.length));
    }
}
