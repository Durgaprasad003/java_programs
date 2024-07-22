package java_programs;

public class remov_whitespaces {
    public static void main(String[] args) {
        String str="A  B  C  D";
        // String st=str.replaceAll("[^A-Z]", "");
        String st=str.replaceAll("\\s", "");
        System.out.println(st);
    }
}
 ///  \\s for removing spaces this is regular expresssion