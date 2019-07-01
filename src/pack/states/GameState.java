package pack.states;

import java.awt.*;

import pack.Game;
import pack.Handler;
import pack.Tiles.Tile;
import pack.classes.World;
import pack.entities.creatures.Player;

public class GameState extends State {

	private Player player;
	private World world;

	public GameState(Handler handler){
		super(handler);
		world = new World(handler, "res/worlds/world1.txt");
		handler.setWorld(world);
		player = new Player(handler, 100, 100);
	}

	@Override
	public void tick() {
		world.tick();
		player.tick();
	}

	@Override
	public void render(Graphics g) {
		world.render(g);
		player.render(g);
	}

}
