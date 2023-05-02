package VirtualAcademy;

import java.util.Scanner;

public class Region {
    public static void main(String[] args) {
        System.out.println("Введіть першу літеру своєї області:");
        String letter= "";
        Scanner skan = new Scanner(System.in);
        letter = skan.nextLine();
        switch (letter.toUpperCase()){
            case "А":
                System.out.println("Автономна республіка Крим");
                break;
            case "В":
                System.out.println("Вінницька або Волинська область.");
                break;
            case "Д":
                System.out.println("Дніпровська або Донецька область.");
            case "Ж":
                System.out.println("Житомирська область.");
            case "З":
                System.out.println("Запорізька або Закарпатська область.");
            case "І":
                System.out.println("Івано-Франківська область.");
            case "К":
                System.out.println("Київська або Кіровоградська область.");
            case "Л":
                System.out.println("Луганська або Львівська область.");
            case "М":
                System.out.println("Миколаївська область.");
            case "О":
                System.out.println("Одеська область.");
            case "П":
                System.out.println("Полтавська область.");
            case "Р":
                System.out.println("Рівненська область.");
            case "С":
                System.out.println("Сумська область.");
            case "Т":
                System.out.println("Тернопільска область.");
            case "Х":
                System.out.println("Харківська, Хмельницька або Херсонська область.");
            case "Ч":
                System.out.println("Чернігівська, Черкаська або Чернівецька область.");
            default:
                System.out.println("Області на таку літеру не знайдено.");
        }
    }
}
