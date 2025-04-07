package ex_page;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Text002 
{
	User user;//사용자 정보
	User_load_writer_save save = new User_load_writer_save();//사용자 정보 저장
	
	public Text002(User user) 
	{
		this.user=user;
	}
	private static int width = 3; //width 값초기화
	
	//상품정보
	private static String[] prices = {"1,500원", "1,500원", "1,500원", "1,500원"};
	private static String[] productNames = {"닭가슴살 1", 
											"닭가슴살 2", 
											"닭가슴살 3", 
											"닭가슴살 4"};
	private static int[] xPositions = {100, 400, 670, 980};  // 각 버튼의 X 위치
	private static int[] yPositions = {700, 700, 700, 700};  // 각 버튼의 Y 위치
	private static int[] heights = {114, 114, 114, 114};     // 각 버튼의 높이
	
	private JLabel balanceLabel; //보유 금액표시
		
	public void show() {

		Frame f = new Frame("닭가슴살");//제목
		f.setLayout(null);
		f.setBounds(0,0,1200,900);

		//폰트 설정
		Font mainFont = new Font("Malgun Gothic", Font.BOLD,35);

		//메인 제목
		Label la = new Label("Your Proteln");
		la.setFont(mainFont);
		la.setBounds(50,50,200,50);
		
		//사용자 정보 표시
		Label userLabel = new Label("ID: " + user.getId() );
		userLabel.setFont(new Font("maigun Gothic" ,Font.BOLD,20));
		userLabel.setBounds(900,50,200,30);
		
		//사용자 보유금액
		balanceLabel = new JLabel("보유 금액 : " + user.getMoney() + "원");
		balanceLabel.setFont(new Font("maigun Gothic", Font.BOLD, 20));
		balanceLabel.setBounds(900,80,200,30);
		

		//배경이미지
		ImageIcon imgbac = new ImageIcon("image/abc22.jpg");
		JLabel scaImage = new JLabel(imgbac);
		scaImage.setBounds(30, 50, 1200, 900);
		
		//상품  이미지	
		ImageIcon imgback = new ImageIcon("image/캡처1.PNG");
		JLabel a0 = new JLabel(imgback);
		a0.setBounds(0, 0, 320, 870);
		
		 ImageIcon imgbtn = new ImageIcon("image/캡처2.PNG");
		 JLabel a1 = new JLabel(imgbtn);
		 a1.setBounds(0, 0, 900, 870);
		 
		 ImageIcon imgbbn = new ImageIcon("image/캡처3.PNG");
		 JLabel a2 = new JLabel(imgbbn);
		 a2.setBounds(0, 0, 1470, 870);
		 
		 ImageIcon imgbbb = new ImageIcon("image/캡처4.PNG");
		 JLabel a3 = new JLabel(imgbbb);
		 a3.setBounds(0, 0, 2045, 870);

		//배열상품버튼
		for (int i = 0; i < prices.length; i++) {
			createButtonWithQuantity(f, xPositions[i], yPositions[i], heights[i], i, prices[i], productNames[i]);
		}
		
		//이미지 출력
		f.add(balanceLabel);
		f.add(la);
		f.add(a0);
		f.add(a1);
		f.add(a2);
		f.add(a3);
		f.add(userLabel);
		f.add(scaImage);
		//창 닫기 
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();				
			}									
		});

		f.setVisible(true);
	}
	
	//버튼 금액 레이블 생성 메서드
	  void createButtonWithQuantity(Frame f, int x, int y, int height,
			int i, String price, String buttonText) {

		//가격을 숫자로 변환
		String priceStr = price.replace("원", "").replace(",", "");
		final int unitprice = Integer.parseInt(priceStr);


		//수량 선택
		JSpinner quantitySpinner = new JSpinner(new SpinnerNumberModel(1, 1, 10 ,1));//1~10까지
		quantitySpinner.setBounds(x+ (width - 80 )/2, y -60, 100, 40);//버튼위표시
		quantitySpinner.setFont(new Font("Malgun Gothic", Font.BOLD,20));

		//금액텍스트
		JLabel prJLabel =new JLabel(price);
		prJLabel.setFont(new Font("Malgun Gothic", Font.BOLD,30));
		prJLabel.setForeground(Color.RED);
		prJLabel.setBounds(x + 70, y - 50, 150,30);//수량옆

		//수량이 변경될떄 금액 갱신
		quantitySpinner.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				int quantity = (Integer) quantitySpinner.getValue();
				int totalPrice = unitprice * quantity;
				prJLabel.setText(String.format("%,d원", totalPrice)); //금액 텍스트업뎃				
			}
		});
	
		//결제 레이블
		JButton payButton = new JButton("결제하기");
		payButton.setFont(new Font("Malgun Gothic", Font.BOLD, 20));//크기조정
		payButton.setBounds(x-30 + (width - 30)/2, y + height - 100, 200, 60); 
		payButton.setBackground(Color.PINK); //배경		
		payButton.setForeground(Color.BLACK);	
						
		
		//결제버튼 클릭 이벤트
		payButton.addActionListener(e -> {
			int quantity = (Integer) quantitySpinner.getValue();			
			int total = unitprice * quantity;
			int userMoney = user.getMoney(); // 현재보유금액
			
			
			if (total > user.getMoney()){
				
				int shortage = total - userMoney; //부족한 금액 계산
				JOptionPane.showMessageDialog(f, "보유금액이 부족합니다!\n 현재 보유금액 : "
					+ userMoney + "원\n"+"부족한 금액:"+ shortage + "원", "결제 실패", 
					JOptionPane.ERROR_MESSAGE);
					return;
				
			}else {
				//결제 가능하면 금액 차감
				user.setMoney(user.getMoney() - total);
				save.save(user); // 사용자 정보 저장
				
			//UI 업데이트	
			SwingUtilities.invokeLater(() -> {
			balanceLabel.setText("보유금액 : " + user.getMoney()+"원");
			});
			
			//결제 확인 메시지
			JOptionPane.showMessageDialog(f, "총 결제 금액:" + total + 
					"원 \n수량:" + quantity, "결제 확인", JOptionPane.INFORMATION_MESSAGE);
			
			//자동 리셋
			quantitySpinner.setValue(1); // 수량 리셋
			prJLabel.setText(price); // 가격 리셋
			}
		});			
		//컴포넌트	
		f.add(quantitySpinner);
		f.add(prJLabel);	
		f.add(payButton);		
	}	
	
}//main

