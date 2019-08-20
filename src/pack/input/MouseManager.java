package pack.input;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseManager implements MouseListener, MouseMotionListener
{

    public boolean left, mid,right , scrlup,scrldown;
    public int mouseX,mouseY;
    public  MouseManager()
    {

    }

    public boolean isLeftPressed()
    {return left;}

    public boolean isRightPressed()
    {return right;}

    public int getMouseX()
    {return mouseX;}

    public int getMouseY()
    {return mouseY;}

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e)
    {
if(e.getButton()==MouseEvent.BUTTON1)
    left=true;
else if(e.getButton()==MouseEvent.BUTTON3)
    right=true;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if(e.getButton()==MouseEvent.BUTTON1)
            left=false;
        else if(e.getButton()==MouseEvent.BUTTON3)
            right=false;
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
mouseX=e.getX();
mouseY=e.getY();
    }
}
