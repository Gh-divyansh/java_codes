/*Find Second largest element in an array
Input: arr[] = {12, 35, 1, 10, 34, 1}
Output: The second largest element is 34.
 */
public class prob2 {
    static void print2nd(int arr[]){
        int size = arr.length, second , largest;
            if (arr == null || size < 2){
            System.out.println("invalid input bcoz in array there should be at leaste two elements!!");
            return ;
            }
        largest = second = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            largest = Math.max(largest, arr[i]);
        }
        System.out.println("Largest Element : " + largest);
        for (int i = 0; i < size; i++) {
            if(arr[i] != largest){
                second = Math.max(second, arr[i]);
            }}
            if (second == Integer.MIN_VALUE) {
                System.out.println("there is no second largest element ");
            }else{
                System.out.println("second largest elemenet : "+ second);
            }
        
    }
 public static void main(String[] args) {
    int arr[] = {12, 35, 1, 10, 34, 1};
    print2nd(arr);
 }   
}
