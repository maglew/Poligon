package pack.states;

import java.awt.Graphics;

import pack.Game;
import pack.Tiles.Tile;
import pack.entities.creatures.Player;

public class GameState extends State {
	
	private Player player;
	
	public GameState(Game game){
		super(game);
		player = new Player(game, 100, 100);
	}
	
	@Override
	public void tick() {
		player.tick();
	}

	@Override
	public void render(Graphics g) {
		player.render(g);
		Tile.tiles[0].render(g,0,0);
	}

}
