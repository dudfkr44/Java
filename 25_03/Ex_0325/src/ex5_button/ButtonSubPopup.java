package ex5_button;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonSubPopup {
	public ButtonSubPopup() {
		// TODO Auto-generated constructor stub
		Frame f2 = new Frame();
		f2.setLayout(null);
		f2.setBounds(500, 300, 300, 200);

		Label la = new Label("종료?", Label.CENTER);
		la.setBounds(50, 30, 200, 30);
		f2.add(la);

		Button BtnYes = new Button("YES");
		BtnYes.setBounds(50, 100, 80, 50);
		BtnYes.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		Button BtnNo = new Button("NO");
		BtnNo.setBounds(170, 100, 80, 50);
		BtnNo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				f2.dispose();
			}
		});

		f2.add(la);
		f2.add(BtnYes);
		f2.add(BtnNo);

		f2.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f2.dispose();
			}
		});
		f2.setVisible(true);
	}
}
