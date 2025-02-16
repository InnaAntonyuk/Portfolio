package VirtualAcademy;

import java.util.Scanner;
public class GuessText {
    public static void main(String[] args) {
        String word ="";
        Scanner scan = new Scanner(System.in);
        while (word.toUpperCase().equals("УКРАЇНА") != true) /*доки word не дорівнює Україна (не є true),
                                                               то виконуємо While*/
        {
            System.out.println("Вгадайте країну");
            word = scan.nextLine();
        }
        System.out.println("Ви вгадали! Вітаю! Залишайтеся патріотами!");
    }
}
