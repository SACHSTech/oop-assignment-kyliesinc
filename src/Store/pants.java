package Store;

/**
 * Pants class file
 * @author: K. Sinclair
 * 
 */

public class Pants extends Clothing{
    // instance variables
    private String pSize;
    private String pType;
    
    /**
     * Constructor - creates a new instance of Pants 
     * 
     * @param clothType - represents the type: Pants
     * @param clothColour - the colour of the pants
     * @param clothPrice - the price of the pants
     * @param pantSize - the size of pants: small, medium, large
     * @param pantType - the type of pants: cargo pants, sweatpants, or shorts
     */
    public Pants(String clothType, String clothColour, double clothPrice, String pantSize, String pantType){
        // call to super constructor
        super(clothType, clothColour, clothPrice); 

        this.pSize = pantSize;
        this.pType = pantType;          
    }

    /**
     * Returns the size of the pants
     * 
     * @return String variable pSize, which represents the size of the pants
     */
    public String getSize(){
        return this.pSize;
    }

    /**
     * Returns the type of pants
     * 
     * @return String variable pType, which represents the type of pants
     */
    public String getType(){
        return this.pType;
    }

    /**
     * String representation of the pants
     * 
     * @return print line description of the pants
     */
    public String toString(){
        return ("Pant description: " + pType + ", " + pSize);
    }

}
