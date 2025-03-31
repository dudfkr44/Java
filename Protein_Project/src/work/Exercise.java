package work;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exercise {

	private static int money = 100000;

	public static void main(String[] args) {
		Exercise exercise = new Exercise();
		exercise.startExercise();
	}

	public void startExercise() {
		// 프레임 생성 및 기본 설정
		Frame f = new Frame("운동 기구");
		f.setLayout(null);
		f.setBounds(0, 0, 1200, 900);

		// 제목 레이블 생성 및 설정
		JLabel titleLabel = new JLabel("운동 기구");
		titleLabel.setFont(new Font("", Font.BOLD, 30));
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		titleLabel.setBounds(0, 250, 1200, 50);
		f.add(titleLabel);

		// 이미지 및 설명 텍스트의 크기와 간격 설정
		int imgWidth = 250;
		int imgHeight = 200;
		int spacing = 20;

		// 이미지 중앙 배치를 위한 좌표 계산
		int startX = (1200 - (imgWidth * 4 + spacing * 3)) / 2;
		int startY = (900 - imgHeight) / 2;

		// 이미지와 설명을 4개 생성 및 배치
		for (int index = 0; index < 4; index++) {
			int x = startX + (imgWidth + spacing) * index;
			addImageWithDescription(f, x, startY, imgWidth, imgHeight, index);
		}

		f.setVisible(true);

		// 창 닫기 이벤트 처리
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public void addImageWithDescription(Frame f, int x, int startY, int imgWidth, int imgHeight, int index) {
		// 이미지 경로와 설명을 배열에 저장
		String[] imagePaths = { "BenchPress.jpg", "Dumbbell.jpg", "KettleBell.jpg", "PushUpBar.jpg" };
		String[] descriptions = { "벤치프레스", "덤벨", "케틀벨", "푸시업바" };
		int[] prices = { 1500000, 150000, 200000, 50000 };

		// 이미지 로드
		ImageIcon icon = new ImageIcon("image_source/" + imagePaths[index]);
		String desc = descriptions[index];
		int price = prices[index];

		// 이미지 레이블 생성 및 배치
		JLabel imgLabel = new JLabel(icon);
		imgLabel.setBounds(x, startY, imgWidth, imgHeight);
		f.add(imgLabel);

		// 설명 레이블 생성 및 설정
		Font font = new Font("", Font.BOLD, 20);
		JLabel descLabel = new JLabel(desc);
		descLabel.setHorizontalAlignment(JLabel.CENTER);
		descLabel.setBounds(x, startY + imgHeight + 5, imgWidth, 30);
		descLabel.setFont(font);
		f.add(descLabel);

		// 가격 레이블 생성 및 설정
		Font priceFont = new Font("", Font.PLAIN, 15);
		String formattedPrice = String.format("%,d", price);
		JLabel priceLabel = new JLabel("가격: " + formattedPrice + "원");
		priceLabel.setHorizontalAlignment(JLabel.CENTER);
		priceLabel.setBounds(x, startY + imgHeight + 40, imgWidth, 25);
		priceLabel.setFont(priceFont);
		f.add(priceLabel);

		// 구매 버튼 생성 및 설정
		JButton buyButton = new JButton("구매하기");
		buyButton.setBounds(x + (imgWidth - 100) / 2, startY + imgHeight + 70, 100, 30);

		buyButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (money < prices[index]) {
					showNotification(f, "잔액 부족", "잔액이 부족합니다.");
				} else {
					boolean isConfirmed = showPurchaseConfirmation(f);
					if (isConfirmed) {
						money -= prices[index];
						showNotification(f, "구매 성공", descriptions[index] + " 구매 완료!\n잔액: " + money + "원");
					}
				}
			}
		});

		f.add(buyButton);
	}

	// 알림 대화상자 표시 메서드
	public void showNotification(Frame f, String title, String message) {
		Frame dialog = new Frame(title);
		dialog.setLayout(null);
		dialog.setBounds(500, 300, 300, 200);
		dialog.setResizable(false);

		JLabel msgLabel = new JLabel("", JLabel.CENTER);
		msgLabel.setText("<html><center>" + message.replace("\n", "<br>") + "</center></html>");
		msgLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		msgLabel.setBounds(0, 30, 300, 60);

		JButton okBtn = new JButton("확인");
		okBtn.setBounds(110, 100, 80, 50);
		okBtn.addActionListener(e -> dialog.dispose());

		dialog.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dialog.dispose();
			}
		});

		dialog.add(msgLabel);
		dialog.add(okBtn);
		dialog.setVisible(true);
	}

	// 구매 확인 대화상자 표시 메서드
	public boolean showPurchaseConfirmation(Frame f) {
		final Dialog purchaseP = new Dialog(f, "구매 확인", true);
		purchaseP.setLayout(null);
		purchaseP.setBounds(500, 300, 300, 200);
		purchaseP.setResizable(false);

		Label purchaseQ = new Label("해당 제품을 구매하시겠습니까?", Label.CENTER);
		purchaseQ.setFont(new Font("Dialog", Font.PLAIN, 15));
		purchaseQ.setBounds(0, 50, 300, 30);
		purchaseP.add(purchaseQ);

		Button BtnYes = new Button("YES");
		BtnYes.setBounds(50, 100, 80, 50);
		purchaseP.add(BtnYes);

		Button BtnNo = new Button("NO");
		BtnNo.setBounds(170, 100, 80, 50);
		purchaseP.add(BtnNo);

		final boolean[] confirmed = { false };

		BtnYes.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				confirmed[0] = true;
				purchaseP.dispose();
			}
		});

		BtnNo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				confirmed[0] = false;
				purchaseP.dispose();
			}
		});

		purchaseP.setVisible(true);
		return confirmed[0];
	}
}