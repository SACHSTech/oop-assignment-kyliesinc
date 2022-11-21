package Store;

public class Shoes extends Clothing {
    private double sSize;
    private String sModel;
   
    public Shoes(String clothType, String clothColour, double clothPrice, double shoeSize, String shoeModel){
        super(clothType, clothColour, clothPrice);  
        this.sSize = shoeSize;
        this.sModel = shoeModel;  
    }

    public double getSize(){
        return this.sSize;
    }

    public String getModel(){
        return this.sModel;
    }
    
    public String toString(){
        return ("Shoes description: " + sModel + ", " + sSize);
    }

}
