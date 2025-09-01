package JavaRevision.Strings;

public class Program6 {
    public static void main(String[] args) {

        String s = "Welcome@1234";

        int lowercase = 0;
        int uppercase = 0;
        int numbers = 0;
        int special = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                lowercase++;
            } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                uppercase++;
            } else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                numbers++;
            } else {
                special++;
            }
        }

        System.out.println("LowerCase letters : " + lowercase);
        System.out.println("UpperCase letters : " + uppercase);
        System.out.println("Numbers in the string : " + numbers);
        System.out.println("Special character : " + special);

    }
}
