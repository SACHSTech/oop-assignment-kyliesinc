package Store;
//import oop.*;

public class Pants extends Clothing{
    // define private variables 
    private String type;
    private int size;
    private String colour;
    private double price;
    
    public Pants(String pantsType, int pantsSize, String pantsColour, double pantsPrice){
        super(clothSize, clothColour);
        this.type = pantsType;
        this.size = pantsSize;
        this.colour = pantsColour;
        this.price = pantsPrice;
        
    }

    // returning colour 
    public String getPantsColour(){
        return this.colour;
    }

    // returning price for the pants
    public double getPantsPrice(){
        return this.price;
    }

}
