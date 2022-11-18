package Store;
import java.io.*;
import java.util.ArrayList;
//import oop.*;


public class main {

    // import BufferedReader
    static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        // declare objects
        
        // declare variables

        // ask user for information
        System.out.println("----------------------------------------------------");
        System.out.println("------ WELCOME TO KYLIE's CLOTHING STORE -----");
        System.out.println("----------------------------------------------------");

        System.out.println("\n To continue shopping please fill out your information");
        System.out.print("\n Name: ");
        String username = keyboard.readLine();
        System.out.print("\n Email: ");
        String email = keyboard.readLine();

        Customer newCustomer = new Customer(username, email);

        System.out.println("\n-------------------------");
        System.out.println("Welcome " + newCustomer.getName());

    }

    // display list of all clothing for customer to add to cart

    // go to cart: display what is in cart and cart total and total number of clothing 


    
}
