package java_programs;

public class hallow_pyramid {
    public static void main(String[] args) {
        int n = 5; // height of the pyramid

        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            // Print stars and spaces
            for (int k = 0; k <= i; k++) {
                if (i == 0 || i == n - 1 || k == 0 || k == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
