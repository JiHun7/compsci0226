import java.util.ArrayList;

public class RandomLetterChooser extends RandomStringChooser
{
    private ArrayList<String> Array;
    private String received;
    private int length;
    public RandomLetterChooser(String str)
    {
        received = str;
        length = str.length();
        for(int i =0; i<length; i++)
        {
            Array.add(str.substring(i));
        }
        ArrayList<String> Arrayone = Array;
        return Arrayone;
    }
    public static String[] getSingleLetters(String str)
    {
        // put your code here
        
    }
}
