package it.carcassi.matteo.witchpotions;

/**
 * Class Shop
 * Class that randomizes and gives items from the shop for gold
 *
 * @author Matteo Carcassi
 * @date 1/24/21
 */
public class Shop {
    /**
     * Gives the user 3 random common ingredients, 4 if they have the haggling book,
     * and prints the result. User also loses 10 gold
     */
    public static void smallBundle(){
        Inventory.getInstance().addGold(-10);
        int rand;
        int numItems = 3;
        if(Inventory.getInstance().hasBook()){
            numItems++;
        }
        int[] items = new int[8];
        
        for(int i = 0; i < numItems; i++){
            rand = (int)(Math.random()*8 + 1);
            if(rand == 1){
                items[0]++;
                Inventory.getInstance().addToadstool(1);
            }
            else if(rand == 2){
                items[1]++;
                Inventory.getInstance().addSugarBark(1);
            }
            else if(rand == 3){
                items[2]++;
                Inventory.getInstance().addNightshade(1);
            }
            else if(rand == 4){
                items[3]++;
                Inventory.getInstance().addMandrake(1);
            }
            else if(rand == 5){
                items[4]++;
                Inventory.getInstance().addFrogLegs(1);
            }
            else if(rand == 6){
                items[5]++;
                Inventory.getInstance().addCatFishWhiskers(1);
            }
            else if(rand == 7){
                items[6]++;
                Inventory.getInstance().addCatTailShavings(1);
            }
            else{
                items[7]++;
                Inventory.getInstance().addNewtTail(1);
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
            System.out.println("frog legs x" + items[4]);
        }
        if(items[5] != 0){
            System.out.println("catfish whiskers x" + items[5]);
        }
        if(items[6] != 0){
            System.out.println("cattail shavings x" + items[6]);
        }
        if(items[7] != 0){
            System.out.println("newt tail x" + items[7]);
        }
        System.out.println();
    }
    /**
     * Gives the user 6 random common ingredients, 7 if they have the haggling book,
     * and prints the result. User also loses 20 gold
     */
    public static void bigBundle(){
        Inventory.getInstance().addGold(-20);
        int rand;
        int numItems = 6;
        if(Inventory.getInstance().hasBook()){
            numItems++;
        }
        int[] items = new int[8];
        
        for(int i = 0; i < numItems; i++){
            rand = (int)(Math.random()*8 + 1);
            if(rand == 1){
                items[0]++;
                Inventory.getInstance().addToadstool(1);
            }
            else if(rand == 2){
                items[1]++;
                Inventory.getInstance().addSugarBark(1);
            }
            else if(rand == 3){
                items[2]++;
                Inventory.getInstance().addNightshade(1);
            }
            else if(rand == 4){
                items[3]++;
                Inventory.getInstance().addMandrake(1);
            }
            else if(rand == 5){
                items[4]++;
                Inventory.getInstance().addFrogLegs(1);
            }
            else if(rand == 6){
                items[5]++;
                Inventory.getInstance().addCatFishWhiskers(1);
            }
            else if(rand == 7){
                items[6]++;
                Inventory.getInstance().addCatTailShavings(1);
            }
            else{
                items[7]++;
                Inventory.getInstance().addNewtTail(1);
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
            System.out.println("frog legs x" + items[4]);
        }
        if(items[5] != 0){
            System.out.println("catfish whiskers x" + items[5]);
        }
        if(items[6] != 0){
            System.out.println("cattail shavings x" + items[6]);
        }
        if(items[7] != 0){
            System.out.println("newt tail x" + items[7]);
        }
        System.out.println();
    }
    /**
     * Gives the user 3 random rare ingredients, 4 if they have the haggling book,
     * and prints the result. User also loses 20 gold
     */
    public static void rareBundle(){
        Inventory.getInstance().addGold(-20);
        int rand;
        int numItems = 3;
        if(Inventory.getInstance().hasBook()){
            numItems++;
        }
        int[] items = new int[4];
        
        for(int i = 0; i < numItems; i++){
            rand = (int)(Math.random()*4 + 1);
            if(rand == 1){
                items[0]++;
                Inventory.getInstance().addUnicornBlood(1);
            }
            else if(rand == 2){
                items[1]++;
                Inventory.getInstance().addPhoenixFeather(1);
            }
            else if(rand == 3){
                items[2]++;
                Inventory.getInstance().addCthulhuTentacles(1);
            }
            else{
                items[3]++;
                Inventory.getInstance().addBloodLotus(1);
            }
        }
        if(items[0] != 0){
            System.out.println("unicorn blood x" + items[0]);
        }
        if(items[1] != 0){
            System.out.println("phoenix feather x" + items[1]);
        }
        if(items[2] != 0){
            System.out.println("cthulhu tentacles x" + items[2]);
        }
        if(items[3] != 0){
            System.out.println("blood lotus x" + items[3]);
        }
        System.out.println();
    }
    /**
     * Gives the user the next recipe for 30 gold. The first time it will give a
     * STRENGTH recipe and the second an EXPLOSION recipe. Any future times will do
     * nothing
     * 
     * @param num: determines how many recipes have been previously unlocked
     */
    public static boolean buyRecipe(int num){
        if(num == 0){
            Inventory.getInstance().addGold(-30);
            Recipe.getInstance().learnRecipe("STRENGTH");
            System.out.println();
            System.out.println("You learned how to make a STRENGTH potion");
            System.out.println();
            return true;
        }
        else if(num == 1){
            Inventory.getInstance().addGold(-30);
            Recipe.getInstance().learnRecipe("EXPLOSION");
            System.out.println();
            System.out.println("You learned how to make an EXPLOSION potion");
            System.out.println();
            return true;
        }
        else{
            System.out.println();
            System.out.println("You already bought all available recipes");
            System.out.println();
            return false;
        }
    }
}