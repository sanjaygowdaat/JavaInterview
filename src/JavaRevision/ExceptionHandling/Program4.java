package JavaRevision.ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program4 {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            System.out.println("Enter the string : ");
            String str = br.readLine();
            System.out.println(str);
        } catch (IOException e) {
            System.out.println("Exception is handled");
        }
    }
}
