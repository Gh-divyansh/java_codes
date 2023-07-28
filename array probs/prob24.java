/*
 MO’s Algorithm (Query Square Root Decomposition) | Set 1 (Introduction)
 Let us consider the following problem to understand MO’s Algorithm.
 We are given an array and a set of query ranges, we are required to find the sum of every query range.
 Input:  arr[]   = {1, 1, 2, 1, 3, 4, 5, 2, 8};
        query[] = [0, 4], [1, 3] [2, 4]
 Output: Sum of arr[] elements in range [0, 4] is 8
         Sum of arr[] elements in range [1, 3] is 4  
         Sum of arr[] elements in range [2, 4] is 6
 */

import java.util.ArrayList;

/**
 * The Query class represents a query with two integer parameters, l and r.
 */
class Query{
    int l;
    int r;
    Query(int l , int r){
        this.l = l;
        this.r = r;
    }
 }
public class prob24 {
    /**
     * The function takes an array, a list of queries, and an integer as input, and prints the sum of
     * subarrays specified by the queries.
     * 
     * @param arr An array of integers.
     * @param q An ArrayList of Query objects. Each Query object has two properties, l and r, which
     * represent the starting and ending indices of a subarray.
     * @param m The parameter `m` represents the number of queries in the `q` ArrayList.
     */
    static void printsum(int arr[],ArrayList<Query> q, int m){
        for (int i = 0; i < m; i++) {
            int l =q.get(i).l , r=q.get(i).r;
            int sum = 0;
            for (int j = l; j <= r; j++) {
                sum += arr[j];
            }
          System.out.println("Sum of [" + l +
          ", " + r + "] is "  + sum);
        }
    }
    public static void main(String[] args) {
       int arr[]   = {1, 1, 2, 1, 3, 4, 5, 2, 8};
       ArrayList<Query> q = new ArrayList<Query>();
       q.add(new Query(0, 4));
       q.add(new Query(1, 3));
       q.add(new Query(2, 4));

       int m = q.size();
       printsum(arr, q, m);
    }
}
