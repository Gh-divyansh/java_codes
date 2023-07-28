/*
Segregate even and odd numbers
Given an array arr[] of integers, segregate even and odd numbers in the array. Such that all the even numbers should be present first, and then the odd numbers.
Input: arr[] = 1 9 5 3 2 6 7 11
Output: 2 6 5 3 1 9 7 11
 */

public class prob7 {
    static void segregate(int arr[]){
        int size = arr.length;
        int temp[] = new int[size];
        int index = 0;
        for(int i = 0 ; i < size ; i++){
            if(arr[i]%2 == 0){
                temp[index] = arr[i];
                index++;
            }
        }
        for(int i = 0 ; i < size ; i++){
            if(arr[i]%2 != 0){
                temp[index] = arr[i];
                index++;
            }
        }
        for(int i = 0 ; i < size ; i++){
            System.out.print(temp[i] + " ");
        }
        System.out.println();
        
    }

    static void segregate2(int arr[]){
        int size = arr.length;
        int i = -1 , j = 0;
        while (j != size) {
            if(arr[j] % 2 == 0){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }
         for(int k = 0 ; k < size ; k++){
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1 ,9 ,5 ,3 ,2 ,6 ,7 ,11};
        System.out.print("after segregating array ::");
        // segregate(arr);
        segregate2(arr);
    }
}
