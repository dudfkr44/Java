package ex6_rpsgame_exam;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.Timer;

public class RpsMain {
	static int userChoice = -1; // 사용자 선택 (0:바위, 1:보, 2:가위) 값을 담을 전역 변수 설정
	static int computerChoice = -1; // 컴퓨터 선택값을 담을 전역 변수 설정

	// 승/무/패 카운터 변수 추가
	static int wins = 0; // 승리 횟수 담을 전역 변수 설정
	static int draws = 0; // 무승부 횟수 담을 전역 변수 설정
	static int losses = 0; // 패배 횟수 담을 전역 변수 설정

	public static void main(String[] args) {
		Frame gameFrame = new Frame("가위 바위 보 게임"); // 가위 바위 보 게임 프레임 생성
		gameFrame.setLayout(null); // 버튼 및 그림 자동 정렬 해제
		gameFrame.setBounds(400, 100, 700, 900); // 프레임 크기 및 위치 설정

		// 배경 이미지 설정
		ImageIcon imgBack = new ImageIcon("images/배경화면.jpg"); // 배경 이미지 생성
		JLabel lbBack = new JLabel(imgBack); // 배경 이미지를 담을 레이블 생성
		lbBack.setBounds(0, 0, 700, 900); // 이미지 크기와 위치 설정

		String[] rpsImg = { "r", "p", "s" }; // 가위, 바위, 보의 이미지 이름 뒷글자 배열 생성

		// 이미지 배열 초기화
		// createImageArray() 메서드로 사용자(u)와 컴퓨터(c)파일 이름 설정 후
		// uImages, cImages 배열에 해당 파일의 그림을 저장
		ImageIcon[] uImages = createImageArray("u", rpsImg);
		ImageIcon[] cImages = createImageArray("c", rpsImg);

		// 사용자 이미지 레이블
		JLabel lbUImg = new JLabel(uImages[0]); // 사용자 가위 바위 보 이미지 레이블 생성
		lbUImg.setBounds(450, 270, 170, 150); // 사용자 가위 바위 보 이미지 크기와 위치 설정

		// VS 이미지
		ImageIcon imgVs = new ImageIcon("images/vs.png"); // VS 이미지 불러옴
		JLabel lbVsImg = new JLabel(imgVs); // VS 이미지를 담을 레이블 생성
		lbVsImg.setOpaque(false); // VS 이미지 배경색 제거
		lbVsImg.setBounds(265, 270, 170, 150); // VS 이미지 위치 및 크기 설정

		// 컴퓨터 이미지 레이블
		JLabel lbCImg = new JLabel(cImages[0]); // 컴퓨터 가위 바위 보 이미지 레이블 생성
		lbCImg.setBounds(75, 270, 170, 150); // 컴퓨터 가위 바위 보 이미지 크기와 위치 설정

		// 버튼 생성 및 설정
		// 가위 바위 보 버튼 배열 생성
		JButton[] buttons = { new JButton("바위"), new JButton("보"), new JButton("가위") };
		Font buttonFont = new Font("", Font.BOLD, 25); // 가위 바위 보 버튼 문자열 글꼴 설정
		for (int i = 0; i < buttons.length; i++) { // for문을 이용한 버튼 자동 배치 및 생성
			// 버튼의 위치를 계산식에 따라 자동 배열
			buttons[i].setBounds((int) (50 + (i * 150 * 1.5)), 700, 150, 50);
			setButtonFont(buttons[i], buttonFont); // setButtonFont - 버튼에 출락하는 문자열의 색상 설정
		} // for

		// 승패 결과 레이블
		// 승패 결과를 출력할 레이블 생성 및 초기에 출력할 문자열 설정
		JLabel lbResult = new JLabel("가위 바위 보");
		lbResult.setHorizontalAlignment(JLabel.CENTER); // 승패 결과 출력 위치 가운데 정렬
		lbResult.setBounds(50, 600, 600, 50); // 승패 결과 레이블 위치 및 크기 설정
		lbResult.setFont(new Font("", Font.BOLD, 30)); // 승패 결과 레이블에 출력하는 문자열의 크기 및 글꼴 설정
		setLabelColor(lbResult, Color.WHITE); // setLabelColor - 레이블에 출력하는 문자열의 색상 설정

		// 승/무/패 기록 레이블
		JLabel lbScore = new JLabel("0승 0무 0패");
		lbScore.setHorizontalAlignment(JLabel.CENTER); // 승패 기록 출력 위치 가운데 정렬
		lbScore.setBounds(50, 660, 600, 30); // 승패 기록 레이블 위치 및 크기 설정
		lbScore.setFont(new Font("", Font.BOLD, 25)); // 승패 기록 레이블에 출력하는 문자열의 크기 및 글꼴 설정
		setLabelColor(lbScore, Color.WHITE); // setLabelColor - 레이블에 출력하는 문자열의 색상 설정

		// 애니메이션이 갱신될 타이머 설정
		// Timer 클래스의 timer로 메모리 선언 후 0.1초의 딜레이를 가진 감지자 설정
		Timer timer = new Timer(100, new ActionListener() {
			int state = 1; // 이미지를 갱신할 순번 초기화

			@Override
			public void actionPerformed(ActionEvent e) {
				if (userChoice == -1) { // userchoice의 변수값이 맨처음 지정된 -1일일 경우
					// 정적 메서드 animateImages()의 파라미터인 state, 가위 바위 보 이미지 등의 결과값을 state 변수에 대입
					// 파라미터: lbUImg, lbCImg(이미지 레이블), lbResult(결과 표시 레이블), timer(애니메이션 제어 타이머)
					state = animateImages(state, lbUImg, lbCImg, uImages, cImages);
					gameFrame.repaint(); // 프레임에 나타날 이미지 갱신
				}
			}
		});
		timer.start(); // 타이머 클래스의 기능이 할당된 timer 변수를 실행

		// 다시하기 버튼
		JButton btnRestart = new JButton("다시하기"); // 다시하기 버튼 설정
		btnRestart.setBounds(275, 760, 150, 50); // 다시하기 버튼 위치 및 크기 설정
		setButtonFont(btnRestart, buttonFont); // 다시하기 버튼의 폰트 적용

		// "다시하기" 버튼 클릭 시 게임을 초기 상태로 재설정하는 이벤트 리스너 등록
		// resetGame 메서드는 다음과 같은 작업을 수행:
		// - 사용자/컴퓨터 선택 변수 초기화 (userChoice, computerChoice = -1)
		// - 사용자/컴퓨터 이미지 레이블을 기본 이미지(바위)로 재설정
		// - 결과 메시지("가위 바위 보")로 복원
		// - 애니메이션 타이머 재시작
		// 파라미터: lbUImg, lbCImg(이미지 레이블), lbResult(결과 표시 레이블), timer(애니메이션 제어 타이머)
		btnRestart.addActionListener(e -> resetGame(lbUImg, lbCImg, lbResult, timer));

		// 프레임에 추가할 객체 컴포넌트 추가
		gameFrame.add(lbUImg);
		gameFrame.add(lbVsImg);
		gameFrame.add(lbCImg);
		// 향상된 for문을 이용해 각 버튼의 배열값을 배열 순서에 따른 btn 변수 위치로 전부 할당
		for (JButton btn : buttons) {
			gameFrame.add(btn);
		}
		gameFrame.add(btnRestart);
		gameFrame.add(lbResult);
		gameFrame.add(lbScore);
		gameFrame.add(lbBack);
		gameFrame.setVisible(true); // 프레임 가시화 설정

		// 창 닫기 이벤트
		gameFrame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		// 버튼 이벤트 설정
		// 가위 바위 보의 해당하는 buttons 변수의 배열값에 각각 정해진 인자에 맞는 버튼 이벤트를 할당
		// 바위 버튼
		buttons[0].addActionListener(new RpsActionListener(0, lbUImg, lbCImg, lbResult, lbScore, timer));
		// 보 버튼
		buttons[1].addActionListener(new RpsActionListener(1, lbUImg, lbCImg, lbResult, lbScore, timer));
		// 가위 버튼
		buttons[2].addActionListener(new RpsActionListener(2, lbUImg, lbCImg, lbResult, lbScore, timer));
	} // main

