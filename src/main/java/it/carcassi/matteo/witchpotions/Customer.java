package it.carcassi.matteo.witchpotions;

/**
 * Class Customer
 * Class that stores current customer information and their dialogue
 *
 * @author Matteo Carcassi
 * @date 1/24/21
 */
public class Customer {
    //stores the amount of customers that showed up today. Up to 3 customers per day
    private int count;
    //stores whether current customer is served
    private boolean served = false;
    //stores current customer ID
    private int custNumber;
    
    /**
     * Singleton structure of Customer, since there is only on customer at any given
     * time and multiple classes need to access it.
     */
    public static final Customer INSTANCE = new Customer();
    private Customer(){}
    public static Customer getInstance() { return INSTANCE; }
    /**
     * Randomizes the next customer. Different days allow different customers to be
     * present. The method then calls the greeting of the chosen customer, and there
     * the customer ID will be set
     * 
     * @param day: changes which randomization to use
     */
    public void customerSelection(int day){
        int choice = 0;
        served = false;
        if(day == 1){
            count = 3;
            Customer.customerOneGreeting();
        }
        else if(day == 2){
            if(count == 0){
                count += 2;
                Customer.customerOneGreeting();
            }
            else{
                count++;
                Customer.customerTwoGreeting();
            }
        }
        else if(day == 3){
            choice = (int)(Math.random()*5 + 1);
            count++;
        }
        else if(day == 4 || day == 5){
            choice = (int)(Math.random()*9 + 1);
            count++;
        }
        else{
            choice = (int)(Math.random()*15 + 1);
            count++;
        }
        if(choice == 1){
            Customer.customerOneGreeting();
        }
        else if(choice == 2){
            Customer.customerTwoGreeting();
        }
        else if(choice == 3){
            Customer.customerThreeGreeting();
        }
        else if(choice == 4){
            Customer.customerFourGreeting();
        }
        else if(choice == 5){
            Customer.customerFiveGreeting();
        }
        else if(choice == 6){
            Customer.customerSixGreeting();
        }
        else if(choice == 7){
            Customer.customerSevenGreeting();
        }
        else if(choice == 8){
            Customer.customerEightGreeting();
        }
        else if(choice == 9){
            Customer.customerNineGreeting();
        }
        else if(choice == 10){
            Customer.customerTenGreeting();
        }
        else if(choice == 11){
            Customer.customerElevenGreeting();
        }
        else if(choice == 12){
            Customer.customerTwelveGreeting();
        }
        else if(choice == 13){
            Customer.customerThirteenGreeting();
        }
        else if(choice == 14){
            Customer.customerFourteenGreeting();
        }
        else if(choice == 15){
            Customer.customerFifteenGreeting();
        }
        
    }
    //returns whether or not customer is served
    public boolean isServed(){
        return served;
    }
    //returns how many customers have shown up today
    public int getCount(){
        return count;
    }
    //used to reset the counter for a new day
    public void setCount(int num){
        this.count = num;
    }
    //return current customer ID. Used to find the ending
    public int getCustNumber(){
        return custNumber;
    }
    /**
     * Message for when user selects (4) Sorry! Can't serve. Gives a universal
     * blah response for now, although with some work each customer could have a
     * separate response
     */
    public static void noLuck(){
        System.out.println();
        System.out.println("Ok, well thank you for trying. I'll come back another time.");
        System.out.println();
        Customer.getInstance().served = true;
    }
    /**
     * Serves the current customer and calls the appropriate customer ending
     */
    public void serveCustomer(){
        Customer.getInstance().served = true;
        if(custNumber == 1){
            customerOneEnding();
        }
        else if(custNumber == 2){
            customerTwoEnding();
        }
        else if(custNumber == 3){
            customerThreeEnding();
        }
        else if(custNumber == 4){
            customerFourEnding();
        }
        else if(custNumber == 5){
            customerFiveEnding();
        }
        else if(custNumber == 6){
            customerSixEnding();
        }
        else if(custNumber == 7){
            customerSevenEnding();
        }
        else if(custNumber == 8){
            customerEightEnding();
        }
        else if(custNumber == 9){
            customerNineEnding();
        }
        else if(custNumber == 10){
            customerTenEnding();
        }
        else if(custNumber == 11){
            customerElevenEnding();
        }
        else if(custNumber == 12){
            customerTwelveEnding();
        }
        else if(custNumber == 13){
            customerThirteenEnding();
        }
        else if(custNumber == 14){
            customerFourteenEnding();
        }
        else if(custNumber == 15){
            customerFifteenEnding();
        }
    }
    /**
     * The following methods all follow a similar structure. Each method that ends
     * in Greeting is the initial customer dialogue. It gives a clue about the appropriate
     * potion to make, as well as set the current customer ID (custNumber). Methods that
     * end in Ending is the final customer dialogue. This will give a response based on
     * whether the user made the correct potion and add gold, with HEALTH potions giving
     * 10, STRENGTH, FERTILIZER, and POISON 15, and EXPLOSION, MAGIC, and AQUATIC 20.
     * Each customer only has one correct potion
     */
    public static void customerOneGreeting(){
        Customer.getInstance().custNumber = 1;
        System.out.println();
        System.out.println("Hey there. I got into a pretty big fight in a bar");
        System.out.println("last night, and I got pummeled pretty hard. A HEALTH");
        System.out.println("potion should fix me right up.");
        System.out.println();
    }
    
