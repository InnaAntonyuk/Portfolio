package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextVsGetAtributeValue {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://meta.ua/uk/");

        WebElement emailinputbox = driver.findElement(By.cssSelector("input[placeholder='e-mail@meta.ua']"));
        emailinputbox.clear();
        emailinputbox.sendKeys("admin123@meta.ua");

        //capturing text from input box
        System.out.println("Result from attribute () method: "+ emailinputbox.getAttribute("placeholder"));
        System.out.println("Result from getText() method: "+ emailinputbox.getText());
    }
}
