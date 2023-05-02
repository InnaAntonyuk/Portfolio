package VirtualAcademy;
import java.util.Scanner;
public class LetterVowel {
    public static void main(String[] args) {
        System.out.println("Введіть літеру");
        String letter="";
        Scanner scan = new Scanner(System.in);
        letter = scan.nextLine();
        switch (letter.toLowerCase()){
            case "а":
            case "е":
            case "і":
            case "и":
            case "ї":
            case "я":
            case "ю":
            case "є":
            case "о":
            case "у":
                System.out.println("Це голосна літера");
                break;
            case "б":
            case "в":
            case "г":
            case "ґ":
            case "д":
            case "ж":
            case "з":
            case "й":
            case "к":
            case "л":
            case "м":
            case "н":
            case "п":
            case "р":
            case "с":
            case "т":
            case "ф":
            case "х":
            case "ц":
            case "ч":
            case "ш":
            case "щ":
                System.out.println("Це приголосна літера");
                break;
            default:
                System.out.println("Не зрозуміло, що введено");
        }
    }
}
