package it.carcassi.matteo.witchpotions;

import java.util.Scanner;
/**
 * Class Potion
 * Class that stores the current potion type as well as methods to change the
 * potion's type
 *
 * @author Matteo Carcassi
 * @date 1/24/21
 */
public class Potion {
    private String type = "NOTHING";
    /**
     * Singleton structure of Potion, since there is only one potion at any given
     * time and multiple classes need to access it.
     */
    public static final Potion INSTANCE = new Potion();
    private Potion(){}
    public static Potion getInstance() { return INSTANCE; }
    
    public String getType(){
        return Potion.getInstance().type;
    }
    /**
     * Changes the type of the potion depending on the ingredients put in. If
     * ingredients don't match any type, then type will be NOTHING
     * 
     * @param a: first ingredient
     * @param b: second ingredient
     * @param c: third ingredient
     */
    public static void make(String a, String b, String c){
        a = a.toLowerCase();
        b = b.toLowerCase();
        c = c.toLowerCase();
        //String check is used to make sure that spelling is correct and ingredients exist
        String check = "toadstool,sugar bark,nightshade,mandrake,unicorn blood,phoenix feather,frog legs,catfish whiskers,cattail shavings,newt tail,cthulhu tentacles,blood lotus";
        if(check.contains(a) && check.contains(b) && check.contains(c)){
            if(Inventory.getInstance().getItem(a) != 0 && Inventory.getInstance().getItem(b) != 0 && Inventory.getInstance().getItem(c) != 0){
                Inventory.getInstance().addItem(a, -1);
                Inventory.getInstance().addItem(b, -1);
                Inventory.getInstance().addItem(c, -1);
                if(a.equals("sugar bark") && b.equals("catfish whiskers") && c.equals("cattail shavings")){
                    Potion.getInstance().type = "HEALTH";
                    System.out.println("You made a HEALTH potion");
                }
                else if(a.equals("mandrake") && b.equals("frog legs") && c.equals("toadstool")){
                    Potion.getInstance().type = "STRENGTH";
                    System.out.println("You made a STRENGTH potion");
                }
                else if(a.equals("cattail shavings") && b.equals("nightshade") && c.equals("sugar bark")){
                    Potion.getInstance().type = "FERTILIZER";
                    System.out.println("You made a FERTILIZER potion");
                }
                else if(a.equals("nightshade") && b.equals("cthulhu tentacles") && c.equals("newt tail")){
                    Potion.getInstance().type = "POISON";
                    System.out.println("You made a POISON potion");
                }
                else if(a.equals("phoenix feather") && b.equals("toadstool") && c.equals("catfish whiskers")){
                    Potion.getInstance().type = "EXPLOSION";
                    System.out.println("You made a EXPLOSION potion");
                }
                else if(a.equals("toadstool") && b.equals("unicorn blood") && c.equals("mandrake")){
                    Potion.getInstance().type = "MAGIC";
                    System.out.println("You made a MAGIC potion");
                }
                else if(a.equals("frog legs") && b.equals("newt tail") && c.equals("blood lotus")){
                    Potion.getInstance().type = "AQUATIC";
                    System.out.println("You made a AQUATIC potion");
                }
                else{
                    Potion.getInstance().type = "NOTHING";
                    System.out.println("Sadly, your concotion turned up nothing special.");
                    System.out.println();
                }
            }
            else{
                Potion.getInstance().type = "NOTHING";
                System.out.println("Sorry, but you are missing one or more ingrediants for your potion.");
                System.out.println();
            }
        }
        else{
            Potion.getInstance().type = "NOTHING";
            System.out.println("One of the ingrediants seems to not exist. Check your spelling.");
            System.out.println();
        }
    }
    /**
     * Gets user input so it can be put in the make() method then serves the potion
     * if it is not of type NOTHING
     */
    public static void brew(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Put in your three ingredients on separate lines.");
        System.out.println("Note: order and spelling DO matter");
        String ingr1 = keyboard.nextLine();
        System.out.println();
        String ingr2 = keyboard.nextLine();
        System.out.println();
        String ingr3 = keyboard.nextLine();
        System.out.println();
        make(ingr1, ingr2, ingr3);
        if(!(Potion.getInstance().getType().equals("NOTHING"))){
            Potion.serve();
        }
        else{
            Screens.menu();
        }
    }
    /**
     * Gives option to serve or not serve if a mistake was made, then links back to
     * serve the customer in the Customer class
     */
    public static void serve(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Would you like to serve this potion?");
        System.out.println("(1) Yes  (2) No");
        String input = keyboard.nextLine();
        if(input.equals("1")){
            Customer.getInstance().serveCustomer();
        }
        else{
            System.out.println();
            System.out.println("You threw away your potion");
            System.out.println();
            Screens.menu();
        }

    }

}