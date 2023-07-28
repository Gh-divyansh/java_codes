/*
 Find the element that appears once in an array where every other element appears twice
 --Given an array of integers. All numbers occur twice except one number which occurs once. Find the number in O(n) time & constant extra space.
Input:  arr[] = {2, 3, 5, 4, 5, 3, 4}
Output: 2 
     :: 5 3 4
 */
public class prob14 {

    static int printRep(int arr[]){
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            int j ;
            int count = 0;
            for(j = 0 ; j < size ; j++ ){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 1){
                return arr[i];
            }
        }
        return -1;
    }
    static void printRep1(int arr[]){
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            int j ;
            for(j = 0 ; j < i ; j++ ){
                if(arr[i] == arr[j]){
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        int  arr[] = {2, 3, 5, 4, 5, 3, 4};
        System.out.println("element count that appare ones :: " + printRep(arr));
        System.out.print("elements that appare more than one :: ");
        printRep1(arr);
    }
}
