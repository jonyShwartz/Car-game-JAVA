package game;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
public class PlayerMovement implements KeyListener {
	

	

		private Car carPlayer; 
		private CustomRectangel rectangelPlayer;
		
		public PlayerMovement(Car i, CustomRectangel rectangelPlayer) {
			this.carPlayer = i;
			this.rectangelPlayer = rectangelPlayer;
		}
		
		public void keyTyped(KeyEvent e) {
			
		}

		
		public void keyPressed(KeyEvent e) {
	int key = e.getKeyCode();
	switch (key){
	case KeyEvent.VK_UP:
		System.out.println("UP");
		this.carPlayer.moveUp();
		this.rectangelPlayer.moveUp();
		break;
	case KeyEvent.VK_DOWN:
		System.out.println("DOWN");
		this.carPlayer.moveDown();
		this.rectangelPlayer.moveDown();
		break;
	case KeyEvent.VK_LEFT:
		System.out.println("LEFT");
		this.carPlayer.moveLeft();
		this.rectangelPlayer.moveLeft();
		break;
	case KeyEvent.VK_RIGHT:
		System.out.println("RIGHT");
		this.carPlayer.moveRight();
		this.rectangelPlayer.moveRight();
		break;
		}
	}


		
		public void keyReleased(KeyEvent e) {
			
		}

		
		
	}


