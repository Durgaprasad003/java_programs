package java_programs;

public class revere_pryamid {
    public static void main(String[] args) {
        for(int i=0;i<5;i++)
        {
           for(int j=0;j<i;j++)
           {
            System.out.print(" ");
           }
           for(int k=5-i;k>0;k--)
           {
            System.out.print("* ");
           }
            System.out.println();
        }
    }
}
