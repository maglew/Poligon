package pack.classes;

import pack.Game;
import pack.Tiles.Tile;

import java.awt.*;

public class World
{
    private Game game;
private int width,height;
private int[][] tiles;
private int spawnX,spawnY;

public World(Game game,String path)
{
this.game=game;
    loadWorld(path);
}

    public void tick()
    {


    }


    public void render(Graphics g)
    {
        int xStart=(int)Math.max(0,game.getGameCamera().getXoffset()/Tile.tilewidth);
        int xEnd=(int)Math.min(width,(game.getGameCamera().getXoffset()+game.getWidth())/Tile.tilewidth+1);
        int yStart=(int)Math.max(0,game.getGameCamera().getYoffset()/Tile.tileheight);
        int yEnd=(int)Math.min(height,(game.getGameCamera().getYoffset()+game.getHeight())/Tile.tileheight+1);

        for(int y=yStart;y<yEnd;y++)
        {
            for(int x=xStart;x<xEnd;x++)
            {
                getTile(x,y).render(g,(int)(x*Tile.tilewidth-game.getGameCamera().getXoffset()),
                        (int)(y*Tile.tileheight-game.getGameCamera().getYoffset()));
            }
        }
    }

    public Tile getTile(int x,int y)
    {
       Tile t=Tile.tiles[tiles[x][y]];
        if (t==null)
        {
            return Tile.dirttile;
        }
        return t;
    }
private void loadWorld(String path)
{
String file =Utils.loadFileAsString(path);
String[] tokens=file.split("\\s+");
width=Utils.parseInt(tokens[0]);
height=Utils.parseInt(tokens[1]);
spawnX=Utils.parseInt(tokens[2]);
spawnY=Utils.parseInt(tokens[3]);
tiles=new int[width][height];
for (int y=0;y<height;y++)
    {
        for (int x=0;x<width;x++)
        {
            tiles[x][y]=Utils.parseInt(tokens[(x+y*width)+4]);
        }
    }
}

}

