package Pract_4;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Match extends JFrame
{

    JButton but1 = new JButton("AC Milan");
    JButton but2 = new JButton("Real Madrid");
    JLabel textR = new JLabel("Result: 0 X 0");
    JLabel textS = new JLabel("Last Scorer: N/A");
    JLabel textW = new JLabel("Winner: DRAW");
    int Milan = 0;
    int Madrid = 0;
    public Match()
    {
        super("Match: Milan vs Madrid");
        setLayout(null);
        but1.setBounds(100,100,110,100);
        but1.setForeground(Color.BLUE);
        but2.setBounds(250,100,110,100);
        but2.setForeground(Color.GREEN);
        textR.setBounds(174,200,100,100);
        textW.setBounds(174,300,150,100);
        add(textW).setVisible(false);
        add(but1);
        add(but2);
        add(textR);
        setSize(700,500);
            but1.addMouseListener(new MouseListener() {

                public void mouseClicked(MouseEvent a) {
                    Milan += 1;
                    textR.setText("Result: " + Milan + " X " + Madrid);
                    if((Milan == 5) && (Madrid < 5))
                    {
                        textW.setText("Winner: Milan");
                        textW.setVisible(true);
                    }
                }

                public void mouseExited(MouseEvent a) {
                }

                public void mouseEntered(MouseEvent a) {
                }

                public void mouseReleased(MouseEvent a) {
                }

                public void mousePressed(MouseEvent a) {
                }
            });
            but2.addMouseListener(new MouseListener() {

                public void mouseClicked(MouseEvent a) {
                    Madrid += 1;
                    textR.setText("Result: " + Milan + " X " + Madrid);
                    if((Madrid == 5) && (Milan < 5))
                    {
                        textW.setText("Winner: Madrid");
                        add(textW).setVisible(true);
                    }

                }

                public void mouseExited(MouseEvent a) {
                }

                public void mouseEntered(MouseEvent a) {
                }

                public void mouseReleased(MouseEvent a) {
                }

                public void mousePressed(MouseEvent a) {
                }
            });


    }
    public static void main(String[]args)
    {
        new Match().setVisible(true);
    }
}
