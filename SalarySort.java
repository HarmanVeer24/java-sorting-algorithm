import java.util.*;

public class SalarySort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] SalaryArray = new int[n];
        System.out.println("Input the unsorted array of Salaries");
        for(int i=0;i<n;i++){
            SalaryArray[i] = sc.nextInt();
        }
        heapSort(SalaryArray);
        System.out.println("Printing the sorted array");
        for(int i=0;i<n;i++){
            System.out.print(SalaryArray[i]+" ");
        }
    }

    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Swap root with last element
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Heapify the reduced heap
            heapify(arr, i, 0);
        }
    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Check if left child is larger
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // Check if right child is larger
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // Swap and continue heapifying if root is not largest
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }
}
//output
// 5
//Input the unsorted array of Salaries
//60000 32000 56000 52000 39000
//Printing the sorted array
//32000 39000 52000 56000 60000