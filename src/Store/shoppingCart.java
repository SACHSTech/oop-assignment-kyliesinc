package Store;
import java.util.ArrayList;

public class shoppingCart {
    
    // instance variables
    private int numberOfClothes;
    private double totalPrice;
    private boolean cartEmpty;
    private ArrayList<String> listClothes = new ArrayList<String>();

    public shoppingCart(int numberOfClothes, double totalPrice, boolean emptyCart, ArrayList<String> listClothes){

        this.numberOfClothes = numberOfClothes;
        this.totalPrice = totalPrice;
        this.cartEmpty = emptyCart;
        this.listClothes = listClothes;
    }

    public int getNumerOfClothes(){
        return this.numberOfClothes;
    }

    public double getTotalPrice(){
        return this.totalPrice;
    }

    public boolean isCartEmpty(){
        return this.cartEmpty;
    }

    public ArrayList<String> listClothes(){
        return this.listClothes;
    }

    public void removeToCart(){
        // remove a clothing from the cart
    }

    public void addtoCart(){
        // add a clothing to the cart
    }

    public void getTotals(){
        // output the subtotal, tax, and final price of all clothes in cart
        System.out.println("Subtotal: "+ Math.round((this.totalPrice)*100/100));
        System.out.println("Tax: "+ Math.round((this.totalPrice*0.13)*100/100));
        System.out.println("Total: "+ Math.round((this.totalPrice*1.13)*100)/100);
    }


}

