package StringPrograms;

import java.util.Scanner;

public class Unicode
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the character : ");
        char ch=scan.next().charAt(0);
        int unicode=ch;
        System.out.println("Unicode value of entered charcter is : "+unicode);
    }
}
