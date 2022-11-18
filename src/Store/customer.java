package Store;
//import oop.*;


public class Customer {
     String name;
     String email;

    // get name and cart for each customer
    public Customer(String newName, String newEmail){
        name = newName;
        email = newEmail;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }
    
}
