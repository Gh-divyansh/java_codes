/*
Rearrange an array in maximum minimum form using Two Pointer Technique
Input: arr[] = {1, 2, 3, 4, 5, 6, 7} 
Output: arr[] = {7, 1, 6, 2, 5, 3, 4}
 */
import java.util.Arrays;
public class prob6 {
/**
 * The function rearranges an array by sorting it and then rearranging the elements in alternating
 * order, starting with the largest element.
 * 
 * @param arr An array of integers that needs to be rearranged.
 */
static void rearrange(int arr[]){
    Arrays.sort(arr);
    int size = arr.length;
    int temp[] = arr.clone();
    int samll = 0 , large = size-1;
    boolean flag = true;
    // The `for` loop is iterating over the elements of the array `arr` and assigning values to each
    // element based on the `flag` variable.
    for( int i = 0 ; i < size ; i++){
        if(flag){
            arr[i] = temp[large--];
        }else{
            arr[i]=temp[samll++];
        }
        flag = !flag;
    }

}

    public static void main(String[] args) {
    //    int arr[] = {2,5,6,8,9,1};
       int arr[] = {1, 2, 3, 4, 5, 6, 7};
       rearrange(arr);
       System.out.println("Array after Rearranging : "+Arrays.toString(arr));
    }
}