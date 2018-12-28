import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CommentTest.
 *
 * @author (Nihinlolamiwa Fajemilehin)
 * @version (28th of December 2018)
 */
public class CommentTest
{
    /**
     * Default constructor for test class CommentTest
     */
    public CommentTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    /**
     * Test to see if author and rating are stored correctly when creating a comment
     */
    @Test
    public void testCreateComment()
    {
        Comment comment1 = new Comment("John", "It works as advertised", 4);
        assertEquals("John", comment1.getAuthor());
        assertEquals(4, comment1.getRating());
    }

    /**
     * Test to see if comment upvote works correctly
     */
    @Test
    public void testUpvote()
    {
        Comment comment1 = new Comment("Dupe", "Theis makeup is great", 5);
        comment1.upvote();
        comment1.upvote();
        comment1.upvote();
        assertEquals(3, comment1.getVoteCount());
    }

    /**
     * Test to see if comment downvote works correctly
     */
    @Test
    public void testDownVote()
    {
        Comment comment1 = new Comment("Sam", "I wich I got the newer model, this one sucks!", 2);
        comment1.upvote();
        comment1.upvote();
        comment1.upvote();
        comment1.downvote();
        comment1.downvote();
        assertEquals(1, comment1.getVoteCount());
    }
}



