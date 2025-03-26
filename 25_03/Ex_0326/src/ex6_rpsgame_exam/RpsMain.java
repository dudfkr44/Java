package ex6_rpsgame_exam;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

public class RpsMain {

	public static void main(String[] args) {
		Frame gameFrame = new Frame("가위 바위 보 게임");
		gameFrame.setLayout(null);
		gameFrame.setBounds(400, 100, 700, 900);

		// 배경 이미지 설정
		ImageIcon imgBack = new ImageIcon("images/배경화면.jpg");
		JLabel lbBack = new JLabel(imgBack);
		lbBack.setBounds(0, 0, 700, 900);

		// 사용자 가위 바위 보 그림 초기 설정
		ImageIcon imgUse = new ImageIcon("images/up.png");
		JLabel lbUImg = new JLabel(imgUse);
		lbUImg.setBounds(250, 270, 170, 150);

		// 이미지 배열 생성 (ur, us, up)
		ImageIcon[] uImages = new ImageIcon[3];
		for (int i = 0; i < 3; i++) {
			String filename = "images/u" + (char) ('r' + i) + ".png";
			uImages[i] = new ImageIcon(filename);
		}

		// 사용자 가위 바위 보 그림 초기 설정
		ImageIcon imgCom = new ImageIcon("images/cp.png");
		JLabel lbCImg = new JLabel(imgCom);
		lbCImg.setBounds(450, 270, 170, 150);

		// 이미지 배열 생성 (cr, cs, cp)
		ImageIcon[] cImages = new ImageIcon[3];
		for (int i = 0; i < 3; i++) {
			String filename = "images/c" + (char) ('r' + i) + ".png";
			cImages[i] = new ImageIcon(filename);
		}

		// 애니메이션 타이머
		Timer timer = new Timer(100, new ActionListener() {
			int state = 1; // 초기 상태

			@Override
			public void actionPerformed(ActionEvent e) {
				// 이미지 변경
				int index = (state - 1) % 3;
				lbUImg.setIcon(uImages[index]);
				lbCImg.setIcon(uImages[index]);

				// 상태 업데이트
				state = (state % 3) + 1; // 1, 2, 3, 1, 2, 3...

				gameFrame.invalidate();
				gameFrame.repaint();
			}

		});
		timer.start();

		// 컴포넌트 추가
		gameFrame.add(lbUImg);
		gameFrame.add(lbCImg);
		gameFrame.add(lbBack);
		gameFrame.setVisible(true);

		// 창 닫기 이벤트
		gameFrame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}