package JavaRevision.ExceptionHandling;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pin = 1234;
        System.out.println("Enter the pin : ");
        int userPin = scan.nextInt();
        if (userPin == pin) {
            System.out.println("Access granted");
        } else {
            try {
                throw new InvalidUserException();
            } catch (InvalidUserException e) {
                System.out.println("Enter the pin 2nd time : ");
                if (scan.nextInt() == pin) {
                    System.out.println("Access granted");
                } else {
                    try {
                        throw new InvalidUserException();
                    } catch (InvalidUserException ex) {
                        System.out.println("Enter the pin 3rd time : ");
                        if (scan.nextInt() == pin) {
                            System.out.println("Access granted");
                        } else {
                            try {
                                throw new InvalidUserException("Card blocked");
                            } catch (InvalidUserException exception) {
                                exception.printStackTrace();
                            }

                        }
                    }
                }
            }
        }
    }
}
