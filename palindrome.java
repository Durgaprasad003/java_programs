package java_programs;

public class palindrome {
    public static void main(String[] args) {
        String palind="madamf";
        char ch[]=palind.toCharArray();
        String check="";
        int n=palind.length()-1;
        for(int i=n;i>=0;i--)
        {
            check=check+ch[i];
        }
        // System.out.println(check);
        if(palind.equals(check))
        {
            System.out.println("yes the given string "+palind+"is palindrome");
        }
        else{
            System.out.println("the give string is not palindrome 🥹");
        }
    }
}
