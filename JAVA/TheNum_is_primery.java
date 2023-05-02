package HomeTask;
import java.util.Scanner;
public class HomeTask_3_1primeryNum {
    public static void main(String[] args) {
        int inputNumber;
        System.out.println("Enter the number");
        Scanner scan = new Scanner(System.in);
        inputNumber = scan.nextInt();
        boolean flag = false;
        if (inputNumber<0 || inputNumber==1)
        {
            System.out.println("The number isn't prime");
        }
        else
        {
            for (int i=2; i<=inputNumber/2; i++)
            {
                if (inputNumber %2==0)
                {
                    flag = true;
                    break;
                }
            }
            if (!flag)
            {
                System.out.println("it's prime");
            }
            else
            {
                System.out.println("It isn't prime");
            }
        }
    }
}
