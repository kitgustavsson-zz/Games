package entities;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class Player extends Entity {
	
	public Player() {
		
	}

	@Override
	public void draw(GameContainer gc, Graphics g) {
		g.fillRect(getX(), getY(), 16, 16);
	}
}
