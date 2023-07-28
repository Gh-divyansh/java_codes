/*
 * Reversal algorithm for Array rotation
 * Given an array arr[] of size N, the task is to rotate the array by d position to the left.
 * Input:  arr[] = {1, 2, 3, 4, 5, 6, 7}, d = 2
   Output: 3, 4, 5, 6, 7, 1, 2
 */
public class prob8 {
    static void reversal(int arr[] , int d){
        int size = arr.length;
        if(d == 0){
            return;
        }
        d = d % size;
        swap(arr, 0, d - 1);
        swap(arr, d, size - 1);
        swap(arr, 0, size- 1);

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }


    }

    static void swap( int arr[] , int start , int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;
        System.out.print("after reversing the array::");
        reversal(arr, d);
    }
}
