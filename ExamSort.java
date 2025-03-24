import java.util.Scanner;

public class ExamSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ExamArray = new int[n];
        System.out.println("Input the unsorted array of exam scores");
        for(int i=0;i<n;i++){
            ExamArray[i] = sc.nextInt();
        }
        SelectionSort(ExamArray,n);
        System.out.println("Printing the sorted array");
        for(int i=0;i<n;i++){
            System.out.print(ExamArray[i]+" ");
        }
    }
    public static void SelectionSort(int[] arr,int n){
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
//output
// 6
//Input the unsorted array of exam scores
//53 12 78 34 75 98
//Printing the sorted array
//12 34 53 75 78 98