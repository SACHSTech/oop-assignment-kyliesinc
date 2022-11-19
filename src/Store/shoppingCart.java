package Store;
import java.util.ArrayList;

public class shoppingCart {
    
    // instance variables
    private Customer customer;
    private int numberOfClothes;
    private double totalPrice;
    private boolean cartEmpty;
    private ArrayList<Tops> listTops = new ArrayList<Tops>();
    private ArrayList<Pants> listPants = new ArrayList<Pants>();
    private ArrayList<Shoes> listShoes = new ArrayList<Shoes>();

    public shoppingCart(String name, int numberOfClothes, double totalPrice, boolean emptyCart, ArrayList<Tops> listTops, ArrayList<Pants> listPants, ArrayList<Shoes> listShoes){
        this.numberOfClothes = numberOfClothes;
        this.totalPrice = totalPrice;
        this.cartEmpty = emptyCart;
        this.listTops = listTops;
        this.listPants = listPants;
        this.listShoes = listShoes;
        customer = getName();

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

    // adding to cart
    public void addTopsToCart(Tops newT){
        listTops.add(newT);
    }
    public void addPantsToCart(Pants newP){
        listPants.add(newP);
    }
    public void addShoesToCart(Shoes newS){
        listShoes.add(newS);
    }

    // returning arrayLists
    public ArrayList<Tops> listTops(){
        return this.listTops;
    }
    public ArrayList<Pants> listPants(){
        return this.listPants;
    }
    public ArrayList<Shoes> listShoes(){
        return this.listShoes;
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

