public class SearchInSortedMatrix {
    static boolean search(int matrix[][], int n, int m, int target)
    {


        for(int i=0; i<n; i++){
            if(matrix[i][n-1]>=target){
                for(int j=0; j<m; j++){
                    if(matrix[i][j]==target){
                        return true ;
                    }
                }
            }
        }
        return false ;
    }
    public static void main(String[] args) {
        int[][]matrix= { {3, 30, 38},{36, 43, 60},{40, 51, 69} } ;
        int x= 62 ;
        System.out.println(search(matrix, matrix.length, matrix[0].length,x));
    }
}
