package toy1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ToyPanel1 extends JPanel {
	public ToyPanel1() {
		JButton button1 = new JButton("버튼 1");
		JButton button2 = new JButton("버튼 2");
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 자동 생성된 메소드 스텁
				System.out.println("버튼 1을 눌렀습니다.");
				new SubFrame1();
			}

		});
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 자동 생성된 메소드 스텁
				System.out.println("버튼 2를 눌렀습니다.");
				
			}

		});
		add(button1);
		add(button2);
	}

}
