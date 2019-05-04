package pack.Tiles;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Tile
{
    ////
    public  static Tile[] tiles =new Tile[256];
    public  static Tile grasstile=new GrassTile(0);
    public  static Tile rocktile=new RockTile(1);
    public  static Tile dirttile=new DirtTile(2);
    ///

public static final int tilewidth=64;
    public static final int tileheight=64;
    protected BufferedImage texture;
    protected  int id=0;


    public Tile(BufferedImage texture,int id) {
        this.texture = texture;
        this.id=id;
        tiles[id]=this;
    }

    public int getId() {
        return id;
    }

    public boolean isSolid()
    {

        return false;
    }
    public void tick()
    {

    }


    public void render(Graphics g,int x, int y)
    {
g.drawImage(texture,x,y,tilewidth,tileheight,null);
    }
}
