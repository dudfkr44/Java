package ex_page;

import java.awt.Button;
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
		Frame frame = new Frame();
		frame.setBounds(400, 200, 750, 800);
		frame.setLayout(null);
		
		Font font = new Font("",Font.BOLD,12);
		
		ImageIcon logo = new ImageIcon("image/logo.png");
		JButton easter_egg = new JButton(logo);
		easter_egg.setBounds(250, 50, 270, 47); //로고
		easter_egg.setContentAreaFilled(false); // 배경 색상 투명하게
		easter_egg.setBorderPainted(false); // 외곽선 투명하게
		
		ImageIcon person = new ImageIcon("image/person.png");
		JLabel person_label = new JLabel(person);
		person_label.setBounds(515,45,50,50);
		
		Label name = new Label(user.getName()+"   보유금액 : "+user.getMoney()+"원");
		name.setBounds(563,55,300,30);
		name.setFont(font);
		
		Button vitamin_b = new Button("비타민");
		vitamin_b.setBounds(600,70,50,50);
		vitamin_b.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				Vitamin vitamin = new Vitamin();
				vitamin.vitamin();
			}
		});
		
		
		frame.add(easter_egg);
		frame.add(person_label);
		frame.add(name);
		frame.addWindowListener(new WindowAdapter() 
		{
			@Override
			public void windowClosing(WindowEvent e) 
			{
				frame.dispose();
			}
		});
		frame.add(vitamin_b);
		
		frame.setVisible(true);
	} // main
}
