/**
 * 
 */
package shoppingcart;
//***************************************************************
//Shop.java
//
//Uses the Item class to create items and add them to a shopping
//cart stored in an ArrayList.
//***************************************************************
import java.util.ArrayList;
import java.util.Scanner;
/**
 * <title>Shop.java</title>
 * <p>Uses the Item class to create items and add them to a shopping
 * cart stored in an ArrayList.</p>
 * @author Rosanna Wubs
 * @version 1.0
 *
 */
public class Shop {
    public static void main (String[] args) {
    Item item;
    String itemName;
    double itemPrice;
    int quantity;
    double totalCost = 0;
    ArrayList<Item> cart = new ArrayList<Item>();
    // incrementer for getting cart items
    int i; 
    Scanner scan = new Scanner(System.in);
    String keepShopping = "y";
    do {
        System.out.print ("Enter the name of the item: ");
        itemName = scan.nextLine();
        System.out.print ("Enter the unit price: ");
        itemPrice = scan.nextDouble();
        System.out.print ("Enter the quantity: ");
        quantity = scan.nextInt();
        item = new Item(itemName,itemPrice,quantity);
        // *** create a new item and add it to the cart
        cart.add (item);
        int size = cart.size();
        //*** print the contents of the cart object using println
        System.out.println ("The cart's content has " + size + " items:");
        for(i=0;i<size;i++) {
            System.out.println ("" + cart.get(i));
        }
        totalCost = totalCost + item.getTotal();
        //*** print the cart's total using println
        System.out.println ("The total is: " + totalCost);
        System.out.print ("Continue shopping (y/n)? ");

        scan.nextLine();
        keepShopping = scan.nextLine();
        }
    while (keepShopping.equals("y"));

    }
}
