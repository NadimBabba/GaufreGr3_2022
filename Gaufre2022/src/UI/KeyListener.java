package UI;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyListener extends KeyAdapter {
	
	@Override
	public void keyPressed(KeyEvent event) {
		switch (event.getKeyCode()) {
			case KeyEvent.VK_Q:
				// QUIT
				break;
			case KeyEvent.VK_R:
				// RESET
				break;
			case KeyEvent.VK_L:
				// LOAD
				break;
			case KeyEvent.VK_ESCAPE:
				// FULLSCREEN
				break;
		}
	}

}
