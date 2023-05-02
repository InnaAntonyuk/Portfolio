package VirtualAcademy;
import java.util.Scanner;
public class TernarnyiUmovnyiOperator {
    public static void main(String[] args) {
        // 1-1000 професори і викладачі
        // 1001-55000 студенти
        //55000 обслуговуючий персонал
        System.out.println("Введіть свій номер:");
        Scanner scan = new Scanner(System.in);
        int id = scan.nextInt();
        double price = (id >=1000 && id <=55000) ? 2.0 : 3.0;
        System.out.println("Ціна для вас "+ price);

    }
}
