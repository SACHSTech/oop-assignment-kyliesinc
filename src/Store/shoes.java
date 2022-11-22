package Store;

/**
 * Shoes class file
 * @author: K. Sinclair
 * 
 */

public class Shoes extends Clothing {
    // instance variables
    private double sSize;
    private String sModel;
   
    /**
     * Constructor - creates a new instance of Shoes
     * 
     * @param clothType - represents the type: shoes
     * @param clothColour - the colour of the shoes
     * @param clothPrice - the price of the shoes
     * @param shoeSize - the size of shoes
     * @param shoeModel - the type of shoes: runners, boots, sandals
     */
    public Shoes(String clothType, String clothColour, double clothPrice, double shoeSize, String shoeModel){
        // call to supuer constructor
        super(clothType, clothColour, clothPrice);

        this.sSize = shoeSize;
        this.sModel = shoeModel;  
    }

    /**
     * Returns the size of the shoes
     * 
     * @return double variable sSize, which represents the size of the shoes
     */
    public double getSize(){
        return this.sSize;
    }

    /**
     * Returns the type of shoes
     * 
     * @return String variable sModel, which represents the type of shoes
     */
    public String getModel(){
        return this.sModel;
    }
    
    /**
     * String representation of the shoes
     * 
     * @return print line description of the shoes
     */
    public String toString(){
        return ("Shoes description: " + sModel + ", " + sSize);
    }

}
