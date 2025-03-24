import java.util.Scanner;

public class StudentAgeSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] AgeArray = new int[n];
        System.out.println("Input the unsorted array of exam scores");
        for(int i=0;i<n;i++){
            AgeArray[i] = sc.nextInt();
        }
        countingSort(AgeArray,10,18);
        System.out.println("Printing the sorted array");
        for(int i=0;i<n;i++){
            System.out.print(AgeArray[i]+" ");
        }
    }
    public static void countingSort(int[] arr, int min, int max) {
        int range = max - min + 1;
        int[] count = new int[range];
        int[] output = new int[arr.length];

        // Count occurrences of each age
        for (int age : arr) {
            count[age - min]++;
        }

        // Compute cumulative frequency
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Place elements in correct positions in the output array
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        // Copy sorted elements back to original array
        System.arraycopy(output, 0, arr, 0, arr.length);
    }
}
//output
// 6
//Input the unsorted array of exam scores
//12 11 16 14 18 15
//Printing the sorted array
//11 12 14 15 16 18