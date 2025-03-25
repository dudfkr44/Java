package ex4_frame_listener;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex_Frame {
	public static void main(String[] args) {

		Frame f = new Frame();
		f.setLocation(300, 200);
		f.setSize(300, 400);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		f.setVisible(true);

	} // main
}
