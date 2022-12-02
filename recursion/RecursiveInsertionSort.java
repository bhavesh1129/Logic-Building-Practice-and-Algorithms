//package recursion;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class RecursiveInsertionSort {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int[] arr = new int[size];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        insertionSort(arr, arr.length);
//        System.out.println(Arrays.toString(arr));
//    }
//
//    private static void insertionSort(int[] arr, int n) {
//        if (n <= 1)
//            return;
//        insertionSort(arr, n - 1);
//        int last = arr[n - 1];
//        int j = n - 2;
//        while (j >= 0 && arr[j] > last) {
//            arr[j + 1] = arr[j];
//            j--;
//        }
//        arr[j + 1] = last;
//    }
//}
