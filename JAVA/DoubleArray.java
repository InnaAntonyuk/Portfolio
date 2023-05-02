package VirtualAcademy;

public class DoubleArray {
    public static void main(String[] args) {
        int [][] lotto = {
                {2, 53, 54, 17, 43, 5},
                {3, 41, 34, 23, 76, 34},
                {3, 4, 67, 98, 34, 75},
                {87, 98, 74, 38, 90}//виграшні номери які випадали за останні 4 тижні
        };
        for (int i=0; i< lotto.length; i++)
        {
            int sumNumbersOfGame = 0;//сума чисел розіграшу
            for (int num: lotto[i])//пробігаємо по підмасиву (2.53.54.17.43.5)
            {
                sumNumbersOfGame += num;// проходимо по підмасиву і сумуємо рядок
            }
            System.out.print("Сума чисел розіграшу номер "+ i +": "+ sumNumbersOfGame + "; \n"); //пишемо номер рядка і вираховуємо суму чисел
            System.out.println("Середнє значення розіграшу у рядку "+ i + ": " + sumNumbersOfGame/lotto[i].length +".");//середнє значення у рядку
        }
    }
}
