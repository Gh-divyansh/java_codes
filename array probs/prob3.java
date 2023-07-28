/*print half array
input int arr[] = {5,6,8,9,8,1};
output = 5,6,8
 print 1s and zeros in arr
 input int arr2[] = {1,1,1,0,0,1,0,2,0};
 output = 1 1 1 1 0 0 0 0
*/ 
public class prob3 {
    static void printHalf(int arr[]){
        int size = arr.length;
        System.out.print("half arr is :: ");
        for (int i = 0; i < size/2; i++) {
            System.out.print(arr[i] +" ");
        }
        
    }

    static void printOne( int arr[]){
        int size = arr.length;
        System.out.print("all ones and zeros in array : ");
        for (int i = 0; i < size; i++) {
            if(arr[i] == 1){
                System.out.print(arr[i] +" ");
            } 
        }
        for (int i = 0; i < size; i++) {
            if (arr[i] == 0) {
                System.out.print(arr[i] +" ");
            }
        }



    }
   public static void main(String[] args) {
    int arr[] = {5,6,8,9,8,1};
    int arr2[] = {1,1,1,0,0,1,0,2,0};
    printHalf(arr);
    System.out.println();
    printOne(arr2);
   } 
}
