package Store;
//import oop.*;

public class Pants extends Clothing{
    private String pSize;
    private String pType;
    private String pColour;
    private double pPrice;
    
    public Pants(String clothType, String clothColour, double clothPrice, String pantSize, String pantType){
        super(clothType, clothColour, clothPrice);  
        this.pSize = pantSize;
        this.pType = pantType;
        this.pColour = clothColour;
        this.pPrice = clothPrice;
          
    }

    public String getSize(){
        return this.pSize;
    }

    public String getPantColour(){
        return this.pColour;
    }

    public double getPantPrice(){
        return this.pPrice;
    }

    public String getType(){
        return this.pType;
    }

    
    public String toString(){
        return ("Pant description: " + pType + " " + pColour + " " +  pPrice );
    }

}
