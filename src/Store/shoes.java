package Store;
//import oop.*;

public class Shoes extends Clothing {
    // define private variables 
    private String type;
    private int size;
    private String colour;
    private double price;
    
    public Shoes (String shoeType, int shoeSize, String shoeColour, double shoePrice){
        super(clothSize, clothColour);

        this.type = shoeType;
        this.size = shoeSize;
        this.colour = shoeColour;
        this.price = shoePrice;
        
    }

    // returning colour 
    public String getShoeColour(){
        return this.colour;
    }

    // returning price for the shoes
    public double getShoePrice(){
        return this.price;
    }
    
}
