package toy1; //윷놀이 메인 프레임

import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame{
	public MainFrame() {
		setSize(800, 800);
		setTitle("윷놀이");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new ToyPanel1());
		setLocationRelativeTo(null);
		setVisible(true);
		
		
	}
	


}

