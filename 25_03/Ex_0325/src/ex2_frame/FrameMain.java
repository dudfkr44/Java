package ex2_frame;

import java.awt.Color;
import java.awt.event.WindowListener;

public class FrameMain {
	public static void main(String[] args) {

		MyFrame mf1 = new MyFrame();
		mf1.setBackground(Color.YELLOW);
		mf1.addWindowListener(new MyEvent());

		MyFrame mf2 = new MyFrame();
		mf2.setBackground(Color.CYAN);
		mf2.setTitle("나도 프레임");
		
		

	} // main
}
