import java.util.* ;
public class indexesOfSubArraySum {
      public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer>list= new ArrayList<>() ;
        int l=0,r=0;
        int sum=0;
        while(r<n)
        {
            sum+=arr[r];

            while(sum>s && l<r)
            {
                sum-=arr[l++];
            }

            if(sum==s){
                list.add(l+1);
                list.add(r+1) ;
                return list ;
            }

            r++;

        }
        list.add(-1) ;
        return list ;

    }
    public static void main(String[] args) {
        int[]nums= {1,2,3,7,5} ;
        int n= nums.length ;
        int target= 12 ;

        System.out.println(subarraySum(nums,n,target));
    }
}
