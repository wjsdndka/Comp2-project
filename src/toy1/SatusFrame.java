package toy1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class SatusFrame extends JFrame{
	public SatusFrame() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(207, 10, 57, 15);
		getContentPane().add(lblNewLabel);
		
		JLabel lblRank = new JLabel("Rank");
		lblRank.setBounds(207, 37, 57, 15);
		getContentPane().add(lblRank);
		
		JLabel lblDbId = new JLabel("DB ID");
		lblDbId.setBounds(309, 10, 57, 15);
		getContentPane().add(lblDbId);
		
		JLabel lblDbRank = new JLabel("DB RANK");
		lblDbRank.setBounds(309, 37, 57, 15);
		getContentPane().add(lblDbRank);
		
		JPanel Pic_panel = new JPanel();
		Pic_panel.setBounds(12, 10, 151, 155);
		getContentPane().add(Pic_panel);
		
		JLabel lblNewLabel_1 = new JLabel("WIN");
		lblNewLabel_1.setBounds(207, 100, 57, 15);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblLose = new JLabel("LOSE");
		lblLose.setBounds(207, 125, 57, 15);
		getContentPane().add(lblLose);
		
		JLabel lblGame = new JLabel("GAME");
		lblGame.setBounds(207, 150, 57, 15);
		getContentPane().add(lblGame);
		
		JLabel lblDbwin = new JLabel("DB_win");
		lblDbwin.setBounds(309, 100, 57, 15);
		getContentPane().add(lblDbwin);
		
		JLabel lblDblose = new JLabel("DBLOSE");
		lblDblose.setBounds(309, 125, 57, 15);
		getContentPane().add(lblDblose);
		
		JLabel lblDbGame = new JLabel("DB Game");
		lblDbGame.setBounds(309, 150, 57, 15);
		getContentPane().add(lblDbGame);
		
		setTitle("유저 스테이터스");
		setSize(400, 250);
		setVisible(true);
		
	}
}
