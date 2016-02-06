/*
 * Sydnee Wren
 * Due: July 27, 2015
 * 
 * GraphicsBox.java
 * Finish the programming project 1 on page 230 of the textbook.
 * The output should be like the copy attached to the instruction sheet. 
 * DrawingPanel.java was imported from the book's supplemental material
 * webpage online.
 */

import java.awt.*;

public class GraphicBox{
	public static void main(String[] args) {
			DrawingPanel panel = new DrawingPanel(400, 400);
			
			panel.setBackground(Color.CYAN);
			Graphics g = panel.getGraphics();
			
			int circles = 10;
			
			for (int i = 1; i <= 1; i++){
				int x = 0;
				int y = 0;
				
				for (int j = i; j <= i; j++){
				drawBox(g, x, y, 100, 100, circles);
				drawLines(g, x, y, 50, 50);
			
				}
			}

			circles = 4;
			for (int i = 0; i < 5; i++){
				for (int j = 0; j < 5; j++){
					int x = i * 24 + 10;
					int y = j * 24 + 120;
					
				drawBox(g, x, y, 24, 24, circles);
				drawLines(g, x, y, 12, 12);
				}
			}
			
			
			circles = 5;
			for (int i = 0; i < 6; i++){
				for (int j = 0; j < 6; j++){
					int x = i * 40 + 150;
					int y = j * 40 + 20;
					
				drawBox(g, x, y, 40, 40, circles);
				drawLines(g, x, y, 20, 20);
				}
			}
			
			circles = 3;
			for (int i = 0; i < 3; i++){
				for (int j = 0; j < 3; j++){
					int x = i * 36 + 130;
					int y = j * 36 + 275;
					
				drawBox(g, x, y, 36, 36, circles);
				drawLines(g, x, y, 18, 18);
				}
			}
	}
	
	public static void drawBox(Graphics g, int x, int y, int width, int height, int circles) {
		g.setColor(Color.GREEN);
		g.fillRect(x, y, width, height);
		
		g.setColor(Color.YELLOW);
		g.fillOval(x, y, width, height);
		
		g.setColor(Color.BLACK);		
		g.drawRect(x, y, width, height);
		g.drawOval(x, y, width, height);
		for (int i = 1; i <= circles; i++){
			g.drawOval(x  + 5 * i, y + 5 * i, width - 10 * i, height - 10 * i);
		}
	}
	public static void drawLines(Graphics g, int x, int y, int width, int height){
		g.drawLine(x, y+width, x + height *2 ,y + height);
		g.drawLine(x + width, y, x + height, y + height * 2);
		g.drawLine(x, y, x + (width * 2), y + (height * 2));
		g.drawLine(x, y + (width * 2), x + (height * 2), y);
	}
	
}