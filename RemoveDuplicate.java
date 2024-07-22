import java.util.* ;
public class RemoveDuplicate {
   public static String removeDups(String s) {
        HashMap<Character,Integer>set = new HashMap() ;
        for(int i=0; i<s.length(); i++){
            if(!set.containsKey(s.charAt(i))){
                set.put(s.charAt(i),1);
            }
            else{
                set.put(s.charAt(i),set.get(s.charAt(i)+1));
            }
        }
        String str="" ;
        int i=0 ;
        while(!set.isEmpty()){
            if(set.containsKey(s.charAt(i))){
                str += String.valueOf(s.charAt(i));
                set.remove(s.charAt(i));
                i++ ;
            }else{
                i++ ;
            }
        }
        return str ;
    }
    public static void main(String[] args) {
        String str="gfg";
        System.out.println(removeDups(str));
    }
}
