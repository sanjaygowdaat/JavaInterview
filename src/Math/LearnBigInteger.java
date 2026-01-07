package Math;

import java.math.BigInteger;

public class LearnBigInteger {
    public static void main(String[] args) {
        BigInteger bi1 = new BigInteger("1234567890123456789");
        System.out.println("BigInteger value : " + bi1);
        // converting int/long to BigInteger
        BigInteger bi2 = BigInteger.valueOf(1234567890);
        System.out.println("BigInteger value instantiated using valueOf method : " + bi2);
        //converting BigInteger to int
        int i = bi1.intValue();
        System.out.println("BigInteger value " + bi1 + " converted to integer value : " + i);
        // perform add operation on a BigInteger number
        BigInteger bi4 = bi1.add(bi2);
        System.out.println(bi4);
        // compareTo function to compare two BigInteger values
        System.out.println(bi1.compareTo(bi2)); // this.compareTo(val) -> returns 0 if this value == val,
        // -1 if val < this.val, 1 if this.val > val passed in the argument
    }
}
