package Store;
import java.io.*;
import java.util.ArrayList;
import java.text.DecimalFormat;
//import oop.*;


public class main {

    // import BufferedReader
    static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        // create colour array for clothes


        // declare objects available for customers to buy
        Customer newCustomer;
        shoppingCart newCart;
            //shoes (running, boots, sandals)
        Shoes runningShoes;
        Shoes bootShoes;
        Shoes sandalShoes;
            //pants (cargo, sweatpants, shorts)
        Pants cargoPants;
        Pants sweatPants;
        Pants shortPants;
            //tops(tanktop, tshirt, longsleeve)
        Tops tankTops;
        Tops shortTops;
        Tops longTops;
        
        // declare variables 
        String user;
        String email;
        String page;
        boolean isShopping = true;

        String clothType;
        double clothPrice = 0.00;
        String clothColour;

        String type;
        String colour;
        double price;

        String pSize;
        String pType;
        String pColour;

        String tSize;
        String tType;
        String tColour;

        double sSize;
        String sModel;
        String sColour;

        int numberOfClothes = 0;
        double totalPrice = 0.00;
        boolean cartEmpty = true;
        ArrayList<Clothing> listClothes = null;
        DecimalFormat priceFormat = new DecimalFormat("0.00");

        
        System.out.println("----------------------------------------------------");
        System.out.println("------ WELCOME TO KYLIE's CLOTHING STORE -----");
        System.out.println("----------------------------------------------------");

        // ask user for information
        System.out.println("\n To continue shopping please fill out your information");
        System.out.print("\n Name: ");
        user = keyboard.readLine();
        System.out.print("\n Email: ");
        email = keyboard.readLine();

        // creating user
        newCustomer = new Customer(user, email);
        newCart = new shoppingCart(email, numberOfClothes, totalPrice, cartEmpty, listClothes);

        System.out.println("\n-------------------------");
        System.out.println("Welcome " + newCustomer.getName());

        System.out.println("Now you can start SHOPPING!");

        // print out what the user is able to do
        System.out.println("\nPage: \n- Shop\n- View cart");

        // create products

        

        // loop while shopping

        while (isShopping == true);

            System.out.print("\nChoose an page: ");
            page = keyboard.readLine();

            if (page.equalsIgnoreCase("Shop")){
                // ask if user wants to shops in shoes, tops, or pants
                System.out.println("\nClothing Type: \n- Pants \n- Tops \n- Shoes");
                System.out.print("\nPick a clothing type listed above: ");
                clothType = keyboard.readLine();



                // based on what type of clothing was chosen list what is available

                // user picks pants
                if (clothType.equalsIgnoreCase("Pants")){
                    //user picks type of pants: cargo, sweatpants, or shorts
                    System.out.println("\nPants Options: \n- Cargo Pants ($30.99)\n- Sweatpants ($25.99)\n- Shorts ($15.99)");
                    System.out.print("\nChoose from pants: ");
                    pType = keyboard.readLine();
                    // based on type of pants set price 
                    if (pType.equalsIgnoreCase("Cargo pants")){
                        clothPrice = 30.50;
                    }
                    else if (pType.equalsIgnoreCase("sweatpants")){
                        clothPrice = 25.00;
                    }
                    else if (pType.equalsIgnoreCase("shorts")){
                        clothPrice = 15.99;
                    }
                    

                    // user input colour 
                    System.out.println("Colour options: white, black, beige, green");
                    System.out.print("\nChoose a colour for your pants: ");
                    pColour = keyboard.readLine();
                    // user input size
                    System.out.print("\nChoose size for pants (small, medium, large): ");
                    pSize = keyboard.readLine();

                    Pants newPants =  new Pants(clothType, pColour, clothPrice, pSize, pType); 
                    System.out.println("\n" + newPants.toString() + ", " + priceFormat.format(newPants.getPrice()));
                    
                    totalPrice += clothPrice;

                    //System.out.println("total price: $" + totalPrice);





                }
                // user picks tops
                else if (clothType.equalsIgnoreCase("Tops")){
                    // tanks, short sleeve, long sleeve
                    System.out.println("\nTops Options: \n- TankTops \n- short sleeves \n- Long sleeves");
                    System.out.print("\nChoose from tops: ");
                    tType = keyboard.readLine();

                    System.out.println("Colour options: white, black, pink, brown");
                    System.out.print("Choose a colour for your pants: ");



                }
                // user picks shoes
                else if (clothType.equalsIgnoreCase("Shoes")){
                    // (running, boots, sandals)
                    System.out.println("\nShoes Options: \n- Running \n- Boots \n- Sandals");
                    System.out.print("\nChoose from Shoes: ");
                    sModel = keyboard.readLine();

                    System.out.println("Colour options: white, black, blue, red");
                    System.out.print("Choose a colour for your pants: ");

                }
            }


            if(page.equalsIgnoreCase("View cart")){

            }

    }

    // display list of all clothing for customer to add to cart

    // go to cart: display what is in cart and cart total and total number of clothing 


    
}
