package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TaskOneCheckElementInMainPage extends PageBase{
    public TaskOneCheckElementInMainPage(WebDriver driver) {
        super(driver);

    }

    public void loginForName(String login){
       WebElement element = driver.findElement(By.name("name"));
       element.sendKeys(login);

    }
    public void CheckSliderWork() {
        WebElement element = driver.findElement(By.xpath("//body/main[@id='panel']/section[@id='banner']/div[1]/div[2]/span[1]"));
        element.click();
    }

    public void AssertTextFinal(){
        isElementByDisplayed(By.xpath("//p[contains(text(),'Привет, !')]"));

    }




    }


