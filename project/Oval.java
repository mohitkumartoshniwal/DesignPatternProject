package designpatternProject;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

import designpatternProject.Rectangle.MyDrawPanel;

public class Oval {
	int x = 70 ;
	int y =70;
	
	int w=30;
	int h=40;

	public void drawOval() {
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
			
			Graphics2D g2d = (Graphics2D)g;
			 
			  // Draw an oval that fills the window
			 
			 
			  
			  g2d.setColor(Color.red);
			 
			  // to draw a filled arc use : g2d.fillArc(x, y, w, h, startAngle, arcAngle) instead
			 
			  g2d.drawOval(x, y, w, h);
			
		
		}
	}

}
