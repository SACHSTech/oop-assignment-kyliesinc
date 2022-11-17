package Store;
import java.util.ArrayList;
//import oop.*;


public abstract class cart {
    private String customer;
    private ArrayList<cart> orderCart;
    private double totalPrice;

    // assign customer name to their cart
    public cart(String name){
        this.customer = name;
        this.totalPrice = 0;
        orderCart = new ArrayList<cart>();
    }
    
    public String getName(){
        return this.customer;
    }

    public void addItem(cart newItem){
        orderCart.add(newItem);
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
            this.totalPrice = orderCart.get(i).getTotalPrice();
        }
        return this.totalPrice;
    }

    public void getTotals(){
        // output the subtotal, tax, and final price
        System.out.println("Subtotal: "+ Math.round((this.totalPrice)*100/100));
        System.out.println("Tax: "+ Math.round((this.totalPrice*0.13)*100/100));
        System.out.println("Total: "+ Math.round((this.totalPrice*1.13)*100)/100);
    }

    


}
