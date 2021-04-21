package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import page.Main;
import page.TaskOneCheckElementInMainPage;
import page.TaskSecondSendAnOrder;
import page.TaskTestLoginForm;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TestBase {
       public WebDriver driver;
       public Main main;
       public TaskOneCheckElementInMainPage taskOneCheckElementInMainPage;
       public TaskSecondSendAnOrder taskSecondSendAnOrder;
       public TaskTestLoginForm taskTestLoginForm;

        //Сюда операции выполняющиеся перед стартом теста
        @BeforeEach
        public void start(){



            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            main = PageFactory.initElements(driver, Main.class);
            taskOneCheckElementInMainPage = PageFactory.initElements(driver, TaskOneCheckElementInMainPage.class);
            taskSecondSendAnOrder = PageFactory.initElements(driver, TaskSecondSendAnOrder.class);
            taskTestLoginForm = PageFactory.initElements(driver, TaskTestLoginForm.class);
        }


        //Сюда то, что выполняется после выполнения теста
       /* @AfterEach
        public void finish(){
            driver.quit();
       }*/

    }

