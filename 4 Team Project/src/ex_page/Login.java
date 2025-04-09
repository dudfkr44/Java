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

import javax.swing.ImageIcon;
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
		
		ImageIcon login_home = new ImageIcon("image/login_icon.png");
		JLabel login_h = new JLabel(login_home);
		login_h.setBounds(0,0,400,400);
		
		//Id 
		Label id_lable = new Label("Id : ");
		id_lable.setBounds(60,202,55,20);
		id_lable.setFont(font_id);
		//Id입력칸
		TextField id = new TextField(Label.CENTER);
		id.setBounds(115,200,200,30);
		
		//Pw
		Label pw_lable = new Label("Pw : ");
		pw_lable.setBounds(60,242,40,20);
		pw_lable.setFont(font_id);
		//Pw입력칸
		TextField pw = new TextField(Label.CENTER);
		pw.setBounds(115,240,200,30);
		pw.setEchoChar('*');
		
		Button login = new Button("로그인");
		login.setBounds(73,292,111,45);
		
		
		
		login.addActionListener(new ActionListener()  // 로그인 버튼 누를 때
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
				                User user = new User();
				                user = (User)ois.readObject(); // 유저 값 로드

				                if(id.getText().equals(user.getId()) && pw.getText().equals(user.getPw()))
				                {
				                    Your_Main main_page = new Your_Main(id.getText());
				                    frame.dispose();
				                    main_page.Your_main();
				                }
				                else
				                {
				                    JDialog dialog = new JDialog(frame, "경고!", true);
				                    dialog.setSize(250, 150);
				                    dialog.setLayout(null);
				                    dialog.setLocationRelativeTo(frame);

				                    JLabel label = new JLabel("비밀번호가 틀렸습니다.", JLabel.CENTER);
				                    label.setBounds(20, 20, 200, 30);
				                    dialog.add(label);

				                    Button confirmButton = new Button("확인");
				                    confirmButton.setBounds(75, 70, 100, 30);
				                    confirmButton.addActionListener(new ActionListener() {
				                        @Override
				                        public void actionPerformed(ActionEvent e) {
				                            dialog.dispose();
				                        }
				                    });
				                    dialog.add(confirmButton);

				                    dialog.setVisible(true);
				                }
				            } 
				            catch (Exception e2) 
				            {
				                e2.printStackTrace();
				            }
				        }
				        else
				        {
				            JDialog dialog = new JDialog(frame, "경고!", true);
				            dialog.setSize(250, 150);
				            dialog.setLayout(null);
				            dialog.setLocationRelativeTo(frame);

				            JLabel label = new JLabel("아이디가 존재하지 않습니다.", JLabel.CENTER);
				            label.setBounds(20, 20, 200, 30);
				            dialog.add(label);

				            Button confirmButton = new Button("확인");
				            confirmButton.setBounds(75, 70, 100, 30);
				            confirmButton.addActionListener(new ActionListener() {
				                @Override
				                public void actionPerformed(ActionEvent e) {
				                    dialog.dispose();
				                }
				            });
				            dialog.add(confirmButton);

				            dialog.setVisible(true);
				        }
				    }
				});
		
		
		Button register = new Button("회원가입");
		register.setBounds(215,292,111,45);
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
		frame.add(login_h);
		frame.setVisible(true);
	} // main
}
