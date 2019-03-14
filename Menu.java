
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Menu{

	

	public void tick(){

	}

	public void render(Graphics g){
		Font fnt = new Font("arial", 1, 50);
		Font fnt2 = new Font("arial", 1, 30);

		g.setFont(fnt);
		g.setColor(Color.white);
		g.drawString("Menu", 250, 70);
		
		g.setFont(fnt2);
		g.drawRect(210, 100, 200, 64);
		g.drawString("Play", 280, 145);

		
		g.drawRect(210, 200, 200, 64);
		g.drawString("Help", 280, 245);

		
		g.drawRect(210, 300, 200, 64);
		g.drawString("Quit", 280, 345);

	}
	
}