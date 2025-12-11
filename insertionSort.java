import java.util.*;

public class insertionSort {

    public static void sort (int [] arr){
      int n = arr.length;
      for (int i =0 ;i<n;i++){
        int point = arr[i];
        int prev = i -1;
        while ( prev >= 0 && arr[prev] > point ){
        arr[prev + 1] =arr[prev];
        prev --;
        }
        arr[prev+1] = point;      
        }
       
    }


    public static void main(String[] args) {
      int [] arr = {23,1,34,17,5};
      sort(arr);
      for(int x:arr){
           System.out.print(x + " ");
      }
    }
}