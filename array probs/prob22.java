/*
    K-th Largest Sum Contiguous Subarray
    Given an array of integers. Write a program to find the K-th largest sum of contiguous subarray within the array of numbers that has both negative and positive numbers.
    Input: a[] = {20, -5, -1}, K = 3
    Output: 14
 */

import java.util.ArrayList;
import java.util.Collections;

public class prob22 {
    static int largestSum(int arr[], int k){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                result.add(sum);
            }
        }
        Collections.sort(result,Collections.reverseOrder());
        return result.get(k-1); //returning the value of index 'K'
    }
    public static void main(String[] args) {
        int a[] = {20, -5, -1}, K = 3;
        System.out.println("The " + K +" th largest contiguous subarray is "+largestSum(a, K));
    }
}
