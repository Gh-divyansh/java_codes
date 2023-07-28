/*
 * Sort an array which contain 1 to n values
 * You have given an array which contain 1 to n element, your task is to sort this array in an efficient way and without replace with 1 to n numbers.
 * Input : arr[] = {10, 7, 9, 2, 8, 3, 5, 4, 6, 1};
 * Output : 1 2 3 4 5 6 7 8 9 10 
 */

public class prob11 {
    static void swap(int arr[] , int start , int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    static void sort(int arr[]){
        int size = arr.length;
        int i = 0;
        while (i < size) {
            int correct = arr[i] - 1;

            if (arr[correct] != arr[i]) {
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
        for (int j = 0; j < size; j++) {
            System.out.print(arr[j] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {10, 7, 9, 2, 8, 3, 5, 4, 6, 1};
        sort(arr);
    }
}
