package BitManipulation;

public class FindUniqueElement
{
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 3, 3, 3, 5, 5, 5, 6, 6, 6, 11};
        System.out.println(findUnique(arr));
    }

    public static int findUnique(int[] arr) {
        int uniqueElement=0;
        for (int i = 0; i < 32; i++) {
            int sumOfBits=0;
            for (int n : arr) {
                if (((n >> i) & 1) == 1) {
                    sumOfBits++;
                }
            }
            if (sumOfBits % 3 != 0) {
                uniqueElement |= (1 << i);
            }
        }
        return uniqueElement;
   }
}
