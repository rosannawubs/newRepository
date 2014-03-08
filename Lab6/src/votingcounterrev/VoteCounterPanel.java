/**
 * 
 */
package votingcounterrev;

import java.awt.*;
import javax.swing.*;
/**
 * <p>Sets up a new panel for buttons and
 * text to count the number of votes and for who.</p>
 * @author Rosanna Wubs
 * @version 2.0
 *
 */
public class VoteCounterPanel extends JPanel {
    /**
     * <p>sets instance data of the counter 
     * panel for text (stats).</p>
     */
    private static JLabel statisticsText = new JLabel();
    /**
     * <p>sets instance data of the counter 
     * panel for text (who's winning).</p>
     */
    private static JLabel winnerText = new JLabel();
/**
 * <p>Create the panel content.</p>
 * @param args
 */
    public VoteCounterPanel() {
        // will add the buttons panel to the window frame panel
        
        VoteButtonPanel buttonPanel = new VoteButtonPanel();

        
        add(buttonPanel);
        add(statisticsText);
        add(winnerText);

       
        
        setPreferredSize(new Dimension(300,200));

    }
    /**
     * <p>Sets the text of current 
     * candidate name and vote amount.</p>
     * @param stringin passed in text to display.
     */
    public static void setStatsMessage(String stringin) {
        statisticsText.setText(stringin);
        
    }
    /**
     * <p>Sets the text of who's winning.</p>
     * @param stringin passed in text to display.
     */
    public static void setWinMessage(String stringin) {
        winnerText.setText(stringin);
    }
    

}
