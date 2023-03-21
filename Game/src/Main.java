

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args)
            //take user input
            //S,P,R
    {
        Scanner input = new Scanner(System.in);
       // System.out.println("Please enter S,P,R");
        char usermove;
System.out.println("Please enter S,P,R");
  usermove=input.next().charAt(0);
  System.out.println(usermove);
  System.out.println("User Gave this input "+usermove);

  // make computer to move S,P,R
        char[] maxMove={'S','P','R'};
        Random random = new Random();
        int guessNumber=random.nextInt(3);
        char computerMove= maxMove[guessNumber];
                System.out.println("Computer move--->"+computerMove);
                //0-2;
                // 0-4;

        // userMove=computerMove--->draw
        if(computerMove==usermove && usermove==computerMove)
        {
            System.out.println("draw");
        }
        else if(computerMove == 'R'&& usermove=='S') {
            System.out.println("user wins");
        }

         else if(computerMove=='R'&& usermove=='P')
        {
            System.out.println("user wins");}

         else if(computerMove=='S'&& usermove=='R'){
            System.out.println("user wins");}
         else
        {
            System.out.println("Computer wins");
        }


    }
}