    public static void customerOneEnding(){
        if(Potion.getInstance().getType().equals("HEALTH")){
            System.out.println();
            System.out.println("Much better, thanks. Here's 10 gold for you.");
            System.out.println();
            Inventory.getInstance().addGold(10);
        }
        else{
            System.out.println();
            System.out.println("No this doesn't help. I'll just jump in a healing");
            System.out.println("fountain instead.");
            System.out.println();
        }
    }
    
    public static void customerTwoGreeting(){
        Customer.getInstance().custNumber = 2;
        System.out.println();
        System.out.println("Hi. My arm got chopped off in a mighty battle against a");
        System.out.println("mighty dragon. If you have anything to heal me back into");
        System.out.println("my former glory, it would be much appreciated.");
        System.out.println();
    }
    
    public static void customerTwoEnding(){
        if(Potion.getInstance().getType().equals("HEALTH")){
            System.out.println();
            System.out.println("Ah, that hits the spot. Look, my arm is back and good");
            System.out.println("as new. Here is 10 gold for your valiant efforts");
            System.out.println();
            Inventory.getInstance().addGold(10);
        }
        else{
            System.out.println();
            System.out.println("I'm afraid this is not quite what I was looking for. Perhaps");
            System.out.println("I shall go to a hospital instead.");
            System.out.println();
            
        }
    }
    
    public static void customerThreeGreeting(){
        Customer.getInstance().custNumber = 3;
        System.out.println();
        System.out.println("Quick, you need to help! I have a terrible disease that");
        System.out.println("makes it so I can only skip to move around. Save me, please");
        System.out.println("save me!");
        System.out.println();
    }
    
    public static void customerThreeEnding(){
        if(Potion.getInstance().getType().equals("HEALTH")){
            System.out.println();
            System.out.println("Phew, what a relief. For a minute there I thought");
            System.out.println("I would be skipping for the rest of my life. Here");
            System.out.println("is your well earned gold.");
            System.out.println();
            Inventory.getInstance().addGold(10);
        }
        else{
            System.out.println();
            System.out.println("No, you failed me. Now I have to skip to leave your");
            System.out.println("store. Look the other way until I leave.");
            System.out.println();
            
        }
    }
    
    public static void customerFourGreeting(){
        Customer.getInstance().custNumber = 4;
        System.out.println();
        System.out.println("Hi, I'm a worker over by the docks. Tomorrow, we're having");
        System.out.println("a really heavy shipment, so my boss wants me to get something");
        System.out.println("to make me stronger. You got anything?");
        System.out.println();
    }
    
    public static void customerFourEnding(){
        if(Potion.getInstance().getType().equals("STRENGTH")){
            System.out.println();
            System.out.println("Yeah, this is great! My boss will love me tomorrow.");
            System.out.println("Here's 15 gold as payment.");
            System.out.println();
            Inventory.getInstance().addGold(15);
        }
        else{
            System.out.println();
            System.out.println("I don't think this will help me much...");
            System.out.println();
            
        }
    }
    
    public static void customerFiveGreeting(){
        Customer.getInstance().custNumber = 5;
        System.out.println();
        System.out.println("Hi, I have a favor to ask. Tomorrow I have a very important");
        System.out.println("boxing competition, and I need something to make me");
        System.out.println("ultra-buff. Do you have anything in stock?");
        System.out.println();
    }
    
    public static void customerFiveEnding(){
        if(Potion.getInstance().getType().equals("STRENGTH")){
            System.out.println();
            System.out.println("Yes, I might actually win this tournament! As long");
            System.out.println("as my opponent doesn't resort to dirty tricks. Here is");
            System.out.println("15 gold for my gratititude.");
            System.out.println();
            Inventory.getInstance().addGold(15);
        }
        else{
            System.out.println();
            System.out.println("Hmm...I'm not feeling ultra-buff. I'll pay you back");
            System.out.println("if it works.");
            System.out.println();
            
        }
    }
    
