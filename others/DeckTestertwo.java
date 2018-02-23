/**
 * This is a class that tests the Deck class.
 */
public class DeckTestertwo
{
    /**
     * The main method in this class checks the Deck operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) 
    {
                System.out.println();
        String[] rank1 = {"10", "1", "2"};
        String[] suit1 = {"Hearts", "Spades", "Diamonds"};
        int[] value1 = {10, 1, 2};
        Deck deck1 = new Deck(rank1, suit1, value1);
        System.out.println("Size is"+deck1.size());
        Card d = deck1.deal();
        System.out.println(d.toString());
        System.out.println("Now the size is"+ deck1.size());
        if(deck1.isEmpty())
        
            System.out.println("The deck is empty");
        
        else
        
            System.out.println("It is not empty.");
        
        for(int i=0; i<8; i++)
        {
        deck1.deal();
        System.out.println("Deal!");
        }
        
        if(deck1.isEmpty())
        {
            System.out.println("The deck is empty");
        }
        else
        {
            System.out.println("It is not empty.");
        }
        
        System.out.println();

        
        String[] rank2 = {"J", "Q", "A"};
        String[] suit2 = {"Clubs", "Spades", "Diamonds"};
        int[] value2 = {11, 12, 13};
        Deck deck2 = new Deck(rank2, suit2, value2);
        System.out.println("Size is"+deck2.size());
        Card q = deck2.deal();
        System.out.println(q.toString());
        System.out.println("Now the size is"+ deck2.size());
        if(deck2.isEmpty())
        
            System.out.println("The deck is empty");
        
        else
        
            System.out.println("It is not empty.");
        
        for(int i=0; i<8; i++)
        {
        deck2.deal();
        System.out.println("Deal!");
        }
        
        if(deck2.isEmpty())
        {
            System.out.println("The deck is empty");
        }
        else
        {
            System.out.println("It is not empty.");
        }
                System.out.println();
        
        String[] rank3 = {"1", "3", "5"};
        String[] suit3 = {"Diamonds", "Spades", "Hearts"};
        int[] value3 = {1, 3, 5};
        Deck deck3 = new Deck(rank3, suit3, value3);

        System.out.println("Size is"+deck3.size());
        Card r = deck3.deal();
        System.out.println(r.toString());
        System.out.println("Now the size is"+ deck3.size());
        if(deck3.isEmpty())
        
            System.out.println("The deck is empty");
        
        else
        
            System.out.println("It is not empty.");
        
        for(int i=0; i<8; i++)
        {
        deck3.deal();
        System.out.println("Deal!");
        }
        
        if(deck3.isEmpty())
        {
            System.out.println("The deck is empty");
        }
        else
        {
            System.out.println("It is not empty.");
        }
    }
}