package designpatternProject;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

import onlinetest2.MainFrame;



public class StrategyADapterwithgui extends JFrame {
	
	  static JFrame f; 
	  static Context context;

	
	
	public StrategyADapterwithgui() {
		
//		JPanel mainPanel = new JPanel();
//		mainPanel.setBounds(new Rectangle(0, 0, 1000, 600));
//		mainPanel.setBorder(UIManager.getBorder("ComboBox.editorBorder"));
//		setContentPane(mainPanel);
//		mainPanel.setLayout(null);
		
		
		
		
		
		
		
		
	}
	   public static void main(String[] args) {
		   f = new JFrame("Animation"); 
		   JPanel p = new JPanel(); 
		   
		   
		   JButton rectangle = new JButton("RECTANGLE");

			JButton circle = new JButton("CIRCLE");

			JButton oval = new JButton("OVAL");
			
			rectangle.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					context = new Context((Strategy) new Rectangle());			
				      context.executeStrategy();
				}
				
			});
			
			
			circle.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					context = new Context(new Circle());	
				      context.executeStrategy();
				}
				
			});
			
			
			oval.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					context = new Context(new myOvalStrategy());	
				      context.executeStrategy();
				      
				}
				
			});
			
			p.add(circle);
			p.add(rectangle);
			p.add(oval);
			
			 f.add(p); 
			  
		        f.setSize(200, 220); 
		        f.setResizable(false);
				f.setTitle("Animations\r\n");
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				f.setBounds(100, 100, 1000, 600);
		        
		   f.setVisible(true);
	      
	      
	   }
	}