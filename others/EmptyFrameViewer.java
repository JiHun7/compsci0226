
import javax.swing.JFrame;

public class EmptyFrameViewer
{
	public static void main(String[] args)
	{
		for(int i = 0 ; i <5; i++)
{
		JFrame frame = new JFrame();
		
		final int FRAME_WIDTH = 300;
		final int FRAME_HEIGHT = 400;
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setTitle("An empty Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
}
	}
}
