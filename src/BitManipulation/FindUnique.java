package BitManipulation;
/*Let’s say your array is:
int[] arr = {A, B, A, C, C, B, X}; // X is the unique one
Now, let’s XOR them all:
A ^ B ^ A ^ C ^ C ^ B ^ X
Group by duplicates:
        (A ^ A) ^ (B ^ B) ^ (C ^ C) ^ X
Each pair cancels out:
        0 ^ 0 ^ 0 ^ X = X
All the duplicate elements vanish. Only the unique one remains.*/
public class FindUnique
{
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 3, 2, 4};
        System.out.println(findUnique(arr));
    }

    public static int findUnique(int[] arr) {
        int unique=0;
        for (int x : arr) {
            unique ^= x;
        }
        return unique;
    }
}
