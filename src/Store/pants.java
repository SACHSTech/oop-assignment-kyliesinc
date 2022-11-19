package Store;
//import oop.*;

public class Pants extends Clothing{
    private String pSize;
    private String pType;
    
    public Pants(String clothType, String clothColour, double clothPrice, String pantSize, String pantType){
        super(clothType, clothColour, clothPrice);  
        this.pSize = pantSize;
        this.pType = pantType;          
    }

    public String getSize(){
        return this.pSize;
    }

    public String getType(){
        return this.pType;
    }

    
    public String toString(){
        return ("Pant description: " + pType + ", " + pSize);
    }

}
