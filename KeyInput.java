import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter{
	
	private Handler handler;
	private boolean[] KeyDown = new boolean[4];

	public KeyInput(Handler handler){
		this.handler = handler;

		KeyDown[0] = false; //for UP
		KeyDown[1] = false; // For DOWN
		KeyDown[2] = false; // for RIGHT
		KeyDown[3] = false; // For LEFT

		//yung apat na boolean naghhold kung na pressed naba yung key or hindi pa   and nilagay ko sa keyevent kasi yung wala to and mabilisan na click sa movement nag sstuck yung player;
	}

	public void keyPressed(KeyEvent e){
		int Key = e.getKeyCode();

		for(int i = 0; i < handler.object.size(); i++){
			GameObject tempObject = handler.object.get(i);

			if(tempObject.getId() == ID.Player){
				

				if(Key == KeyEvent.VK_W) { tempObject.setvelY(-5); KeyDown[0] = true;} 
				if(Key == KeyEvent.VK_S) { tempObject.setvelY(5); KeyDown[1] = true;}
				if(Key == KeyEvent.VK_D) { tempObject.setvelX(5); KeyDown[2] = true;}
				if(Key == KeyEvent.VK_A) { tempObject.setvelX(-5); KeyDown[3] = true;}
			}
		}
		if(Key == KeyEvent.VK_ESCAPE) System.exit(1);
	}

	public void keyReleased(KeyEvent e){
		int Key = e.getKeyCode();

		for(int i = 0; i < handler.object.size(); i++){
			GameObject tempObject = handler.object.get(i);

			if(tempObject.getId() == ID.Player){
				//player 1

				if(Key == KeyEvent.VK_W)  KeyDown[0] = false;
				if(Key == KeyEvent.VK_S)  KeyDown[1] = false;
				if(Key == KeyEvent.VK_D)  KeyDown[2] = false;
				if(Key == KeyEvent.VK_A)  KeyDown[3] = false;

				if(!KeyDown[0] && !KeyDown[1]) tempObject.setvelY(0); 
				if(!KeyDown[2] && !KeyDown[3]) tempObject.setvelX(0); 
			}
		}
	}
}