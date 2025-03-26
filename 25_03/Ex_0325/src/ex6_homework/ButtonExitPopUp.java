package ex6_homework;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class ButtonExitPopUp {
	public ButtonExitPopUp() {
		Frame exitP = new Frame();
		exitP.setLayout(null); // 종료 여부 버튼 위치 자동 정렬 해제
		exitP.setBounds(500, 300, 300, 200); // 종료 여부 창 위치

		Label exitQ = new Label("종료하시겠습니까?", Label.CENTER); //종료 여부 묻는 문장 출력
		Font qFont = new Font("폰트", Font.BOLD, 15); 
		exitQ.setBounds(50, 30, 200, 30);
		exitQ.setFont(qFont);
		exitP.add(exitQ);

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
				exitP.dispose();
			}
		});

		exitP.add(exitQ);
		exitP.add(BtnYes);
		exitP.add(BtnNo);

		exitP.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				exitP.dispose();
			}
		});
		exitP.setVisible(true);
	}
}
