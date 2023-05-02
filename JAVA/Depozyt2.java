package VirtualAcademy;
import java.util.Scanner;
public class Depozyt2 {
    public static void main(String[] args) {
        System.out.println("Введіть ваш початковий вклад");
        Scanner scan1= new Scanner(System.in);
        double vklad = scan1.nextDouble();
        System.out.println("Введіть відсоток вкладу");
        Scanner scan2 = new Scanner(System.in);
        double vidsotok = scan2.nextDouble();
        System.out.println("Введіть термін на який буде покладено гроші");
        Scanner scan3 = new Scanner(System.in);
        int rik = scan3.nextInt();
        int a=rik;
        System.out.println("Введіть поточний рік вкладу");
        Scanner scan4 = new Scanner(System.in);
        int rikvkladu = scan4.nextInt();
        double vidsotokTotal = vidsotok/100, balance=0;
        for (rik=rikvkladu; rik<=(rikvkladu+a); rik++)
        {
            balance=Math.round(vklad*Math.pow(1+vidsotokTotal, (rik-rikvkladu+1)));
            System.out.println("Баланс на кінець "+rik+" року "+ balance +" грн.");
        }

    }
}
