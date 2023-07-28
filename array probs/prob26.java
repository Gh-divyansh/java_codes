/*
Sparse Table
We have briefly discussed sparse table in Range Minimum Query (Square Root Decomposition and Sparse Table)
Sparse table concept is used for fast queries on a set of static data (elements do not change). It does preprocessing so that the queries can be answered efficiently.

Input:  arr[]   = {7, 2, 3, 0, 5, 10, 3, 12, 18};
        query[] = [0, 4], [4, 7], [7, 8]

Output: Minimum of [0, 4] is 0
        Minimum of [4, 7] is 3
        Minimum of [7, 8] is 12
*/
public class prob26 {
    static int max = 500;
    static int[][] lookup = new int[max][max];
    static void SparseTable( int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++)
            lookup[i][0] = arr[i];
     
        for (int j = 1; (1 << j) <= n; j++) {
            for (int i = 0; (i + (1 << j) - 1) < n; i++) {
                if (lookup[i][j - 1] <
                            lookup[i + (1 << (j - 1))][j - 1])
                    lookup[i][j] = lookup[i][j - 1];
                else
                    lookup[i][j] =
                            lookup[i + (1 << (j - 1))][j - 1];
            }
        }
    }
    static int query(int l , int r){
        int j = (int)Math.log(r - l + 1);
        if (lookup[l][j] <= lookup[r - (1 << j) + 1][j]) {
            return lookup[l][j];
        }else{
            return lookup[(r - ( 1 << j ) + 1)][j] ;
        }
    }
    public static void main(String[] args) {
        int arr[]   = {7, 2, 3, 0, 5, 10, 3, 12, 18};
        SparseTable(arr);
        System.out.println(query(0, 4));
        System.out.println(query(4, 7));
        System.out.println(query(7, 8));
    }
}
