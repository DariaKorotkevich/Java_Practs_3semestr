package Laba_5;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Animation extends JFrame {
    protected static Image image;
    protected static ArrayList<Image> framelist = new ArrayList<>();
    Animation(){
        super("Animation");
        setSize(467,467);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g){
        Graphics2D gr = (Graphics2D) g;
        gr.drawImage(image,0,0,null);
    }
}
