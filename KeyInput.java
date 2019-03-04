import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter{
	
	private Handler handler;

	public KeyInput(Handler handler){
		this.handler = handler;
	}

	public void keyPressed(KeyEvent e){
		int Key = e.getKeyCode();

		for(int i = 0; i < handler.object.size(); i++){
			GameObject tempObject = handler.object.get(i);

			if(tempObject.getId() == ID.Player){
				//player 1

				if(Key == KeyEvent.VK_W) tempObject.setvelY(-5);
				if(Key == KeyEvent.VK_S) tempObject.setvelY(5);
				if(Key == KeyEvent.VK_D) tempObject.setvelX(5);
				if(Key == KeyEvent.VK_A) tempObject.setvelX(-5);
			}

			if(tempObject.getId() == ID.Player2){
				//player 2

				if(Key == KeyEvent.VK_UP) tempObject.setvelY(-5);
				if(Key == KeyEvent.VK_DOWN) tempObject.setvelY(5);
				if(Key == KeyEvent.VK_RIGHT) tempObject.setvelX(5);
				if(Key == KeyEvent.VK_LEFT) tempObject.setvelX(-5);
				
			}
		}
	}

	public void keyReleased(KeyEvent e){
		int Key = e.getKeyCode();

		for(int i = 0; i < handler.object.size(); i++){
			GameObject tempObject = handler.object.get(i);

			if(tempObject.getId() == ID.Player){
				//player 1

				if(Key == KeyEvent.VK_W) tempObject.setvelY(0);
				if(Key == KeyEvent.VK_S) tempObject.setvelY(0);
				if(Key == KeyEvent.VK_D) tempObject.setvelX(0);
				if(Key == KeyEvent.VK_A) tempObject.setvelX(0);
			}

			if(tempObject.getId() == ID.Player2){
				//player 2

				if(Key == KeyEvent.VK_UP) tempObject.setvelY(0);
				if(Key == KeyEvent.VK_DOWN) tempObject.setvelY(0);
				if(Key == KeyEvent.VK_RIGHT) tempObject.setvelX(0);
				if(Key == KeyEvent.VK_LEFT) tempObject.setvelX(0);	
			}
		}
	}
}