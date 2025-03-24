import java.util.Arrays;
import java.util.Scanner;
public class EmployeeSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Array before sorting");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        InsertionSort(arr);
    }
    public static void InsertionSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int j = i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        System.out.println("Printing the sorted array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
//I/O
// 5
//Array before sorting
//2 3 5 1 9
//Printing the sorted array
//1 2 3 5 9