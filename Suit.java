

/**
 * Write a description of class Suit here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public enum Suit
{
    // instance variables - replace the example below with your own
    CLUBS(2),
    DIAMONDS(3),
    HEARTS(4),
    SPADES(1);
    
    private final int pointValue;
    /**
     * Constructor for objects of class Rank
     */
    private Suit(int pointValue)
    {
        // initialise instance variables
        this.pointValue = pointValue;
    }

    public int getPointValue()
    {
        return pointValue;
    }
}