    public static void customerSixGreeting(){
        Customer.getInstance().custNumber = 6;
        System.out.println();
        System.out.println("Good morning. I perform lawnmowing services, but business has");
        System.out.println("been slow lately. I need something to sprinkle on people's");
        System.out.println("lawns so I can be hired again. I know it sounds mean,");
        System.out.println("but my dog, William, is sick and I need money to treat him.");
        System.out.println();
    }
    
    public static void customerSixEnding(){
        if(Potion.getInstance().getType().equals("FERTILIZER")){
            System.out.println();
            System.out.println("Thank you, this means so much to me, and my dog,");
            System.out.println("Wilbur, too. Here's is some of my little money.");
            System.out.println();
            Inventory.getInstance().addGold(15);
        }
        else{
            System.out.println();
            System.out.println("My dog Wilbur will die and it's all your fault!");
            System.out.println();
            
        }
    }
    
    public static void customerSevenGreeting(){
        Customer.getInstance().custNumber = 7;
        System.out.println();
        System.out.println("Hiya! I'm planning to grow some cherry trees in");
        System.out.println("my backyard to remind me of my home country, but the");
        System.out.println("climate isn't the best. If you have something to help");
        System.out.println("them grow, it'd mean a lot to me.");
        System.out.println();
    }
    
    public static void customerSevenEnding(){
        if(Potion.getInstance().getType().equals("FERTILIZER")){
            System.out.println();
            System.out.println("Yes, this is sure to work! Here is 15 gold.");
            System.out.println();
            Inventory.getInstance().addGold(15);
        }
        else{
            System.out.println();
            System.out.println("I don't think this is it...thanks anyways.");
            System.out.println();
            
        }
    }
    
    public static void customerEightGreeting(){
        Customer.getInstance().custNumber = 8;
        System.out.println();
        System.out.println("Hello, my house is having a rat infestation problem,");
        System.out.println("and I am fresh out of cats. Do you have anything");
        System.out.println("to get rid of them?");
        System.out.println();
    }
    
    public static void customerEightEnding(){
        if(Potion.getInstance().getType().equals("POISON")){
            System.out.println();
            System.out.println("Thanks! I'll for sure get a good nights sleep tonight.");
            System.out.println("Here's 15 gold for your troubles.");
            System.out.println();
            Inventory.getInstance().addGold(15);
        }
        else{
            System.out.println();
            System.out.println("My rats will never leave with this stuff!");
            System.out.println();
            
        }
    }
    
    public static void customerNineGreeting(){
        Customer.getInstance().custNumber = 9;
        System.out.println();
        System.out.println("Good day to you. Now, I need a POISON potion for a certain");
        System.out.println("someone...let's call it a wolf. Yeah, there is a big bad");
        System.out.println("wolf in my backyard. Do you have one to take care of him...I mean");
        System.out.println("it?");
        System.out.println();
    }
    
    public static void customerNineEnding(){
        if(Potion.getInstance().getType().equals("POISON")){
            System.out.println();
            System.out.println("Haha, John will never see this coming! That's the wolf's name.");
            System.out.println();
            Inventory.getInstance().addGold(15);
        }
        else{
            System.out.println();
            System.out.println("This won't do. I guess I'll have to resort to other methods.");
            System.out.println();
            
        }
    }
    
    public static void customerTenGreeting(){
        Customer.getInstance().custNumber = 10;
        System.out.println();
        System.out.println("Hi, I'm a miner at the nearby mine, and we've been");
        System.out.println("having trouble mining in this certain spot. We think");
        System.out.println("we should probably just blow it up, so we'd appreciate");
        System.out.println("anything that could help.");
        System.out.println();
    }
    
    public static void customerTenEnding(){
        if(Potion.getInstance().getType().equals("EXPLOSION")){
            System.out.println();
            System.out.println("This is great! You've been a big help. Here is 20 gold");
            System.out.println("for your fine job.");
            System.out.println();
            Inventory.getInstance().addGold(20);
        }
        else{
            System.out.println();
            System.out.println("I think you might've made a mistake. Oh well, we can");
            System.out.println("just buy some dynamite and call it a day.");
            System.out.println();
            
        }
    }
    
