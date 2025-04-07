package ex_page;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class Register 
{
	public void show_register() 
	{
		User user = new User();
		
		Frame frame = new Frame("회원가입");
		frame.setLayout(null);
		frame.setBounds(750, 250, 500, 520);
		
		Font font = new Font("",Font.BOLD,15);
		
		ImageIcon logo = new ImageIcon("image/logo.png");
		JButton logo_b = new JButton(logo);
		logo_b.setBounds(115, 50, 270, 50); //로고
		logo_b.setContentAreaFilled(false); // 배경 색상 투명하게
		logo_b.setBorderPainted(false); // 외곽선 투명하게
		
		Label label_id = new Label("아이디");
		label_id.setFont(font);
		label_id.setBounds(125,120,500,30);
		TextField text_id = new TextField();
		text_id.setBounds(125, 150, 250, 25);
		
		
		Label label_pw = new Label("비밀번호");
		label_pw.setFont(font);
		label_pw.setBounds(125,180,500,30);
		TextField text_pw = new TextField();
		text_pw.setFont(font);
		text_pw.setBounds(125, 210, 250, 30);
		// 입력한 텍스트를 별표(*)로 히든 상태로 보이게 설정
		text_pw.setEchoChar('*');
		
		
		
		Label label_name = new Label("이름");
		label_name.setFont(font);
		label_name.setBounds(125,240,500,30);
		TextField text_name = new TextField();
		text_name.setBounds(125,270,250,30);
		text_name.setFont(font);
		
		
		Label label_tel = new Label("전화번호");
		label_tel.setFont(font);
		label_tel.setBounds(125,300,500,30);
		TextField text_tel = new TextField();
		text_tel.setBounds(125,330,250,30);
		text_tel.setFont(font);
		
		Label gender = new Label("성별");
		gender.setFont(font);
		gender.setBounds(125, 360, 50, 30);
		
		CheckboxGroup group = new CheckboxGroup();
		Checkbox male = new Checkbox("남자", group, false);
		Checkbox female = new Checkbox("여자", group, false);
		male.setBounds(125, 380, 50, 40); // 너비 조정
		female.setBounds(333, 380, 50, 40); // 위치 조정
		
		Button register_b = new Button("회원가입"); //회원가입 버튼
		register_b.setBounds(125,450,120,30);
		
		register_b.addActionListener(new ActionListener() //회원가입 버튼 누르면 데이터 저장 
		{
		    @Override
		    public void actionPerformed(ActionEvent e) 
		    {
		        String id = text_id.getText();  // 아이디 입력한값을 user - id에 저장
		        String pw = text_pw.getText();  // 비밀번호 입력한값을 user - pw에 저장
		        String name = text_name.getText();  // 이름 입력한값을 user - name에 저장
		        String tel = text_tel.getText();  // 전화번호 입력한값을 user - tel에 저장
		        
		        user.setId(id);
		        user.setPw(pw);
		        user.setName(name);
		        user.setTel(tel);
		        if (male.getState()) 
		        {
		            user.setGender("남자");
		        } 
		        else if (female.getState()) 
		        {
		            user.setGender("여자");
		        }
		        
		        String path = "C:/4jo/Protein/User/"+user.getId().trim();
		        File f = new File(path);
		        if(!f.exists()) //데이터에 회원아이디가 없으면 
		        {
		       		User_load_writer_save set_get = new User_load_writer_save(user);
		       		User user =new User();
		       		user = set_get.load();
		       		
					JDialog register_ok = new JDialog(frame, "성공", true);
	                register_ok.setSize(300, 200);
	                register_ok.setLocationRelativeTo(frame);
	                
		            JLabel label_register_ok = new JLabel("회원가입이 완료되었습니다.");
		            label_register_ok.setBounds(70, 30, 200, 50);
		            register_ok.add(label_register_ok);
		            register_ok.setLayout(null);
		            
		            JButton confirmButton = new JButton("확인");
		        	confirmButton.setBounds(100, 100, 100, 30);  // 위치와 크기 지정
		        	confirmButton.addActionListener(e2 -> 
		        	{
		        	    register_ok.dispose();  // 확인 버튼 클릭 시 대화상자 닫기 
		        	});
		        	register_ok.add(confirmButton);
		            register_ok.setVisible(true);
		            Login login = new Login();
		            frame.dispose();
		            login.login();
		        }
		        else //데이터에 회원 아이디가 존재하면
		        {
		        	JDialog register_no = new JDialog(frame, "경고!", true); // modal = true -> 부모 프레임과 상호작용을 막음
		        	register_no.setSize(300, 200);
		        	register_no.setLocationRelativeTo(frame);
		        	register_no.setLayout(null);  // 레이아웃을 null로 설정하여 setBounds()로 위치 지정 가능

		        	// 레이블 추가
		        	JLabel label_register_no = new JLabel("이미 존재하는 아이디입니다.");
		        	label_register_no.setBounds(70, 30, 200, 50); // 위치와 크기 지정
		        	register_no.add(label_register_no);

		        	// 확인 버튼 추가
		        	JButton confirmButton = new JButton("확인");
		        	confirmButton.setBounds(100, 100, 100, 30);  // 위치와 크기 지정
		        	confirmButton.addActionListener(e2 -> {
		        	    register_no.dispose();  // 확인 버튼 클릭 시 대화상자 닫기
		        	});
		        	register_no.add(confirmButton);

		        	// JDialog 보이기
		        	register_no.setVisible(true);
		        }
		    }
		});
		
		Button exit_b = new Button("닫기"); //닫기 버튼
		exit_b.setBounds(255,450,120,30);
		exit_b.addActionListener(new ActionListener() //닫기버튼 클릭시 프레임 종료
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.dispose();
			}
		});
		
		frame.add(logo_b);
		frame.add(label_id);
		frame.add(text_id);
		frame.add(label_pw);
		frame.add(text_pw);
		frame.add(label_name);
		frame.add(text_name);
		frame.add(label_tel);
		frame.add(text_tel);
		frame.add(register_b);
		frame.add(exit_b);
		frame.add(gender);
		frame.add(male);
		frame.add(female);
		
		frame.addWindowListener(new WindowAdapter() 
		{
			@Override
			public void windowClosing(WindowEvent e) 
			{
				System.exit(0);
			}
		});
		frame.setVisible(true);
		
	} // main
}
