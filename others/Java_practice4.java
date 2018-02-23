

import java.util.Date;
import java.text.SimpleDateFormat ;

public class Java_practice4
{
	public static void main(String[] args)
	{
		Date d = new Date();
		SimpleDateFormat dateForm = new SimpleDateFormat("yyyy MM dd hh mm ss");
		System.out.println(dateForm.format(d));
	}
}