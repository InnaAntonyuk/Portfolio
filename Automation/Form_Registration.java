import io.netty.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Form_Registration {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String url = "https://mytestingthoughts.com/Sample/home.html";
        driver.manage().window().maximize();

        driver.get(url);
        WebElement First_name = driver.findElement(By.xpath("//input[@name = 'first_name']"));
        WebElement Last_name = driver.findElement(By.xpath("//input[@name = 'last_name']"));
        First_name.sendKeys("Inna");
        Last_name.sendKeys("Antoniuk");
        System.out.println("First_name, Last_name is entered");

        WebElement radio_Femail = driver.findElement(By.xpath("//input[@value = 'Female']"));
        radio_Femail.click();
        System.out.println("Radio Button Femail Option is Selected");
        if (radio_Femail.isSelected()){
            System.out.println("Checkbox is Toggled ON");
        }
        else {
            System.out.println("Checkbox is Toggled OFF");
        }
        WebElement Hobbies = driver.findElement(By.xpath("//option[text()='Swimming']"));
        Hobbies.click();
        System.out.println("The Hobbies is selected");

        Select Select_Departament = new Select(driver.findElement(By.xpath("//select[@name ='department']")));
        Select_Departament.selectByVisibleText("Tresurer's Office");
        System.out.println("The text is selected");

        WebElement User_name = driver.findElement(By.xpath("//input[@name='user_name']"));
        WebElement User_password = driver.findElement(By.xpath("//input[@name='user_password']"));
        WebElement User_email = driver.findElement(By.xpath("//input[@name='email']"));
        WebElement User_phone = driver.findElement(By.xpath("//input[@name='contact_no']"));
        WebElement Addition_info = driver.findElement(By.xpath("//textarea[@class='form-control']"));

        User_name.sendKeys("Inna Antoniuk");
        System.out.println("The text is entered");
        User_password.sendKeys("ASIO2389");
        System.out.println("The password is entered");
        User_email.sendKeys("Innaantoniuk@gmail.com");
        System.out.println("The email is entered");
        User_phone.sendKeys("(639)7185890");
        System.out.println("The phone is entered");
        Addition_info.sendKeys("Hello, I'm new customer");
        System.out.println("The information is entered");

        WebElement Submit_button = driver.findElement(By.xpath("//button[@type = 'submit']"));
        Submit_button.click();
        System.out.println("The button Submit is clicked");


        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebElement Success_pop_up = driver.findElement(By.xpath("//div[text()='Success ']"));
        if (Success_pop_up.isDisplayed()){
            System.out.println("The registration is success");
        }
        else {
            System.out.println("Wrong registration");

        }
        driver.close();
    }
}
