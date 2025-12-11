public class SelectionSort {
    public static void sort(int [] arr){
        int n = arr.length;
        for (int i=0 ;i<n;i++ ){
            int min =arr[i];
            int min_index = i;
            for(int j=i+1;j<n;j++){
            if(arr[j]<min){
                min = arr[j];
                min_index =j;
            }
            }
        
        int swapNum = arr[min_index];
        arr[min_index] = arr[i];
        arr[i] =swapNum;
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