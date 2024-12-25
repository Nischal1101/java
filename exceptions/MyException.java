package exceptions;

import java.util.Scanner;

class InvalidAgeException extends Exception {

    InvalidAgeException(String s) {
        super(s);
    }

}

public class MyException {

    static void validate(int Age) throws InvalidAgeException {
        if (Age > 18) {
            System.out.println("hi");
        } else {
            throw new InvalidAgeException("Invalid age");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        String age = sc.nextLine();
        int Age = Integer.parseInt(age);
        try {

            validate(Age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
