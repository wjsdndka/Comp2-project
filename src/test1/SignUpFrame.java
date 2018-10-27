package test1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class SignUpFrame extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	public SignUpFrame() {
		setTitle("회원가입 페이지");
		setVisible(true);
		setSize(600, 600);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("이름");
		lblNewLabel.setBounds(64, 31, 57, 15);
		getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("생년월일");
		label.setBounds(64, 56, 57, 15);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("이메일");
		label_1.setBounds(64, 81, 57, 15);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("닉네임");
		label_2.setBounds(64, 106, 57, 15);
		getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("아이디");
		label_3.setBounds(64, 147, 57, 15);
		getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("비밀번호");
		label_4.setBounds(64, 172, 57, 15);
		getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("비밀번호 확인");
		label_5.setBounds(64, 197, 76, 15);
		getContentPane().add(label_5);
		
		textField = new JTextField();
		textField.setBounds(238, 28, 116, 21);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(238, 53, 116, 21);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(238, 78, 116, 21);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(238, 103, 116, 21);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(238, 144, 116, 21);
		getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(238, 169, 116, 21);
		getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(238, 194, 116, 21);
		getContentPane().add(textField_6);
		
		JButton btnNewButton = new JButton("회원가입");
		btnNewButton.setBounds(325, 228, 97, 23);
		getContentPane().add(btnNewButton);
	}

}
