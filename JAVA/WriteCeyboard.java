package week1lecture1;

import java.io.IOException;

public class WriteCeyboard {
    public static void main(String[] args) throws IOException {
        char ch;
        System.out.println("Натисніть потрібну клавішу, а потім ENTER");
        ch = (char)System.in.read();
        System.out.println("Ви натиснули клавішу:" + ch);
    }
}
