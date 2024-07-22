package java_programs;

public class downpr {
    public static void main(String[] args) {
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<2*(4-i)-1;k++)
            {
                if(i==0 || k==0||k==2*(4-i)-2)
                {

                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
