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
		textPane.setText("1. 채팅프로그램 --> 쓰레드 시스템\r\n2. 로그인 프로그램 --> DB 활용\r\n3. 회원 가입 -->DB 활용\r\n4. 윷놀이 --> 게임 결과\r\n\r\n");
		getContentPane().add(textPane, BorderLayout.NORTH);
		
		setVisible(true);
		
	}
}
