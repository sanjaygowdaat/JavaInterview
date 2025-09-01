package StringPrograms;

import java.util.Scanner;

public class CompareTo
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String 1 and String 2 respectively : ");
        String s1=scan.nextLine();
        String s2=scan.nextLine();
        System.out.println("Entered Strings : "+s1+" ,"+s2);
        System.out.println(s1.compareTo(s2));
    }
}
