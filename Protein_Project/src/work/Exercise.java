package work;

import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Exercise {
	public static void main(String[] args) {
		// 프레임 생성 및 기본 설정
		Frame f = new Frame("운동 기구"); // 프레임 생성
		f.setLayout(null); // 절대 위치 레이아웃 사용 (각 이미지와 설명 레이블의 위치를 직접 지정)
		f.setBounds(0, 0, 1200, 900); // 프레임 크기: 너비 1200px, 높이 900px

		// 제목 레이블 생성 및 설정
		JLabel titleLabel = new JLabel("운동 기구"); // 웹페이지 제목 레이블 생성
		titleLabel.setFont(new Font("", Font.BOLD, 30)); // 웹페이지 제목 레이블 폰트 설정
		titleLabel.setHorizontalAlignment(JLabel.CENTER); // 웹페이지 제목 가운데 정렬
		titleLabel.setBounds(0, 250, 1200, 50); // 웹페이지 제목 레이블 위치 및 크기 설정

		// 이미지 및 설명 텍스트의 크기와 간격 설정
		int imgWidth = 250; // 이미지 너비
		int imgHeight = 200; // 이미지 높이
		int spacing = 20; // 이미지 간 간격

		// 이미지들을 화면 중앙에 배치하기 위한 시작 좌표 계산
		int startX = (1200 - (imgWidth * 4 + spacing * 3)) / 2; // 총 너비 계산 후 중앙 정렬
		int startY = (900 - imgHeight) / 2; // 수직 중앙 정렬

		// 이미지와 설명을 4개 생성 및 배치 (for문으로 반복)
		for (int index = 0; index < 4; index++) {
			int x = startX + (imgWidth + spacing) * index; // 각 이미지의 x 좌표 계산
			// 정적 메서드 addImageWithDescription()에
			// 변수 f, x, startY, imgWidth, imgHeight, index를 넘겨줌
			addImageWithDescription(f, x, startY, imgWidth, imgHeight, index);
		} // for

		f.add(titleLabel);
		f.setVisible(true); // 프레임을 화면에 표시

		// 창 닫기 이벤트 처리 (창을 닫을 때 프로그램 종료)
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0); // 프로그램 종료
			}
		}); // 프레임 창 닫기 기능 추가
	} // main

	/**
	 * 이미지와 설명 텍스트를 생성하고 프레임에 추가하는 메서드
	 * 
	 * @param f         프레임 객체
	 * @param x         이미지의 x 좌표
	 * @param y         이미지의 y 좌표
	 * @param imgWidth  이미지 너비
	 * @param imgHeight 이미지 높이
	 * @param index     이미지 인덱스 (0~3)
	 */
	private static void addImageWithDescription(Frame f, int x, int startY, int imgWidth, int imgHeight, int index) {
		// 이미지 경로와 설명을 배열에 저장
		String[] imagePaths = { "BenchPress.jpg", "Dumbbell.jpg", "KettleBell.jpg", "PushUpBar.jpg" };
		String[] descriptions = { "벤치프레스", "덤벨", "케틀벨", "푸시업바" };
		int[] prices = { 1500000, 150000, 200000, 50000 };

		// 인덱스에 따라 이미지와 설명 선택
		ImageIcon icon = new ImageIcon("image_source/" + imagePaths[index]);
		String desc = descriptions[index]; // 배열에 맞는 제품 이름 가져오기
		int price = prices[index]; // 배열에 맞는 가격 가져오기

		// 이미지 레이블 생성 및 위치 설정
		JLabel imgLabel = new JLabel(icon);
		imgLabel.setBounds(x, startY, imgWidth, imgHeight); // x, y 좌표와 크기 지정

		// 설명 폰트 설정 (볼드체 20pt)
		Font font = new Font("", Font.BOLD, 20);

		// 설명 레이블 생성 및 설정
		JLabel descLabel = new JLabel(desc);
		descLabel.setHorizontalAlignment(JLabel.CENTER); // 상품 이름 중앙 정렬
		descLabel.setBounds(x, startY + imgHeight + 5, // 이미지 아래 5px 간격
				imgWidth, 30 // 텍스트 높이
		);
		descLabel.setFont(font); // 폰트 적용

		// 가격 표시 폰트 변경
		Font priceFont = new Font("", Font.PLAIN, 15);

		// 가격 포맷팅 (콤마 추가)
		String formattedPrice = String.format("%,d", price); // 예: 1500000 → 1,500,000
		// 가격 레이블 생성 및 설정
		// 각 제품의 가격 (단위: 원)
		JLabel priceLabel = new JLabel("가격: " + formattedPrice + "원"); // "가격: 1,500,000원" 형식으로 출력
		priceLabel.setHorizontalAlignment(JLabel.CENTER); // 가격 표시 가운데 정렬
		priceLabel.setBounds(x, startY + imgHeight + 40, imgWidth, 25); // 설명 아래 40px 여백 추가
		priceLabel.setFont(priceFont); // 변경된 폰트 적용

		// 구매 버튼 생성 및 설정
		JButton buyButton = new JButton("구매하기");
		buyButton.setBounds(x + (imgWidth - 100) / 2, // 중앙 정렬을 위해 위치 계산
				startY + imgHeight + 70, // 가격 레이블 아래 45px 간격
				100, 30); // 버튼 크기: 100x30px

		buyButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 구매하기 버튼을 누르면 콘솔에 해당 문자열 출력
				System.out.println(descriptions[index] + " 구매 요청!");
			}
		});

		// 모든 컴포넌트를 프레임에 추가
		f.add(imgLabel);
		f.add(descLabel);
		f.add(priceLabel);
		f.add(buyButton);
	} // addImageWithDescription 정적 메서드
}