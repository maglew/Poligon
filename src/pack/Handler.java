package pack;

import pack.classes.World;
import pack.gfx.GameCamera;
import pack.input.KeyManager;

public class Handler {
private Game game;
private World world;

public Handler(Game game)
{this.game=game;}

public int getWidth()
{return game.getWidth();}

    public int getHeight()
    {return game.getHeight();}

    public GameCamera getGameCamera()
    {return game.getGameCamera();}

    public KeyManager getKeyManager()
    {return game.getKeyManager();}

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }
}
