package java_programs;

public class half_diamond {
    public static void main(String[] args) {
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    //    for(int i=3;i>0;i--)
    //    {
    //       for(int j=0;j<i;j++)
    //       {
    //         System.out.print("*");
    //       }
    //       System.out.println();
    //    }
    for(int j=0;j<3;j++)
    {
        for(int k=3;k>j;k--)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    }
}
