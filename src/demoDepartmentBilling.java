//Class with main method to call the super class and its sub classes.
public class demoDepartmentBilling {
    public static void main(String[] args){

        //Objects for Grocery sub class.
        Grocery groceries1 = new Grocery ("11\n","Bread",1.50,2,0);
        Grocery groceries2 = new Grocery ("12\n","Apple", 0.75,6,1);

        //Objects for Clothing sub class.
        Clothing clothes1 = new Clothing ("21\n", "Jeans", "Levis", 35, 1,0);
        Clothing clothes2 = new Clothing ("22\n","Dress Shirt", "Izod", 25, 2, 10);

        //Calculates Total Amount Due for all items.
        double totalAmtDue;
        totalAmtDue = (groceries1.computeTotalPrice() + groceries2.computeTotalPrice()
                + clothes1.computeTotalPrice() + clothes2.computeTotalPrice());

        //Displays the Grocery and Clothing items.
        groceries1.displayGrocery();
        groceries2.displayGrocery();
        clothes1.displayClothing();
        clothes2.displayClothing();

        //Prints out the Total Amount Due for all items.
        System.out.println("\nTotal Amount Due: $"+ totalAmtDue);
    }
}
