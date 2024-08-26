import java.util.* ;
public class FourSum {
    public static ArrayList<ArrayList<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        LinkedHashSet<ArrayList<Integer>> ans = new LinkedHashSet<>() ;


        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int x = j + 1;
                int y = nums.length - 1;
                while (x < y) {

                    int sum = nums[i] + nums[j] + nums[x] + nums[y];

                    if (sum == target) {
                        ans.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[x], nums[y])));

                        x++;
                        y--;
                    } else if (sum > target) {
                        y--;
                    } else if (sum < target) {
                        x++;
                    }
                }

            }
        }

        result.addAll(ans);

        return result ;
    }
    public static void main(String[] args) {
        int[]arr= {10,2,3,4,5,7,8} ;
        int sum= 23 ;
        ArrayList<ArrayList<Integer>>ar= fourSum(arr, sum);
      for(int i=0; i<ar.size(); i++){
            for(int j=0; j<ar.get(i).size(); j++){
                System.out.print(ar.get(i).get(j));
            }
          System.out.println();
        }

    }
}
