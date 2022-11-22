package Store;

/**
 * Customer class file
 * 
 * @author: K. Sinclair
 * 
 */

public class Customer {
    // instance variables
    String name;
    String email;

    /**
     * Constructor -  creates a new instance for a customer
     * 
     * @param newName - the name of the customer
     * @param newEmail - the customer's email info
     */
    public Customer(String newName, String newEmail){
        name = newName;
        email = newEmail;
    }

    /**
     * Returns the customer's name
     * 
     * @return String variable name 
     */
    public String getName(){
        return name;
    }

    /**
     * Returns the customer's email
     * 
     * @return String variable email
     */
    public String getEmail(){
        return email;
    }
    
}
