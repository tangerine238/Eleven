
/**
 * Write a description of class Deck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Deck
{
    // instance variables - replace the example below with your own
    private int size;
    private ArrayList<Card> deck = new ArrayList<Card>();

    /**
     * Constructor for objects of class Deck
     */
    public Deck(Rank[] rank, Suit[] suits)
    {
        // initialise instance variables
        for (Suit s : suits){
            for (Rank r : rank){
                deck.add(new Card(r, s));
            }
        }
        size = deck.size();
        this.shuffle();
    }

    public void shuffle()
    {
        
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public int size(){
        return size;
    }
    public Card deal(){
        if (!this.isEmpty()){
            size --;
            return deck.get(size);
        }
        else{
            return null;
        }
    }
    public void perfectShuffle(){
        Card[] shuffled = new Card[size];
        int k = 0;
        for (int j = 0; j <= 25; j++){
            
            k = k + 2;
        }
    }
}
