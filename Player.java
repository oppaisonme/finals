import java.awt.Graphics;
import java.awt.Color;


public class Player extends GameObject{

	
	public Player(int x, int y, ID id){
		super(x, y, id);
		
		
	}

	public void tick(){
		x += velX;
		y += velY;
	}

	public void render(Graphics g){
		if(id == ID.Player) g.setColor(Color.blue);
		else if(id == ID.Player2) g.setColor(Color.white);
		g.fillRect(x, y, 32, 32);
	}
}