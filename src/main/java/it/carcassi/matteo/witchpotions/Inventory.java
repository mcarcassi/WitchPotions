package it.carcassi.matteo.witchpotions;

public class Inventory {
    //gold
    private double gold = 10.0;
    //forest items
    private int toadstool = 0;
    private int sugarBark = 0;
    private int nightshade = 0;
    private int mandrake = 0;
    //rare forest items
    private int unicornBlood = 0;
    private int phoenixFeather = 0;
    //pond items
    private int frogLegs = 0;
    private int catFishWhiskers = 0;
    private int catTailShavings = 0;
    private int newtTail = 0;
    //rare pond items
    private int cthulhuTentacles = 0;
    private int bloodLotus = 0;
    //special items
    private boolean hagglingBook = false;
    private boolean foragingBasket = false;
    /**
     * Singleton structure of Inventory. This ensures only one Inventory object is created
     * and that it can be set and retrieved by all other classes.
     * 
     * return the Inventory
     */
    public static final Inventory INSTANCE = new Inventory();
    private Inventory(){}
    public static Inventory getInstance() { return INSTANCE; }
    /**
     * Need a separate getter for gold as it is a double
     * 
     * return current gold in Inventory
     */
    public double getGold(){
        return this.gold;
    }
    /**
     * Gets the number of the chosen item
     * 
     * @param item The item that is to be gotten.
     * return number of chosen item or -1 if item does not exist
     */
    public int getItem(String item){
        if(item.equals("toadstool")){
            return toadstool;
        }
        else if(item.equals("sugar bark")){
            return sugarBark;
        }
        else if(item.equals("nightshade")){
            return nightshade;
        }
        else if(item.equals("mandrake")){
            return mandrake;
        }
        else if(item.equals("unicorn blood")){
            return unicornBlood;
        }
        else if(item.equals("phoenix feather")){
            return phoenixFeather;
        }
        else if(item.equals("frog legs")){
            return frogLegs;
        }
        else if(item.equals("catfish whiskers")){
            return catFishWhiskers;
        }
        else if(item.equals("cattail shavings")){
            return catTailShavings;
        }
        else if(item.equals("newt tail")){
            return newtTail;
        }
        else if(item.equals("cthulhu tentacles")){
            return cthulhuTentacles;
        }
        else if(item.equals("blood lotus")){
            return bloodLotus;
        }
        else{
            return -1;
        }
    }
    //returns whether or not the user has the haggling book
    public boolean hasBook(){
        return hagglingBook;
    }
    //returns whether or not the user has the foraging basket
    public boolean hasBasket(){
        return foragingBasket;
    }
    //sets haggling book to true
    public void findBook(){
        this.hagglingBook = true;
    }
    //sets foraging basket to true
    public void findBasket(){
        this.foragingBasket = true;
    }
    /**
     * Displays the inventory when user checks the inventory on the shop. Then it
     * prints each of the ingredients on separate lines, and does not display the ingredient
     * if it is zero
     */
    public void checkInventory(){
        System.out.println();
        System.out.println("Gold: " + gold);
        if(toadstool != 0){
            System.out.println("Toadstool: " + toadstool);
        }
        if(sugarBark != 0){
            System.out.println("Sugar bark: " + sugarBark);
        }
        if(nightshade != 0){
            System.out.println("Nightshade: " + nightshade);
        }
        if(mandrake != 0){
            System.out.println("Mandrake: " + mandrake);
        }
        if(unicornBlood != 0){
            System.out.println("Unicorn blood: " + unicornBlood);
        }
        if(phoenixFeather != 0){
            System.out.println("Phoenix feather: " + phoenixFeather);
        }
        if(frogLegs != 0){
            System.out.println("Frog legs: " + frogLegs);
        }
        if(catFishWhiskers != 0){
            System.out.println("Catfish whiskers: " + catFishWhiskers);
        }
        if(catTailShavings != 0){
            System.out.println("Cattail shavings: " + catTailShavings);
        }
        if(newtTail != 0){
            System.out.println("Newt tail: " + newtTail);
        }
        if(cthulhuTentacles != 0){
            System.out.println("Cthulhu tentacles: " + cthulhuTentacles);
        }
        if(bloodLotus != 0){
            System.out.println("Blood lotus: " + bloodLotus);
        }
        System.out.println();
        Screens.menu();
    }
    /**
     * Multiple add methods to add amount of each ingredient. Put in a negative
     * to remove ingredients
     * 
     * @param n number of items to add
     */
    public void addGold(double n){
        gold += n;
    }
    public void addToadstool(int n){
        toadstool += n;
    }
    public void addSugarBark(int n){
        sugarBark += n;
    }
    public void addNightshade(int n){
        nightshade += n;
    }
    public void addMandrake(int n){
        mandrake += n;
    }
    public void addUnicornBlood(int n){
        unicornBlood += n;
    }
    public void addPhoenixFeather(int n){
        phoenixFeather += n;
    }
    public void addFrogLegs(int n){
        frogLegs += n;
    }
    public void addCatFishWhiskers(int n){
        catFishWhiskers += n;
    }
    public void addCatTailShavings(int n){
        catTailShavings += n;
    }
    public void addNewtTail(int n){
        newtTail += n;
    }
    public void addCthulhuTentacles(int n){
        cthulhuTentacles += n;
    }
    public void addBloodLotus(int n){
        bloodLotus += n;
    }
    /**
     * Add method that takes a String to specify the item. This is required for
     * user input
     * 
     * @param item: choose item to add
     * @param n: number of items to add
     */
    public void addItem(String item, int n){
        if(item.equals("gold")){
            addGold(n);
        }
        if(item.equals("toadstool")){
            addToadstool(n);
        }
        if(item.equals("sugar bark")){
            addSugarBark(n);
        }
        if(item.equals("nightshade")){
            addNightshade(n);
        }
        if(item.equals("mandrake")){
            addMandrake(n);
        }
        if(item.equals("unicorn blood")){
            addUnicornBlood(n);
        }
        if(item.equals("phoenix feather")){
            addPhoenixFeather(n);
        }
        if(item.equals("frog legs")){
            addFrogLegs(n);
        }
        if(item.equals("catfish whiskers")){
            addCatFishWhiskers(n);
        }
        if(item.equals("cattail shavings")){
            addCatTailShavings(n);
        }
        if(item.equals("newt tail")){
            addNewtTail(n);
        }
        if(item.equals("cthulhu tentacles")){
            addCthulhuTentacles(n);
        }
        if(item.equals("blood lotus")){
            addBloodLotus(n);
        }
        
    }
    

    
    
}