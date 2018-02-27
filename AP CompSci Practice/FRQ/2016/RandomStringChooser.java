import java.util.Random;          // Correct import, but it's okay not to write it in the real FRQ response!
public class RandomStringChooser 
{
    private String[] received;    // Very good!
    private int length;
    public RandomStringChooser(String[] Array)
    {
        received = Array;         // This only points to where the array is saved!
        length = Array.length;
        
    }
    public String sChooser()
    {
        String[] used = received;
        Random randomGenerator = new Random();
        int randomint = randomGenerator.nextInt(length-1);   // In APCS, you don't get user input as nextInt -- just as parameters
        if(used[randomint] == null)       // Good, let's talk about this further.
        {
            return "None";
        }
        else
        {
            String Choosed = used[randomint];
            received[randomint] = null;
            return Choosed;
        }
    }
}

/**
  * getNext() method is missing. I suggest you to rewrite the method for getNext() only.
  * RandomStringChooser (+4/7)
  */
