package HomeTask;

import java.util.Scanner;

public class HomeTask_1_1 {
    public static void main(String[] args) {
        System.out.println("Please, enter two numbers");
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        int in1 = scan1.nextInt(), in2 = scan2.nextInt();
        while (in1>0 & in2>0)
        {
            if (in1>=in2)
            {
                in1%=in2;
            }
            else
            {
                in2%=in1;
            }
        }
        System.out.println(in1+in2);
    }
}
