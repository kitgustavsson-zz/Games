package entities;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public abstract class Entity {
	private int x;
	private int y;
	
	public abstract void draw(GameContainer gc, Graphics g);
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public abstract void update(GameContainer gc, int i);
}
