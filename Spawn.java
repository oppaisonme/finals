import java.util.Random;


public class Spawn{

	private Handler handler;
	private HUD hud;
	private int scoreKeep = 0;
	private Random r = new Random();

	public Spawn(Handler handler, HUD hud){
		this.handler = handler;
		this.hud = hud;


	}

	public void tick(){
		scoreKeep++;


		if(scoreKeep >= 300){
			scoreKeep = 0;
			hud.setLevel(hud.getLevel() + 1);
		
			
			if(hud.getLevel() == 2){
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
			}
			else if(hud.getLevel() == 3){
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
			}
			else if(hud.getLevel() == 4){
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
			}
			else if(hud.getLevel() == 5){
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
			}
			else if(hud.getLevel() == 6){
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
			}
			else if(hud.getLevel() == 8){
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
			}
			else if(hud.getLevel() == 10){
				handler.clearEnemies();
				handler.addObject(new EnemyBoss((Game.WIDTH / 2) - 48, -120, ID.EnemyBoss, handler));
			}
			else if(hud.getLevel() == 13){
				handler.clearEnemies();
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));			
			}
			else if(hud.getLevel() == 15){
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
			}
			else if(hud.getLevel() == 18){
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
			}
			else if(hud.getLevel() == 20){
				handler.clearEnemies();
				handler.addObject(new EnemyBoss2((Game.WIDTH / 2) - 48, -120, ID.EnemyBoss2, handler));
			}
			else if(hud.getLevel() == 22){
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
			}
			else if(hud.getLevel() == 23){
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
			}
			else if(hud.getLevel() == 24){
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
			}
			else if(hud.getLevel() == 25){
				handler.clearEnemies();
				handler.addObject(new EnemyBoss((Game.WIDTH / 2) - 48, -120, ID.EnemyBoss, handler));
			}
			else if(hud.getLevel() == 27){
				handler.addObject(new EnemyBoss2((Game.WIDTH / 2) - 48, -120, ID.EnemyBoss2, handler));

			}
		}
	}
	
} 