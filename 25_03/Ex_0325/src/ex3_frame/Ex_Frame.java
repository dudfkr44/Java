package ex3_frame;

import java.awt.Color;
import java.awt.Frame;

public class Ex_Frame {
	public static void main(String[] args) {

		Frame f = new Frame();
		f.setSize(300, 400);
		f.setLocation(300, 200);
		f.addWindowListener(new WinClosingListener());
		f.setVisible(true);
		
		

	} // main
}
