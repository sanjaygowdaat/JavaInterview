package StringPrograms;

import java.util.Scanner;

public class ReverseEachWord
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s1=scan.nextLine();
        String[]arr=s1.split(" ");
        String revSent="";
        for(String str:arr)
        {
            char[]word=str.toCharArray();
            int i=0,j=word.length-1;
            while(i<j)
            {
                char temp=word[i];
                word[i]=word[j];
                word[j]=temp;
                i++;j--;
            }
            String revWord=new String(word);
            revSent=revSent+revWord+" ";
        }
        System.out.println("Reverse Each Word Sentence : "+revSent);
    }
}
