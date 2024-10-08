import java.util.ArrayList;
import java.util.*;
public class CommonElement {
    public static ArrayList<Integer> common_element(int v1[], int v2[])
    {
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(v1);
        Arrays.sort(v2);

        int i = 0;
        int j = 0;

        while (i < v1.length && j < v2.length) {
            if (v1[i] == v2[j]) {
                result.add(v1[i]);
                i++;
                j++;
            } else if (v1[i] < v2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[]v1= {3, 4, 2, 2, 4};
        int[]v2= {3, 2, 2, 7} ;
        ArrayList<Integer>arr= common_element(v1,v2);
        System.out.println(arr);
    }
}