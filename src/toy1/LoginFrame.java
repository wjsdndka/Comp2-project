package toy1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame {
	private JPasswordField passwordField;
	private JTextField textField;
	public LoginFrame() {
		setSize(500, 200);
		setTitle("로그인 페이지 입니다.");
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(82, 48, 100, 25);
		add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("PassWord");
		lblPassword.setBounds(82, 88, 100, 25);
		add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(200, 90, 116, 21);
		add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(200, 50, 116, 21);
		add(textField);
		textField.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(346, 49, 100, 58);
		btnLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 자동 생성된 메소드 스텁
				new MainFrame();
				new SatusFrame();
				setVisible(false);
				
			}
			
		});
		add(btnLogin);
		setLocationRelativeTo(null);
		setVisible(true);
		
		
		
		
	}
	protected void setDefaultCloseOperation(JButton btnLogin) {
		// TODO 자동 생성된 메소드 스텁
		
	}
}
