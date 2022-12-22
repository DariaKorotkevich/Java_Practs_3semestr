package Laba_5;

import javax.swing.*;

public class testAnimation extends Animation {
    public static void main(String[]args){
        framelist.add(new ImageIcon("src/step0.jpg").getImage());
        framelist.add(new ImageIcon("src/step1.jpg").getImage());
        framelist.add(new ImageIcon("src/step2.jpg").getImage());
        framelist.add(new ImageIcon("src/step3.jpg").getImage());
        framelist.add(new ImageIcon("src/step4.jpg").getImage());

        Animation anim = new Animation();
        while(true){
            for(int i =0 ;i<5;i++){
                image = framelist.get(i);
                anim.repaint();
                try {
                    Thread.sleep(35);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

            }
        }
    }
}
