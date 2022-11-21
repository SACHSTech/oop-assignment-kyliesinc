package Store;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class shoppingCart {
    // decimal format
    DecimalFormat dFormat = new DecimalFormat("$0.00");
    
    // instance variables

    private Customer customer;
    private int numberOfClothes;
    private double totalPrice;
    private boolean cartEmpty;
    private ArrayList<String> listTops = new ArrayList<String>();
    private ArrayList<String> listPants = new ArrayList<String>();
    private ArrayList<String> listShoes = new ArrayList<String>();

    public shoppingCart(String name, int numberOfClothes, double totalPrice, boolean emptyCart, ArrayList<String> listTops, ArrayList<String> listPants, ArrayList<String> listShoes){
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

    public int getNumberOfClothes(){
        return this.numberOfClothes;
    }

    public boolean isCartEmpty(){
        return this.cartEmpty;
    }

    // adding to cart
    public ArrayList<String> addTopsToCart(String tType){
        listTops.add(tType);
        return listTops;
    }
    public ArrayList<String> addPantsToCart(String tPants){
        listPants.add(tPants);
        return listPants;
    }
    public ArrayList<String> addShoesToCart(String sModel){
        listShoes.add(sModel);
        return listShoes;
    }

    
    // returning arrayLists
    public ArrayList<String> listTops(){
        return this.listTops;
    }
    public ArrayList<String> listPants(){
        return this.listPants;
    }
    public ArrayList<String> listShoes(){
        return this.listShoes;
    }

    // return total price
    public double getTotalPrice(){
        return this.totalPrice;
    }
    
    public void getTotals(){
        // output the subtotal, tax, and final price of all clothes in cart
        System.out.println("Subtotal: "+ dFormat.format((this.totalPrice)*100/100));
        System.out.println("Tax: "+ dFormat.format((this.totalPrice*0.13)*100/100));
        System.out.println("\nTotal: "+ dFormat.format((this.totalPrice*1.13)*100/100));
        System.out.println("------------------------------------");


    }


}

