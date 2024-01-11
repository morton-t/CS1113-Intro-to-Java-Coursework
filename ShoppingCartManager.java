import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCartManager {
   public static void printMenu() {
      System.out.println("MENU\n" +
                           "a - Add item to cart\n" + 
                           "d - Remove item from cart\n" + 
                           "c - Change item quantity\n" + 
                           "i - Output items' descriptions\n" + 
                           "o - Output shopping cart\n" + 
                           "q - Quit\n");
      
      return;
   }
   
   public static void executeMenu(char menuChoice, ShoppingCart myCart, Scanner scnr) {
      if (menuChoice == 'q') {
         return;
      }
      else if (menuChoice == 'a') {
         System.out.println("ADD ITEM TO CART");
         
         System.out.println("Enter the item name:");
         String name = scnr.nextLine();
         
         System.out.println("Enter the item description:");
         String desc = scnr.nextLine();
         
         System.out.println("Enter the item price:");
         int price = scnr.nextInt();
         scnr.nextLine();
         System.out.println("Enter the item quantity:");
         int qty = scnr.nextInt();
         scnr.nextLine();
         
         ItemToPurchase item = new ItemToPurchase(name, desc, price, qty);
         myCart.addItem(item);
         
      }
      
      else if (menuChoice == 'd') {
         System.out.println("REMOVE ITEM FROM CART");
         System.out.println("Enter name of item to remove:");
         String name = scnr.nextLine();
         myCart.removeItem(name);
      }
      
      else if (menuChoice == 'c') { 
         System.out.println("CHANGE ITEM QUANTITY");
         System.out.println("Enter the item name:");
         String name = scnr.nextLine();
         System.out.println("Enter the new quantity:");
         int qty = scnr.nextInt();      
      }
      
      else if (menuChoice == 'i') {
         System.out.println("OUTPUT ITEMS' DESCRIPTIONS");
         myCart.printDescriptions();

      }
      else if (menuChoice == 'o') {
         myCart.printTotal();
      }
      
      return;
   } 
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
     
      System.out.println("Enter Customer's Name:");
      String custName = scnr.nextLine();
           
      System.out.println("Enter Today's Date:");
      String currDate = scnr.nextLine();
      System.out.println();
      ShoppingCart myCart = new ShoppingCart(custName, currDate);
      
      System.out.println("Customer Name: " + myCart.getCustomerName());
      System.out.println("Today's Date: " + myCart.getDate());
      System.out.println();
      
      printMenu();
      char menuChoice = ' ';

      while (menuChoice != 'q') {
         System.out.println("Choose an option:");
         menuChoice = scnr.nextLine().charAt(0);
         if (menuChoice == 'q') {
            break;
         }
         else if (menuChoice != 'a' && menuChoice != 'o' && menuChoice != 'i' && menuChoice != 'c' && menuChoice != 'd') {
            continue;
         }
         executeMenu(menuChoice, myCart, scnr);
         printMenu();
      }
      
   }   
}