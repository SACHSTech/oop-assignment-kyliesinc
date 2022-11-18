package Store;
import java.util.ArrayList;

public class shoppingCart {
    
    // instance variables
    private Customer customer;
    private int numberOfClothes;
    private double totalPrice;
    private boolean cartEmpty;
    private ArrayList<Clothing> listClothes = new ArrayList<Clothing>();

    public shoppingCart(String name, int numberOfClothes, double totalPrice, boolean emptyCart, ArrayList<Clothing> listClothes){
        this.numberOfClothes = numberOfClothes;
        this.totalPrice = totalPrice;
        this.cartEmpty = emptyCart;
        this.listClothes = listClothes;

        customer = new Customer(name);

    }

    public Customer getName(){
        return this.customer;
    }

    public int getNumerOfClothes(){
        return this.numberOfClothes;
    }

    public boolean isCartEmpty(){
        return this.cartEmpty;
    }

    public ArrayList<Clothing> listClothes(){
        return this.listClothes;
    }

    public void addtoCart(Clothing newClothing){
        // add a clothing to the cart and adds the price of the new clothing to the total price
        listClothes.add(newClothing);
        totalPrice += newClothing.getPrice();
    }

    public double getTotalPrice(){
        return this.totalPrice;
    }

    public void getTotals(){
        // output the subtotal, tax, and final price of all clothes in cart
        System.out.println("Subtotal: "+ Math.round((this.totalPrice)*100/100));
        System.out.println("Tax: "+ Math.round((this.totalPrice*0.13)*100/100));
        System.out.println("Total: "+ Math.round((this.totalPrice*1.13)*100)/100);
    }


}

