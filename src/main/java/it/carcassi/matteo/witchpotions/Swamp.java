package it.carcassi.matteo.witchpotions;

import java.util.Scanner;
/**
 * Class Swamp
 * Class that stores all swamp exploration events as well as randomizes foraging
 * items retrieved
 *
 * @author Matteo Carcassi
 * @date 1/24/21
 */
public class Swamp {
    /**
     * Forages for swamp ingredients using random numbers. It will give 2-4 items,
     * or 3-5 items if you have the foraging basket. Then it will randomly select
     * between the ingredients and display the results
     */
    public static void forage(){
        int rand = (int)(Math.random()*10 + 1);
        int numItems;
        int[] items = new int[6];
        if(rand == 1 || rand == 2){
            System.out.println();
            System.out.print("A poor forage.");
            numItems = 2;
        }
        else if(rand == 9 || rand == 10){
            System.out.println();
            System.out.print("An outstanding forage!");
            numItems = 4;
        }
        else{
            System.out.println();
            System.out.print("An average forage.");
            numItems = 3;
        }
        if(Inventory.getInstance().hasBasket()){
            numItems++;
        }
        System.out.println(" You gained " + numItems + " items.");
        
        for(int i = 0; i < numItems; i++){
            rand = (int)(Math.random()*10 + 1);
            if(rand == 1 || rand == 2){
                items[0]++;
                Inventory.getInstance().addFrogLegs(1);
            }
            else if(rand == 3 || rand == 4){
                items[1]++;
                Inventory.getInstance().addCatFishWhiskers(1);
            }
            else if(rand == 5 || rand == 6){
                items[2]++;
                Inventory.getInstance().addCatTailShavings(1);
            }
            else if(rand == 7 || rand == 8){
                items[3]++;
                Inventory.getInstance().addNewtTail(1);
            }
            else if(rand == 9){
                items[4]++;
                Inventory.getInstance().addCthulhuTentacles(1);
            }
            else{
                items[5]++;
                Inventory.getInstance().addBloodLotus(1);
            }
        }
        if(items[0] != 0){
            System.out.println("frog legs x" + items[0]);
        }
        if(items[1] != 0){
            System.out.println("catfish whiskers x" + items[1]);
        }
        if(items[2] != 0){
            System.out.println("cattail shavings x" + items[2]);
        }
        if(items[3] != 0){
            System.out.println("newt tail x" + items[3]);
        }
        if(items[4] != 0){
            System.out.println("cthulhu tentacles x" + items[4]);
        }
        if(items[5] != 0){
            System.out.println("blood lotus x" + items[5]);
        }
        System.out.println();
    }
    /**
     * Method that selects the exploration depending on how many successful explorations
     * you've had. There are only three scenarios, so exploring a fourth time or beyond
     * will not do anything
     * 
     * @param num: selects which exploration method to call
     */
    public static boolean selectExplore(int num){
        boolean success = false;
        if(num == 0){
            success = Swamp.exploreOne();
        }
        else if(num == 1){
            success = Swamp.exploreTwo();
        }
        else if(num == 2){
            success = Swamp.exploreThree();
        }
        else{
            System.out.println();
            System.out.println("You already explored everything.");
            System.out.println();
        }
        return success;
    }
    /**
     * First exploration: teaches POISON recipe if successful and nothing for
     * a failure. Answer to the puzzle is "mongoose" with any capitalization
     */
    public static boolean exploreOne(){
        Scanner keyboard = new Scanner(System.in);
        String input = "";
        System.out.println();
        System.out.println("While exploring in the swamp, you find a swamp cobra.");
        System.out.println("It looks like he wants to tell you something.");
        System.out.println("(1) Continue");
        System.out.println();
        input = keyboard.nextLine();
        System.out.println();
        System.out.println("The cobra begins to tell you a riddle:");
        System.out.println("An evil predator is on the loossse. Thisss");
        System.out.println("weasssel-like creature'sss name ssstupidly endsss in goossse.");
        System.out.println("What is the name of my worssst enemy?");
        System.out.println();
        input = keyboard.nextLine();
        input = input.toLowerCase();
        if(input.equals("mongoose")){
            System.out.println();
            System.out.println("Yesss, I sssee that you can be trusssted. I ssshall");
            System.out.println("tell you the sssecret of my poissson, ssso you can");
            System.out.println("help me fight him.");
            System.out.println();
            Recipe.getInstance().learnRecipe("POISON");
            System.out.println("You learned how to make a POISON potion.");
            System.out.println();
            return true;
        }
        else{
            System.out.println();
            System.out.println("You don't know my great enemy the mongoossse!");
            System.out.println("You are definitely very uneducated.");
            System.out.println();
            return false;
        }
    }
    /**
     * Second exploration: gives foraging basket if successful and noting for
     * a failure. Answer to puzzle is 0
     */
    public static boolean exploreTwo(){
        Scanner keyboard = new Scanner(System.in);
        String input = "";
        System.out.println();
        System.out.println("You approach a company with a sign saying");
        System.out.println("Basket Maker Inc.");
        System.out.println("(1) Enter");
        System.out.println();
        input = keyboard.nextLine();
        if(!(input.equals("1"))){
            System.out.println("You're too curious to turn around.");
        }
        System.out.println();
        System.out.println("Hi there. This is Basket Maker Inc., where we take the finest");
        System.out.println("reeds from this swamp to make some baskets. Actually, we");
        System.out.println("need some help with an accounting problem. Can you give us a hand?");
        System.out.println("(1) Help out");
        System.out.println();
        input = keyboard.nextLine();
        if(!(input.equals("1"))){
            System.out.println("That's mean");
        }
        System.out.println();
        System.out.println("Ok, so we have 5 employees, and each can make 6 baskets");
        System.out.println("in a day. Each basket makes us 5 gold. Also, don't forget");
        System.out.println("that we need to pay employees 30 gold a day. How much");
        System.out.println("money do we make in one day?");
        System.out.println();
        input = keyboard.nextLine();
        if(input.equals("0")){
            System.out.println();
            System.out.println("Great, thanks for the help! Here, have a free basket.");
            System.out.println("I'm sure it will help you forage");
            System.out.println();
            System.out.println("You recieved a Foraging Basket! You now get more");
            System.out.println("resources when foraging.");
            Inventory.getInstance().findBasket();
            return true;
        }
        else{
            System.out.println();
            System.out.println("I don't think your math was quite right. Thanks for");
            System.out.println("trying, though.");
            System.out.println();
            return false;
        }
    }
    /**
     * Third exploration: gives AQUATIC recipe if successful and nothing for
     * a failure. You must first write "unicorn blood" and "blood lotus", then make
     * a HEALTH potion. If successful, the user loses 1 unicorn blood and 1 blood lotus
     */
    public static boolean exploreThree(){
        Scanner keyboard = new Scanner(System.in);
        String input = "";
        System.out.println();
        System.out.println("You find a sacrificial altar, and it claims it will give");
        System.out.println("a reward if you can make the necessary sacrifice.");
        System.out.println("(1) What does it want?");
        System.out.println();
        input = keyboard.nextLine();
        System.out.println();
        System.out.println("It says it wants human blood, magic blood, and plant blood.");
        System.out.println("What ingredient might be magic blood?");
        System.out.println();
        input = keyboard.nextLine();
        input = input.toLowerCase();
        if(input.equals("unicorn blood")){
            System.out.println("Great! That could work.");
        }
        else{
            System.out.println();
            System.out.println("That isn't quite right. Check what ingredients might be");
            System.out.println("magic blood and which one plant blood.");
            System.out.println();
            return false;
        }
        System.out.println();
        System.out.println("Now, what ingredient might be plant blood?");
        System.out.println();
        input = keyboard.nextLine();
        input = input.toLowerCase();
        if(input.equals("blood lotus")){
            System.out.println("Yes! That's exactly right");
        }
        else{
            System.out.println();
            System.out.println("That isn't quite right. Check what ingredients might be");
            System.out.println("magic blood and which one plant blood.");
            System.out.println();
            return false;
        }
        if(!(Inventory.getInstance().getItem("unicorn blood") > 0 && Inventory.getInstance().getItem("blood lotus") > 0)){
            System.out.println();
            System.out.println("You seem to be missing either unicorn blood or a blood");
            System.out.println("lotus for this sacrifice. Come back when you have them.");
            System.out.println();
            return false;
        }
        System.out.println();
        System.out.println("It looks like this ritual might use up some resources.");
        System.out.println("Are you willing to use them?");
        System.out.println("(1) Yes  (2) No");
        input = keyboard.nextLine();
        if(!(input.equals("1"))){
            System.out.println();
            System.out.println("Ok. You head back.");
            System.out.println();
            return false;
        }
        System.out.println();
        System.out.println("You start with the human blood, and make a cut on your palm.");
        System.out.println("Uh oh, the cut was too deep. Quick, make a potion to cure yourself!");
        System.out.println("(1) Brew");
        System.out.println();
        input = keyboard.nextLine();
        System.out.println();
        System.out.println("Put in your three ingredients on separate lines.");
        System.out.println("Note: order and spelling DO matter");
        String ingr1 = keyboard.nextLine();
        System.out.println();
        String ingr2 = keyboard.nextLine();
        System.out.println();
        String ingr3 = keyboard.nextLine();
        System.out.println();
        Potion.make(ingr1, ingr2, ingr3);
        if(!(Potion.getInstance().getType().equals("HEALTH"))){
            System.out.println();
            System.out.println("You didn't make the right potion. You have lost too");
            System.out.println("much blood, so you have to head back.");
            System.out.println();
            return false;
        }
        System.out.println();
        System.out.println("What a relief! Now, I'm just going to put in the unnicorn");
        System.out.println("blood and blood lotus.");
        System.out.println();
        Inventory.getInstance().addUnicornBlood(-1);
        Inventory.getInstance().addBloodLotus(-1);
        System.out.println();
        System.out.println("The altar starts glowing! It has a recipe written on it.");
        Recipe.getInstance().learnRecipe("AQUATIC");
        System.out.println("You learned how to make an AQUATIC potion.");
        System.out.println();
        return true;
    }
}