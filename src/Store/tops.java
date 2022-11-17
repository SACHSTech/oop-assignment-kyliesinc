package Store;
//import oop.*;

public class Tops extends Clothing {
    private String size;
    private String type;

    public Tops(String clothType, String clothColour, double clothPrice, String topSize, String topType){
        super(clothType, clothColour, clothPrice);  
        this.size = topSize;
        this.type = topType;
    }

    public String getSize(){
        return this.size;
    }

    public String getType(){
        return this.type;
    }

    public String toString(){
        return "...";
    }
}
