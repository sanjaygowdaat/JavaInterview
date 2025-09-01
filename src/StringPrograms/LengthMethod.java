package StringPrograms;

import java.util.Scanner;

public class LengthMethod
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s1=scan.nextLine();
        System.out.println("Length of entered string "+s1+" is : "+s1.length());
    }
}
