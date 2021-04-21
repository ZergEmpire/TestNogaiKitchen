package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main extends PageBase {
    String SITE_URL = "https://nogai.ru/"; /*https://nogai.ru/*/ /*https://sole.pizza/*/
    public Main(WebDriver driver) {
        super(driver);
    }

    public void goTo() {
        driver.get(SITE_URL);
    }

}
