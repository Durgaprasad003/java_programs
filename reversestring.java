package java_programs;

public class reversestring {
    public static void main(String[] args) {
        String name="hello";
        char ch[]=name.toCharArray();
        String newstring="";
        int n=name.length()-1;
        for(int i=n;i>=0;i--)
        {
             newstring=newstring+ch[i];

        }
        System.out.println(newstring);
    }
}
