
// import java.util.*;
// public class MergeTwoArray {

//    public static int [] merge (int [] arr , int [] brr){
//     int n = arr.length;
//     int m=brr.length;
//     // Arrays.sort(arr);
//     // Arrays.sort(brr);
//     int [] result = new int [n+m];
//     int i =0;
//     int j =0;
//     int k =0;
//     while(i<n && j<m){
//     if(arr[i]<brr[j]){
//        result[k]=arr[i];
//        i++;
//        //k++;
//     }
//     else{
//         result[k]=brr[j];
//         j++;
//          //k++;
//     }
//     k++;
//     }
//     while (i<n){
//         result[k]=arr[i];
//         i++;
//         k++;
//     }
//     while (j < m){
//         result[k]=brr[j];
//         j++;
//         k++;
//     }
//     return result;

//    }

//     public static void main(String[] args) {
//        int [] arr = {23,1,34,17,5};
//         int [] brr = {3,1,4,10,5};
//       int []ans=merge(arr,brr);
//       for(int x:ans){

//            System.out.print(x + " ");
//       }
//     }
// }
import java.util.*;

public class MergeTwoArray {

    public static int[] merge(int[] arr, int[] brr) {
        // if (arr == null) arr = new int[0];
        // if (brr == null) brr = new int[0];

        int n = arr.length;
        int m = brr.length;
        int[] result = new int[n + m];

        int i = 0, j = 0, k = 0;

        // merge while both have elements
        while (i < n && j < m) {
            if (arr[i] < brr[j]) {
                result[k] = arr[i];
                i++;
            } else {
                result[k] = brr[j];
                j++;
            }
            k++;
        }

        // copy remaining of arr
        while (i < n) {
            result[k] = arr[i];
            i++;
            k++;
        }

        // copy remaining of brr
        while (j < m) {
            result[k] = brr[j];
            j++;
            k++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7};    // must be sorted
        int[] brr = {2, 4, 6, 8};    // must be sorted

        int[] ans = merge(arr, brr);

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}
