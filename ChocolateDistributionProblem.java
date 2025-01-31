import java.util.*;
public class ChocolateDistributionProblem {

    public static int chocolate(int arr[], int m){
        Arrays.sort(arr);
        int i=0;
        int j=m-1;
        int n =arr.length;
        int min = Integer.MAX_VALUE;
        

        while(j<n){
            int dif =arr[j]-arr[i];
            min = Math.min(min,dif);
            i++;
            j++;
        }
      
        return min;
    }
    public static void main(String[] args) {
        int arr[] = {7,3,2,4,9,12,56};
        int m = 3;
        System.out.println(chocolate(arr,m));
    }
}
