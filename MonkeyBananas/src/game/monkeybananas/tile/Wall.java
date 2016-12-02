package game.monkeybananas.tile;

import java.awt.Color;
import java.awt.Graphics;

import game.monkeybananas.Game;
import game.monkeybananas.Handler;
import game.monkeybananas.Id;

public class Wall extends Tile {

	public Wall(int x, int y, int width, int height, boolean solid, Id id, Handler handler) {
		super(x, y, width, height, solid, id, handler);
	}

	public void render(Graphics g) {
		g.drawImage(Game.grass.getBufferedImage(), x, y, width, height, null);
	}

	public void tick() {
		
	}

}
