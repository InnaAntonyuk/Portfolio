package HomeTask;
import java.util.Scanner;
public interface Home_task2_1sumNum {
    public static void main(String[] args) {
        int sum = 0, currentNum;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter the number (>10)");
        currentNum  = scan.nextInt();
        if (currentNum >10)
        {
            while (currentNum>0)
            {
                sum+=currentNum%10;
                currentNum/=10;
            }
            System.out.println("The sum of entered number is: "+sum);
        }
        else
        {
            System.out.println("You entered uncorrected number. The number must be >10! ");
        }
    }
}
