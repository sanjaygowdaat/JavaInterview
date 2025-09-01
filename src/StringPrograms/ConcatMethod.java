package StringPrograms;

import java.util.Scanner;

public class ConcatMethod
{
    public static void main(String[] args)
    {
        String s1="Sanjay ";
        String s2="Gowda";
        s1.concat(s2);
        System.out.println(s1);
        System.out.println(s2);
        String s3=s1.concat(s2);
        System.out.println(s3);
    }
}
