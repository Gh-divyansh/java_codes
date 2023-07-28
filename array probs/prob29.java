/*
 Range LCM Queries
 Given an array arr[] of integers of size N and an array of Q queries, query[], where each query is of type [L, R] denoting the range from index L to index R, the task is to find the LCM of all the numbers of the range for all the queries.
 Input: arr[] = {5, 7, 5, 2, 10, 12 ,11, 17, 14, 1, 44}
query[] = {{2, 5}, {5, 10}, {0, 10}}
Output: 60,15708, 78540
 */

import java.util.ArrayList;
import java.util.List;

public class prob29 {
    static final int MAX = 1000;
    static int tree[] = new int[4 * MAX];
    static int arr [] = new int[MAX];


    static int gcd(int a , int b){
        if (a == 0) {
            return b;
        }
        return gcd ( b % a , a);
    }

    
    
    static int lcm(int a , int b){
        return a * b / gcd(a, b);
    }

    static void build(int node , int start , int end){
        if (start == end) {
            tree[node] = arr[start];
            return;
        }

        int mid = (start + end) / 2;
        build(2 * node, start, mid);
        build(2 * node + 1, mid + 1, end);

        int leftlcm = tree[2 * node];
        int rightlcm = tree[2 * node + 1];

        tree[node] = lcm(leftlcm , rightlcm);
    }

    static int query(int node , int start , int end , int l , int r){
        if (end < l || start > r) {
            return 1;
        }

        if (l <= start && r >= end) {
            return tree[node];
        }

        int mid = (start + end) / 2;
        int leftlcm = query(2*node, start, mid, l, r);
        int rightlcm = query(2*node+1, mid + 1, end, l, r);
        return lcm(leftlcm, rightlcm);
    }

    public static List<Integer> rangeLcmQueries(List<Integer> arr, List<int[]> queries) {
        List<Integer> results = new ArrayList<>();
        for (int[] query : queries) {
            int l = query[0];
            int r = query[1];
            int lcmVal = arr.get(l);
            for (int i = l + 1; i <= r; i++) {
                lcmVal = lcm(lcmVal, arr.get(i));
            }
            results.add(lcmVal);
        }
        return results;
    }
    public static void main(String[] args) {
        //method 1
        arr[0] = 5;
        arr[1] = 7;
        arr[2] = 5;
        arr[3] = 2;
        arr[4] = 10;
        arr[5] = 12;
        arr[6] = 11;
        arr[7] = 17;
        arr[8] = 14;
        arr[9] = 1;
        arr[10] = 44;
        build(1, 0, 10);
        System.out.println(query(1, 0, 10, 2, 5));
        System.out.println(query(1, 0, 10, 5, 10));
        System.out.println(query(1, 0, 10, 0, 10));

        //method 2

        List<Integer> arr = List.of(5, 7, 5, 2, 10, 12, 11, 17, 14, 1, 44);
        List<int[]> queries = List.of(new int[]{2, 5}, new int[]{5, 10}, new int[]{0, 10});
        List<Integer> results = rangeLcmQueries(arr, queries);
        for (int result : results) {
            System.out.print(result + " ");
        }
        System.out.println();

    }
}
