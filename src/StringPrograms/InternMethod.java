package StringPrograms;

import java.util.Scanner;

public class InternMethod
{
    public static void main(String[] args)
    {
        String s1=new String("Sanjay");
        String s2=s1.intern();
        String s3="Sanjay";
        if(s2==s3)
        {
            System.out.println("References are same!");
        }
    }
}
