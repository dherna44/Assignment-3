//Super class.
public class Item {
    private String itemCode;
    private String Name;

    //constructor method for the Item Superclass.
    public Item(String itemCode, String Name){
        this.itemCode = itemCode;
        this.Name = Name;
    }

    //display method for itemCode and Name.
    public void display(){
        System.out.println("Item Code: " + this.itemCode + "Name: " + this.Name);
    }
}
