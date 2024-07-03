public class kthElement_OfTwoArray {
    public static long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        int p1 = 0, p2 = 0;
        int count = 0;
        while(p1 < n && p2 < m){
            if(arr1[p1] < arr2[p2]){
                if(count + 1 == k)  return arr1[p1];
                p1++;
            }else{
                if(count + 1 == k)  return arr2[p2];
                p2++;
            }
            count++;
        }

        while(p1 < n){
            if(count + 1 == k)  return arr1[p1];
            p1++;
            count++;
        }

        while(p2 < m){
            if(count + 1 == k)  return arr2[p2];
            p2++;
            count++;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]arr1= {100, 112, 256, 349, 770} ;
        int[]arr2= {72, 86, 113, 119, 265, 445, 892} ;
        int k=7 ;

        System.out.println(kthElement(arr1,arr2,arr1.length,arr2.length,k));
    }
}
