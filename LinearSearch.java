import java.util.*;
class LSArray{
   public static int find (int [] arr,int n){
    for (int i=0;i<arr.length;i++){
        if(arr[i]==n)
        {
            return i;
        }
    }
    return -1;
    
   }
}


public class LinearSearch {
    public static void main(String[] args) {
    
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter array size : ");
    int size = sc.nextInt();
    int [] arr =new int[size];
     System.out.println("Enter array Value's : ");
     for(int i =0 ;i< size;i++){
        arr[i]=sc.nextInt();
     }
     System.out.println("Enter array Value's : ");
      int n = sc.nextInt();
      int index = LSArray.find(arr,n);
      if(index !=-1){
        System.out.println( n +" is find the index in the given list in position "+ index);
      }
      else{
                System.out.println( "Sorry Bro this " + n +" not found that this list ");

      }

    }
}