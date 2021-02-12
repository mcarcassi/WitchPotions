package it.carcassi.matteo.witchpotions;

import java.util.Scanner;
/**
 * Class Forest
 * Class that stores all forest exploration events as well as randomizes foraging
 * items retrieved
 *
 * @author Matteo Carcassi
 * @date 1/24/21
 */
public class Forest {
    /**
     * Forages for forest ingredients using random numbers. It will give 2-4 items,
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
                Inventory.getInstance().addToadstool(1);
            }
            else if(rand == 3 || rand == 4){
                items[1]++;
                Inventory.getInstance().addSugarBark(1);
            }
            else if(rand == 5 || rand == 6){
                items[2]++;
                Inventory.getInstance().addNightshade(1);
            }
            else if(rand == 7 || rand == 8){
                items[3]++;
                Inventory.getInstance().addMandrake(1);
            }
            else if(rand == 9){
                items[4]++;
                Inventory.getInstance().addUnicornBlood(1);
            }
            else{
                items[5]++;
                Inventory.getInstance().addPhoenixFeather(1);
            }
        }
        if(items[0] != 0){
            System.out.println("toadstool x" + items[0]);
        }
        if(items[1] != 0){
            System.out.println("sugar bark x" + items[1]);
        }
        if(items[2] != 0){
            System.out.println("nightshade x" + items[2]);
        }
        if(items[3] != 0){
            System.out.println("mandrake x" + items[3]);
        }
        if(items[4] != 0){
            System.out.println("unicorn blood x" + items[4]);
        }
        if(items[5] != 0){
            System.out.println("phoenix feather x" + items[5]);
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
            success = Forest.exploreOne();
        }
        else if(num == 1){
            success = Forest.exploreTwo();
        }
        else if(num == 2){
            success = Forest.exploreThree();
        }
        else{
            System.out.println();
            System.out.println("You already explored everything.");
            System.out.println();
        }
        return success;
    }
    /**
     * First exploration: teaches FERTILIZER recipe if successful and nothing for
     * a failure. Answer to the puzzle is "potion" with any capitalization
     */
    public static boolean exploreOne(){
        Scanner keyboard = new Scanner(System.in);
        String input = "";
        System.out.println();
        System.out.println("You find a small hut in the woods. It seems like there is");
        System.out.println("a young man inside.");
        System.out.println("(1) Knock");
        System.out.println();
        input = keyboard.nextLine();
        if(!(input.equals("1"))){
            System.out.println("You knock anyway.");
        }
        System.out.println();
        System.out.println("After knocking on the door, the person comes to open it and");
        System.out.println("greets you.");
        System.out.println();
        System.out.println("Hello. You're that witch from the potion shop nearby right?");
        System.out.println("Actually, I need some help on this problem. I'm getting a");
        System.out.println("PhD in Alchemical Chemistry, and I'm really stuck on");
        System.out.println("this one question on a take home exam. Can you figure it out?");
        System.out.println();
        System.out.println("4. What is the secret message?");
        System.out.println("Polonium  Titanium  Oxygen  Nitrogen");
        System.out.println();
        input = keyboard.nextLine();
        input = input.toLowerCase();
        if(input.equals("potion")){
            System.out.println();
            System.out.println("Yes, that's exactly right! Here, I have a recipe you might");
            System.out.println("like. It can make plants grow really fast!");
            System.out.println();
            Recipe.getInstance().learnRecipe("FERTILIZER");
            System.out.println("You learned how to make a FERTILIZER potion.");
            System.out.println();
            return true;
        }
        else{
            System.out.println();
            System.out.println("Hmm...that doesn't seem to be right. I think it has");
            System.out.println("something to do with the periodic table.");
            System.out.println();
            return false;
        }
    }
    /**
     * Second exploration: gives haggling book if successful and lose 10 gold for
     * a failure. Answer to puzzle is "violet" in any capitilization
     */
    public static boolean exploreTwo(){
        Scanner keyboard = new Scanner(System.in);
        String input = "";
        System.out.println();
        System.out.println("You find a leprechaun prancing about. He stops when he");
        System.out.println("hears you and smiles maliciously.");
        System.out.println("(1) Talk");
        System.out.println();
        input = keyboard.nextLine();
        if(!(input.equals("1"))){
            System.out.println("There is no going back. He approaches and talks to you.");
        }
        System.out.println();
        System.out.println("Hi there, human. My name is ROY G. BIV, and what do you say");
        System.out.println("we make a bet? If you can guess the right word, I'll teach you");
        System.out.println("some secrets to haggling. If not, you will have to give some gold.");
        System.out.println("(1) Make bet");
        System.out.println();
        input = keyboard.nextLine();
        if(!(input.equals("1"))){
            System.out.println("What are you, chicken? Just search up the answer if you don't know");
        }
        System.out.println();
        System.out.println("Alright, try to guess the next word in the sequence.");
        System.out.println("Red Orange Yellow Green Blue Indigo");
        System.out.println();
        System.out.println();
        input = keyboard.nextLine();
        input = input.toLowerCase();
        if(input.equals("violet")){
            System.out.println();
            System.out.println("Aww man, you're smarter than you look. Fine, here is a");
            System.out.println("book on haggling.");
            System.out.println();
            System.out.println("You recieved a Haggling Book! You now get more");
            System.out.println("resources when shopping.");
            System.out.println();
            Inventory.getInstance().findBook();
            return true;
        }
        else if(input.equals("purple")){
            System.out.println();
            System.out.println("Ha! I knew you'd say that. My last name is BIV, not");
            System.out.println("BIP. Alrgiht, now pay your 10 gold.");
            System.out.println();
            Inventory.getInstance().addGold(-10);
            return false;
        }
        else{
            System.out.println();
            System.out.println("Not even close. Pay your 10 gold now.");
            System.out.println();
            Inventory.getInstance().addGold(-10);
            return false;
        }
    }
    /**
     * Third exploration: gives MAGIC recipe if successful and noting for
     * a failure. You must first brew a FERTILIZER potion, then type "pocus" and
     * "kadabra", with any capitilization
     */
    public static boolean exploreThree(){
        Scanner keyboard = new Scanner(System.in);
        String input = "";
        System.out.println();
        System.out.println("While exploring the forest, you find a bean stalk sprout.");
        System.out.println("Maybe with a certain potion, you can help it grow.");
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
        if(!(Potion.getInstance().getType().equals("FERTILIZER"))){
            System.out.println();
            System.out.println("That didn't seem to work. Come back when you remember");
            System.out.println("the recipe or have all ingredients.");
            System.out.println();
            return false;
        }
        System.out.println();
        System.out.println("Awesome! The bean sprout turned into a mighty stalk that");
        System.out.println("reaches all the way into the clouds! Maybe you should climb it.");
        System.out.println("(1) Climb");
        System.out.println();
        input = keyboard.nextLine();
        if(!(input.equals("1"))){
            System.out.println("This is a rare chance, so you take it anyway.");
        }
        System.out.println();
        System.out.println("On the clouds, you find a team of magicians about to perform");
        System.out.println("a magic spell. One of them comes up to you.");
        System.out.println();
        System.out.println("Hey, we need your help doing a spell, because we're short a");
        System.out.println("person. It's easy, you just have to say the correct response.");
        System.out.println("(1) Start ritual");
        System.out.println();
        input = keyboard.nextLine();
        if(!(input.equals("1"))){
            System.out.println("They say they'll give you a reward, and it seems easy enough.");
        }
        System.out.println();
        System.out.println("Hocus");
        System.out.println("Hint: response starts with p");
        System.out.println();
        input = keyboard.nextLine();
        input = input.toLowerCase();
        if(!(input.equals("pocus"))){
            System.out.println();
            System.out.println("Hey, you messed up the ritual! You were supposed to say");
            System.out.println("pocus.");
            System.out.println();
            return false;
        }
        System.out.println();
        System.out.println("Abra");
        System.out.println("Hint: response starts with k");
        System.out.println();
        input = keyboard.nextLine();
        input = input.toLowerCase();
        if(!(input.equals("kadabra"))){
            System.out.println();
            System.out.println("Hey, you messed up the ritual! You were supposed to say");
            System.out.println("kadabra.");
            System.out.println();
            return false;
        }
        System.out.println();
        System.out.println("Hooray! You succeeded in the ritual. A pile of sunscreen");
        System.out.println("appears out of nowhere.");
        System.out.println();
        System.out.println("Thanks so much for the help. We've been direly in need of");
        System.out.println("sunscreen up here in the clouds. Here, I can teach you a");
        System.out.println("recipe you might like.");
        System.out.println();
        System.out.println("You learned how to make a MAGIC potion.");
        System.out.println();
        Recipe.getInstance().learnRecipe("MAGIC");
        return true;
    }
    

}