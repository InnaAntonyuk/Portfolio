package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementVsFindElements {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //driver.get("https://rozetka.com.ua/");
        driver.get("https://allo.ua/");

        //find WebElement => return single the webElement
        //1
       /* WebElement searchBox = driver.findElement(By.cssSelector("input[placeholder='Я шукаю...']"));
        searchBox.sendKeys("apple");
        //2 return the first element from multiples
        WebElement firstElement = driver.findElement(By.xpath("//div[@class='footer']//a"));
        System.out.println(firstElement.getText());//return the first element of list => Вакансії*/

        //findElements return multiples elements
        List<WebElement> links = driver.findElements(By.xpath("//div[@class='footer']//a"));
        System.out.println("Number of elements captured: "+links.size());//return 31 elements
    }
}
