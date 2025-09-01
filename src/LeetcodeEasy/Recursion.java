package LeetcodeEasy;

public class Recursion
{
    static int count=0;
    static void print()
    {
        if(count==6)
        {
            return;
        }
        System.out.println(count);
        count++;
        print();
    }

    public static void main(String[] args) {
        print();
    }
}
