package game;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

import entities.Entity;
import entities.Player;

public class Adventure extends BasicGame
{
	private ArrayList<Entity> entities;
	
	public Adventure(String title)
	{
		super(title);
		
		entities = new ArrayList<>();
	}

	@Override
	public void init(GameContainer gc) throws SlickException {
		entities.add(new Player(gc));
	}

	@Override
	public void update(GameContainer gc, int i) throws SlickException {
		for (Entity e : entities) {
			e.update(gc, i);
		}
	}

	@Override
	public void render(GameContainer gc, Graphics g) throws SlickException
	{
		for (Entity e : entities) {
			e.draw(gc, g);
		}
		
		g.drawString("Hello World!", 30, 30);
	}

	public static void main(String[] args)
	{	
		try
		{
			AppGameContainer appgc;
			appgc = new AppGameContainer(new Adventure("Adventure Game"));
			appgc.setDisplayMode(640, 480, false);
			appgc.start();
		}
		catch (SlickException ex)
		{
			Logger.getLogger(Adventure.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}