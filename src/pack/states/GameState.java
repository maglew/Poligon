package pack.states;

import java.awt.*;

import pack.Game;
import pack.Tiles.Tile;
import pack.classes.World;
import pack.entities.creatures.Player;

public class GameState extends State {
	
	private Player player;
	private World world;
	public GameState(Game game){
		super(game);
		player = new Player(game, 100, 100);
		world=new World("res/worlds/world1.txt");
	}
	
	@Override
	public void tick() {
		player.tick();
	}

	@Override
	public void render(Graphics g) {

		//Tile.tiles[0].render(g,0,0);
		world.render(g);
		player.render(g);
	}

}
