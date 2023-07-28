/*Rearrange array such that even positioned are greater than odd
Input : A[] = {1, 2, 2, 1}
Output :  1 2 1 2
 */

import java.util.Arrays;

public class prob5 {
    // The `rearrange` method takes an array `arr` as input and rearranges its elements such that the
    // even positioned elements are greater than the odd positioned elements.
    static void rearrange(int arr[]){
        int size = arr.length;
        Arrays.sort(arr);
        int newArr[] = new int[size];
        int a = 0 , b = size - 1;
        for(int i = 0 ; i < size ; i++){
            if((i + 1) % 2 == 0){
                newArr[i] = arr[b--];
            }else{
                newArr[i] = arr[a++];
            }
        }

        // The code snippet `for (int i = 0; i < size; i++) { System.out.print(newArr[i] + " "); }` is
        // printing the elements of the `newArr` array, which contains the rearranged elements of the
        // original array. It iterates over each element of `newArr` and prints it followed by a space.
        for (int i = 0; i < size; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int A[] = {1, 2, 2, 1};
        rearrange(A); 
    }
}
