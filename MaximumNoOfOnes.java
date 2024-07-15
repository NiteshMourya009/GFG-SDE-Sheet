public class MaximumNoOfOnes {
    public static int maxOnes (int Mat[][], int N, int M)
    {

        int max =0 ;
        int ind =Integer.MIN_VALUE ;
        for(int i=0; i<Mat.length; i++){
            int count =0 ;
            for(int j=0; j<Mat[0].length; j++){
                if(Mat[i][j]==1){
                    count++ ;
                }
                if(count>max){
                    ind = i ;
                }
                max= Math.max(max,count) ;
            }
        }
        return ind ;
    }
    public static void main(String[] args) {
        int[][]mat= {{0, 1, 1, 1},
                {0, 0, 1, 1},
                {0 ,0, 1, 1}} ;
        System.out.println(maxOnes(mat, mat.length,mat[0].length));
    }
}
