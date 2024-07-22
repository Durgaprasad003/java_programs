package java_programs;

public class hollow_square {
    public static void main(String[] args) {
        int n = 4;  // Size of the square
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n-1 || j == 0 || j == n-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();  // Move to the next line after printing all columns of the current row
        }
    }
}
