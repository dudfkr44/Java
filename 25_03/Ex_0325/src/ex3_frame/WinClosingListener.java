package ex3_frame;

import java.awt.event.WindowEvent;

public class WinClosingListener extends ListenerAll {
	
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("종료할 거임");
		System.exit(0);
	}

}
