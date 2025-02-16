package VirtualAcademy;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        double num1, num2, result;
        String diya;
        System.out.println("Введіть перше число:");
        num1 = Double.parseDouble (keyboardInput.nextLine());
        System.out.println("Введіть друге число:");
        num2 = Double.parseDouble (keyboardInput.nextLine());
        System.out.println("Введіть дію(+,-,*,/): ");
        diya = keyboardInput.nextLine();
        if (diya.equals("/")&& num2 == 0) {
            System.out.println("Ділення на 0 заборонено");
            return;
        }
        if (diya.equals("+")) {
            result = num1 + num2;
        } else if (diya.equals("-")) {
            result = num1 - num2;
        } else if (diya.equals("*")) {
            result = num1 * num2;
        }
        else if (diya.equals("/")) {
            result = num1 / num2;
        }
        else {
            result = 0;
        }
        System.out.println("Результат: " + result);
    }
}
