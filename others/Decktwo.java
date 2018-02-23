import java.util.*;
public class Decktwo
{
   ArrayList<Card> cards = new ArrayList<Card>();
   private int size;
   public cards Deck(String[] ranks, String[] suits, int[] values)
   {
        for(int i=0; i<ranks.length; i++)
        {
            for(String suitString : suits)
            {
                Card adder = new Card(ranks[i], suitString, values[i]);
                cards.add(adder);
            }
        }
        size = cards.size();
        shuffle();
   }   
   public void shuffle()
   {
       for(int k=cards.size()-1; k>0; k--)
       {
           int howMany = k+1;
           int start = 0;
           int randPos = (int) (Math.random()*howMany) + start;
           Card temp = cards.get(k);
           cards.set(k, cards.get(randPos));
           cards.set(randPos, temp);
        }
       size = cards.size(); 
   }
   public Card deal()
   {
       if(cards.isEmpty())
           return null;
       else
       {
           size--;
           Card c = cards.get(size);
           return c;
       }
   }
   public boolean isEmpty()
   {
       return size ==0 ;
   }
    public int size()
   {
        return cards.size();
   }
   @Override
    public String toString() {
        String rtn = "size = " + size + "\nUndealt cards: \n";

        for (int k = size - 1; k >= 0; k--) {
            rtn = rtn + cards.get(k);
            if (k != 0) {
                rtn = rtn + ", ";
            }
            if ((size - k) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\nDealt cards: \n";
        for (int k = cards.size() - 1; k >= size; k--) {
            rtn = rtn + cards.get(k);
            if (k != size) {
                rtn = rtn + ", ";
            }
            if ((k - cards.size()) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\n";
        return rtn;
    }
}