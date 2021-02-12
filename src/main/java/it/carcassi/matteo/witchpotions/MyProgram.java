package it.carcassi.matteo.witchpotions;

import java.util.Scanner;
/**
 * Class MyProgram
 * The main class that cycles between each day
 *
 * @author Matteo Carcassi
 * @date 1/24/21
 */
public class MyProgram
{
    public static void main(String[] args)
    {
        //creating scanner
        Scanner keyboard = new Scanner(System.in);
        String input = " ";
        Screens s = new Screens();
        
        System.out.println("Would you like to see the tutorial?");
        System.out.println("(1) Yes  (2) No");
        input = keyboard.nextLine();
        if(input.equals("1")){
            Tutorial.startTutorial();
        }
        Inventory.getInstance().addSugarBark(2);
        Inventory.getInstance().addCatTailShavings(2);
        Inventory.getInstance().addCatFishWhiskers(2);
        int day = 1;
        while(true){
            System.out.println();
            System.out.println("Day " + day);
            System.out.println("Ready to open shop?");
            System.out.println("(1) Yes");
            input = keyboard.nextLine();
            if(!(input.equals("1"))){
                System.out.println("You have to be ready. The shop always opens at this time.");
            }
            while(Customer.getInstance().getCount() != 3){
                System.out.println("A customer is entering.");
                System.out.println("(1) Take order");
                input = keyboard.nextLine();
                if(!(input.equals("1"))){
                    System.out.println("You take their order anyway.");
                }
                Customer.getInstance().customerSelection(day);
                Screens.menu();
                while(Customer.getInstance().isServed() == false){
                
                }
                
            }
            Customer.getInstance().setCount(0);
            System.out.println("It's time to close the shop for today.");
            System.out.println("(1) Continue");
            input = keyboard.nextLine();
            if(!(input.equals("1"))){
                System.out.println("You continue anyway.");
            }
            System.out.println("---------------------------------------------------------------------");
            System.out.println();
            s.eveningScreen(3);
            System.out.println("---------------------------------------------------------------------");
            
            day++;
        }
        
        
        
    }
}