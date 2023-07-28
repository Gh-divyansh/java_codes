/*Find Subarray with given sum | Set 1 (Non-negative Numbers)
 Given an array arr[] of non-negative integers and an integer sum, find a subarray that adds to a given sum.

Note: There may be more than one subarray with sum as the given sum, print first such subarray. 
Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
Output: Sum found between indexes 2 and 4
 */
public class prob16 {
    static void subSum(int arr[] , int sum){
        for(int i=0;i<arr.length ;i++){
            int current = arr[i];

            if (current == sum) {
                System.out.println("sum found at index :: " + i);
                return;
            }else{
                for(int j = i + 1 ; j < arr.length; j++){
                    current+= arr[j];

                if (current == sum) {
                    System.out.println("sum found between index "+i+" and "+j);
                    return;
                }
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 20, 3, 10, 5};
        int sum = 33;
        subSum(arr, sum);
    }
}
