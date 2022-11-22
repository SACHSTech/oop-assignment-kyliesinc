package Store;

/**
 * Shoes class file
 * @author: K. Sinclair
 * 
 */

public class Tops extends Clothing {
    // instance variables
    private String tSize;
    private String tType;

    /**
     * Constructor - creates a new instance of Tops
     * 
     * @param clothType - represents the type: Tops
     * @param clothColour - the colour of the top
     * @param clothPrice - the price of the top
     * @param topSize - the size of top: small, medium, large
     * @param topType - the type of top: tanktop, short sleeve, long sleeve
     */
    public Tops(String clothType, String clothColour, double clothPrice, String topSize, String topType){
        // call to super constructor
        super(clothType, clothColour, clothPrice); 

        this.tSize = topSize;
        this.tType = topType;
        
    }

    /**
     * Returns the size of the top
     * 
     * @return String variable tSize, which represents the size of the tops
     */
    public String getSize(){
        return this.tSize;
    }

    /**
     * Returns the type of top
     * 
     * @return String variable tType, which represents the type of top
     */
    public String getType(){
        return this.tType;
    }

    /**
     * String representation of the top
     * 
     * @return print line description of the top
     */
    public String toString(){
        return ("Tops description: " + tType + ", " + tSize);
    }

    
}
