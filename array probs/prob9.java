/*Print left rotation of array in O(n) time and O(1) space
 * Given an array of size n and multiple values around which we need to left rotate the array. How to quickly print multiple left rotations?
 * arr[] = {1, 3, 5, 7, 9}
k1 = 1
k2 = 3
k3 = 4
k4 = 6
Output : 
3 5 7 9 1
7 9 1 3 5
9 1 3 5 7
3 5 7 9 1
 * 
 */

public class prob9 {
    static void rotate(int arr[] , int k){
        int size = arr.length;
        int m = k%size;
        for (int i = 0; i < size; i++) {
            System.out.print(arr[(i + m) % size] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
       int arr[] = {1, 3, 5, 7, 9};
       int k = 1;
       rotate(arr, k);
       k = 2;
       rotate(arr, k);
       k = 3;
       rotate(arr, k);
       k = 4;
       rotate(arr, k); 
    }
}
