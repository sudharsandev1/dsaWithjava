import java.util.*;
class BinarySearch{
  public static int search (int [] arr ,int target){
    int low =0;
    int high=arr.length-1;
    boolean isAsc = arr[low]<arr[high];

    while(low<=high){
        int mid = (low + high )/2;
        if(arr[mid]==target){
            return mid;
        }
        if(isAsc){
            if(target > arr[mid]){
                mid=low+1;
            }
            else{
                mid=high-1;
            }
        }
        else{
              if(target < arr[mid]){
                mid=low+1;
            }
            else{
                mid=high-1;
            }
        }
    }
     return -1;
  }
}

public class BinarySearchAlgo {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
    System.out.println("Enter array size : ");
    int size = sc.nextInt();
    int [] arr =new int[size];
     System.out.println("Enter array Value's : ");
     for(int i =0 ;i< size;i++){
        arr[i]=sc.nextInt();
     }
     System.out.println("Enter The Target number : ");
      int n = sc.nextInt();
      int index = BinarySearch.search(arr,n);
      if(index !=-1){
        System.out.println( n +" is find the index in the given list in position "+ index);
      }
      else{
      System.out.println( "Sorry Bro this " + n +" not found  this list ");

      }

    }
}