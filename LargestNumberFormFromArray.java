import java.util.* ;
public class LargestNumberFormFromArray {
   public static String printLargest(int n, String[] arr) {
        Arrays.sort(arr,(a,b) -> (b+a).compareTo(a+b));
        StringBuilder result = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            result.append(arr[i]);
        }
        return result.charAt(0)=='0'?"0" : result.toString();
    }
    public static void main(String[] args) {
        String[]arr= {"3", "30", "34", "5", "9"};
        System.out.println(printLargest(arr.length, arr));
    }
}
