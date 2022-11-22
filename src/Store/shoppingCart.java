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
     * Returns the customer's name by using the customer class
     * 
     * @return String variable of name that is found from the Customer class 
     */
    public Customer getName(){
        return this.customer;
    }

    /**
     * Returns the total number of clothes in cart
     * 
     * @return int variable numberOfClothes, which is the total number of clothes in the cart
     */
    public int getNumberOfClothes(){
        return this.numberOfClothes;
    }

    /**
     * Returns whether the cart is empty or not
     * 
     * @return boolean variable isCartEmpty, which is whether cart has any clothes in it or not
     */
    public boolean isCartEmpty(){
        return this.cartEmpty;
    }

    // adding to cart
    /**
     * This adds tops to the cart and then returns a list of them
     * 
     * @param tType - is the type of Top
     * @return ArrayList<String> listTops, which is the list of type of tops added
     */
    public ArrayList<String> addTopsToCart(String tType){
        listTops.add(tType);
        return listTops;
    }
    /**
     * This adds pants to the cart and then returns a list of them
     * 
     * @param tPants - is the type of pant
     * @return ArrayList<String> listPants, which is the list of type of pants added
     */
    public ArrayList<String> addPantsToCart(String tPants){
        listPants.add(tPants);
        return listPants;
    }
    /**
     * This adds shoes to the cart and then returns a list of them
     * 
     * @param sModel - is the type of shoes
     * @return ArrayList<String> listShoes, which is the list of type of shoes added
     */
    public ArrayList<String> addShoesToCart(String sModel){
        listShoes.add(sModel);
        return listShoes;
    }

    
    // returning arrayLists
    /**
     * Returns the list of tops
     * 
     * @return ArrayList<String> listTops, which is a String list of tops that were added to cart
     */
    public ArrayList<String> listTops(){
        return this.listTops;
    }
    /**
     * Returns the list of pants
     * 
     * @return ArrayList<String> listPants, which is a String list of pants that were added to cart
     */
    public ArrayList<String> listPants(){
        return this.listPants;
    }
    /**
     * returns the list of shoes
     * 
     * @return ArrayList<String> listShoes, which is a String list of shoes that were added to cart
     */
    public ArrayList<String> listShoes(){
        return this.listShoes;
    }

    /**
     * Returns the total price of all the clothes in cart
     * 
     * @return double variable totalPrice, which is the sum of all the clothing's prices
     */
    public double getTotalPrice(){
        return this.totalPrice;
    }
    
    /**
     * This method calculates the subtotal, tax, and total from the totalPrice and outputs it as a print statement
     */
    public void getTotals(){
        // output the subtotal, tax, and final price of all clothes in cart
        System.out.println("Subtotal: "+ dFormat.format((this.totalPrice)*100/100));
        System.out.println("Tax: "+ dFormat.format((this.totalPrice*0.13)*100/100));
        System.out.println("\nTotal: "+ dFormat.format((this.totalPrice*1.13)*100/100));
        System.out.println("------------------------------------");


    }


}

