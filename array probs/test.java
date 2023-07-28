public class test {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements in the sequence: ");
        int n = 5;

        // Get the first term of the sequence
        System.out.println("Enter the first term of the sequence: ");
        int a1 = 1;

        // Get the common ratio of the sequence
        System.out.println("Enter the common ratio of the sequence: ");
        int r = 2;

        // Print the geometric sequence
        System.out.println("The geometric sequence is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a1 + " ");
            a1 = a1 * r;
        }
	}
    }
