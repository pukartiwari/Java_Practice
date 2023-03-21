import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setTitle("Hello world");


//        JButton button=new JButton("click here");
//        button.setBounds(100,50,75,95);
//        frame.add(button);


        JTextField t1= new JTextField("welcome to the first page");
        t1.setBounds(10,10,300,50);
        frame.add(t1);

        JTextField t2= new JTextField("Enter your name");
        t2.setBounds(10,100,300,50);
        frame.add(t2);

        JButton button=new JButton("click here");
        button.setBounds(10,300,400,50);
        frame.add(button);


        String[] fruits={"Apple","Orange","Syau"};
         JComboBox comboBox=new JComboBox<>(fruits);
         comboBox.setBounds(10,200,300,50);
         frame.add(comboBox);


        //JFrame.setVisible(true);

        frame.setSize(400,500);
        //frame.setBounds(10,5,20,25);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);


    }
}