package JavaRevision.Practice;

public class Program1 {
    public static void main(String[] args) {
        String s = "Raja Ram Mohan Roy";
        char[] arr = s.toCharArray();
        char[] rev = new char[arr.length];
        int j = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                rev[i] = ' ';
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                continue;
            } else {
                if (rev[j] == ' ') {
                    j--;
                }
                rev[j--] = arr[i];
            }
        }
        System.out.println(new String(rev));

    }
}
