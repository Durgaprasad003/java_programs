package java_programs;

public class reverse_text {
    public static void main(String[] args) {
        String input = "Hello World this is Java";
        String[] words = input.split(" ");
        
        // Reverse the array of words using a for loop
        int n = words.length;
        for (int i = 0; i < n / 2; i++) {
            // Swap the words
            String temp = words[i];
            words[i] = words[n - 1 - i];
            words[n - 1 - i] = temp;
        }
        System.out.println(String.join(" ", words));
    }
}
