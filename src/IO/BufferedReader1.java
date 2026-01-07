package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader1 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = new String[100];
        // Reading the input
        for (int i = 0; i < line.length; i++) {
            try {
                System.out.println("Enter the line " + (i + 1) + " text : ");
                line[i] = br.readLine();
                if (line[i].equals("Stop")) {
                    break;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        // Writing the output to the console
        System.out.println("\nHere is your text file : ");
        for (int i = 0; i < line.length; i++) {
            if (line[i].equals("Stop")) {
                break;
            }
            System.out.println(line[i]);
    }
    }
}
