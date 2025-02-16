package Selenium;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Inicialization {
    public static void main(String[] args) {
        /*System.setProperty("webdriver.chrome.driver", "E:\\Inna\\tools\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rozetka.com.ua/");*/

        /*System.setProperty("webdriver.edge.driver", "E:\\Inna\\tools\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://rozetka.com.ua/");*/

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rozetka.com.ua/");
        System.out.println("Title of the web page is: " + driver.getTitle() ); //the title of page
        System.out.println("Title of the web page is: " + driver.getCurrentUrl() );// the url of page
        System.out.println("Title of the web page is: " + driver.getPageSource() );//code of page

    }
}
