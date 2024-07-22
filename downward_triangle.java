package java_programs;

public class downward_triangle {
    public static void main(String[] args) {
        // for(int i=5;i>0;i--)
        // {
        //    for(int j=1;j<=i;j++)
        //    {
        //     System.out.print("*");
        //    }
        //    System.out.println();
        // }
        

        for(int i=0;i<5;i++)
        {
            for(int j=5-i;j>0;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }

       
    }
}
