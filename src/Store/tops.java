package Store;
//import oop.*;

import java.util.ArrayList;

public class Tops extends Clothing {
    private String tSize;
    private String tType;

    public Tops(String clothType, String clothColour, double clothPrice, String topSize, String topType){
        super(clothType, clothColour, clothPrice);  
        this.tSize = topSize;
        this.tType = topType;
    }

    public String getSize(){
        return this.tSize;
    }

    public String getType(){
        return this.tType;
    }

    public String toString(){
        return ("Tops description: " + tType + ", " + tSize);
    }

    public void addTopsToCart(ArrayList<Tops> listTops) {
    }
}
