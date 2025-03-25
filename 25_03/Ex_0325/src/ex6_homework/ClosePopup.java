package ex6_homework;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ClosePopup {
	public ClosePopup() {
		// TODO Auto-generated constructor stub
		Frame exitFrame = new Frame();
		exitFrame.setLayout(null);
		exitFrame.setBounds(500, 300, 300, 200);

		Label exitConfirm = new Label("종료?", Label.CENTER);
		exitConfirm.setBounds(50, 30, 200, 30);
		exitFrame.add(exitConfirm);

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
				exitFrame.dispose();
			}
		});

		exitFrame.add(exitConfirm);
		exitFrame.add(BtnYes);
		exitFrame.add(BtnNo);

		exitFrame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				exitFrame.dispose();
			}
		});
		exitFrame.setVisible(true);
	}
}
