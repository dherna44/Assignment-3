//Clothing sub class
public class Clothing extends Item implements Discount, Tax{
    private String brand;
    private double price;
    private double units;
    private double discount;
    final double taxp = 8.5;

    //Constructor for Clothing sub class.
    public Clothing (String itemCode, String Name, String brand, double price, double units, double discount){
        super(itemCode, Name);
        this.brand = brand;
        this.price = price;
        this.units = units;
        this.discount = discount;
    }

    //Method to apply discount for clothing, if applicable.
    @Override
    public double computeDiscount() {
        return ((price * units) * (discount/100.00));
    }

    //Method to calculate Tax for clothing.
    @Override
    public double computeTax(){
        return (((price * units) - computeDiscount()) * (taxp /100));
    }

    //Method to calculate final price for an item.
    double computeTotalPrice(){
        return (((price * units) - computeDiscount() + computeTax()));
    }

    //Method to display final Clothing item information.
    public void displayClothing(){
        super.display();
        System.out.println("Units: "+this.units+"\nPrice: $"+this.price+"\nBrand: "+this.brand+"\nDiscount: "
                +this.discount+"%");
    }

}
