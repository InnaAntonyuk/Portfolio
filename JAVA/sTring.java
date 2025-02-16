package VirtualAcademy;
import java.util.Scanner;
public class sTring {
    public static void main(String[] args) {
        System.out.println("Введіть ваше речення:");
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        System.out.println("Яке слово ви хочете знайти?");
        Scanner scan2 = new Scanner(System.in);
        String findWord  = scan2.nextLine();
        String result = (sentence.indexOf(findWord) >= 0)? "У тексті знайдено \""+ findWord +"\" " : "Шукане \""+ findWord+ "\" не знайдено";
        System.out.println(result);
    }
}
