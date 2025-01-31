import java.util.*;
public class ContainsDuplicate {

    public static boolean duplicate(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
           if(map.containsKey(arr[i])){
            map.put(i, map.get(i)+1);
            return true;
           }
           map.put(arr[i],1);
        }
        return false;
    }
    public static void main(String[
    ] args) {
        int arr[] ={2,3,1,2,7,6,4,};
        System.out.println(duplicate(arr));
    }
    
}