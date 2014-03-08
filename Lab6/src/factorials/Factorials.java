/**
 * 
 */
package factorials;

import java.util.Scanner;
/**
 * <p>Prints out the factorials of a number.</p>
 * @author Rosanna Wubs
 * @version 1.0
 *
 */
public class Factorials {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int i,n;
        int total = 1;
        //prompt user for a factorial
        System.out.println("Enter a factorial: ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        
        //keep asking for new number till number is valid. (a factorial)
        while (n<0) {
            System.out.println("That is not valid. Enter another factorial: ");
            n = scan.nextInt();
        }
            for (i=1;i<n;i++) {
                //compute the factorials.
                System.out.print (i + "*");
                total = total*i;
            }
            
            //display the factorials.
            System.out.print(n + "=" + total*i);
        }


}
