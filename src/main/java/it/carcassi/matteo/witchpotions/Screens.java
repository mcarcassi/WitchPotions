package it.carcassi.matteo.witchpotions;

import java.util.Scanner;
/**
 * Class Screens
 * Controls the current screen shown and keeps track of certain counters
 *
 * @author Matteo Carcassi
 * @date 1/24/21
 */
public class Screens {
    //stores actions remaining for the night
    private int actRem;
    //stores how many times the user bought a recipe at the shop
    private int shopCount = 0;
    //stores how many times the user successfully explored the forest
    private int forestCount = 0;
    //stores how many times the user successfully explored the swamp
    private int swampCount = 0;
    /**
     * Method that displays the potion shop screen. It shows the 4 options, brew, check recipe
     * check inventory, or refuse customer. It then takes the user input and calls
     * the appropriate method
     */
    public static void menu(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("(1) Brew  (2) Recipes  (3) Check inventory  (4) Sorry! Can't serve");
        String input = keyboard.nextLine();
        if(input.equals("1")){
            Potion.brew();
        }
        else if(input.equals("2")){
            Recipe.getInstance().recipeSelection();
        }
        else if(input.equals("3")){
            Inventory.getInstance().checkInventory();
        }
        else if(input.equals("4")){
            Customer.noLuck();
        }
        else{
            menu();
        }
        
    }
    /**
     * Method that displays the evening screen. It shows the 3 options, going to
     * the forest, swamp, or shop, then it takes user input and calls the appropriate
     * method. Also keeps track of the actions remaining
     * 
     * @param actionsRemaining: must be between 3 and 0
     */
    public void eveningScreen(int actionsRemaining){
        actRem = actionsRemaining;
        if(actRem != 0){
            System.out.println("You have " + actRem + " actions remaining.");
            Scanner keyboard = new Scanner(System.in);
            System.out.println();
            System.out.println("(1) Forest  (2) Swamp  (3) Shop");
            String input = keyboard.nextLine();
            if(input.equals("1")){
                this.forestScreen();
            }
            else if(input.equals("2")){
                this.swampScreen();
            }  
            else if(input.equals("3")){
                this.shopScreen();
            }
            else{
                this.eveningScreen(actRem);
            }
        }
    }
    /**
     * Method that displays the forest screen. It displays the possible items to get
     * as well as the options to forage or explore, or simply return to the evening
     * screen. Also keeps track of how many successful explorations have occurred
     */
    public void forestScreen(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println();
        System.out.println("Common Items:");
        System.out.println("toadstool, sugar bark, nightshade, mandrake");
        System.out.println();
        System.out.println("Rare Items:");
        System.out.println("unicorn blood, phoenix feather");
        System.out.println();
        System.out.println("(1) Forage  (2) Explore  (3) Back");
        System.out.println();
        String input = keyboard.nextLine();
        if(input.equals("1")){
            Forest.forage();
            actRem--;
            this.eveningScreen(actRem);
        }
        else if(input.equals("2")){
            if(forestCount <= 2){
                actRem--;
            }
            //only increases forestCount if the exploration is succesful
            if(Forest.selectExplore(forestCount)){
                    forestCount++;
                }
            this.eveningScreen(actRem);
        }
        else{
            this.eveningScreen(actRem);
        }
    }
    /**
     * Method that displays the swamp screen. It displays the possible items to get
     * as well as the options to forage or explore, or simply return to the evening
     * screen. Also keeps track of how many successful explorations have occurred
     */
    public void swampScreen(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println();
        System.out.println("Common Items:");
        System.out.println("frog legs, catfish whiskers, cattail shavings, newt tail");
        System.out.println();
        System.out.println("Rare Items:");
        System.out.println("cthulhu tentacles, blood lotus");
        System.out.println();
        System.out.println("(1) Forage  (2) Explore  (3) Back");
        System.out.println();
        String input = keyboard.nextLine();
        if(input.equals("1")){
            Swamp.forage();
            actRem--;
            this.eveningScreen(actRem);
        }
        else if(input.equals("2")){
            if(swampCount <= 2){
                actRem--;
            }
            //only increases swampCount if the exploration is succesful
            if(Swamp.selectExplore(swampCount)){
                    swampCount++;
            }
                
            this.eveningScreen(actRem);
        }
        else{
            this.eveningScreen(actRem);
        }
    }
    
    /**
     * Method that displays the shop screen. It shows all the different options to
     * buy, takes user input, and calls the appropriate methods. Also checks that
     * the user has enough gold
     */
    public void shopScreen(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("You have " + Inventory.getInstance().getGold() + " gold");
        System.out.println();
        System.out.println("(1) Common Pack 10G  (2) Big Common Pack 20G  (3) Rare Pack 20G");
        System.out.println("(4) New Recipe 30G  (5) Back");
        String input = keyboard.nextLine();
        if(input.equals("1")){
            if(Inventory.getInstance().getGold() >= 10){
                Shop.smallBundle();
                actRem--;
            }
            else{
                System.out.println("Sorry, but you don't have enough gold.");
            }
            this.eveningScreen(actRem);
        }
        else if(input.equals("2")){
            if(Inventory.getInstance().getGold() >= 20){
                Shop.bigBundle();
                actRem--;
            }
            else{
                System.out.println("Sorry, but you don't have enough gold.");
            }
            this.eveningScreen(actRem);
        }
        else if(input.equals("3")){
            if(Inventory.getInstance().getGold() >= 20){
                Shop.rareBundle();
                actRem--;
            }
            else{
                System.out.println("Sorry, but you don't have enough gold.");
                System.out.println();
            }
            this.eveningScreen(actRem);
        }
        else if(input.equals("4")){
            if(Inventory.getInstance().getGold() >= 30){
                if(Shop.buyRecipe(shopCount)){
                    shopCount++;
                    actRem--;
                }
            }
            else{
                System.out.println("Sorry, but you don't have enough gold.");
                System.out.println();
            }
            this.eveningScreen(actRem);
        }
        else{
            this.eveningScreen(actRem);
        }
        
        
        
        
        
    }
}