package Store;
import java.util.ArrayList;
import java.util.*;
//import oop.*;


public class cart {
    private Customer customer;
    private ArrayList<Clothing> orderCart = new ArrayList<Clothing>();
    private double totalPrice;

    // assign customer name to their cart
    public cart(){
        ArrayList<Clothing> orderCart =  new ArrayList<Clothing>();
        Customer newCustomer = new Customer(null);
        double totalPrice;
    }

    
    
    public String getName(){
        return this.customer;
    }

    public void addItem(cart newClothing){
        orderCart.add(newClothing);
    }

    public void removeItem(cart previousCart){
        // remove an item if customer no longer wants to buy it
        for (int i = 0; i < orderCart.size(); i++){
            if (orderCart.get(i).equals(previousCart)){
                orderCart.remove(i);
            }
        }
    }

    public double getTotalPrice(){
        // return sum price of all items currently in the cart
        for (int i = 0; i < orderCart.size(); i++){
            this.totalPrice += orderCart.getPrice(i);
        }
        return this.totalPrice;
    }

    public void getTotals(){
        // output the subtotal, tax, and final price
        System.out.println("Subtotal: "+ Math.round((this.totalPrice)*100/100));
        System.out.println("Tax: "+ Math.round((this.totalPrice*0.13)*100/100));
        System.out.println("Total: "+ Math.round((this.totalPrice*1.13)*100)/100);
    }

    public void checkOut(){
        // use total and ask customer to pay
        // once payed == true, say thank you for shopping!
    }

    


}
