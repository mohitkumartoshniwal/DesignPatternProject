package designpatternProject;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Rectangle implements Strategy  {
	int x = 70 ;
	int y =70;

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		JFrame frame =new JFrame () ;
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyDrawPanel drawPanel = new MyDrawPanel() ;
		frame.getContentPane().add(drawPanel) ;
		frame.setSize(300,300);
		frame.setVisible(true);
		
		for (int i =0; i <130; i++) {
			x++;
			y++;
			drawPanel.repaint();
			try {
				Thread.sleep(50);
			}catch (Exception ex) {
				
			}
		}
	}
	class MyDrawPanel extends JPanel {
		public void paintComponent(Graphics g) {
			g.setColor(Color.white);
			g.fillRect (0 ,0, this.getWidth() , this.getHeight());
			System.out.println("uhuhu");
			
		g.setColor(Color.green);
		g.fillRect(x,y,40,40);
		}
	}

}
