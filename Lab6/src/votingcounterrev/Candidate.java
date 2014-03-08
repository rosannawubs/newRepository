/**
 * 
 */
package votingcounterrev;

/**
 * <p>Creates a new candidate.</p>
 * @author Rosanna Wubs
 * @version 2.0
 *
 */
public final class Candidate {
    /**
     * <p>Declare instance data, votes.</p>
     */
    private int votes;
    /**
     * <p>Declare instance data, name.</p>
     */
    private String name;
    /**
     * <p>Constructs a new candidate object.</p>
     * @param namein the name of candidate
     */
    public Candidate(String namein) {
        
        name = namein;
    }
    /**
     * <p>Will add a vote for that candidate.</p>
     */
    public void addVote() {
        votes++;
    }
    /**
     * <p>Will get the votes from the candidate data.</p>
     * @return current votes of this candidate.
     */
    public int getVotes() {
        return votes;
    }
    /**
     * <p>Will set votes to the required amount.</p>
     * @param votesin is the number of votes we want
     */
    public void setVotes(int votesin) {
        votes = votesin;
    }
    /**
     * <p>Will get the name of the candidate.</p>
     * @return the name.
     */
    public String getName() {
        return name;
    }
    /**
     * <p>Will get the stats of this candidate.</p>
     * @return returns a string of stats data.
     */
    public String getStats() {
        return name + " has " + votes + " votes.";
    }

}
