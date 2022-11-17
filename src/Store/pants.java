package Store;
//import oop.*;

public class Pants extends Clothing{
    private int pSize;
    private String pType;
    
    public Pants(String clothType, String clothColour, double clothPrice, int pantSize, String pantType){
        super(clothType, clothColour, clothPrice);  
        this.pSize = pantSize;
        this.pType = pantType;
          
    }

    public double getSize(){
        return this.pSize;
    }

    public String getType(){
        return this.pType;
    }
    
    public String toString(){
        return "...";
    }

}
