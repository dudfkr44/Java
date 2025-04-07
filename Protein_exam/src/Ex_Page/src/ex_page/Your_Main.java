package Ex_Page.src.ex_page;

import java.awt.Button;

import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Your_Main 
{	
	User user;
	
	public Your_Main(String id) 
	{
		user = new User();
		User_load_writer_save user_load_writer_save = new User_load_writer_save(); 
		user = user_load_writer_save.load(id);
	}
	
	public void Your_main() 
	{
		User_Money_Thread thread;
		Frame frame = new Frame();
		
		frame.setBounds(400, 200, 750, 800);
		frame.setLayout(null);
		
		Font font = new Font("",Font.BOLD,12);
		
		ImageIcon logo = new ImageIcon("image/logo.png");
		JButton easter_egg = new JButton(logo);
		easter_egg.setBounds(250, 50, 270, 47); //로고
		easter_egg.setContentAreaFilled(false); // 배경 색상 투명하게
		easter_egg.setBorderPainted(false); // 외곽선 투명하게
		easter_egg.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				RpsGame rpsgame = new RpsGame();
				rpsgame.startGame();
			}
		});
		
		ImageIcon person = new ImageIcon("image/person.png");
		JLabel person_label = new JLabel(person);
		person_label.setBounds(515,45,50,50);
		
		JLabel nameLabel = new JLabel(user.getName() + "   보유금액 : " + user.getMoney() + "원");
        nameLabel.setFont(font);
        nameLabel.setBounds(563, 55, 300, 30);
		
        thread = new User_Money_Thread(user, nameLabel);
        thread.start();
		
		JButton vitamin = new JButton("비타민");
		vitamin.setBounds(50,370,650,50);
		vitamin.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				Vitamin vitamin = new Vitamin(user);
				vitamin.vitamin();
			}
		});
		
		JButton p = new JButton("운동기구");
		p.setBounds(50,440,650,50);
		p.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				Exercise exercise = new Exercise(user);
				exercise.main();
			}
		});
		
		JButton r = new JButton("닭가슴살");
		r.setBounds(50,510,650,50);
		r.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				Text002 t = new Text002(user);
				t.show();
			}
		});
		JButton protein = new JButton("프로틴");
		protein.setBounds(50,580,650,50);
		protein.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				Protein p = new Protein(user);
				p.protein();
			}
		});
		
		JButton sprots = new JButton("스포츠");
		sprots.setBounds(50,650,650,50);
		sprots.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				SportsWear sportsWear = new SportsWear(user);
				sportsWear.main();
			}
		});
		
		
		Button addMoneyButton = new Button("+");
        addMoneyButton.setBounds(563, 90, 50, 30);
        addMoneyButton.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                user.setMoney(user.getMoney() + 100000); // 돈 100000원 증가
                nameLabel.setText(user.getName() + "   보유금액 : " + user.getMoney() + "원"); // 업데이트
            }
        });

        frame.add(easter_egg);
        frame.add(person_label);
        frame.add(nameLabel);
        frame.add(vitamin);
        frame.add(r);
        frame.add(p);
        frame.add(protein);
        frame.add(sprots);
        frame.add(addMoneyButton);
		frame.add(easter_egg);
		frame.add(person_label);
		frame.add(nameLabel);
		
		frame.addWindowListener(new WindowAdapter() 
		{
			@Override
			public void windowClosing(WindowEvent e) 
			{
				thread.stop();
				frame.dispose();
			}
		});
		
		frame.setVisible(true);
	} // main
}
