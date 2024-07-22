package java_programs;

public class right_pascal {
    public static void main(String[] args) {
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        // for(int i=4;i>0;i--)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        for(int i=0;i<4;i++)
        {
            for(int j=4-i;j>0;j--)
            {
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}
