/*
 Move all zeroes to end of array
Input :  arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
Output : arr[] = {1, 2, 4, 3, 5, 0, 0, 0};
 */
public class prob4 {
    /**
     * The function moves all non-zero elements in an array to the beginning and fills the remaining
     * elements with zeros.
     * 
     * @param arr The parameter "arr" is an array of integers.
     */
    static void move(int arr[]){
        int size = arr.length, count = 0;
        // The code snippet `for (int i = 0; i < size; i++) { if (arr[i] != 0) { arr[count++] = arr[i];
        // } }` is responsible for moving all non-zero elements to the beginning of the array.
        for (int i = 0; i < size; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        // The code snippet `while (count < size) { arr[count++] = 0; }` is responsible for filling the
        // remaining elements of the array with zeros.
        while (count < size) {
            arr[count++] = 0;
        }
    }

    //second method

    static void swap(int arr[], int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

   // The `move2` method is another implementation of moving all non-zero elements to the beginning of
   // the array.
    static void move2(int arr[]){
        int size = arr.length , j = 0 , i;
       for( i = 0 ; i < size ; i++){
        if(arr[i] != 0 ){
            swap(arr,j,i );
            j++;
       }
    }
    }


    static void print(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
        System.out.print("after moving to zero :: ");
        // move(arr);
        move2(arr);
        print(arr);
    }
}
