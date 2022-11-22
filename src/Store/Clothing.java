package Store;
/**
* Clothing class file
* @author: K. Sinclair
* 
*/

public class Clothing {
    // instance variables 
    private String type;
    private String colour;
    private double price;

    /**
     * Cunstructor - creates new instance of an clothing
     * 
     * @param clothType - will identify if the clothing type is pants, tops or shoes
     * @param clothColour - the colour of the clothing
     * @param clothPrice - the price of the clothing
     */
    public Clothing(String clothType, String clothColour, double clothPrice){
        this.type = clothType;
        this.colour = clothColour;
        this.price = clothPrice;
    }

    /**
     * Returns the type of clothing
     * 
     * @return String variable type
     */
    
    public String getType(){
        return type;
    }

    /**
     * Returns the colour of the clothing
     * 
     * @return String variable colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * Return the price of the clothing 
     * 
     * @return double variable price, which holds the price of the clothing
     */
    public double getPrice(){
        return price;
    }
}
