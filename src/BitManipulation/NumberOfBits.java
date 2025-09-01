package BitManipulation;

public class NumberOfBits {
    public static void main(String[] args) {
        int n=50;
        System.out.println("Method 1 : "+numberOfBits(n));
        System.out.println("Method 2 : " + numberOfBits2(n));
    }

    static int numberOfBits(int n) {
        return (int)(Math.log(n) / Math.log(2))+1;
    }

    static int numberOfBits2(int n) {
        int numberOfBits=0;
        while (n > 0) {
            numberOfBits++;
            n >>= 1;
        }
        return numberOfBits;
    }
}
