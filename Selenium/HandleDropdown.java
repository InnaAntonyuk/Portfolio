package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandleDropdown {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.opencart.com/index.php?route=account/register");

        WebElement drpCountryElement = driver.findElement(By.id("input-country"));
        Select drpCountry= new Select(drpCountryElement);
        //drpCountry.selectByVisibleText("Ukraine");//select by visible text
        //drpCountry.selectByValue("10"); //write the value attribute Argentina = 10
        //drpCountry.selectByIndex(8);//index of value start from 0 => selected Antractica

        //selecting option from dropdown without using methods
        List<WebElement> alloptions = drpCountry.getOptions();
        for(WebElement option:alloptions)
        {
            if(option.getText().equals("Ukraine"))
            {
                option.click();
                break;
            }
        }

    }
}
