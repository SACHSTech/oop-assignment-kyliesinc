package Store;
import java.io.*;
import java.util.ArrayList;
import java.text.DecimalFormat;
//import oop.*;
import java.text.Format;


public class main {

    // import BufferedReader
    static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        //String[] arrlistTops = {""};
        //String[] arrlistPants = {""};
        //String[] arrlistShoes = {""};
        ArrayList<String> listTops = new ArrayList<>();
        ArrayList<String> listPants = new ArrayList<>();
        ArrayList<String> listShoes = new ArrayList<>();

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
        int addPants;

        String tSize;
        String tType;
        String tColour;
        int addTop;

        double sSize;
        String sModel;
        String sColour;
        int addShoe;

        int payOrShop;
        int numberOfClothes = 0;
        double subTotal = 0.00;
        String totalPrice;
        boolean cartEmpty = true;
        DecimalFormat priceFormat = new DecimalFormat("$0.00");
        DecimalFormat dFormat = new DecimalFormat("0.00");
        
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
        newCart = new shoppingCart(user, numberOfClothes, subTotal, cartEmpty, listTops, listPants, listShoes);

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

                    System.out.print("\n Want to add this to your cart? \n(1)Yes \n(2)No, continue shopping \n(3)Home page \n Pick one of the above: ");
                    addPants = Integer.parseInt(keyboard.readLine());

                    if (addPants == 1){
                        // add to cart and add to ArrayList of shoes
                        newCart.addPantsToCart(pType);

                        // add this pants to the current total price
                        subTotal += newClothing.getPrice();
                        numberOfClothes ++;
                        cartEmpty = false;
                        newCart = new shoppingCart(user, numberOfClothes, subTotal, cartEmpty, listTops, listPants, listShoes);
                    }
                    else if(addPants == 2){
                        System.out.println("\n Ok, continue shopping");
                        page = 1;
                    }
                    else{
                        System.out.println("\n Ok, going to home page");
                        page = 0;
                    }

                    // print out subtotal (before tax) for user to refer to
                    System.out.println("---------------------------------------------");
                    System.out.println("Subtotal price: " + priceFormat.format(subTotal));

