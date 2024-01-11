import java.util.ArrayList;

public class ShoppingCart{
   ArrayList<ItemToPurchase> cartItems = new ArrayList<ItemToPurchase>();
   private String customerName;
   private String currentDate;
   
   
   public ShoppingCart() {
      this("none", "January 1, 2016");
   }
      
   public ShoppingCart(String name, String date) {
      this.customerName = name;
      this.currentDate = date;
      
   }
   public String getCustomerName() {
      return customerName;
   }
   
   public String getDate() {
      return currentDate;
   }


   public void addItem(ItemToPurchase item) {
      cartItems.add(item);
      return;      
   }
   
   public void removeItem(String item) {
      if (cartItems.contains(item)) {
         cartItems.remove(item);
      }
      else {
       System.out.println("Item not found in cart. Nothing removed.");
      }
      return;
   }

   public void modifyItem(ItemToPurchase item) {
      if (cartItems.contains(item)) {
         item.setDescription("none");
         item.setName("none"); 
         item.setPrice(0); 
         item.setQuantity(0);
      }
      else {
         System.out.println("Item not found in cart. Nothing modified.");
      }
      return;
   }
   
   public int getNumItemsInCart() {
      int numItems = 0;
      for (int i = 0; i < cartItems.size(); ++i) {
         ItemToPurchase item = cartItems.get(i);
         numItems += item.getQuantity();
      }
      return numItems;   
   }
   
   public int getCostOfCart() {
      int price = 0;
      for (int i = 0; i < cartItems.size(); ++i) {
         ItemToPurchase item = cartItems.get(i);
         price += (item.getPrice() * item.getQuantity());
      }
      return price;
   }
   
   public void printTotal() {
      System.out.println("OUTPUT SHOPPING CART");
      System.out.println(getCustomerName() + "'s Shopping Cart - " + getDate());
      System.out.println("Number of Items: " + getNumItemsInCart());
      System.out.println();
      
      if (!cartItems.isEmpty()) {
         for (int i = 0; i < cartItems.size(); ++i) {
            ItemToPurchase item = cartItems.get(i);
            item.printItemCost();
         }
      }
      else {
         System.out.println("SHOPPING CART IS EMPTY");
      }
      System.out.println();
      System.out.println("Total: $" + getCostOfCart());
      System.out.println();
      return;   
   }
   
   public void printDescriptions() {
      System.out.println(getCustomerName() + "'s Shopping Cart - " + getDate());
      System.out.println("\nItem Descriptions");
      
      for (int i = 0; i < cartItems.size(); ++i) {
         ItemToPurchase item = cartItems.get(i);
         System.out.println(item.getDescription());
      }
     return;
   }
}
