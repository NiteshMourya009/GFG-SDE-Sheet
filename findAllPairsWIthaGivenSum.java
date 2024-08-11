import java.util.* ;
class Pair  {
    long first, second;
    public Pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}
public class findAllPairsWIthaGivenSum {
    public static Pair[] allPairs(int x, int arr1[], int arr2[]) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        List<Pair> list = new ArrayList<>();
        int i = 0;
        int j = arr2.length - 1;
        int sum;

        while (i < arr1.length && j >= 0) {
            sum = arr1[i] + arr2[j];
            if (sum == x) {
                list.add(new Pair(arr1[i], arr2[j]));
                i++;
                j--;
            } else if (sum < x) {
                i++;
            } else {
                j--;
            }
        }

        // Convert List<Pair> to Pair[] array
        Pair[] result = new Pair[list.size()];
        result = list.toArray(result);

        return result;
    }
    public static void main(String[] args) {
        int[] a={1, 2, 4, 5, 7} ;
        int[]b={5, 6, 3, 4, 8} ;
        int x= 9 ;
        Pair[]arrs=allPairs(x,a,b) ;
        for(int i=0; i<arrs.length; i++){
            System.out.println(arrs[i]);
        }

    }
}
