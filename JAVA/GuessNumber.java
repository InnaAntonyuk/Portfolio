package VirtualAcademy;
import java.util.Scanner;
public class GuessNumber {
    public static void main(String[] args) {
        int number = 0;
        Scanner scan = new Scanner(System.in);

        while (number != 7)
        {
            System.out.println("Вгадай число від 0 до 10");
            number = scan.nextInt();
        }
        System.out.println("Вітання! Ви вгадали число!");
    }
}
