public class SearchInRotatedSortedArray {
   public static int search(int[] arr, int key) {

        int j= arr.length-1 ;
        int i=0 ;

        while(i<=j){
            if(arr[i]==key){
                return i ;
            }
            else if(arr[j]==key){
                return j ;
            }
            i++ ;
            j-- ;
        }
        return -1 ;
    }
    public static void main(String[] args) {
        int[]arr= {5, 6, 7, 8, 9, 10, 1, 2, 3} ;
        int key= 10 ;
        System.out.println(search(arr, key));
    }
}
