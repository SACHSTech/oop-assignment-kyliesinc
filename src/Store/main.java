package Store;
import java.io.*;
import java.util.ArrayList;
import java.text.DecimalFormat;
//import oop.*;


public class main {

    // import BufferedReader
    static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] arrlistTops = {""};
        String[] arrlistPants = {""};
        String[] arrlistShoes = {""};
        //ArrayList<Tops> listTops = {""};
        //ArrayList<Pants> listPants;
        //ArrayList<Shoes> listShoes;

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
        int page;
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
        DecimalFormat priceFormat = new DecimalFormat("$0.00");
        
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
        newCart = new shoppingCart(user, numberOfClothes, totalPrice, cartEmpty, listTops, listPants, listShoes);

        System.out.println("---------------------------------------------");
        System.out.println("Welcome " + newCustomer.getName());

        System.out.println("Now you can start SHOPPING!");      
        // print out what the user is able to do
        System.out.println("---------------------------------------------");
        System.out.println("\nPage: \n1) Shop\n2) View cart");
        System.out.print("\nChoose an page: ");
        page = Integer.parseInt(keyboard.readLine());

        // when shop is user input set shopping as true

        // user input view cart, display cart, subtotal, tax, total, 

      
        // loop for shopping
        while (isShopping == true){

            if (page == 1){
                System.out.println("---------------------------------------------");
                // ask if user wants to shops in shoes, tops, or pants
                System.out.println("\nClothing Type: \n- Pants \n- Tops \n- Shoes");
                System.out.print("\nPick a clothing type listed above: ");
                clothType = keyboard.readLine();
            // based on what type of clothing was chosen list what is available

                // user picks pants
                if (clothType.equalsIgnoreCase("Pants")){
                    System.out.println("---------------------------------------------");
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
                    System.out.println("\nColour options: white, black, beige, green");
                    System.out.print("\nChoose a colour for your pants: ");
                    pColour = keyboard.readLine();

                    // user input size
                    System.out.print("\nChoose size for pants (small, medium, large): ");
                    pSize = keyboard.readLine();
                    

                    // output user's chosen pant
                    Clothing newClothing = new Clothing(clothType, pColour, clothPrice);
                    Pants newPants =  new Pants(clothType, pColour, clothPrice, pSize, pType); 
                    System.out.println("\n" + newPants.toString() + ", " + pColour + ", " + priceFormat.format(newPants.getPrice()));                    

                    // add to cart
                    arrlistPants.add(pType);
                    newPants.addPantsToCart(listPants);

                    // add this pants to the current total price
                    totalPrice += clothPrice;
                    numberOfClothes ++;
                    cartEmpty = false;

                    // print out subtotal (before tax) for user to refer to
                    System.out.println("---------------------------------------------");
                    System.out.println("Subtotal price: " + priceFormat.format(totalPrice));

                    // reset to home page
                    page = 0;


                }
                // user picks tops
                else if (clothType.equalsIgnoreCase("Tops")){
                    System.out.println("---------------------------------------------");
                    // tanks, short sleeve, long sleeve
                    System.out.println("\nTops Options: \n- TankTop \n- short sleeve \n- Long sleeve");
                    System.out.print("\nChoose from tops: ");
                    tType = keyboard.readLine();

                    // based on type of top set price 
                    if (tType.equalsIgnoreCase("Tanktop")){
                        clothPrice = 9.99;
                    }
                    else if (tType.equalsIgnoreCase("short sleeve")){
                        clothPrice = 12.50;
                    }
                    else if (tType.equalsIgnoreCase("long sleeve")){
                        clothPrice = 15.95;
                    }

                    System.out.println("\nColour options: white, black, pink, brown");
                    System.out.print("\nChoose a colour for your top: ");
                    tColour = keyboard.readLine();

                    // user input size
                    System.out.print("\nChoose size for top (small, medium, large): ");
                    tSize = keyboard.readLine();

                    // output user's chosen top
                    Clothing newClothing = new Clothing(clothType, tColour, clothPrice);
                    Tops newTop =  new Tops(clothType, tColour, clothPrice, tSize, tType); 
                    System.out.println("\n"  + newTop.toString() + ", " + tColour + ", " + priceFormat.format(newTop.getPrice()));
                    
                    // add to cart and to the ArrayList of clothing
                    newCart.addTopsToCart(newTop);

                    // add this top to the current total price
                    totalPrice += clothPrice;
                    numberOfClothes ++;
                    cartEmpty = false;

                    // print out subtotal (before tax) for user to refer to     
                    System.out.println("---------------------------------------------");               
                    System.out.println("Subtotal price: " + priceFormat.format(totalPrice));

                    // reset to home page
                    page = 0;


                }
                // user picks shoes
                else if (clothType.equalsIgnoreCase("Shoes")){
                    // (running, boots, sandals)
                    System.out.println("---------------------------------------------");
                    System.out.println("\nShoes Options: \n- Runners \n- Boots \n- Sandals");
                    System.out.print("\nChoose from Shoes: ");
                    sModel = keyboard.readLine();

                    // based on model of shoes set price 
                    if (sModel.equalsIgnoreCase("runners")){
                        clothPrice = 64.99;
                    }
                    else if (sModel.equalsIgnoreCase("boots")){
                        clothPrice = 110.50;
                    }
                    else if (sModel.equalsIgnoreCase("sandals")){
                        clothPrice = 30.32;
                    }

                    System.out.println("\nColour options: white, black, blue, red");
                    System.out.print("\nChoose a colour for your shoes: ");
                    sColour = keyboard.readLine();

                    // user input size
                    System.out.print("\nChoose size for top (US womens 5-13): ");
                    sSize = Double.parseDouble(keyboard.readLine());

                    // output user's chosen shoe
                    Shoes newShoes =  new Shoes(clothType, sColour, clothPrice, sSize, sModel); 
                    System.out.println("\n" + newShoes.toString() + ", " + sColour + ", " + priceFormat.format(newShoes.getPrice()));
                    
                    newShoes.addShoesToCart(newCart.listShoes(), sModel);
                    // add to cart and add to ArrayList of clothing
                    //listShoes = newShoes.addShoesToCart(Object);

                    // add this pants to the current total price
                    totalPrice += clothPrice;
                    numberOfClothes ++;
                    cartEmpty = false;

                    // print out subtotal (before tax) for user to refer to
                    System.out.println("---------------------------------------------");
                    System.out.println("Subotal price: " + priceFormat.format(totalPrice));

                    // reset to home page 
                    page = 0;

                    
                }
                
            }

            if (page == 2){
                // display all items 
                newCart = new shoppingCart(user, numberOfClothes, totalPrice, cartEmpty, listTops, listPants, listShoes);

                System.out.println(user + "'s Cart: \nTotal Items: " + newCart.getNumberOfClothes() + "\nTops: " + newCart.listTops() + "\nPants: " + newCart.listPants() + "\nShoes: " + newCart.listShoes() + "\nSubtotal: " + priceFormat.format(newCart.getTotalPrice()));
                System.out.print("Want to continue shopping or pay?");
                String shoppingorpay = keyboard.readLine();
                if (shoppingorpay.equalsIgnoreCase("continue shopping")){
                    page = 0;
                }
                

            }

            else if (page == 0){
                System.out.println("---------------------------------------------");

                // print out what the user is able to do
                System.out.println("\nPage: \n1) Shop\n2) View cart");
                System.out.print("\nChoose an page: ");
                page = Integer.parseInt(keyboard.readLine());
            }

        }

    }

}
