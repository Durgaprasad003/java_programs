package java_programs;

public class ex_pat {
    public static void main(String[] args) {
        // right triangle
        // for(int i=0;i<5;i++)
        // {
        //     for(int j=0;j<=i;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
           
        // down right 

                //  for(int i=0;i<5;i++)
                //  {
                //     for(int j=5-i;j>0;j--)
                //     {
                //         System.out.print("*");
                //     }
                //     System.out.println();
                //  }

        // for(int i=5;i>0;i--)                        
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }



        // inverted right 
        // for(int i=0;i<5;i++)
        // {
        //     for(int j=1;j<5-i;j++)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(int j=0;j<=i;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        for(int i=0;i<5;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<5-i;k++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
