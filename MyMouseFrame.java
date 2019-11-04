import javax.swing.*;
import java.awt.event.*;
/**
 * MyMouseFrame 클래스 안에 
 * 
 * @author (20118315053 테라오카유이카, 2017315002 김아름, 2014671038 김진수) 
 * @version (2019.11.04)
 */
public class MyMouseFrame  extends JFrame
{
    public MyMouseFrame(){
        setTitle("MouseListener & MouseMotionListener");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,300);
        this.setVisible(true);

        JPanel jp = new JPanel();
        this.add(jp);
        jp.setFocusable(true);
        setVisible(true);

    }
}