import javax.swing.*;
import java.awt.event.*;
/**
 * MyMouseFrame 클래스 안에 
 * 
 * @author (20118315053 테라오카유이카, 2017315002 김아름, 2014671038 김진수) 
 * @version (2019.11.04)
 */
public class MyMouseFrame  extends JFrame{
    public JLabel la;
    public MyMouseFrame(){
        this.setTitle("MouseListener & MouseMotionListener");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,300);
        
        la = new JLabel("No MouseEvent");
        JPanel jp = new JPanel();
        jp.add(la);
        jp.addMouseListener(new MyMouseListener());
        this.add(jp);
        setVisible(true);

    }
    public JLabel getLabel(){
        return la;
    }
}