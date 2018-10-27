package test1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame {
	private JTextField textField;
	private JPasswordField passwordField;

	public LoginFrame() {
		setTitle("로그인 화면");
		setSize(450, 200);
		getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBounds(188, 53, 116, 21);
		getContentPane().add(textField);
		textField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(188, 84, 116, 21);
		getContentPane().add(passwordField);

		JLabel lblId = new JLabel("ID");
		lblId.setBounds(68, 56, 57, 15);
		getContentPane().add(lblId);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(68, 87, 57, 15);
		getContentPane().add(lblPassword);

		JButton btnNewButton = new JButton("Sign in");
		btnNewButton.setBounds(316, 53, 85, 52);
		getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Sign up");
		btnNewButton_1.setBounds(316, 128, 85, 23);
		btnNewButton_1.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				new SignUpFrame();
				
			}
			
		});
		getContentPane().add(btnNewButton_1);
		setVisible(true);
	}
}



