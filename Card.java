
/**
 * Write a description of class Card here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Card
{
    // instance variables - replace the example below with your own
    private Suit suit;
    private Rank rank;


    public Card(Rank val, Suit sui)
    {
        suit = sui;
        rank = val;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param n  Inputed number of card
     * @return    the rank of the card
     */
    public Rank getRank()
    {
        return rank;
    }
    /**
     * getter to get suit of the card
     */
    public Suit getSuit()
    {
        return suit;
    }
    public boolean matches(Card other)
    {
        return this.rank == other.rank && this.suit == other.suit;
    }
    public String print(){
        return(suit.name().toLowerCase() +"of"+rank.name().toLowerCase());
    }
}