	// 승패 판정 및 승패 기록 출력 갱신 메서드
	private static void updateResultAndScore(int userChoice, int computerChoice, JLabel lbResult, JLabel lbScore) {
		String result = "";
		if (userChoice == computerChoice) {
			result = "무승부!";
			draws++;
		} else if ((userChoice == 0 && computerChoice == 2) || (userChoice == 1 && computerChoice == 0)
				|| (userChoice == 2 && computerChoice == 1)) {
			result = "승리!";
			wins++;
		} else {
			result = "패배...";
			losses++;
		}

		lbResult.setText("결과: " + result);
		lbScore.setText(wins + "승 " + draws + "무 " + losses + "패");
	}

	// 이미지 배열 생성 메서드
	private static ImageIcon[] createImageArray(String prefix, String[] rpsImg) {
		// 이미지 아이콘 클래스 형태의 images 경로를 저장할 image 배열값 할당
		ImageIcon[] images = new ImageIcon[3];
		for (int i = 0; i < 3; i++) {
			String filename = "images/" + prefix + rpsImg[i] + ".png";
			images[i] = new ImageIcon(filename);
		}
		return images;
	}

	// 버튼 폰트 설정 메서드
	private static void setButtonFont(JButton btn, Font font) {
		btn.setFont(font);
	}

