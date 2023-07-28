/*
 * Rearrange an array such that arr[i] = i
 * Given an array of elements of length N, ranging from 0 to N – 1. All elements may not be present in the array. If the element is not present then there will be -1 present in the array. Rearrange the array such that A[i] = i and if i is not present, display -1 at that place.
 * Input : arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1}
 * Output : [-1, 1, 2, 3, 4, -1, 6, -1, -1, 9]
 */
public class prob17 {
    static void Rearrange(int arr[]){
        int n=arr.length;
        int i , j , temp;
        for(i = 0; i < n; i++){
            for(j = 0 ; j < n ; j++){
                if(arr[j] == i){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i]=temp;
                    break;
                }
            }
        }
        for( i = 0 ; i < n ; i++){
            if(arr[i] != i){
                arr[i] = -1;
            }
        }
        System.out.print("after Rearrange::");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        Rearrange(arr);

    }
}
