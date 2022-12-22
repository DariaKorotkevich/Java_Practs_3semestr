package Laba_5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Animator extends JComponent implements KeyListener, ActionListener {
    Image star = new ImageIcon("src/calm.jpg").getImage();
    private int Rx=0,Ry=0,W=30,H=30;
    Rectangle rectangle = new Rectangle(Rx,Ry,W,H);
    public void paint(Graphics g){
        Graphics2D gr = (Graphics2D)g;
        gr.drawImage(star,0,0,null);
        gr.fill(rectangle);
    }



    public static void main(String[] args){
        Animator A = new Animator();
        JFrame frame = new JFrame("Animation");
        frame.setSize(1024, 713);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//выход по закрытию
        frame.addKeyListener(A);
        frame.add(new Animator());
        frame.add(A);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}