/*
 * Count the number of possible triangles
 * Given an unsorted array of positive integers, find the number of triangles that can be formed with three different array elements as three sides of triangles. For a triangle to be possible from 3 values, the sum of any of the two values (or sides) must be greater than the third value (or third side). 
 * input: arr= {4, 6, 3, 7}
 * Output: 3
 */
import java.util.*;
public class prob12 {
    static int findTri(int arr[]){
        int size = arr.length;
        Arrays.sort(arr);
        int count = 0;
        for(int i = 0 ; i < size ; i++){
            for(int j = i + 1 ; j < size ; j++){
                for(int k = j + 1 ; k < size ; k++){
                    if(arr[i] + arr[j] > arr[k]){
                        count++;
                    }
                }
            }
        
        }
        return count;       
    }
    public static void main(String[] args) {
        int arr[]= {4, 6, 3, 7};
        System.out.println(findTri(arr));
        
    }
}
