import java.util.*;
public class BookPriceSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] BookArray = new int[n];
        System.out.println("Input the unsorted array of prices of books");
        for(int i=0;i<n;i++){
            BookArray[i] = sc.nextInt();
        }
        mergeSort(BookArray,0,n-1);
        System.out.println("Printing the sorted array");
        for(int i=0;i<n;i++){
            System.out.print(BookArray[i]+" ");
        }
    }
    public static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // if elements on the left half are still left //
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2 ;
        mergeSort(arr, low, mid);  // left half
        mergeSort(arr, mid + 1, high); // right half
        merge(arr, low, mid, high);  // merging sorted halves
    }
}
// I/O
// 5
//Input the unsorted array of prices of books
//300 230 275 150 255
//Printing the sorted array
//150 230 255 275 300
