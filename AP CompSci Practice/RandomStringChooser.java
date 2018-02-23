import java.util.Random;
public class RandomStringChooser
{
    private String[] received;
    private int length;
    public RandomStringChooser(String[] Array)
    {
        received = Array;
        length = Array.length;
        
    }
    public String sChooser()
    {
        String[] used = received;
        Random randomGenerator = new Random();
        int randomint = randomGenerator.nextInt(length-1);
        if(used[randomint] == null)
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
