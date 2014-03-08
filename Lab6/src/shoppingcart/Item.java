/**
 * 
 */
package shoppingcart;

import java.text.NumberFormat;
/**
 * <p>Represents an item in a shopping cart.</p>
 * @author Rosanna Wubs
 * @version 1.0
 *
 */
public class Item {

    private String name;
    private int quantity; //the quantity purchased
    private double price;
    /**
     * <p>Create a new item with the given attributes.</p>
     * @param args will pass in a name, price and quantity
     */
    public Item(String itemName, double itemPrice, int numPurchased) {
        name = itemName;
        price = itemPrice;
        quantity = numPurchased;
    }
    /**
     * <p>Return a string with the information about the item</p>
     */
    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return (name + "\t" + fmt.format(price) + "\t" + quantity + "\t"
        + fmt.format(price*quantity));
    }
    // -----------------------------------------------
    // Returns the unit price of the item
    // -----------------------------------------------
    public double getPrice() {
        return price;
    }
    // -----------------------------------------------
    // Returns the name of the item
    // -----------------------------------------------
    public String getName() {
            return name;
    }
    // -----------------------------------------------
    // Returns the quantity of the item
    // -----------------------------------------------
    public int getQuantity() {
            return quantity; 
    }
    // -----------------------------------------------
    // Returns the total price for items of that kind
    // -----------------------------------------------
    public double getTotal() {
            return getPrice() * getQuantity();
    }
}
