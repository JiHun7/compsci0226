/**
 /* This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"Ace", "Two", "Three", "Four", "Five"};
		String[] suits = {"Spade", "Heart"};
		int[] pointv = {1,2,3,4,5};
		
		String[] rankstwo = {"Six", "Seven", "Eight", "Nine", "Ten"};
		String[] suitstwo = {"Clover", "Diamond"};
		int[] pointvtwo = {6, 7, 8, 9, 10};
		
		String[] ranksthree = {"Jack", "Queen", "King"};
		String[] suitsthree = {"Spade", "Heart", "Clover", "Diamond"};
		int[] pointvthree = {11, 12, 13};
		
		Deck A1 = new Deck(ranks, suits, pointv);
		Deck A2 = new Deck(rankstwo, suitstwo, pointvtwo);
		Deck A3 = new Deck(ranksthree, suitsthree, pointvthree);

Card C1 = A1.deal();
Card C2 = A2.deal();
Card C3 = A3.deal();

System.out.println(A1.isEmpty());
System.out.println(A1.size());
System.out.println(C1.toString());
System.out.println(A1.toString());

System.out.println(A2.isEmpty());
System.out.println(A2.size());
System.out.println(C2.toString());
System.out.println(A2.toString());

System.out.println(A3.isEmpty());
System.out.println(A3.size());
System.out.println(C3.toString());
System.out.println(A3.toString());
		
		
	}
}