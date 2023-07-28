/*
 * Search an element in a sorted and rotated Array
 * Given a sorted and rotated array arr[] of size N and a key, the task is to find the key in the array.
 * Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3}, key = 3
   Output : Found at index 8
 * 
*/
public class prob20 {
    static int Search(int arr[],int l , int h, int key){
        if(l > h){
            return -1;
        }

        int mid = (l + h)/2;
        if (arr[mid] == key) {
            return mid;
        }

        if (arr[l] <= arr[mid]) {
            if (key >= arr[l] && key <= arr[mid]) {

                return Search(arr,l , mid-1, key);
            }
            return Search(arr,mid+1,h, key);
        }
        if (key >= arr[mid] && key <= arr[h]) {
            return Search(arr,mid+1,h, key);
        }
        
        return Search(arr,l,mid-1, key);
    }
    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 8, 9, 1, 2, 3 };
        int key = 3;
        int i = Search(arr,0 , arr.length-1, key);
        if (i != -1){
        System.out.println("Index: " + i);
        }else{
        System.out.println("Key not found");
        }
    }
}
