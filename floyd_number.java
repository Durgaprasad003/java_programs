package java_programs;

public class floyd_number {
    public static void main(String[] args) {
        int k=1;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }
}
