package it.carcassi.matteo.witchpotions;

import java.util.Scanner;
/**
 * Class Recipe
 * Class that stores the recipes and which ones are currently known
 *
 * @author Matteo Carcassi
 * @date 1/24/21
 */
public class Recipe {
    //stores whether or not recipe is learned by the user
    private boolean healthRecipe = true;
    private boolean strengthRecipe = false;
    private boolean fertilizerRecipe = false;
    private boolean poisonRecipe = false;
    private boolean explosionRecipe = false;
    private boolean magicRecipe = false;
    private boolean aquaticRecipe = false;
    
    Scanner keyboard = new Scanner(System.in);
    /**
     * Singleton structure of Recipe, since there is only one recipe list at any given
     * time and multiple classes need to access it.
     */
    public static final Recipe INSTANCE = new Recipe();
    private Recipe(){}
    public static Recipe getInstance() { return INSTANCE; }
    /**
     * sets one of the recipes from false to true, depending on the String inputed
     * 
     * @param type: must be equivalent to a potion type
     */
    public void learnRecipe(String type){
        if(type.equals("STRENGTH")){
            strengthRecipe = true;
        }
        else if(type.equals("FERTILIZER")){
            fertilizerRecipe = true;
        }
        else if(type.equals("POISON")){
            poisonRecipe = true;
        }
        else if(type.equals("EXPLOSION")){
            explosionRecipe = true;
        }
        else if(type.equals("MAGIC")){
            magicRecipe = true;
        }
        else if(type.equals("AQUATIC")){
            aquaticRecipe = true;
        }
    }
    /**
     * Gives all of the known recipes to choose from. If it is known, it will depict
     * the name, otherwise it will show ????. Then takes user input and calls the
     * info method to show the recipe
     */
    public void recipeSelection(){
        System.out.println("Select a potion to learn more about:");
        System.out.println("(1) Health potion");
        if(strengthRecipe){
            System.out.println("(2) Strength potion");
        }
        else{
            System.out.println("(2) ????");
        }
        if(fertilizerRecipe){
            System.out.println("(3) Fertilizer potion");
        }
        else{
            System.out.println("(3) ????");
        }
        if(poisonRecipe){
            System.out.println("(4) Poison potion");
        }
        else{
            System.out.println("(4) ????");
        }
        if(explosionRecipe){
            System.out.println("(5) Explosion potion");
        }
        else{
            System.out.println("(5) ????");
        }
        if(magicRecipe){
            System.out.println("(6) Magic potion");
        }
        else{
            System.out.println("(6) ????");
        }
        if(aquaticRecipe){
            System.out.println("(7) Aquatic potion");
        }
        else{
            System.out.println("(7) ????");
        }
        int num = keyboard.nextInt();
        Recipe.getInstance().recipeInfo(num);
    }
    /**
     * Shows the information of the chosen recipe. It will give a short description
     * and the ingredients in the order they go
     * 
     * @param num: must be between 1 and 7. Used to select the desired recipe
     */
    public void recipeInfo(int num){
        if(num == 1 && healthRecipe == true){
            System.out.println();
            System.out.println("A potion that can treat wounds, diseases, and other");
            System.out.println("injuries");
            System.out.println();
            System.out.println("Ingredients:");
            System.out.println("sugar bark");
            System.out.println("catfish whiskers");
            System.out.println("cattail shavings");
        }
        else if(num == 2 && strengthRecipe == true){
            System.out.println();
            System.out.println("A potion that gives incredible physical strength");
            System.out.println("to those who drink it");
            System.out.println();
            System.out.println("Ingredients:");
            System.out.println("mandrake");
            System.out.println("frog legs");
            System.out.println("toadstool");
        }
        else if(num == 3 && fertilizerRecipe == true){
            System.out.println();
            System.out.println("A potion that causes plants to grow very quickly");
            System.out.println();
            System.out.println("Ingredients:");
            System.out.println("cattail shavings");
            System.out.println("nightshade");
            System.out.println("sugar bark");
        }
        else if(num == 4 && poisonRecipe == true){
            System.out.println();
            System.out.println("A deadly potion that can kill those who drink it");
            System.out.println();
            System.out.println("Ingredients:");
            System.out.println("nightshade");
            System.out.println("cthulhu tentacles");
            System.out.println("newt tail");
        }
        else if(num == 5 && explosionRecipe == true){
            System.out.println();
            System.out.println("A potion that explodes when thrown or spilled");
            System.out.println();
            System.out.println("Ingredients:");
            System.out.println("phoenix feather");
            System.out.println("toadstool");
            System.out.println("catfish whiskers");
        }
        else if(num == 6 && magicRecipe == true){
            System.out.println();
            System.out.println("A potion that increases the magical capabilities to");
            System.out.println("those who drink it");
            System.out.println();
            System.out.println("Ingredients:");
            System.out.println("toadstool");
            System.out.println("unicorn blood");
            System.out.println("mandrake");
        }
        else if(num == 7 && aquaticRecipe == true){
            System.out.println();
            System.out.println("A potion that gives the ability to breathe and");
            System.out.println("swim underwater to those who drink it");
            System.out.println();
            System.out.println("Ingredients:");
            System.out.println("frog legs");
            System.out.println("newt tail");
            System.out.println("blood lotus");
        }
        else{
            System.out.println("Sorry, that recipe can't be found.");
        }
        System.out.println();
        Screens.menu();
    }

}