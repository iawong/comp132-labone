package lab01.voting;

import static org.junit.Assert.*;
import org.junit.*;

public class CandidateTest {

    /*
     * Candidate for the test fixture. This variable is a field and is thus
     * available in all of the tests.
     */
    private Candidate c1;

    @Before
    public void setUp() throws Exception {
        /*
         * Construct all of the objects being used in the test fixture here.
         */
        c1 = new Candidate("Joe", Candidate.DEMOCRAT);
    }

    @Test
    public void testTwoArgConstructor() {
        assertEquals("Name not set", "Joe", c1.getName());
        assertEquals("Party not set", Candidate.DEMOCRAT, c1.getParty());
        assertEquals("Votes not set", 0, c1.getVotes());
    }

    @Test
    public void testThreeArgConstructor() {
        Candidate c1 = new Candidate("Joe", Candidate.DEMOCRAT, 10);
        assertEquals("Name not set", "Joe", c1.getName());
        assertEquals("Party not set", Candidate.DEMOCRAT, c1.getParty());
        assertEquals("Votes not set", 10, c1.getVotes());
    }

    @Test
    public void testSetParty() {
        c1.setParty(Candidate.INDEPENDENT);
        assertEquals("Party not set", Candidate.INDEPENDENT, c1.getParty());
    }

    @Test
    public void testIncreaseVotesNoArgs() {
        c1.increaseVotes();
        assertEquals("Votes not increased", 1, c1.getVotes());
        c1.increaseVotes();
        assertEquals("Votes not increased", 2, c1.getVotes());
    }
    
    @Test
    public void testIncreaseVotesOneArg() {
        c1.increaseVotes(5);
        assertEquals("Votes not increased", 5, c1.getVotes());
        c1.increaseVotes(10);
        assertEquals("Votes not increased", 15, c1.getVotes());
    }
    
    @Test
    public void testDefeatedTrue() {
        fail("Not implemented");
    }
    
    @Test
    public void testDefeatedFalse() {
        fail("Not implemented");
    }
    
    @Test
    public void testDefeatedTie() {
        fail("Not implemented");
    }
}
