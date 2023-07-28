/*
Leaders in an array...
Write a program to print all the LEADERS in the array. An element is a leader if it is greater than all the elements to its right side. And the rightmost element is always a leader. 
Input: arr[] = {16, 17, 4, 3, 5, 2}, 
Output: 17, 5, 2
*/
public class prob15 {
    static void leaders(int arr[]){
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            int j;
            for(j = 1 + i ; j < n; j++){
                if (arr[i] <= arr[j]) {
                    break;
                }
            }
            if (j == n) {
                System.out.print(arr[i] + " ");
            }
        }
    }
public static void main(String[] args) {
    int arr[] = {16, 17, 4, 3, 5, 2};
    System.out.print("leaders in givin array::");
    leaders(arr);
}    
}
