
import java.util.*;
public class MergeSort{

   public static int [] merge (int [] arr){
    int n = arr.length;
    int []result = new int [n];
    int end = n-1;
    int start =0;
   int mid = (end+start)/2;
    int i =start;
    int j =mid+1;
    int k =start;
    while(i<=mid && j<=end){
    if(arr[i]<arr[j]){
       result[k]=arr[i];
       i++;
       k++;
    }
    else{
        result[k]=arr[j];
        j++;
        k++;
      
    }
 
    }
    while (i<=mid){
        result[k]=arr[i];
        i++;
        k++;
    }
    while (j <=end){
        result[k]=arr[j];
        j++;
        k++;
    }
    Arrays.sort(result);
    return result;

   }

    public static void main(String[] args) {
       int [] arr = {23,1,34,17,5};
      int []ans=merge(arr);
      for(int x:ans){

           System.out.print(x + " ");
      }
    }
}
