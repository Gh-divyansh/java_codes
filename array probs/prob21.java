/*
::Find the Rotation Count in Rotated Sorted array
Problem Description:Given an array arr[] of size N having distinct numbers sorted in increasing order and the array has been right rotated (i.e, the last element will be cyclically shifted to the starting position of the array) k number of times, the task is to find the value of k.
Input: arr[] = {15, 18, 2, 3, 6, 12}
Output: 2
*/
public class prob21 {
    static int rotate(int arr[]){
        int min = arr[0] , minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static void main(String[] args) {
        int arr[] = {15, 18, 2, 3, 6, 12};
        System.out.println("Rotation count is " +rotate(arr)); 
    }
}
