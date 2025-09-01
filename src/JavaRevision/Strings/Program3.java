package JavaRevision.Strings;

public class Program3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        sb.ensureCapacity(90);
        System.out.println(sb.capacity());

        System.out.println(sb.toString()); // toString() is redundant here

    }
}
