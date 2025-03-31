package ex_page;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MyFrame 
{
	public static void main(String[] args) 
	{
		Frame f = new Frame("프로틴");
		f.setLayout(null);
		f.setBounds(400, 100, 1200, 900);
		
		Font title_t = new Font("",Font.BOLD,25);
		
		Font name_t = new Font("",Font.BOLD,15);
		
		Label title = new Label("Yout Protein");
		title.setBounds(523,45,150,50);
		title.setFont(title_t);
		
		
		
		//이미지 4개 
		String[] imageFiles1 = 
			{
			    "image/1.jpg",
			    "image/2.jpg",
			    "image/3.jpg",
			    "image/4.jpg"
			};

			JLabel[] labels = new JLabel[4];
			for (int i = 0; i < 4; i++) 
			{
				int initialX = 80; // 시작 x 좌표
				int xGap = 260;    // x 좌표 간격
			    ImageIcon image1 = new ImageIcon(imageFiles1[i]);
			    labels[i] = new JLabel(image1);
			    labels[i].setBounds(initialX + (i * xGap), 100, 250, 250);
			    f.add(labels[i]);
			}
			//이미지4 2줄
			JLabel[] labels2 = new JLabel[4];
			String[] imageFiles2 = 
				{
				    "image/5.jpg",
				    "image/6.jpg",
				    "image/7.jpg",
				    "image/8.jpg"
				};

				for (int i = 0; i < 4; i++) 
				{
					int initialX = 80; // 시작 x 좌표
					int xGap = 260;    // x 좌표 간격
				    ImageIcon image2 = new ImageIcon(imageFiles2[i]);
				    labels2[i] = new JLabel(image2);
				    labels2[i].setBounds(initialX + (i * xGap), 470, 250, 250);
				    f.add(labels2[i]);
				}
				
				//1줄 이름
				Label[] names = new Label[4];
				String[] productNames = 
					{
					    "임팩트 웨이 프로틴", 
					    "임팩트 비건 프로틴", 
					    "임팩트 다이어트 웨이", 
					    "아침 식사 스무디"
					};
				
				for (int i = 0; i < 4; i++) 
				{
					int initialX = 117; // 시작 x 좌표
					int xGap = 268;    // x 좌표 간격
				    names[i] = new Label(productNames[i]);
				    names[i].setBounds(initialX + (i * xGap), 360, 230, 30);
				    names[i].setFont(name_t);
					names[i].setVisible(true);
					f.add(names[i]);
				}
				
				//2줄 이름
				Label[] names2 = new Label[4];
				String[] productNames2 = 
					{
					    "임팩트 소이 프로틴", 
					    "어드밴스트 웨이트 게이너", 
					    "임팩트 완두콩 프로틴", 
					    "클리어 웨이 프로틴"
					};
				
				for (int i = 0; i < 4; i++) 
				{
					int initialX = 117; // 시작 x 좌표
					int xGap = 260;    // x 좌표 간격
				    names2[i] = new Label(productNames2[i]);
				    names2[i].setBounds(initialX + (i * xGap), 730, 200, 30);
				    names2[i].setFont(name_t);
					names2[i].setVisible(true);
					f.add(names2[i]);
				}
				
				//1줄 가격
				String[] price1_s = {"￦26900","￦18900","￦52900","￦81900"};
				
				Label[] price1 = new Label[4];
				for(int i = 0; i<4;i++)
				{
					int initialX = 170;
					int xGap = 260;    // x 좌표 간격
					price1[i] = new Label(price1_s[i]);
					price1[i].setBounds(initialX+(i*xGap),380,135,32);
					price1[i].setFont(name_t);
					f.add(price1[i]);
				}
				//2줄 가격 
				String[] price2_s = {"￦29900","￦89900","￦35900","￦59900"};
				
				Label[] price2 = new Label[4];
				for(int i = 0; i<4;i++)
				{
					int initialX = 170;
					int xGap = 260;    // x 좌표 간격
					price2[i] = new Label(price2_s[i]);
					price2[i].setBounds(initialX+(i*xGap),750,135,32);
					price2[i].setFont(name_t);
					f.add(price2[i]);
				}
				
				// 버튼 1줄
				Button[] btn1 = new Button[4];
				for(int i = 0 ; i<4 ;i++)
				{	//시작 y는 500
					int inintitalX = 80; 
					int xGap = 260;
					btn1[i] = new Button("구매");
					btn1[i].setBounds(inintitalX+(xGap * i),413,250,30);
					btn1[i].setVisible(true);
					f.add(btn1[i]);
				}
				
				//2줄 버튼
				Button[] btn2 = new Button[4];
				for(int i = 0 ; i<4 ;i++)
				{	//시작 y는 500
					int inintitalX = 80; 
					int xGap = 260;
					btn2[i] = new Button("구매");
					btn2[i].setBounds(inintitalX+(xGap * i),785,250,30);
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
