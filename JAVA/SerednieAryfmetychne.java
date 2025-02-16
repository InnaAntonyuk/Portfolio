package VirtualAcademy;
import java.util.Scanner;
public class SerednieAryfmetychne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = 0, countNumber = 0, sum = 0, serednie = 0;
        while (countNumber<3){
            System.out.println("Введіть число:");
            number = scan.nextInt();
            sum = sum + number;
            countNumber++;
        }
        serednie = sum/countNumber;
        System.out.println("Ваше середнє значення чисел, що були введені: "+ serednie);
    }
}
