/*
 Square Root (Sqrt) Decomposition Algorithm
Square Root Decomposition Technique is one of the most common query optimization techniques used by competitive programmers. This technique helps us to reduce Time Complexity by a factor of sqrt(N) 
 */
public class prob25 {
    static int maxn = 1000;
    static int sqrsize = 100;
    static int arr[] = new int[maxn];
    static int block[] = new int[sqrsize];
    static int blksize;

    static void update(int idx , int val){
        int blockNum = idx / blksize;
        block[blockNum] += val - arr[idx];
        arr[idx] = val;
    }
    static int query(int l , int r){
        int sum = 0;
        while (l < r && l % blksize != 0 && l != 0) {
            sum += arr[l];
            l++;
        }
        while (l + blksize - 1 <= r) {
            sum += block[l / blksize];
            l += blksize;
        }
        while (l <= r) {
            sum += arr[l];
            l++;
        }
        return sum;
        
    }

    static void prepro(int arr1[]){
        int n = arr1.length;
        int blkidx = -1;
        blksize = (int)Math.sqrt(n);
        for (int i = 0; i < n; i++) {
            arr[i] = arr1[i];
            if (i % blksize == 0) {
                blkidx++;
            }
            block[blkidx]+=arr[i];
        }
    }
    public static void main(String[] args) {
        int input[] = { 1, 5, 2, 4, 6, 1, 3, 5, 7, 10 };
        prepro(input);
        System.out.println("query(3, 8) : " + query(3, 8));
        System.out.println("query(1, 6) : " + query(1, 6));
        update(8, 0);
        System.out.println("query(8, 8) : " + query(8, 8));

    }
}
