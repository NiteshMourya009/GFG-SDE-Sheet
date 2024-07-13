import java.util.* ;
public class RelativeSorting {
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {

        Arrays.sort(arr1) ;
        HashMap<Integer,Integer> map =new HashMap<>() ;
        int[]arr =new int[arr1.length] ;
        for(int num:arr1){
            if(!map.containsKey(num)){
                map.put(num,1) ;
            }
            else{
                map.put(num, map.get(num)+1) ;
            }
        }
        int k= 0 ;
        for(int i=0; i<arr2.length ; i++){
            if(map.containsKey(arr2[i])){
                int freq = map.get(arr2[i]) ;
                while(freq != 0){
                    arr[k++] =arr2[i] ;
                    freq-- ;
                }
            }
        }
        ArrayList<Integer> nums= new ArrayList<>() ;
        HashMap<Integer,Integer> map1= new HashMap<>() ;
        for(int var:arr2){
            if(!map1.containsKey(var)){
                map1.put(var,1) ;
            }
            else{
                map1.put(var, map1.get(var)+1) ;
            }
        }
        for(int i=0; i<arr1.length; i++){
            if(!map1.containsKey(arr1[i])){
                nums.add(arr1[i]) ;
            }
        }
        int p =nums.size() ;
        for(int i=0; i<p; i++){
            arr[k++] = nums.get(i);
        }
        return arr ;

    }
    public static void main(String[] args) {
        int[]arr1={2,3,1,3,2,4,6,7,9,2,19} ;
        int[]arr2={2,1,4,3,9,6} ;
        int[]nums= relativeSortArray(arr1,arr2) ;
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] +" ");
        }
    }

}
