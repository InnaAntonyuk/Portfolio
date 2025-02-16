package VirtualAcademy;

public class MasyvString {
    public static void main(String[] args) {
        String  [] SummerMonth = new String[3];
        SummerMonth [0] = "June"; SummerMonth [1] = "July"; SummerMonth [2] = "August";
        String []  berries = {"a strawberry", "a blackberry", "a raspberry"};
        for (int i = 0; i<berries.length; i++ )//починаємо з першого елементу масиву 0, далі беремо довжину масиву  і перебираємо кожен елемент ++
        {
            System.out.print(berries[i]+" , ");
        }

    }
}
