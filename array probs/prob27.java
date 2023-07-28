/* 
Range sum query using Sparse Table
We have an array arr[]. We need to find the sum of all the elements in the range L and R where 0 <= L <= R <= n-1. Consider a situation when there are many range queries.

Input : 3 7 2 5 8 9
        query(0, 5)
        query(3, 5)
        query(2, 4)
Output : 34
         22
         15
 */

public class prob27 {
    static int k = 16;
    static int n = 100;
    static long tab[][] = new long[n][k+1];
    static void table(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            tab[i][0] = arr[i];
        }
        for (int j = 1; j <= k ; j++) {
            for (int i = 0; i <= arr.length - (1 << j); i++)
            tab[i][j] = tab[i][j - 1] +
            tab[i + (1 << (j - 1))][j - 1];
        } 
    }

    static long query( int l , int r){
        long ans = 0;
        for (int i = k; i >= 0; i--) {
            if (l + (1 << i) - 1 <= r) {
                ans = ans + tab[l][i];
                l+=1<<i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 7, 2, 5, 8, 9 };
        table(arr);
        System.out.println(query(0, 5));
        System.out.println(query(3, 5));
        System.out.println(query(2, 4));
    }
}
 