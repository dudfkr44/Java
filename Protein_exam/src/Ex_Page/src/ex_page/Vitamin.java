package Ex_Page.src.ex_page;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Vitamin 
{	
	User user;
	public Vitamin(User user) {
		this.user = user;

	}

	public void vitamin() 
	{
		User_load_writer_save lw = new User_load_writer_save();

		Font font = new Font("",Font.BOLD,30);
		Font modelFont = new Font("",Font.BOLD,15);

		Frame f = new Frame("https://www.yourprotein.co.kr/c/nutrition/vitamins/");
		f.setLayout(null);
		f.setBounds(0,0,1200,900);

		//타이틀 제목
		Label title = new Label("Your Protin");
		title.setBounds(45,45,170,50);
		title.setFont(font);

		//타이틀 중앙 이미지
		ImageIcon mTitle = new ImageIcon("image/youtprotin.png");
		JLabel mt = new JLabel(mTitle);
		mt.setBounds(145,145,272,47);
		mt.setVisible(true);

		//제품 모델 이름 배열로 입력
		String model[] = {"  마카","A-Z멀티비타민","알파맨 멀티비타민", "데일리 멀티비타민"};
		Label[] arr = new Label[4];
		int[] price = {12490,11740,15630,11740};

		for(int i = 0; i < model.length; i++) {
			arr[i] = new Label(model[i]);
			int x = 160;
			int y = 500;
			arr[i].setBounds(x+(i*250), y, 135, 30);
			arr[i].setFont(modelFont);
			f.add(arr[i]);
		}

		//제품 이미지
		ImageIcon vitamin1 = new ImageIcon("image/vitamin1.png");
		JLabel vita1 = new JLabel(vitamin1);
		vita1.setBounds(60, 140,250 ,306);
		vita1.setVisible(true);

		ImageIcon vitaminAZ = new ImageIcon("image/vitaminAZ.png");
		JLabel vita2 = new JLabel(vitaminAZ);
		vita2.setBounds(320, 145, 270, 306);
		vita2.setVisible(true);

		ImageIcon alphaMen = new ImageIcon("image/AlphaMen.png");
		JLabel vita3 = new JLabel(alphaMen);
		vita3.setBounds(570,140,290,306);

		ImageIcon multVitamin = new ImageIcon("image/multivitamin.png");
		JLabel vita4 = new JLabel(multVitamin);
		vita4.setBounds(830, 140,295, 306);

		//버튼 배열 생성
		JButton[] btnArr = new JButton[4];

		//버튼 생성 및 위치 설정
		for(int i = 0; i < btnArr.length; i++) {
			btnArr[i] = new JButton("Purchase");
			int x = 95;
			int y = 445;
			btnArr[i].setBounds(x+(i*265), y, 180, 46);
			btnArr[i].setBackground(Color.darkGray);
			btnArr[i].setForeground(Color.white);
			btnArr[i].setFont(modelFont);

			//버튼 구매 후 금액 차감
			for(int i1 = 0; i1 < model.length; i1++) 
			{
				Label label = new Label(model[i1] + " -$" + price[i1]);
				label.setBounds(160+ (i1*260), 500, 200, 30);
				label.setFont(modelFont);
				f.add(label);

				final int productPrice = price[i1];
				final String productName = model[i1];
				
			}//for

			//구매완료 버튼 이벤트 생성
			int index = i;
			btnArr[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {


					switch(index) {
					case 0: 
						if(user.getMoney() >= price[0]) {

							JOptionPane.showMessageDialog(vita1, "마카 구매 완료");
							user.setMoney(user.getMoney()-price[0]);
							lw.save(user);
						}else {
							JOptionPane.showMessageDialog(f, "잔액이 부족합니다.");
						}
						break;
					case 1: 
						if(user.getMoney() >= price[1]) {

							JOptionPane.showMessageDialog(vita2, "A-Z멀티비타민 구매 완료");
							user.setMoney(user.getMoney()-price[1]);
							lw.save(user);
						}else {
							JOptionPane.showMessageDialog(f, "잔액이 부족합니다.");
						}

						break;
					case 2:
						if(user.getMoney() >= price[2]) {

							JOptionPane.showMessageDialog(vita3, "알파맨 멀티비타민 구매 완료");
							user.setMoney(user.getMoney()-price[2]);
							lw.save(user);
						}else {
							JOptionPane.showMessageDialog(f, "잔액이 부족합니다.");
						}
						break;
					case 3:
						if(user.getMoney() >= price[3]) {

							JOptionPane.showMessageDialog(vita4, "데일리 멀티비타민 구매 완료");
							user.setMoney(user.getMoney()-price[3]);
							lw.save(user);
						}else {
							JOptionPane.showMessageDialog(f, "잔액이 부족합니다.");
						}
						break;
					}

				}
			});

			//버튼 누를 시 금액 차감
			User user = new User();
			user.getMoney(); // 

			f.add(btnArr[i]);
		}

		//제품 금액 배열 생성
		String modelPrice[] = {"$12.49", "$11.74", "$15.63", "$11.74"};
		Label[] pri = new Label[4];

		//제품 금액 for문으로 반복후 위치 지정
		for(int i = 0; i < price.length; i++) {
			pri[i] = new Label(modelPrice[i]);
			int x = 100;
			int y = 530;
			pri[i].setBounds(x+(i*280), y, 135, 30);
			pri[i].setFont(modelFont);
			f.add(pri[i]);
		}

		//제품 이벤트 설명 이미지 첨부
		ImageIcon makainfo = new ImageIcon("image/makainfo.png");
		JLabel mi = new JLabel(makainfo);
		mi.setBounds(80, 570, 230, 140);
		mi.setVisible(true);

		ImageIcon multiinfo = new ImageIcon("image/multiinfo.PNG");
		JLabel mi1 = new JLabel(multiinfo);
		mi1.setBounds(330, 570, 230, 140);
		mi1.setVisible(true);

		ImageIcon alphamen = new ImageIcon("image/alphainfo.PNG");
		JLabel apm = new JLabel(alphamen);
		apm.setBounds(610, 560, 230, 140);
		apm.setVisible(true);

		ImageIcon daliyinfo = new ImageIcon("image/daliyinfo.PNG");
		JLabel dyo = new JLabel(daliyinfo);
		dyo.setBounds(870, 560, 230, 140);
		dyo.setVisible(true);

		//프레임에 이미지 추가
		f.add(title);
		f.add(vita1);
		f.add(vita2);
		f.add(vita3);
		f.add(vita4);
		f.add(mi);
		f.add(mi1);
		f.add(apm);
		f.add(dyo);
		//------------------------------------------
		f.addWindowListener(new WindowAdapter() 
		{
			@Override
			public void windowClosing(WindowEvent e) 
			{
				f.dispose();
			}
		});
		f.setVisible(true);
	}
}
