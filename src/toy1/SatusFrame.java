package toy1;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.sun.prism.shader.DrawCircle_ImagePattern_AlphaTest_Loader;

import sun.java2d.pipe.DrawImage;

public class SatusFrame extends JFrame {
	BufferedImage img = null;
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

		Pic_panel pp = new Pic_panel();
		pp.setBounds(12, 10, 151, 155);
		add(pp);
		

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
		setResizable(false);
		setVisible(true);

	}
	class Pic_panel extends JPanel{
		BufferedImage img = null;
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			try {
				img = ImageIO.read(new File("C:\\Users\\h0033\\Desktop\\download.png"));
			} catch (IOException e) {
				// TODO 자동 생성된 catch 블록
				e.printStackTrace();
			}
			g.drawImage(img, 12, 10, 151, 155, null);
			
		}
	}

	

}
