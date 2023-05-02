package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.sql.Driver;

public class isSelected {
    public static void main(String[] args) {
        WebDriverManager.edgedriver();
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");

        //isSelected
        WebElement male = driver.findElement(By.xpath("(//input[@id='gender-male'])[1]"));
        WebElement female = driver.findElement(By.xpath("(//input[@id='gender-female'])[1]"));
        System.out.println(male.isSelected()); //false
        System.out.println(female.isSelected()); //false

        male.click();
        System.out.println(male.isSelected());//true
        System.out.println(female.isSelected());//false

        female.click();
        System.out.println(male.isSelected());//false
        System.out.println(female.isSelected());//true

        //driver.quit();

    }
}
