//Grocery sub class.
public class Grocery extends Item implements Discount, Tax {
    private double price;
    private double units;
    private double discount;

    //Constructor for Grocery sub class.
    public Grocery (String itemCode, String Name, double price, double units, double discount){
        super(itemCode, Name);
        this.price = price;
        this.units = units;
        this.discount = discount;
    }

    //Method to calculate the Discount, declared in Discount Interface.
    @Override
    public double computeDiscount(){
        return ((price * units) * (discount / 100.00));
    }

    //Method to calculate the Tax, declared in Tax Interface.
    @Override
    public double computeTax(){
        return 0;
    }

    //Method to calculate the final price for an item after any discounts and/or taxes.
    public double computeTotalPrice(){
        double discount = computeDiscount();
        return ((price * units) - discount + computeTax());
    }

    //Method to display final information for a Grocery item.
    public void displayGrocery(){
        super.display();
        System.out.println("Units: "+this.units+"\nPrice: $"+this.price+"\nDiscount: "+this.discount+"%\nTax: 0");
    }
}
