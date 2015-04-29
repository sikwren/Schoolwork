//Sydnee Wren
//Homework 9

import javax.swing.*;
import java.awt.*;

public class CheckerBoard extends JFrame{
	public CheckerBoard () {
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		this.setSize(225,250);
		this.setTitle("CheckerBoard (Homework 9)");
		
		JPanel panel = new JPanel(){
			public void paintComponent(Graphics g){
				super.paintComponent(g);
				
				this.setBackground(Color.GRAY);
				
				for (int row = 0; row < 8; row++){
					for(int col = 0; col < 8; col++){
					
						int x = col * 25 + 5;
						int y = row * 25 + 5;
					
						if ((row + col) % 2 == 0){
							g.setColor(Color.BLACK);
						} else {
							g.setColor(Color.RED);
						}
						g.fillRect(x , y, 25, 25);
					
					}
				}
				
				this.repaint();
			}
		};
		
		this.add(panel);
		this.setVisible(true);
	}
				
	public static void main(String[] args) {
		new CheckerBoard(); //create your container
	
	}
}



