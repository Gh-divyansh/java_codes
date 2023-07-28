/*
Reorder an array according to given indexes
Given two integer arrays of same size, “arr[]” and “index[]”, reorder elements in “arr[]” according to given index array. It is not allowed to given array arr’s length.
Input:  arr[]   = [10, 11, 12];
        index[] = [1, 0, 2];
Output: arr[]   = [11, 10, 12]
        index[] = [0,  1,  2] 
*/public class prob19 {
    static void swap(int arr[], int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void reorder(int arr[] , int index[]){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            while (index[i] != i) {
                swap(arr, i, index[i]);
                swap(index, i, index[i]);
            }
        }
    }
    static void print(int arr[]){
        System.out.print("Array elements are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
       int arr[]   = {10, 11, 12};
       int index[] = {1, 0, 2};
       reorder(arr, index);
       print(arr);
    }
}
