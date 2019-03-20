import java.awt.Graphics;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Graphics2D;
import java.util.Random;


public class EnemyBossBullet2 extends GameObject{

	private Handler handler;
	Random r = new Random();
	
	public EnemyBossBullet2(int x, int y, ID id, Handler handler){
		super(x, y, id);

		this.handler = handler;

		velX = (r.nextInt(5 - -5) + -5);
		velY = 5;

	}

	public Rectangle getBounds(){
		return new Rectangle(x, y, 16, 16);
	}

	public void tick(){
		x += velX;
		y += velY;

		//if(y <= 0 || y >= Game.HEIGHT - 32) velY *= -1;
		//if(x <= 0 || x >= Game.WIDTH - 16) velX *= -1;

		if(y >= Game.HEIGHT) handler.removeObject(this);

		handler.addObject(new Trail(x, y, ID.Trail, Color.cyan, 16, 16, 0.02f, handler));

	}

	public void render(Graphics g){
		g.setColor(Color.cyan);
		g.fillRect(x, y, 16, 16);
	}
}