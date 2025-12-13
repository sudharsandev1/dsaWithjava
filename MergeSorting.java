import java.util.*;
public class MergeSorting {

    public static void merge(int [] arr, int start ,int mid,int end){
        
        //two array size find
        int n1 = mid - start +1;
        int n2 = end - mid ;
        int left[]= new int[n1];
        int right[]= new int[n2]; 
        int i,j,k;
     //copy of the two array
        for(i=0;i<n1;i++){
            left[i]=arr[start+i];
        }
          for(j=0;j<n2;j++){
            right[j]=arr[mid+1+j];
        }
         i =0;
         j=0;
         k=start;
        //merge in array
        while(i<n1 && j<n2){
          if(left[i]<=right[j]){
            arr[k]=left[i];
            i++;
          }
          else{
             arr[k]=right[j];
            j++;
          }
          k++;
        }
        while(i<n1){
            arr[k]=left[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=right[j];
            j++;
            k++;
        }
    }
    public static void sort(int[]arr,int start,int end){
        if(start>=end){
            return;
        }
        int mid =(start+end)/2;
        sort(arr,start,mid);
       for(int x:arr){
            System.out.print(x + " ");
        }
        System.out.println();
        sort(arr,mid+1,end);
          for(int x:arr){
            System.out.print(x + " ");
        }
        System.out.println();
        merge(arr,start,mid,end);
          for(int x:arr){
            System.out.print(x + " ");
        }
        System.out.println("  ");
    }
    public static void main(String[] args) {
        int [] arr = {15,7,17,4,11,21,22,2,4,5,78,9,90,101,5};
        sort(arr,0,arr.length-1);
        for(int x:arr){
            System.out.print(x + " ");
        }

    }
}