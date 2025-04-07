package ex_page;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Protein {
	User user;

	public Protein(User user) {
		this.user = user;
	}

	public void protein() {
		User_load_writer_save load_writer_save = new User_load_writer_save();

		Frame f = new Frame("프로틴");
		f.setLayout(null);
		f.setBounds(400, 100, 1200, 900);

		Font title_t = new Font("", Font.BOLD, 25);

		Font name_t = new Font("", Font.BOLD, 15);

		Label title = new Label("Your Protein");
		title.setBounds(523, 45, 150, 50);
		title.setFont(title_t);

		// 이미지 4개
		String[] imageFiles1 = { "image/11.jpg", "image/12.jpg", "image/13.jpg", "image/14.jpg" };

		JLabel[] labels = new JLabel[4];
		for (int i = 0; i < 4; i++) {
			int initialX = 80; // 시작 x 좌표
			int xGap = 260; // x 좌표 간격
			ImageIcon image1 = new ImageIcon(imageFiles1[i]);
			labels[i] = new JLabel(image1);
			labels[i].setBounds(initialX + (i * xGap), 100, 250, 250);
			f.add(labels[i]);
		}
		// 이미지4 2줄
		JLabel[] labels2 = new JLabel[4];
		String[] imageFiles2 = { "image/15.jpg", "image/16.jpg", "image/17.jpg", "image/18.jpg" };

		for (int i = 0; i < 4; i++) {
			int initialX = 80; // 시작 x 좌표
			int xGap = 260; // x 좌표 간격
			ImageIcon image2 = new ImageIcon(imageFiles2[i]);
			labels2[i] = new JLabel(image2);
			labels2[i].setBounds(initialX + (i * xGap), 470, 250, 250);
			f.add(labels2[i]);
		}

		// 1줄 이름
		Label[] names = new Label[4];
		String[] productNames = { "임팩트 웨이 프로틴", "임팩트 비건 프로틴", "임팩트 다이어트 웨이", "아침 식사 스무디" };

		for (int i = 0; i < 4; i++) {
			int initialX = 117; // 시작 x 좌표
			int xGap = 268; // x 좌표 간격
			names[i] = new Label(productNames[i]);
			names[i].setBounds(initialX + (i * xGap), 360, 230, 30);
			names[i].setFont(name_t);
			names[i].setVisible(true);
			f.add(names[i]);
		}

		// 2줄 이름
		Label[] names2 = new Label[4];
		String[] productNames2 = { "임팩트 소이 프로틴", "어드밴스트 웨이트 게이너", "임팩트 완두콩 프로틴", "클리어 웨이 프로틴" };

		for (int i = 0; i < 4; i++) {
			int initialX = 117; // 시작 x 좌표
			int xGap = 260; // x 좌표 간격
			names2[i] = new Label(productNames2[i]);
			names2[i].setBounds(initialX + (i * xGap), 730, 200, 30);
			names2[i].setFont(name_t);
			names2[i].setVisible(true);
			f.add(names2[i]);
		}

		// 1줄 가격
		String[] price1_s = { "￦26900", "￦18900", "￦52900", "￦81900" };

		Label[] price1 = new Label[4];
		for (int i = 0; i < 4; i++) {
			int initialX = 170;
			int xGap = 260; // x 좌표 간격
			price1[i] = new Label(price1_s[i]);
			price1[i].setBounds(initialX + (i * xGap), 380, 135, 32);
			price1[i].setFont(name_t);
			f.add(price1[i]);
		}
		// 2줄 가격
		String[] price2_s = { "￦29900", "￦89900", "￦35900", "￦59900" };

		Label[] price2 = new Label[4];
		for (int i = 0; i < 4; i++) {
			int initialX = 170;
			int xGap = 260; // x 좌표 간격
			price2[i] = new Label(price2_s[i]);
			price2[i].setBounds(initialX + (i * xGap), 750, 135, 32);
			price2[i].setFont(name_t);
			f.add(price2[i]);
		}

		// 버튼 1줄
		Button[] btn1 = new Button[4];
		int[] price1_arr = { 26900, 18900, 52900, 81900 };
		for (int i = 0; i < 4; i++) { // 시작 y는 500
			int inintitalX = 80;
			int xGap = 260;
			final int idx = i;
			btn1[i] = new Button("구매");
			btn1[i].setBounds(inintitalX + (xGap * i), 413, 250, 30);
			btn1[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if (user.getMoney() >= price1_arr[idx]) {
						JDialog price1_d = new JDialog();
						price1_d.setSize(300, 200);
						price1_d.setTitle("구매 - 수량 선택");

						price1_d.setLayout(new FlowLayout());

						// 초기 수량 설정
						final int[] quantity = { 1 }; // 배열로 감싸서 내부 값 변경 가능

						// 수량을 표시할 레이블
						JLabel quantityLabel = new JLabel("수량: " + quantity[0]);
						quantityLabel.setFont(new Font("", Font.BOLD, 16));

						// 금액을 표시할 레이블
						JLabel priceLabel = new JLabel("금액: " + price1_arr[idx] * quantity[0] + "원");
						priceLabel.setFont(new Font("", Font.BOLD, 16));

						// 수량을 증가시키는 버튼
						JButton btnIncrease = new JButton("+");
						btnIncrease.setFont(new Font("", Font.BOLD, 16));

						// 수량을 감소시키는 버튼
						JButton btnDecrease = new JButton("-");
						btnDecrease.setFont(new Font("", Font.BOLD, 16));

						// 구매 버튼
						JButton btnPurchase = new JButton("구매");
						btnPurchase.setFont(new Font("", Font.BOLD, 16));

						// 수량 증가 버튼 이벤트
						btnIncrease.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								quantity[0]++; // 수량 증가
								quantityLabel.setText("수량: " + quantity[0]); // 수량 레이블 업데이트
								priceLabel.setText("금액: " + price1_arr[idx] * quantity[0] + "원"); // 금액 업데이트
							}
						});

						// 수량 감소 버튼 이벤트
						btnDecrease.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								if (quantity[0] > 1) {
									quantity[0]--; // 수량 감소
									quantityLabel.setText("수량: " + quantity[0]); // 수량 레이블 업데이트
									priceLabel.setText("금액: " + price1_arr[idx] * quantity[0] + "원"); // 금액 업데이트
								}
							}
						});

						// 구매 버튼 이벤트
						btnPurchase.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								int totalPrice = price1_arr[idx] * quantity[0];
								if (user.getMoney() >= totalPrice) {
									// 구매가 성공적으로 이루어지면
									user.setMoney(user.getMoney() - totalPrice); // 금액 차감
									load_writer_save.save(user); // 사용자 정보 저장
									JOptionPane.showMessageDialog(price1_d, "구매 성공! 남은 금액: " + user.getMoney() + "원");
									price1_d.dispose(); // 다이얼로그 닫기
								} else {
									JOptionPane.showMessageDialog(price1_d, "잔액이 부족합니다.");
								}
							}
						});

						// JDialog에 컴포넌트 추가
						price1_d.add(quantityLabel);
						price1_d.add(btnDecrease);
						price1_d.add(btnIncrease);
						price1_d.add(priceLabel);
						price1_d.add(btnPurchase);
						price1_d.setLocationRelativeTo(f); // 구매 버튼 누르면 화면 중앙에 오게 하는 것

						// JDialog 표시
						price1_d.setVisible(true);
					} else {
						JOptionPane.showMessageDialog(null, "잔액이 부족합니다.", "알림", JOptionPane.INFORMATION_MESSAGE);
					}
				}
			});
			btn1[i].setVisible(true);
			f.add(btn1[i]);
		}

		// 2줄 버튼
		Button[] btn2 = new Button[4];
		int[] price2_arr = { 29900, 89900, 35900, 59900 };
		for (int i = 0; i < 4; i++) {
			int inintitalX = 80;
			int xGap = 260;
			final int idx = i;
			btn2[i] = new Button("구매");
			btn2[i].setBounds(inintitalX + (xGap * i), 785, 250, 30);
			btn2[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if (user.getMoney() >= price2_arr[idx]) {
						JDialog price2_d = new JDialog();
						price2_d.setSize(300, 200);
						price2_d.setTitle("구매 - 수량 선택");

						price2_d.setLayout(new FlowLayout());

						// 초기 수량 설정
						final int[] quantity = { 1 }; // 배열로 감싸서 내부 값 변경 가능

						// 수량을 표시할 레이블
						JLabel quantityLabel = new JLabel("수량: " + quantity[0]);
						quantityLabel.setFont(new Font("", Font.BOLD, 16));

						// 금액을 표시할 레이블
						JLabel priceLabel = new JLabel("금액: " + price1_arr[idx] * quantity[0] + "원");
						priceLabel.setFont(new Font("", Font.BOLD, 16));

						// 수량을 증가시키는 버튼
						JButton btnIncrease = new JButton("+");
						btnIncrease.setFont(new Font("", Font.BOLD, 16));

						// 수량을 감소시키는 버튼
						JButton btnDecrease = new JButton("-");
						btnDecrease.setFont(new Font("", Font.BOLD, 16));

						// 구매 버튼
						JButton btnPurchase = new JButton("구매");
						btnPurchase.setFont(new Font("", Font.BOLD, 16));

						// 수량 증가 버튼 이벤트
						btnIncrease.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								quantity[0]++; // 수량 증가
								quantityLabel.setText("수량: " + quantity[0]); // 수량 레이블 업데이트
								priceLabel.setText("금액: " + price1_arr[idx] * quantity[0] + "원"); // 금액 업데이트
							}
						});

						// 수량 감소 버튼 이벤트
						btnDecrease.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								if (quantity[0] > 1) {
									quantity[0]--; // 수량 감소
									quantityLabel.setText("수량: " + quantity[0]); // 수량 레이블 업데이트
									priceLabel.setText("금액: " + price1_arr[idx] * quantity[0] + "원"); // 금액 업데이트
								}
							}
						});

						// 구매 버튼 이벤트
						btnPurchase.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								int totalPrice = price1_arr[idx] * quantity[0];
								if (user.getMoney() >= totalPrice) {
									// 구매가 성공적으로 이루어지면
									user.setMoney(user.getMoney() - totalPrice); // 금액 차감
									load_writer_save.save(user); // 사용자 정보 저장
									JOptionPane.showMessageDialog(price2_d, "구매 성공! 남은 금액: " + user.getMoney() + "원");
									price2_d.dispose(); // 다이얼로그 닫기
								} else {
									JOptionPane.showMessageDialog(null, "잔액이 부족합니다.", "알림",
											JOptionPane.INFORMATION_MESSAGE);
								}
							}
						});

						// JDialog에 컴포넌트 추가
						price2_d.add(quantityLabel);
						price2_d.add(btnDecrease);
						price2_d.add(btnIncrease);
						price2_d.add(priceLabel);
						price2_d.add(btnPurchase);
						price2_d.setLocationRelativeTo(f); // 구매버튼 누르면 화면 중앙에 오게하는것

						// JDialog 표시
						price2_d.setVisible(true);
					} // if
					else {
						JOptionPane.showMessageDialog(null, "잔액이 부족합니다.", "알림", JOptionPane.INFORMATION_MESSAGE);
					} // else
				}
			});
			btn2[i].setVisible(true);
			f.add(btn2[i]);
		}

		f.add(title);

		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
		f.setVisible(true);
	} // main
}
