package Math;

import java.text.DecimalFormat;
/*
There are 11 Special Pattern Characters, but the most important are:
    0 – prints a digit if provided, 0 otherwise
    # – prints a digit if provided, nothing otherwise
    . – indicate where to put the decimal separator
    , – indicate where to put the grouping separator
*/
public class LearnDecimalFormat {
    public static void main(String[] args) {
        DecimalFormat pattern1 = new DecimalFormat("000.00");
        System.out.println("Pattern 1 : " + pattern1.format(7.178));
        DecimalFormat pattern2 = new DecimalFormat("###.##");
        System.out.println("Pattern 2 : " + pattern2.format(7.178));
//      -> If the decimal part of the pattern can’t contain the whole precision of the input number, it gets rounded.
//      -> The default rounding mode is HALF_EVEN, but it can be customized through the setRoundingMode method.
//      -> The grouping separator is used to specify a sub-pattern which gets repeated automatically
        DecimalFormat pattern3 = new DecimalFormat("#####,###.#");
        System.out.println("Pattern 3 : " + pattern3.format(12345678.901));
        /* -> Some countries have a variable number of grouping patterns in their numbering systems.
        -> The Indian Numbering System uses the format #,##,###.##, in which only the first grouping separator
        holds three numbers, while all the others hold two numbers.
        -> This isn’t possible to achieve using the DecimalFormat class, which keeps only the latest pattern
        encountered from left to right, and applies it to the whole number, ignoring previous grouping patterns.
        -> An attempt to use the pattern #,##,##,##,### would result in a regroup to #######,### and
        end in a redistribution to #,###,###,###.*/
        DecimalFormat pattern4 = new DecimalFormat("Mixing String Literals with numbers like #! Cool!");
        System.out.println("Pattern 4 : " + pattern4.format(12345));
//      It’s also possible to use special characters as String literals, through escaping :
        DecimalFormat pattern5 = new DecimalFormat("Mixing String Literals with special characters and numbers : #,###.# ',' Pattern used : '#,###.#' ");
        System.out.println("Pattern 5 : " + pattern5.format(12345678.9012));

        // Converting String to an integer using a method from Integer Class
        int parsedInteger = Integer.parseInt("123");
        // notice the difference between the two.
        System.out.println(parsedInteger + "" + 1); // 1231
        System.out.println(parsedInteger + 1); // 124
    }
}
