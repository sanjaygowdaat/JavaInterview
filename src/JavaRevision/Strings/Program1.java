package JavaRevision.Strings;

// converting string to character array
public class Program1 {
    public static void main(String[] args) {
        String s = "Aditya";
        char[] arr = s.toCharArray();
        for (char ch : arr) {
            System.out.print(ch + " ");
        }
    }
}