                    // reset to home page
                    page = 0;


                }
                // user picks tops
                else if (clothType.equalsIgnoreCase("Tops")){
                    System.out.println("---------------------------------------------");
                    // tanks, short sleeve, long sleeve
                    System.out.println("\nTops Options: \n- TankTop ($9.99)\n- short sleeve ($12.50)\n- Long sleeve ($15.95)");
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
                    else{
                        System.out.println("\nSorry that is an invalid option.");
                        page = 1;
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
                    

                    System.out.print("\n Want to add this to your cart? \n(1)Yes \n(2)No, continue shopping \n(3)Home page \n Pick one of the above: ");
                    addTop = Integer.parseInt(keyboard.readLine());
                    if (addTop == 1){
                        // add to cart and add to ArrayList of shoes
                        newCart.addTopsToCart(tType);

                        // add this pants to the current total price
                        subTotal += newClothing.getPrice();
                        numberOfClothes ++;
                        cartEmpty = false;
                        newCart = new shoppingCart(user, numberOfClothes, subTotal, cartEmpty, listTops, listPants, listShoes);

                    }
                    else if(addTop == 2){
                        System.out.println("\n Ok, continue shopping");
                        page = 1;
                    }
                    else{
                        System.out.println("\n Ok, going to home page");
                        page = 0;
                    }

                    // print out subtotal (before tax) for user to refer to     
                    System.out.println("---------------------------------------------");               
                    System.out.println("Subtotal price: " + priceFormat.format(subTotal));

                    // reset to home page
                    page = 0;


                }
                // user picks shoes
                else if (clothType.equalsIgnoreCase("Shoes")){
                    // (running, boots, sandals)
                    System.out.println("---------------------------------------------");
                    System.out.println("\nShoes Options: \n- Runners ($64.99) \n- Boots ($110.50)\n- Sandals ($30.32)");
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
                    else{
                        System.out.println("\nSorry that is an invalid option.");
                        page = 1;
                    }

                    System.out.println("\nColour options: white, black, blue, red");
                    System.out.print("\nChoose a colour for your shoes: ");
                    sColour = keyboard.readLine();

                    // user input size
                    System.out.print("\nChoose size for top (US womens 5-13): ");
                    sSize = Double.parseDouble(keyboard.readLine());

                    // output user's chosen shoe
                    Clothing newClothing = new Clothing(clothType, sColour, clothPrice);
                    Shoes newShoes =  new Shoes(clothType, sColour, clothPrice, sSize, sModel); 
                    System.out.println("\n" + newShoes.toString() + ", " + sColour + ", " + priceFormat.format(newShoes.getPrice()));

                    // ask user if they would like to add this item to cart
                    System.out.print("\n Want to add this to your cart? \n(1)Yes \n(2)No, continue shopping \n(3)Home page \n Pick one of the above: ");
                    addShoe = Integer.parseInt(keyboard.readLine());
                    if (addShoe == 1){
                        // add to cart and add to ArrayList of shoes
                        newCart.addShoesToCart(sModel);

                        // add this pants to the current total price
                        subTotal += newClothing.getPrice();
                        numberOfClothes ++;
                        cartEmpty = false;
                        //newCart = new shoppingCart(user, numberOfClothes, subTotal, cartEmpty, listTops, listPants, listShoes);

                    }
                    else if(addShoe == 2){
                        System.out.println("\n Ok, continue shopping");
                        page = 1;
                    }
                    else{
                        System.out.println("\n Ok, going to home page");
                        page = 0;
                    }

                    // print out subtotal (before tax) for user to refer to
                    System.out.println("---------------------------------------------");
                    System.out.println("Subotal price: " + priceFormat.format(subTotal));

                    // reset to home page 
                    page = 0;
  
                }
                // if they type wrong word just restart by asking question again
                else {
                    page = 1;
                }
                
            }

            if (page == 2){
                newCart = new shoppingCart(user, numberOfClothes, subTotal, cartEmpty, listTops, listPants, listShoes);

                System.out.println("---------------------------------------------");

                // output cart and all clothes in the cart
                System.out.println("\n" + user + "'s Cart: \nTotal Items: " + newCart.getNumberOfClothes() + "\nTops: " + newCart.listTops() + "\nPants: " + newCart.listPants() + "\nShoes: " + newCart.listShoes() + "\nSubtotal: " + priceFormat.format(newCart.getTotalPrice()));
                System.out.print("\nWant to continue shopping or pay? \n(1)Pay or\n(2)Continue shopping: ");
                payOrShop = Integer.parseInt(keyboard.readLine());

                if (payOrShop == 1){
                    page = 3;

                }
                
                else if (payOrShop == 2){
                    System.out.println("\nYay more shopping");
                    page = 1;
                }

                else{
                    page = 2;
                }
                
            }
            else if (page ==3){

                System.out.println("\n----------Checkout-----------");
                newCart.getTotals();
                System.out.print("\nInput Amount to Pay: $");
                String payed = keyboard.readLine();
                subTotal = subTotal * 1.13;
                totalPrice = String.format("%f", dFormat.format(subTotal));

                if (payed == totalPrice){
                    System.out.println("\n ---------------------------------------------\nSucessfully Paid!! Thanks for shopping come again!\n---------------------------------------------");
                    break;
                }
                else {
                    System.out.println("\nPayment error, please try again. " + subTotal);
                    page = 3;
                    
                }
                

            }

            else if (page == 0){
                System.out.println("\n---------------------------------------------");

                // print out what the user is able to do
                System.out.println("\nPage: \n(1) Shop\n(2) View cart");
                System.out.print("\nChoose an page: ");
                page = Integer.parseInt(keyboard.readLine());
            }

            else{
                page = 0;
            }

        }

    }

}
