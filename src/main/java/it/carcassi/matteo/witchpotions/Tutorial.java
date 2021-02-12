package it.carcassi.matteo.witchpotions;

import java.util.Scanner;
/**
 * Class Tutorial
 * Stores the tutorial
 *
 * @author Matteo Carcassi
 * @date 1/24/21
 */
public class Tutorial {
    //This is the method that calls the tutorial. I used to have it all in the
    //main method, but it was getting ridiculously long. I pretty much hardcoded
    //all of actions and chances, because since the user can only make set choices,
    //I don't want them to fail or change anything
    public static void startTutorial(){
        //creating scanner
        Scanner keyboard = new Scanner(System.in);
        //input is a variable that will constantly be changed for character choices
        //although it will always be a number, I want to make sure the user doesn't crash
        //the game by putting incorrect answers, which is why it's a String
        String input = " ";
        
        //basic setup teaching
        System.out.println("Hello there! You may have forgotten, but you are a witch.");
        System.out.println("You run a small potion shop, and brew potions for anyone who needs them to make");
        System.out.println("lots of money! And a warm feeling inside.");
        System.out.println();
        System.out.println("Press 1 and ENTER to continue");
        input = keyboard.nextLine();
        //ensures user cannot mess up. This will be seen after action the user makes for the tutorial
        while(!(input.equals("1"))){
            System.out.println("That wasn't a 1! Let's try again");
            input = keyboard.nextLine();
        }
        //teaching about brew
        System.out.println();
        System.out.println("When you're in your shop, you have three options to choose from.");
        System.out.println("The first is to brew a potion. Each potion requires three ingredients to make,");
        System.out.println("and different combinations create different potions. Careful though, the");
        System.out.println("order you put them in matters, and spelling does, too.");
        System.out.println();
        System.out.println("Press 1 and ENTER to continue");
        input = keyboard.nextLine();
        while(!(input.equals("1"))){
            System.out.println("That wasn't a 1! Let's try again");
            input = keyboard.nextLine();
        }
        //teaching about recipes
        System.out.println();
        System.out.println("The second option is to check your recipe book. Here, you can see");
        System.out.println("all the recipes of potions that you have unlocked. When opening a");
        System.out.println("recipe, it will give a short description and show the ingredients in the");
        System.out.println("precise order that they should be put.");
        System.out.println();
        System.out.println("Press 1 and ENTER to continue");
        input = keyboard.nextLine();
        while(!(input.equals("1"))){
            System.out.println("That wasn't a 1! Let's try again");
            input = keyboard.nextLine();
        }
        //teaching about inventory
        System.out.println();
        System.out.println("Finally, you can check your inventory to see what ingredients you have");
        System.out.println("on hand. Oh my, here comes a customer. Let's use our skills to make some money!");
        System.out.println();
        System.out.println("Press 1 to see what they want");
        input = keyboard.nextLine();
        while(!(input.equals("1"))){
            System.out.println("That wasn't a 1! Don't keep your customer waiting!");
            input = keyboard.nextLine();
        }
        //dialogue from customer
        System.out.println();
        System.out.println("Hello there. I got into a little bit of a fight last night, and was");
        System.out.println("hoping you could supply me a HEALTH potion. I'll pay you, of course.");
        //teaching how to access recipe book
        System.out.println();
        System.out.println("Hmm... a HEALTH potion. Select 2 to check your recipes to see");
        System.out.println("how you can make one.");
        System.out.println();
        System.out.println("(1) Brew  (2) Recipes  (3) Check inventory (4) Sorry! Can't serve");
        input = keyboard.nextLine();
        while(!(input.equals("2"))){
            System.out.println("That wasn't a 2! Don't keep your customer waiting!");
            input = keyboard.nextLine();
        }
        //selecting recipe screen
        System.out.println("Select a recipe to learn more about:");
        System.out.println("(1) Health potion");
        System.out.println("(2) ????");
        input = keyboard.nextLine();
        while(!(input.equals("1"))){
            System.out.println("We want to check the health potion.");
            input = keyboard.nextLine();
        }
        //recipe screen
        System.out.println();
        System.out.println("A potion that can treat wounds, diseases, and other");
        System.out.println("injuries");
        System.out.println();
        System.out.println("Ingredients:");
        System.out.println("sugar bark");
        System.out.println("catfish whiskers");
        System.out.println("cattail shavings");
        //teaching how to access inventory
        System.out.println();
        System.out.println("Great! Keep those ingredients in mind. Let's check our inventory to see if");
        System.out.println("you have everything.");
        System.out.println();
        System.out.println("(1) Brew  (2) Recipes  (3) Check inventory  (4) Sorry! Can't serve");
        input = keyboard.nextLine();
        while(!(input.equals("3"))){
            System.out.println("We want to check our inventory");
            input = keyboard.nextLine();
        }
        //check inventory method being called
        System.out.println();
        System.out.println("Gold: 10.0");
        System.out.println("Sugar bark: 1");
        System.out.println("Catfish whiskers: 1");
        System.out.println("Cattail shavings: 1");
        System.out.println();
        //teaching how to access brewing
        System.out.println();
        System.out.println("It looks like we got everything! Let's hit the brew button and");
        System.out.println("make that HEALTH potion!");
        System.out.println();
        System.out.println("(1) Brew  (2) Recipes  (3) Check inventory (4) Sorry! Can't serve");
        input = keyboard.nextLine();
        while(!(input.equals("1"))){
            System.out.println("We want to brew a potion");
            input = keyboard.nextLine();
        }
        //brewing recipe. This will be a real method in the game, but the tutorial is an exception
        System.out.println("Put in your three ingredients on separate lines.");
        System.out.println("Note: order and spelling DO matter");
        String a = keyboard.nextLine();
        System.out.println();
        String b = keyboard.nextLine();
        System.out.println();
        String c = keyboard.nextLine();
        System.out.println();
        //making sure the user put the right ingredients in the right order. The tutorial
        //is case sensitive, but it will not be in the real game
        while(!(a.equals("sugar bark"))||!(b.equals("catfish whiskers"))||!(c.equals("cattail shavings"))){
            System.out.println("You made a mistake when making your potion. Here are");
            System.out.println("some more ingredients.");
            System.out.println("Remember: sugar bark, catfish whiskers, cattail shavings");
            System.out.println("(Some features, such as allowing capital letters, are disabled for the tutorial)");
            System.out.println();
            System.out.println("Put in your three ingrediants on separate lines.");
            System.out.println("Note: order and spelling DO matter");
            a = keyboard.nextLine();
            System.out.println();
            b = keyboard.nextLine();
            System.out.println();
            c = keyboard.nextLine();
            System.out.println();
        }
        //serving screen. This will always show after brewing a potion
        System.out.println("You made a HEALTH potion");
        System.out.println("Would you like to serve this potion?");
        System.out.println("(1) Yes  (2) No");
        input = keyboard.nextLine();
        while(!(input.equals("1"))){
            System.out.println("Why don't you want to serve it?");
            input = keyboard.nextLine();
        }
        //customer thank you. Each customer will have an initial dialogue and a response
        //that depends on whether the potion type is correct 
        System.out.println();
        System.out.println("Thank you so much for the potion. It'll fix me right");
        System.out.println("up. Here's 10 gold for your hard work.");
        //adding gold
        Inventory.getInstance().addGold(10);
        //closing shop
        System.out.println();
        System.out.println("Great job! You successfully made a customer happy. I think");
        System.out.println("it's time to close the shop for today. Meet me outside the shop");
        System.out.println("and I'll teach you how you can explore.");
        System.out.println();
        System.out.println("Press 1 to go outside");
        input = keyboard.nextLine();
        while(!(input.equals("1"))){
            System.out.println("What are you waiting for? Go outside!");
            input = keyboard.nextLine();
        }
        //these dashed lines will transition shopkeeper and exploration phases
        System.out.println("---------------------------------------------------------------------");
        //teaching about after shop activities
        System.out.println("After your shop closes, you need to go out and get more ingredients,");
        System.out.println("potion recipes, or sometimes even rare items. To do this, you can");
        System.out.println("either use gold in the shop or forage and explore in different");
        System.out.println("biomes, each giving its own special resources.");
        System.out.println();
        System.out.println("Press 1 to continue");
        input = keyboard.nextLine();
        while(!(input.equals("1"))){
            System.out.println("That's not a 1! Let's try again.");
            input = keyboard.nextLine();
        }
        //teaching about after shop activities. Also, how to access swamp
        System.out.println();
        System.out.println("You can only perform 3 actions, so choose them wisely!");
        System.out.println("How about for tonight, we start by foraging in the swamp.");
        System.out.println("Press 2 to enter the swamp.");
        System.out.println();
        System.out.println("(1) Forest  (2) Swamp  (3) Shop");
        System.out.println();
        input = keyboard.nextLine();
        while(!(input.equals("2"))){
            System.out.println("Let's enter into the swamp!");
            input = keyboard.nextLine();
        }
        //display of resources. This will always show when entering a biome
        System.out.println();
        System.out.println("Common Items:");
        System.out.println("frog legs, catfish whiskers, cattail shavings, newt tail");
        System.out.println();
        System.out.println("Rare Items:");
        System.out.println("cthulhu tentacles, blood lotus");
        System.out.println();
        System.out.println("Press 1 to forage");
        System.out.println("(1) Forage  (2) Explore  (3) Back");
        System.out.println();
        input = keyboard.nextLine();
        while(!(input.equals("1"))){
            System.out.println("We should forage in the swamp.");
            input = keyboard.nextLine();
        }
        //completing forage screen. This will always show after foraging it has
        //the success of the forage along with the items gotten
        System.out.println();
        System.out.println("An average forage. You gained 3 items.");
        System.out.println("cattail shavings x2");
        System.out.println("frog legs x1");
        System.out.println();
        Inventory.getInstance().addCatTailShavings(2);
        Inventory.getInstance().addFrogLegs(1);
        //teaching about foraging and shopping
        System.out.println("Great work! While foraging, you have a chance to get");
        System.out.println("anywhere between 2-4 items, although special items will allow");
        System.out.println("you to increase this amount.");
        System.out.println("Now, let's go use some money to buy something from the shop.");
        System.out.println("The shop is nice because you will consistently get 3 items, and");
        System.out.println("those items will be from both biomes. You can also buy in bulk");
        System.out.println("to get double the items for only one action. You can also");
        System.out.println("exclusively buy rare items or new recipes.");
        System.out.println("Press 3 to enter the shop.");
        System.out.println();
        System.out.println("(1) Forest  (2) Swamp  (3) Shop");
        System.out.println();
        input = keyboard.nextLine();
        while(!(input.equals("3"))){
            System.out.println("We should buy something in the shop");
            input = keyboard.nextLine();
        }
        //shop screen. This will always show before shopping
        System.out.println();
        System.out.println("You have 20.0 gold");
        System.out.println();
        System.out.println("Press 1 to buy the common pack and spend 10 gold");
        System.out.println("(1) Common Pack 10G  (2) Big Common Pack 20G  (3) Rare Pack 20G");
        System.out.println("(4) New Recipe 30G  (5) Back");
        System.out.println();
        input = keyboard.nextLine();
        while(!(input.equals("1"))){
            System.out.println("We should buy the common pack. It's cheaper.");
            input = keyboard.nextLine();
        }
        //completed shopping screen. This will always show after shopping
        System.out.println();
        System.out.println("You received:");
        System.out.println("toadstool x1");
        System.out.println("mandrake x1");
        System.out.println("cattail shavings x1");
        Inventory.getInstance().addGold(-10);
        //vague foreshadowing to exploring, and teaching to forage in the forest
        //I did not want to have them explore, as this would require me to make either a
        //separate tutorial story or to spoil and already made adventure.
        //Also, the press 1 to continue has ceased, as hopefully user has learned by
        //now and it will not show in real game
        System.out.println();
        System.out.println("Nice job! Now, the last option would be to explore a biome,");
        System.out.println("but I'm too lazy for that right now. You should try it for");
        System.out.println("yourself tomorrow. How about we end instead by foraging");
        System.out.println("in the forest.");
        System.out.println();
        System.out.println("(1) Forest  (2) Swamp  (3) Shop");
        System.out.println();
        input = keyboard.nextLine();
        while(!(input.equals("1"))){
            System.out.println("Let's go to the forest.");
            input = keyboard.nextLine();
        }
        //forest display of resources. Can see that it is different from swamp
        System.out.println();
        System.out.println("Common Items:");
        System.out.println("toadstool, sugar bark, nightshade, mandrake");
        System.out.println();
        System.out.println("Rare Items:");
        System.out.println("unicorn blood, phoenix feather");
        System.out.println();
        System.out.println("(1) Forage  (2) Explore  (3) Back");
        System.out.println();
        input = keyboard.nextLine();
        while(!(input.equals("1"))){
            System.out.println("We should forage in the forest.");
            input = keyboard.nextLine();
        }
        //example of outstanding forage and rare item to make user happy
        System.out.println();
        System.out.println("An outstanding forage! You gained 4 items.");
        System.out.println("sugar bark x1");
        System.out.println("nightshade x1");
        System.out.println("mandrake x1");
        System.out.println("phoenix feather x1");
        //don't want tutorial ppl to have an extra advantage, so starting for 
        //everyone can be the same
        System.out.println();
        System.out.println("That completes our little adventure together. I think I'll");
        System.out.println("keep all the cool items you got, as payment for my help.");
        System.out.println("That way, you can start fresh. Good luck with your shop!");
    }
}