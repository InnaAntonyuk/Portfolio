package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("https://snapdeal.com");
        //driver.get("https://amozon.com");
        driver.navigate().to("https://amazon.com");
        driver.navigate().back();//back to snapdeal.com
        driver.navigate().forward();//forfard to amozon.com

        driver.navigate().refresh();//reload page
    }
}
