package VirtualAcademy;
import java.util.Random;
import java.util.Scanner;
public class GeneratorOfNumber {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        Random cube = new Random();//рандом кубика
        int numberOfCube=0, variableOfUser=0, toTry=0;
        do{
            System.out.println("Введіть число від 1 до 6");
            variableOfUser = scan.nextInt();//зчитуємо число, яке вгадує користувач
            numberOfCube = 1 + cube.nextInt(6);//зчитуємо число з кубика з рандому - максимальне число 6
            System.out.println("А на кубику випало:"+numberOfCube+".");
            System.out.println("--------------------------------------");
            toTry++;//кількість спроб
        }
        while (variableOfUser != numberOfCube);//якщо ця рівність буде істинною, заходимо знову у цикл do
        System.out.println("Так! Ви вгадали з "+ toTry + " спроби!");//toTry записує з якої спроби вгадано
    }
}
