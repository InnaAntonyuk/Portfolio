package VirtualAcademy;
import java.util.Random;
public class random {
    public static void main(String[] args) {
        Random kube = new Random();
        int number; //сюди записуємо число, що випало на кубику
        for (int i = 1; i<=10; i ++)
        {
            int numberOfKub = 1 + kube.nextInt(6);//викликаємо Random from 0 to 5, тому додаємо +1, щоб числа випадали з 1 до 6
            System.out.println(numberOfKub);
        }
    }
}
