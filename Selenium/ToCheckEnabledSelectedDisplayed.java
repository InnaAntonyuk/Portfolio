package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToCheckEnabledSelectedDisplayed {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        /*driver.get("https://rozetka.com.ua/ua/");

        //check the webElement isDisplayed or isEnable
        WebElement searchStore = driver.findElement(By.cssSelector("input[placeholder='Я шукаю...']"));// searchStore true or not

        System.out.println("Displayed status: "+searchStore.isDisplayed()); //true
        System.out.println("Enabled status: "+searchStore.isEnabled()); //true
        System.out.println("Selected status: " + searchStore.isSelected());//false

        driver.quit();*/

        //isSelected for radiobutton, checkboxes, dropdown option
        driver.get("https://rozetka.com.ua/ua/careers/");

        WebElement checkOn = driver.findElement(By.cssSelector("label[for='Без досвіду роботи']")); //find button

        System.out.println(checkOn.isSelected());//initialization ->false

        checkOn.click(); //selected button
        System.out.println(checkOn.isSelected());//true

        driver.quit();

    }
}
