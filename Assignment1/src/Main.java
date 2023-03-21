import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want to print multiple");
        int a = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(+a + "x" + i + "=" + a * i);
        }
    }
}