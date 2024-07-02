public class Sort_0s_1s_2s {
    public static int[] sort(int[]nums){
        int one=0 ;
        int two=0 ;
        int thr=0 ;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                one++ ;
            }
            else if(nums[i]==1){
                two++ ;
            }
            else{
                thr++ ;
            }
        }
        for(int i=0; i<nums.length; i++){
            if(one!=0){
                nums[i]=0 ;
                one-- ;
            }
            else if(two !=0){
                nums[i]= 1 ;
                two-- ;
            }
            else {
                nums[i]= 2 ;
                thr -- ;
            }
        }
        return nums ;
    }
    public static void main(String[] args) {
        int[]nums= {0,1,0} ;
        int[]arr =sort(nums) ;
        for(int ar:arr){
            System.out.println(ar);
        }
    }
}
