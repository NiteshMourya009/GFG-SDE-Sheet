import java.util.* ;
public class UniqueRowInMatrix {
    public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][],int r, int c)
    {
        ArrayList<ArrayList<Integer>> set = new ArrayList<>();

        for(int i = 0; i < r; i++)
        {
            ArrayList<Integer> p = new ArrayList<>();
            for(int j = 0; j < c; j++)
            {
                p.add(a[i][j]);
            }

            if(!set.contains(p))
            {
                set.add(p);
            }
        }

        return set;
    }
    public static void main(String[] args) {
        int[][]matrix=  {{1, 1, 0 ,1},{1, 0, 0, 1},{1, 1, 0 ,1}} ;
        ArrayList<ArrayList<Integer>>q= uniqueRow(matrix, matrix.length, matrix[0].length);
        for(ArrayList i: q ){
            System.out.println(i);
        }
    }
}
