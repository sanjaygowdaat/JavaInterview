package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LearnBufferedReader {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        try {
//            System.out.println("Enter characters, else 'q' to quit");
//            char ch;
//            do {
//                ch = (char) br.read();
//                System.out.print(ch);
//            } while (ch != 'q');
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        System.out.println("Enter the name : ");
        try {
            String name = br.readLine();
            System.out.print(name);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.print(" As we can see, cursor is still in the same line as my String name because" +
                " unlike read() method readLine doesn't print \\n character");
    }
}
