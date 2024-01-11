public class ItemToPurchase{
   private String itemDescription;
   private String itemName;
   private int itemPrice;
   private int itemQuantity;


   public ItemToPurchase() {
         this("none", "none", 0, 0);
   }
      
   public ItemToPurchase(String name, String description, int price, int quantity) {
      this.itemDescription = description;
      this.itemName = name;
      this.itemPrice = price;
      this.itemQuantity = quantity;
   
   }   
   
   public void setDescription(String description) {
      this.itemDescription = description;
      return;
   }
   
   public String getDescription() {
      return this.itemDescription;   
   }
   
   public void printItemCost() {
      System.out.println(getName() + " " + getQuantity() + " @ $" + getPrice() + " = $"
                         + (getPrice() * getQuantity()));
      return;
   }
   
   public void printItemDescription() {
      System.out.println(getName() + ": " + getDescription());
      return;
   }   
   
   public String getName() {
      String name = this.itemName;
      return name;
   }
   
   public void setName(String inputName) {
      this.itemName = inputName;
      return;
   }
   
   public int getQuantity() {
      int quantity = this.itemQuantity;
      return quantity;
   }
   
   public void setQuantity(int inputQuantity) {
      this.itemQuantity = inputQuantity;
      return;
   }
   
   public int getPrice() {
      int price = this.itemPrice;
      return price;
   }
   
   public void setPrice(int inputPrice) {
      this.itemPrice = inputPrice;
      return;
   }
}