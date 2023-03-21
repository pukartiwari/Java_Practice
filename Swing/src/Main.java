import javax.swing.*;

public class Main {
    public static void main(String[] args)
    {
//        System.out.println("Hello world!");
        JFrame frame=new JFrame("Title");
        JTextField t1,t2;
        t1=new JTextField("Welcome to the javapoint");

        t1.setBounds(50,10,150,30);

        t2=new JTextField("Welcome to the new era");

        t2.setBounds(50,150, 200,30);

        JButton button=new JButton("button");    //button add garxa
        //button.setSize(50,100);
        frame.add(t1);

        frame.add(t2);

       // frame.add(button);
        button.setBounds(50,100, 200,30); //layout of button

        frame.setSize(400,500);

        frame.add(button);

        frame.setLayout(null);

        frame.setVisible(true);
    }
}