	// 레이블 색상 설정 메서드
	private static void setLabelColor(JLabel label, Color color) {
		label.setForeground(color);
	}

	// 그림 애니메이션으로 구현 메서드
	private static int animateImages(int state, JLabel lbUImg, JLabel lbCImg, ImageIcon[] uImages,
			ImageIcon[] cImages) {
		int index = (state - 1) % 3;
		lbUImg.setIcon(uImages[index]);
		lbCImg.setIcon(cImages[index]);
		return (state % 3) + 1;
	}

	// 초기화 메서드
	private static void resetGame(JLabel lbUImg, JLabel lbCImg, JLabel lbResult, Timer timer) {
		userChoice = -1;
		computerChoice = -1;
		lbUImg.setIcon(createImageIcon("u", 0)); // 바위로 초기화
		lbCImg.setIcon(createImageIcon("c", 0)); // 바위로 초기화
		lbResult.setText("가위 바위 보"); // 결과 기록창에 처음 및 다시하기 버튼 누를 시 표시될 문자열 설정
		timer.start();
	}

	// 이미지 경로 생성 메서드
	private static ImageIcon createImageIcon(String prefix, int choice) {
		return new ImageIcon("images/" + prefix + getRpsImgName(choice) + ".png");
	}

	// 이미지 두번째 자리의 파일명 생성 메서드 (r, p, s 변환)
	private static String getRpsImgName(int choice) {
		return switch (choice) {
		case 0 -> "r";
		case 1 -> "p";
		default -> "s";
		};
	}

	// 새로운 클래스: 버튼 클릭 이벤트 제어자
	private static class RpsActionListener implements ActionListener {
		private final int userChoice;
		private final JLabel lbUImg, lbCImg;
		private final JLabel lbResult, lbScore;
		private final Timer timer;

		// 생성자를 통해 각 파라미터의 값을 받아오고 상기에 선언된 변수에 대입
		public RpsActionListener(int userChoice, JLabel lbUImg, JLabel lbCImg, JLabel lbResult, JLabel lbScore,
				Timer timer) {
			this.userChoice = userChoice;
			this.lbUImg = lbUImg;
			this.lbCImg = lbCImg;
			this.lbResult = lbResult;
			this.lbScore = lbScore;
			this.timer = timer;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			RpsMain.userChoice = this.userChoice;
			lbUImg.setIcon(createImageIcon("u", userChoice));

			computerChoice = (int) (Math.random() * 3);
			lbCImg.setIcon(createImageIcon("c", computerChoice));

			timer.stop();
			updateResultAndScore(userChoice, computerChoice, lbResult, lbScore);
		}
	}
}