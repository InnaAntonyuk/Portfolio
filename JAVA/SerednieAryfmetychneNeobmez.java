package VirtualAcademy;
import java.util.Scanner;

public class SerednieAryfmetychneNeobmez {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        //String vved = "0.0";
        //double sum = 0, serednie = 0, num = 0;
        int countNumber = 0, serednie = 0, num = 0, sum = 0;
        String vved = "0";
        while (vved.equals(".") != true){
            //num = Double.parseDouble(vved);
            num = Integer.parseInt(vved);
            sum += num;
            System.out.println("Введіть число або [.] щоб зупинитися: ");
            vved= scan.nextLine();
            countNumber++;
        }
        serednie = sum/--countNumber;//предекремент, щоб програма не рахувала .
        System.out.println("Середнє число з " + countNumber + " чисел " + serednie);
    }
}
