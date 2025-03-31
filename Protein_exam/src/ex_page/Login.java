package ex_page;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JDialog;
import javax.swing.JLabel;

public class Login 
{
	public void login() 
	{
		 
		Frame frame = new Frame("로그인");
		
		Font font_id = new Font("",Font.BOLD,20);
		frame.setLayout(null);
		frame.setBounds(400, 150, 400, 400);
		
		//Id 
		Label id_lable = new Label("Id : ",Label.CENTER);
		id_lable.setBounds(10,50,400,20);
		id_lable.setFont(font_id);
		//Id입력칸
		TextField id = new TextField(Label.CENTER);
		id.setBounds(80,75,250,30);
		
		//Pw
		Label pw_lable = new Label("Pw : ",Label.CENTER);
		pw_lable.setBounds(10,120,400,20);
		pw_lable.setFont(font_id);
		//Pw입력칸
		TextField pw = new TextField(Label.CENTER);
		pw.setBounds(80,145,250,30);
		
		Button login = new Button("로그인");
		login.setBounds(80,230,100,50);
		
		
		
		login.addActionListener(new ActionListener()  //로그인 버튼 누를때
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String path = "C:/4jo/Protein/User/"+id.getText().trim()+"/userInfo.sav";
				File f = new File(path);
				
				if(f.exists())
				{
					FileInputStream fis = null;
					ObjectInputStream ois = null;
					
					try 
					{
						fis = new FileInputStream(f);
						ois = new ObjectInputStream(fis);
						User user = new  User();
						user = (User)ois.readObject(); //유저값을 보내야됨
						if(id.getText().equals(user.getId()) && pw.getText().equals(user.getPw()))
						{
							Your_Main main_page = new Your_Main(id.getText());
							frame.dispose();
							main_page.Your_main();
						}
						else
						{
							JDialog register_ok = new JDialog(frame, "경고!", true);
			                register_ok.setSize(200, 150);
			                register_ok.setLocationRelativeTo(frame);
			                JLabel label_register_ok = new JLabel("비밀번호가 틀렸습니다.");
			                //버튼 만들어야됨 확인버튼
			                register_ok.add(label_register_ok);
			                register_ok.setVisible(true);
						}
					} 
					catch (Exception e2) 
					{
						// TODO: handle exception
					}
					
				}//if
				
				else
				{
					JDialog register_ok = new JDialog(frame, "경고!", true);
	                register_ok.setSize(200, 150);
	                register_ok.setLocationRelativeTo(frame);
	                JLabel label_register_ok = new JLabel("아이디가 존재하지 않습니다.");
	                register_ok.add(label_register_ok);
	                register_ok.setVisible(true);
				}
			}
		});
		
		
		Button register = new Button("회원가입");
		register.setBounds(228,230,100,50);
		register.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.dispose();
				Register register = new Register();
				register.show_register();
			}
		});
		
		
		id.addKeyListener(new KeyAdapter() // id창에서 엔터시 pw로 이동 
		{ 
		    @Override
		    public void keyPressed(KeyEvent e)  // keyPressed로 변경 
		    { 
		        if (e.getKeyCode() == KeyEvent.VK_ENTER) 
		        {
		            pw.setFocusable(true); 		// pw가 포커스를 받을 수 있도록 설정
		            pw.requestFocusInWindow(); // id창에서 엔터시 pw필드로 이동
		        }
		    }
		});
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				frame.dispose();
			}
		});
		frame.add(id_lable);
		frame.add(id);
		frame.add(pw);
		frame.add(pw_lable);
		frame.add(login);
		frame.add(register);
		frame.setVisible(true);
	} // main
}
