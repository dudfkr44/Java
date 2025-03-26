package ex3_choice;

import java.awt.Choice;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex2_Choice {
	public static void main(String[] args) {
		Frame f = new Frame();
		Choice local = new Choice();
		Label display = new Label("선택된 지역", Label.CENTER);

		f.setLayout(null);
		f.setBounds(400, 200, 300, 150);

		// Choice 컴포넌트 설정
		local.setBounds(30, 50, 230, 20);
		local.add("지역 선택");
		local.add("서울");
		local.add("경기");
		local.add("인천");
		local.add("광주");
		local.add("대구");
		local.add("대전");
		local.add("부산");

		// 선택 감지자(addItemListener) 선언
		local.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				String selected = local.getSelectedItem();
				String formatStr = String.format("%s(을)를 선택함", selected);
				display.setText(formatStr); // 라벨 업데이트
			}
		});

		// 라벨 설정
		Font font = new Font("", Font.BOLD, 15);
		display.setBounds(30, 80, 230, 30); // Choice 아래 위치
		display.setFont(font);

		// 프레임에 추가
		f.add(local);
		f.add(display);

		// 창 닫기 이벤트
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		f.setVisible(true);
	}
}