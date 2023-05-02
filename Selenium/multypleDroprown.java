package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multypleDroprown {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://passport.meta.ua/reg/");

        Select dayDrp =new Select(driver.findElement(B);
        dayDrp.selectByVisibleText("23");

        /*Select monthdrp = new Select(driver.findElement(By.name("901d8115368507c32fe61baa78c1a5eac")));
        monthdrp.selectByValue("3");

        Select yeardrp = new Select(driver.findElement(By.name("181f346a91c1d54c2229388176e045ff4")));
        yeardrp.selectByValue("25");*/


    }
}
