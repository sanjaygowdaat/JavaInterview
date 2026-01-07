package IO;

/* -> System.out is a PrintStream, not the console itself.
- Output goes through an in-memory buffer before reaching the OS/terminal.
- A buffer is a byte array used to batch writes for performance.
-> write(int): Writes only the lowest 8 bits of the integer.
- Is byte-oriented, not character-oriented.
- Does not flush automatically.
- Writing data ≠ displaying output.
- Flush means forcing buffered bytes to be sent to the OS immediately.
- Without flush(), data may remain in memory and never appear.
- Program termination does not guarantee buffer flushing.
-> print() / println(): Handle character encoding.
- Typically trigger automatic flushing (especially with newline).
- Use write() only for low-level I/O when buffering and encoding are intentional.
- For normal console output, prefer print / println.
-> Core rule: Write stages data. Flush makes it visible.*/
public class WriteMethod {
    public static void main(String[] args) {
        int a = 'A';
        int b = 'b';
        System.out.write(a); // write takes int as argument, and
        // send only the lowest 8 bit of that number to memory, buffer
        System.out.write('\n'); // prints next line
        System.out.write(b);
        System.out.flush(); // bytes stored in buffer,
        // in memory is flushed to OS, to the terminal to display the bytes after decoding
    }
}
