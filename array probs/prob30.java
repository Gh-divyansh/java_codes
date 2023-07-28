/*
 * Merge Sort Tree for Range Order Statistics
 * Given an array of n numbers, the task is to answer the following queries:

kthSmallest(start, end, k) : Find the Kth smallest 
                             number in the range from array
                             index 'start' to 'end'.

Input : arr[] = {3, 2, 5, 1, 8, 9|
     Query 1: start = 2, end = 5, k = 2
     Query 2: start = 1, end = 6, k = 4
Output : 2
         5
Explanation:
[2, 5, 1, 8] represents the range from 2 to 
5 and 2 is the 2nd smallest number 
in the range[3, 2, 5, 1, 8, 9] represents 
the range from 1 to 6 and 5 is the 4th
smallest number in the range
 */

import java.util.Arrays;

public class prob30 {
    public static void kthelement(int arr[] , int q[]){
        if (q[1] > arr.length) {
            System.out.println("out of range :(");
        } else if((q[1] - q[0] + 1) < q[2]) {
            System.out.println("k'th element is not present :/");
        }else{
            int temp [] = Arrays.copyOfRange(arr, q[0]-1, q[1]);
            Arrays.sort(temp);
            System.out.println(temp[q[2] - 1]);
        }
    }
    public static void main(String[] args) {
         int arr[] = {3, 2, 5, 1, 8, 9};
         //query {start , end , kth}
         int query1 [] = {2,5,2};
         System.out.print("k = " + query1[2] + " smallest number :: ");
         kthelement(arr, query1);
         int query2 [] = {1,6,4};
         System.out.print("k = " + query2[2] + " smallest number :: ");
         kthelement(arr, query2);
    }
}
