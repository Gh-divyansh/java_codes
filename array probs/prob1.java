/* Find the largest three distinct elements in an array
Input: arr[] = {10, 4, 3, 50, 23, 90}
Output: 90, 50, 23
*/
public class prob1 {
static void print(int arr[]){
    int size = arr.length;
    int first , second , third;
    if (size < 3) {
        System.out.println("invalid input bcoz in array there should be at leaste three elements!!");
        return;
    }
    third = first = second = Integer.MIN_VALUE;

    for (int i = 0; i < size; i++) {
       if (arr[i] > first) {
        third = second;
        second = first;
        first = arr[i];
       } 
       else if(arr[i] > second){
        third=second ;
        second = arr[i];
       }
       else if(arr[i] > third){
        third = arr[i];
       }
    }
    System.out.println("three largest element is , first:"+first+" ,second:"+second+" ,third:"+third);
}
public static void main(String[] args) {
    int arr[] = {10, 4, 3, 50, 23, 90};
    print(arr);
}
    
}