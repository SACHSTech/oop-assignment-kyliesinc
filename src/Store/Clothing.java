package Store;
//import oop.*;

public abstract class Clothing {
    // private variables 
    private String type;
    private int size;
    private String colour;
    private double price;

    public Clothing(String clothType, int clothSize, String clothColour, double clothPrice){
        type = clothType;
        size = clothSize;
        colour = clothColour;
        price = clothPrice;
    }

    public String getType(){
        return type;
    }

    public int getSize() {
        return size;
    }

    public String getColour() {
        return colour;
    }

    public double getPrice(){
        return price;
    }

    


}
