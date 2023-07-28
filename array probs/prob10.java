/*Sort an array in wave form
 * Given an unsorted array of integers, sort the array into a wave array. An array arr[0..n-1] is sorted in wave form if:
arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] >= …..
 * Input: arr[] = {20, 10, 8, 6, 4, 2}
Output: arr[] = {20, 8, 10, 4, 6, 2}
 */
public class prob10 {
    static void swap(int arr[] , int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void waveSort(int arr[]){
        int size = arr.length;
        for (int i = 0; i < size - 1; i+=2) {
            if (i > 0 && arr[ i - 1] > arr[i]) {
                swap(arr, i, i - 1);
            }
            if (i < size - 1 && arr[ i + 1] > arr[i]) {
                swap(arr, i, i + 1);
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {20, 10, 8, 6, 4, 2};
        System.out.print("after wave sort ::");
        waveSort(arr);
    }
}
