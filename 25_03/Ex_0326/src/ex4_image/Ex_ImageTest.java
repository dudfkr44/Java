package ex4_image;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Ex_ImageTest {

	static int state = 0;

	public static void main(String[] args) {
		Frame f = new Frame();
		f.setLayout(null);

		f.setBounds(400, 100, 700, 900);

		// 이미지 불러오기
		ImageIcon imgBack = new ImageIcon("images\\배경화면.jpg");

		// 위에서 가져온 이미지를 JLabel에 저장
		// JLabel에 들어갈 이미지는 클릭이 필요없는 이미지를 사용
		JLabel lbBack = new JLabel(imgBack);

		// ImageIcon 생성
		ImageIcon imgBtn = new ImageIcon("images\\cp.png");
		JLabel lbBtn = new JLabel(imgBtn);
		lbBtn.setBounds(270, 270, 170, 150);

		// 버튼으로 사용할 이미지 생성
		ImageIcon imgIcon = new ImageIcon("images\\cs.png");
		JButton btn1 = new JButton(imgIcon);
		btn1.setBounds(30, 270, 170, 150);

		// 버튼 배경 투명하게
		btn1.setContentAreaFilled(false); // 배경 색상 투명하게
		btn1.setBorderPainted(false); // 외곽선 투명하게

		lbBack.setBounds(0, 0, 700, 900);

		// 버튼 클릭 시 사용할 이미지 추가
		ImageIcon img1 = new ImageIcon("images\\ur.png");
		ImageIcon img2 = new ImageIcon("images\\us.png");
		ImageIcon img3 = new ImageIcon("images\\up.png");

		// 버튼에 클릭 이벤트 감지자 추가
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				state++;
				if (state == 4) {
					state = 1;
				}

				switch (state) {

				case 1:
					lbBtn.setIcon(img1);
					break;
				case 2:
					lbBtn.setIcon(img2);
					break;
				case 3:
					lbBtn.setIcon(img3);
					break;

				} // switch

				// 이미지 갱신이 잘 되지 않을 경우 쓸 수 있는 방법 (둘 중 하나 사용)
				f.invalidate();
				f.repaint();

			}
		});

		// 프레임에 추가되는 순서가 앞쪽일수록 제일 위에 보이게 출력
		f.add(lbBtn);
		f.add(btn1);
		// 프레임에 배경화면 추가
		f.add(lbBack);

		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		f.setVisible(true);

	} // main
}