    public static void customerElevenGreeting(){
        Customer.getInstance().custNumber = 11;
        System.out.println();
        System.out.println("Greetings. We are a team that concerns itself with top");
        System.out.println("secret matters. We built a specialized locking system");
        System.out.println("that is so strong no one could get in, but we now forgot");
        System.out.println("the pass code. Our only option to retrieve what we have");
        System.out.println("lost is to blow it up. We will pay you well for your");
        System.out.println("services.");
        System.out.println();
    }
    
    public static void customerElevenEnding(){
        if(Potion.getInstance().getType().equals("EXPLOSION")){
            System.out.println();
            System.out.println("Excellent. We should be able to get back all our");
            System.out.println("top secret information on the computer with this.");
            System.out.println("Here is 20 gold, as promised.");
            System.out.println();
            Inventory.getInstance().addGold(20);
        }
        else{
            System.out.println();
            System.out.println("This is not what we require. Our search will");
            System.out.println("resume elsewhere.");
            System.out.println();
            
        }
    }
    
    public static void customerTwelveGreeting(){
        Customer.getInstance().custNumber = 12;
        System.out.println();
        System.out.println("Hey, so here's the deal. I'm a wizard a wizarding school,");
        System.out.println("and yesterday, my class learned how to make a MAGIC potion.");
        System.out.println("Only trouble is, I was kind of sleeping during that lesson,");
        System.out.println("and my professor told us to make one for homework. Can");
        System.out.println("you give me one, pretty please?");
        System.out.println();
    }
    
    public static void customerTwelveEnding(){
        if(Potion.getInstance().getType().equals("MAGIC")){
            System.out.println();
            System.out.println("Oh thank goodness! You're a lifesaver. Here is 20 gold.");
            System.out.println();
            Inventory.getInstance().addGold(20);
        }
        else{
            System.out.println();
            System.out.println("This isn't it. You must have slept during your lesson");
            System.out.println("too, huh?");
            System.out.println();
            
        }
    }
    
    public static void customerThirteenGreeting(){
        Customer.getInstance().custNumber = 13;
        System.out.println();
        System.out.println("G'day. I was hoping to impress my friends by doing a really");
        System.out.println("advanced magical spell, but I'm just not powerful enough.");
        System.out.println("Do you have anything to boost my magic for a bit?");
        System.out.println();
    }
    
    public static void customerThirteenEnding(){
        if(Potion.getInstance().getType().equals("MAGIC")){
            System.out.println();
            System.out.println("Good, I like this. Here is 20 gold for you.");
            System.out.println();
            Inventory.getInstance().addGold(20);
        }
        else{
            System.out.println();
            System.out.println("No, this isn't what I want. I'm going to leave now.");
            System.out.println();
            
        }
    }
    
    public static void customerFourteenGreeting(){
        Customer.getInstance().custNumber = 14;
        System.out.println();
        System.out.println("Hello. Really nice shop you have here. I was just here");
        System.out.println("because my friend is drowning in the swamp, and I was hoping");
        System.out.println("you could help. Maybe something to help her breathe underwater?");
        System.out.println();
    }
    
    public static void customerFourteenEnding(){
        if(Potion.getInstance().getType().equals("AQUATIC")){
            System.out.println();
            System.out.println("Wow, thanks! Here, let me just find some gold for you.");
            System.out.println("Hmm...I don't have enough in my pocket. Let me check my");
            System.out.println("bag. Oh yes...ok here you go. 20 gold!");
            System.out.println();
            Inventory.getInstance().addGold(20);
        }
        else{
            System.out.println();
            System.out.println("Aww man...this doesn't seem right. Oh well, thanks for");
            System.out.println("trying. I'll see if there is anything nextdoor.");
            System.out.println();
            
        }
    }
    
    public static void customerFifteenGreeting(){
        Customer.getInstance().custNumber = 15;
        System.out.println();
        System.out.println("Hi, I found this treasure map, and it says there is treasure");
        System.out.println("deep in a certain lake, can't tell you which. I don't think");
        System.out.println("I can last long enough underwater, though, so I'm going");
        System.out.println("to need something to help me.");
        System.out.println();
    }
    
    public static void customerFifteenEnding(){
        if(Potion.getInstance().getType().equals("AQUATIC")){
            System.out.println();
            System.out.println("Yeah, you're the best! Here's 20 gold, mere");
            System.out.println("pocket change after I find this treasure!");
            System.out.println();
            Inventory.getInstance().addGold(20);
        }
        else{
            System.out.println();
            System.out.println("Nuh-uh, this won't help. I'll have to find another way.");
            System.out.println();
            
        }
    }
    
    

}