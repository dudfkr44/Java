package ex2_check;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex_CheckBox {
	public static void main(String[] args) {
		Frame f = new Frame();
		Checkbox sports = new Checkbox("Sports");
		Checkbox movie = new Checkbox("Movie");
		Checkbox music = new Checkbox("Music");
		sports.setBounds(20, 90, 55, 20);
		movie.setBounds(80, 90, 50, 20);
		music.setBounds(135, 90, 50, 20);

		// 체크박스 선택을 감지하는 감지자
		ItemListener checkItemListener = new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// e.getItem().toString() : 선택된 체크박스의 문자열을 출력
				System.out.println(e.getItem().toString());

				switch (e.getItem().toString()) {
				case "Sports":
					String s = e.getStateChange() == 1 ? "Sports Checked" : "Sports UnChecked";
					System.out.println(s);
					break;
				case "Movie":
					s = e.getStateChange() == 1 ? "Movie Checked" : "Movie UnChecked";
					System.out.println(s);
					break;
				case "Music":
					s = e.getStateChange() == 1 ? "Music Checked" : "Music UnChecked";
					System.out.println(s);
					break;
				}

			}
		};

		sports.addItemListener(checkItemListener);
		movie.addItemListener(checkItemListener);
		music.addItemListener(checkItemListener);

		f.setLayout(null);
		f.setBounds(500, 100, 800, 250);

		Font font = new Font("", Font.BOLD, 30);
		Label q1 = new Label("1. 관심 분야는 무엇입니까?");
		q1.setFont(font);
		q1.setBounds(20, 30, 400, 40);

		f.add(q1);
		f.add(sports);
		f.add(movie);
		f.add(music);

		// 라디오(둥근 형태) 버튼
		Label q2 = new Label("2. 당신의 성별은 무엇입니까?");
		q2.setFont(font);
		q2.setBounds(20, 120, 450, 40);

		// 라디오 버튼 선택 감지자
		// 라디오 버튼 리스너
		ItemListener radioItemListener = new ItemListener() { // 변수명 수정
			@Override
			public void itemStateChanged(ItemEvent e) {
				String item = e.getItem().toString();
				switch (item) {
				case "남자":
					System.out.println("I am Male.");
					break;
				case "여자":
					System.out.println("I am Female.");
					break;
				}
			}
		};

		CheckboxGroup group = new CheckboxGroup();
		Checkbox male = new Checkbox("남자", group, true);
		Checkbox female = new Checkbox("여자", group, false);
		male.setBounds(20, 165, 80, 40); // 너비 조정
		female.setBounds(110, 165, 80, 40); // 위치 조정

		male.addItemListener(radioItemListener); // 오타 수정
		female.addItemListener(radioItemListener); // 오타 수정

		f.add(q2);
		f.add(male);
		f.add(female);

		// 창 닫기 이벤트
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		f.setVisible(true);

	} // main

}
