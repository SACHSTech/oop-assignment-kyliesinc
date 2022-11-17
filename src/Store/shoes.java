package Store;
//import oop.*;

public class Shoes extends Clothing {
    private double size;
    private String model;
   
    public Shoes(String clothType, String clothColour, double clothPrice, double shoeSize, String shoeModel){
        super(clothType, clothColour, clothPrice);  
        this.size = shoeSize;
        this.model = shoeModel;  
    }

    public double getSize(){
        return this.size;
    }

    public String getModel(){
        return this.model;
    }
    
    public String toString(){
        return "...";
    }
}
