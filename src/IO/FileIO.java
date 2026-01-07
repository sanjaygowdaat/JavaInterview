package IO;

import java.io.*;
/* -> new FileWriter("file.txt")	    | Overwrite |	 Creating a fresh report or log from scratch.
   -> new FileWriter("file.txt", true)	| Append |	     Adding a new entry to an existing log file.
   -> Files.writeString(...)	        | Configurable | Modern, clean way to handle small file updates.*/
public class FileIO {
    public static void main(String[] args) {
        FileReader fr = null;
        try (FileWriter fw = new FileWriter("TradeOffs.txt")) {
            try {
                fw.write("System Design TradeOff 1\n");
                fw.write("System Design TradeOff 2\n");
                fw.write("System Design TradeOff 3\n");
                fw.append("System Design TradeOff 4\n");
                fw.flush();
                fr = new FileReader("TradeOffs.txt");
                BufferedReader br = new BufferedReader(fr);
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println("RULE : " + line);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

