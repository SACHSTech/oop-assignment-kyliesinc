package Store;
//import oop.*;

public class Clothing {
    // private variables 
    private int size;
    private String colour;

    public Clothing(int clothSize, String clothColour){
        this.size = clothSize;
        this.colour = clothColour;
    }

    public String getSize() {
        return this.size;
    }

    public String getColour() {
        return this.colour;
    }


}
