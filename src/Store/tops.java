package Store;
//import oop.*;

public class Tops extends Clothing {
    // define private variables 
    private String type;
    private int size;
    private String colour;
    private double price;

    public Tops (String topType, int topSize, String topColour, double topPrice){
        super(clothSize, clothColour);

        this.type = topType;
        this.size = topSize;
        this.colour = topColour;
        this.price = topPrice;
        
    }

    // returning colour 
    public String getTopColour(){
        return this.colour;
    }

    // returning price for the top
    public double getTopPrice(){
        return this.price;
    }
    
    
}
