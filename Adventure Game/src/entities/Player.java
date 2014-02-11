package entities;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;

public class Player extends Entity {
	private Input input;
	private int speed;
	
	public Player(GameContainer gc) {
		input = gc.getInput();
		speed = 4;
	}

	@Override
	public void draw(GameContainer gc, Graphics g) {
		g.fillRect(getX(), getY(), 16, 16);
	}

	@Override
	public void update(GameContainer gc, int i) {
		if (input.isKeyDown(Input.KEY_UP)) {
			setY(getY() - speed);
		}

		if (input.isKeyDown(Input.KEY_DOWN)) {
			setY(getY() + speed);
		}

		if (input.isKeyDown(Input.KEY_RIGHT)) {
			setX(getX() + speed);
		}

		if (input.isKeyDown(Input.KEY_LEFT)) {
			setX(getX() - speed);
		}

		// Normalize Y to 8x8 grid
		// TODO: Update normalization to take direction into consideration for smoother movement
		if (!input.isKeyDown(Input.KEY_UP) && !input.isKeyDown(Input.KEY_DOWN)) {
			if (getY() % 16 != 0 && getY() % 16 != 8) {
				setY((int)(getY() + speed));
			}
		}
	}
}
