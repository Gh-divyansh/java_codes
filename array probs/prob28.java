/*
Range Minimum Query (Square Root Decomposition and Sparse Table)

We have an array arr[0 . . . n-1]. We should be able to efficiently find the minimum value from index L (query start) to R (query end) where 0 <= L <= R <= n-1. Consider a situation when there are many range queries. 
Example: 
Input:  arr[]   = {7, 2, 3, 0, 5, 10, 3, 12, 18};
        query[] = [0, 4], [4, 7], [7, 8]

Output: Minimum of [0, 4] is 0
        Minimum of [4, 7] is 3
        Minimum of [7, 8] is 12
*/
public class prob28 {
    static int Max = 500;
    static int [][] lookup = new int [Max][Max];
    static class Query{
        int L , R;
        public Query( int L , int R ){
            this.L=L ;
            this.R=R ;
        }
    };

    static void prepo(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            lookup[i][i] = i;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[lookup[i][j - 1]] < arr[j]) {
                    lookup[i][j] = lookup[i][j-1];
                } else {
                    lookup[i][j] = j;
                }
            }
        }
    }

    static void rmq(int arr[] , Query q[] ){
        prepo(arr);

        for (int i = 0; i < q.length; i++) {
            int L = q[i].L , R = q[i].R;
            System.out.println("Minimum of [" + L + ", " + R
            + "] is "
            + arr[lookup[L][R]]);
        }
    }
    public static void main(String[] args) {
        int a[] = { 7, 2, 3, 0, 5, 10, 3, 12, 18 };
        Query q[] = { new Query(0, 4), new Query(4, 7),new Query(7, 8) };
        rmq(a, q);
    }
}
