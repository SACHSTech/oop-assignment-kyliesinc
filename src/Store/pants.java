package Store;
//import oop.*;

public class Pants extends Clothing{
    private int pantSize;
    
    public Pants(String clothType, int pantSize, String clothColour, double clothPrice){
        super(clothType, clothColour, clothPrice);   

        // is there some way to use the customer variables in the pants class
        custPantSize = pantSize;
        
         
    }
}
