package IO;

import java.io.*;

public class SerializeStudent {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Arun", 20, 90);
        Student s2 = new Student(2, "Ankita", 22, 99);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("StudentInfo.ser"))) {
            oos.writeObject(s1);
            System.out.println("Object has been serialized to StudentInfo.ser");
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("StudentInfo.ser"));
            Student retrievedObject = (Student) ois.readObject();
            System.out.println(retrievedObject);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
/* -> File Extension: Notice we used .ser instead of .txt. While you can use .txt, the content is binary "gibberish" to humans.
      If you open that file in Notepad, you'll see weird symbols. This is because it's a Byte Stream.
-> The Chain: ObjectOutputStream is the high-level tool. It needs a "raw pipe" to work.
   Since we want to save to a file, we provide new FileOutputStream().
-> Static Fields: static variables are not serialized. They belong to the class, not the individual object.
-> Transient: If you added transient int marks;, then after reading the object back, the marks would be 0 (the default for int),
 because transient tells Java "ignore this field during saving."*/