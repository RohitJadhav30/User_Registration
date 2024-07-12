package userPortal;

import java.util.Scanner;

public class User_Registration {
    public static boolean validateFirstName(String firstName) {
        return firstName.matches("^[A-Z][a-zA-Z]{2,}$");
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the first name: ");
        String firstName = sc.nextLine();
        sc.close();
        
        if (validateFirstName(firstName)) {
            System.out.println(firstName + " is a valid first name.");
        } else {
            System.out.println(firstName + " is not a valid first name.");
        }
    }
}
