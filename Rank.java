
/**
 * Write a description of class Rank here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public enum Rank
{
    // instance variables - replace the example below with your own
    ACE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(0),
    QUEEN(0),
    KING(0);

    private final int pointValue;
    /**
     * Constructor for objects of class Rank
     */
    private Rank(int pointValue)
    {
        // initialise instance variables
        this.pointValue = pointValue;
    }

    public int getPointValue()
    {
        return pointValue;
    }
}
