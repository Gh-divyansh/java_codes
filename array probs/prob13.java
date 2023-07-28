/*
Print All Distinct Elements of a given integer array
--Given an integer array, print all distinct elements in an array. The given array may contain duplicates and the output should print every element only once. The given array is not sorted.
Input: arr[] = {12, 10, 9, 45, 2, 10, 10, 45}
Output: 12, 10, 9, 45, 2
*/
public class prob13 {
    static void print (int arr[]){
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            int j;
            for(j = 0; j < i; j++){
                if (arr[i] == arr[j]) {
                    break;
                } 
            }
            if(i == j){
             System.out.print(" " + arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        int  arr[] = {12, 10, 9, 45, 2, 10, 10, 45};
        System.out.print("All Distinct Elements of a given integer array ::");
        print(arr);
    }
}
