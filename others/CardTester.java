/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card C1 = new Card("three", "club", 3);
		Card C2 = new Card("two", "heart", 2);
		if(C1.matches(C2))
		{
		    System.out.print("Cards are same");
		  }
		else
		{
		    System.out.print("Not same");
		   
		
		
	}
}
}

