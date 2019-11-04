import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 * MyMouseListener를 구현한 클래스
 * 
 * @author (20118315053 테라오카유이카, 2017315002 김아름, 2014671038 김진수) 
 * @version (2019.11.04)
 */
public class MyMouseListener extends MouseAdapter implements MouseListener
{   
    public void mouseClicked(MouseEvent e){}
    
    public void mouseEntered(MouseEvent e){
        Component c = (Component)e.getSource();
        c.setBackground(Color.CYAN);
    }
    
    public void mouseExited(MouseEvent e){
        Component c = (Component)e.getSource();
        c.setBackground(Color.YELLOW);
    }
    
    public void mousePressed(MouseEvent e){
        la.setText("MousePredded (" + e.getX() + ", " + e.getY() + ")");
    }
    
    public void mouseReleasd(MouseEvent e){
        la.setText("MouseReleasd (" + e.getX() + ", " + e.getY() + ")");
    }
    
    public void mouseDragged(MouseEvent e){
        la.setText("MouseDragged (" + e.getX() + ", " + e.getY() + ")");
    }
    
    public void mouseMoved(MouseEvent e){
        la.setText("MouseMoved (" + e.getX() + ", " + e.getY() + ")");
    }
}
