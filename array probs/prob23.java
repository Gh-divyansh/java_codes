/*
 * Find the smallest missing number
 * Given a sorted array of n distinct integers where each integer is in the range from 0 to m-1 and m > n. Find the smallest number that is missing from the array. 
 * Input: {0, 1, 2, 6, 9}, n = 5, m = 10 
   Output: 3
*/
public class prob23 {
    static int findMissing(int arr[] , int m , int n){
        if (m > n) {
            return n+1;
        }
        if (m != arr[m]) {
            return m;
        }
        int mid = (n+m)/2;

        if(arr[mid] == mid){
            return findMissing(arr, mid+1, n);
        }
        return findMissing(arr, m, mid);
    }
    public static void main(String[] args) {
        int arr [] = {0, 1, 2, 6, 9}, n = arr.length -1;
        System.out.println("Missing Number is " +findMissing(arr,0, n));
    }
}
