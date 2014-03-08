/**
 * 
 */
package votingcounterrev;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * <p>Counts and matches the votes for two
 *  candidates.</p>
 * @author Rosanna Wubs
 * @version 2.0
 *
 */
        
public class VoteButtonPanel extends JPanel {
    /**
     * <p>Creates a new button for first candidate.</p>
     */
    private JButton candidate1Button;
    /**
     * <p>Creates a new button for second candidate.</p>
     */
    private JButton candidate2Button;
    /**
     * <p>Creates candidate.</p>
     */
    private Candidate candidate1;
    /**
     * <p>Creates another candidate.</p>
     */
    private Candidate candidate2;
    /**
     * <p>Will create grey panel for buttons and 
     * let actions change VoteCounerPanel.</p>
     * @param args
     */
    public VoteButtonPanel() {
        // sets up the buttons in the panel
        
        candidate1 = new Candidate("Joe");
        candidate2 = new Candidate("Sam");
        candidate1Button = new JButton("Vote for " + candidate1.getName());
        candidate2Button = new JButton("Vote for " + candidate2.getName());
        ButtonListener listener = new ButtonListener();
        candidate1Button.addActionListener(listener);
        candidate2Button.addActionListener(listener);
      

        setPreferredSize(new Dimension(200,100));
        setBackground(Color.gray);
        add(candidate1Button);
        add(candidate2Button);
    }
    /**
     * <p>Personalized listener class that will listen for click on button.</p>
     * @author Rosanna Wubs
     */
    private class ButtonListener implements ActionListener {
        /**
         * <p>When button clicked, add the votes and change text data.</p>
         * @param event the click of the mouse.
         */
        public void actionPerformed(ActionEvent event) {
            String winner;
            
            if (event.getSource() == candidate1Button) {
                candidate1.addVote();
            }
            else {
                candidate2.addVote();
            }
            
            VoteCounterPanel.setStatsMessage(candidate1.getStats() 
                    + " " + candidate2.getStats());
            
            if (candidate1.getVotes() != candidate2.getVotes()) {
               winner = (candidate1.getVotes() > candidate2.getVotes())
                       ? candidate1.getName() : candidate2.getName();
               VoteCounterPanel.setWinMessage("The winner is: " + winner);
            }
            else {
                VoteCounterPanel.setWinMessage(candidate1.getName() 
                        + " and " + candidate2.getName() + " are tied.");
            }

        }
    
    }
    
}
