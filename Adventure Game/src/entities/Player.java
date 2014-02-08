package entities;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;

public class Player extends Entity {
	private Input input;
	
	public Player(GameContainer gc) {
		input = gc.getInput();
	}

	@Override
	public void draw(GameContainer gc, Graphics g) {
		g.fillRect(getX(), getY(), 16, 16);
	}

	@Override
	public void update(GameContainer gc, int i) {
		if (input.isKeyDown(Input.KEY_UP)) {
			setY(getY() - 1);
		}

		if (input.isKeyDown(Input.KEY_DOWN)) {
			setY(getY() + 1);
		}

		if (input.isKeyDown(Input.KEY_RIGHT)) {
			setX(getX() + 1);
		}

		if (input.isKeyDown(Input.KEY_LEFT)) {
			setX(getX() - 1);
		}
	}
}
