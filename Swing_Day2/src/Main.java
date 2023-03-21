
import javax.swing.*;
import java.awt.*;

public class Main
{
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setTitle("Tittle of this frame"); //title of the frame
        frame.setVisible(true); //toggle visibility
        frame.setResizable(false); //disable resize
        frame.setSize(500,500);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit when program is closed
       frame.setLayout(null);    //layout off garne
        frame.getContentPane().setBackground(Color.RED);




     JButton button= new JButton("Click here");
        button.setBounds(100,50,150,50);
        frame.add(button);

    }
}