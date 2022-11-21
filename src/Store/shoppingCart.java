package Store;
import java.util.ArrayList;
import java.text.DecimalFormat;

/**
 * Shoes class file
 * @author: K. Sinclair
 * 
 */

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

    /**
     * Constructor - creates new instance of a shopping cart
     * 
     * @param name - the name of the customer who's cart this is
     * @param numberOfClothes - the total number of clothes in the cart
     * @param totalPrice - the total price (before tax) of all the clothes in the cart
     * @param emptyCart - this determines if the cart is empty
     * @param listTops - the list of tops added to cart
     * @param listPants - the list of pants added to cart 
     * @param listShoes - the list of shoes added to cart
     */
    public shoppingCart(String name, int numberOfClothes, double totalPrice, boolean emptyCart, ArrayList<String> listTops, ArrayList<String> listPants, ArrayList<String> listShoes){
        this.numberOfClothes = numberOfClothes;
        this.totalPrice = totalPrice;
        this.cartEmpty = emptyCart;
        this.listTops = listTops;
        this.listPants = listPants;
        this.listShoes = listShoes;
        customer = getName();

    }

    /**
     * 
     * @return String variable of name that is found from the Customer class 
     */
    public Customer getName(){
        return this.customer;
    }

    /**
     * 
     * @return int variable numberOfClothes, which is the total number of clothes in the cart
     */
    public int getNumberOfClothes(){
        return this.numberOfClothes;
    }

    /**
     * 
     * @return boolean variable isCartEmpty, which is whether cart has any clothes in it or not
     */
    public boolean isCartEmpty(){
        return this.cartEmpty;
    }


    /**
     * 
     * @param tType
     * @return 
     */
    public ArrayList<String> addTopsToCart(String tType){
        listTops.add(tType);
        return listTops;
    }
    /**
     * 
     * @param tPants
     * @return 
     */
    public ArrayList<String> addPantsToCart(String tPants){
        listPants.add(tPants);
        return listPants;
    }
    /**
     * 
     * @param sModel
     * @return 
     */
    public ArrayList<String> addShoesToCart(String sModel){
        listShoes.add(sModel);
        return listShoes;
    }

    
    // returning arrayLists
    /**
     * 
     * @return ArrayList<String> listTops, which is a String list of tops that were added to cart
     */
    public ArrayList<String> listTops(){
        return this.listTops;
    }
    /**
     * 
     * @return ArrayList<String> listPants, which is a String list of pants that were added to cart
     */
    public ArrayList<String> listPants(){
        return this.listPants;
    }
    /**
     * 
     * @return ArrayList<String> listShoes, which is a String list of shoes that were added to cart
     */
    public ArrayList<String> listShoes(){
        return this.listShoes;
    }

    // return total price
    /**
     * 
     * @return
     */
    public double getTotalPrice(){
        return this.totalPrice;
    }
    
    /**
     * 
     */
    public void getTotals(){
        // output the subtotal, tax, and final price of all clothes in cart
        System.out.println("Subtotal: "+ dFormat.format((this.totalPrice)*100/100));
        System.out.println("Tax: "+ dFormat.format((this.totalPrice*0.13)*100/100));
        System.out.println("\nTotal: "+ dFormat.format((this.totalPrice*1.13)*100/100));
        System.out.println("------------------------------------");


    }


}

