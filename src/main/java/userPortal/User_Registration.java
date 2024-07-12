package userPortal;

import java.util.Scanner;

public class User_Registration {
    public static boolean validateFirstName(String firstName, String lastname) {
        return firstName.matches("^[A-Z][a-zA-Z]{2,}$") && lastname.matches("^[A-Z][a-zA-Z]{2,}$");
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the first name: ");
        String firstName = sc.nextLine();
        
        System.out.print("Enter the last name: ");
        String lastName = sc.nextLine();
        sc.close();
        
        if (validateFirstName(firstName , lastName)) {
            System.out.println(firstName + " " + lastName + " is a valid name.");
        } else {
            System.out.println(firstName + " " + lastName + " is not a valid name.");
        }
    }
}
