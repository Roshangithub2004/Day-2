public class SearchInRotatedSortedArray {
    public static int rotateArray(int arr[], int target){
        int si=0;
        int n = arr.length;
        int ei=n-1;
        
        while(si<=ei){
            int mid = (si+ei)/2;

            if(arr[mid] == target) return mid;
            

            if(arr[si] <= arr[mid]){
                if(arr[si] <= target && target <=arr[mid]-1){
                    ei = mid-1;
                }
                else{
                    si = mid+1;
                }
            }
            else{
                if(arr[mid]+1 <= target && target <= arr[ei]){
                  si= mid +1;   
                }else{
                    ei = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] ={4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(rotateArray(arr, target));
    
    }    
}
