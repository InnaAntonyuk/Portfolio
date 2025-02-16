package VirtualAcademy;

import java.util.Random;
import java.util.Scanner;

public class GameLotto {
    /*користувач має ввести 6 чисел із діапазону, який ми встановимо від 1 до 54
    програма дістане числа від 1 до 54 (рандомно)
    і потім перевіряє скільки чисел з розіграшу співпало, тобто скільки користувач вгадав
     */
    public static void main(String[] args) {
        //крок 1 викликаємо метод для отримання чисел від користувача
        String [] NumbersFromUser = gotInputOfUser();
        //крок 2 вибираємо числа у розіграші
        int [] tyrazh = takeAgame();
        //крок 3 визначаємо які числа виграшні
        int countEuquals = checkTheResult (NumbersFromUser, tyrazh);
        //крок 4 записуємо виграшні числа
        String allNumOfGame = ConvertArrayInText(tyrazh);
        //Всі числа розіграшу записуємо у рядок
        System.out.println("У розіграші ("+ allNumOfGame+") співпало: " + countEuquals+ " чисел.");
    }
    public static String[] gotInputOfUser()
    {
        //крок 1 користувач записує свої числа
        System.out.println("Введіть 6 чисел від 1 до 54 через \",\"");
        Scanner scan = new Scanner(System.in);//запустили клас скан
        /*дозволяємо ввести користувачеві 6 чисел через кому*/
        String numbers = scan.nextLine();//користувач вводить 11, 17, 8... => використали скан
        scan.close();//закрити цей елемент для ефективного використання => закрили цей клас
        //перетворємо набір тексту (числа) у масив
        String[] strArrayInputNum = numbers.split(","); //якщо є текст, що містить ",", split розбиває на масив текст
        return strArrayInputNum;
    }
    public static int[] takeAgame()
    {
        int[] tyrazh = new int[6];//створюємо масив з 6 чисел
        Random r = new Random(); // генеруємо випадкові 6 чисел
        int iNumberOfGame = 0;//число розіграшу для початку 0/ максимум чисел буде 6
        while (iNumberOfGame != 6)
        {
            boolean numberIsAlready = false;//Змінна для if на випадок, якщо число вийняте раніше співпало з новим числом
            int ceyNumber = r.nextInt(54) + 1;//викликаємо рандом r і вибираємо число у межах від 0 до 53, тому +1
            //перевіряємо, щоб числа, що випадають рандомно не повторювалися
            for (int isnuiucheNumber : tyrazh)//вибране число з масиву
            {
                if (isnuiucheNumber == ceyNumber) {
                    numberIsAlready = true;
                    break;//зупинити виконання циклу for
                }
            }
            if (numberIsAlready != true) {//якщо числа не існує, то воно записується
                tyrazh[iNumberOfGame++] = ceyNumber;//записуємо число яке випадає в елемент масиву,записуємо всі 6 чисел інкрементом
            }
        }
        return tyrazh;
    }
    public static int checkTheResult (String[] strArrayInputNum, int[] tyrazh)
    {
        int countEuqual = 0;//у цю змінну записуємо кількість співпадінь чисел
        for (int k = 0; k < strArrayInputNum.length; k++)
        {
            int number = Integer.parseInt(strArrayInputNum[k]);//перетворюємо числа, що ввів користувач у String в Int
            for (int ceyNumberIsWin : tyrazh)
            {
                if (number == ceyNumberIsWin)
                {
                    countEuqual++;
                }
            }
        }
    return countEuqual;
    }
    public  static  String ConvertArrayInText(int [] numbers)
    {
        String allNumOfGame = ""; //створюємо рядок пустий, куди будемо записувати виграшні числа
        for (int number : numbers)
        {
            allNumOfGame = allNumOfGame+number+" ";
        }
        return allNumOfGame;
    }
}



















