public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Outer loop: runs n-1 times
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            // Inner loop: compares adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // if no swap happened → array already sorted
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        bubbleSort(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
