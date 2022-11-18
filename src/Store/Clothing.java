package Store;
//import oop.*;


public abstract class Clothing {
    // private variables 
    private String type;
    private String colour;
    private double price;

    public Clothing(String clothType, String clothColour, double clothPrice){
        this.type = clothType;
        this.colour = clothColour;
        this.price = clothPrice;
    }

    public String getType(){
        return type;
    }

    public String getColour() {
        return colour;
    }

    public double getPrice(){
        return price;
    }

    


}
