package java_programs;
public class remove_sp_junk {
    public static void main(String[] args) {
        String str="@12,. ab5/ Bcd43";
       String str2= str.replaceAll("[^0-9a-zA-Z]","");
       System.out.println(str2);
    }
}
