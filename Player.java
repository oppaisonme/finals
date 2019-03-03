import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;

public class Player extends GameObject{

	Random r = new Random();
	
	public Player(int x, int y, ID id){
		super(x, y, id);
		velX = r.nextInt(5);
		velY = r.nextInt(5);
	}

	public void tick(){
		x += velX;
		y += velY;
	}

	public void render(Graphics g){
		g.setColor(Color.blue);
		g.fillRect(x, y, 32, 32);
	}
}