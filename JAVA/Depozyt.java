package VirtualAcademy;

public class Depozyt {
    public static void main(String[] args) {
        //vklad 100 grn
        //vidsotok 20%
        //vkinci (100*0.2)+100=120 grn,nastupnogo roku narahovuetsia na 120 grn
        //formula vklad*(1+vidsotok)`kilkistRokiv
        //100grn*(1+0.2)`5
        double vklad = 1000, vidsotok = 0.2, balans = 0;
        int rikVkladu = 2017;
        for (int rik = rikVkladu; rik<=(rikVkladu+10); rik++)
        {
            balans=Math.round(vklad*Math.pow(1+vidsotok, (rik-rikVkladu+1)));
            System.out.println("Баланс на кінець "+rik+" року "+balans +" грн.");
        }
    }
}
