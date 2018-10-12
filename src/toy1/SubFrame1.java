package toy1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextPane;

public class SubFrame1 extends JFrame{
	public SubFrame1() {
		setTitle("서브 프레임 입니다.");
		setSize(500, 500);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setText("만들어야 하는 목록 입니다. \r\n1. 로그인 페이지 이벤트 처리 및 기타 프로그램 응용 가능?\r\n2. 쓰레드 프로그래밍\r\n3, GUI 프로 그래밍\r\n4, DB 활용\r\n5, 랭킹 시스템\r\n6, ~~~`");
		getContentPane().add(textPane, BorderLayout.CENTER);
		
		setVisible(true);
		
	}
}
