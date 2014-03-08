/**
 * 
 */
package votingcounterrev;

import javax.swing.*;
/**
 * <p>Will count the votes of two 
 * candidates and display winner.</p>
 * @author Rosanna Wubs
 * @version 2.0
 *
 */
public class VoteCounter {

    /**<p>Will create frames/panels for app.</p>
     * @param args passed in to command line.
     */
    public static void main(String[] args) {
        // will open a new window to run application
        JFrame frame = new JFrame("Vote Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        VoteCounterPanel panel = new VoteCounterPanel();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }

}
