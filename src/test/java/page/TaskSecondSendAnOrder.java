package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class TaskSecondSendAnOrder extends PageBase {
    public TaskSecondSendAnOrder(WebDriver driver) {
        super(driver);
    }

/*    public TaskSecondSendAnOrder GoToMenuRoll() {
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Роллы')]"));
        element.click();
        return this;
    }*/

    public TaskSecondSendAnOrder GoClickRandomCard (){
        List<WebElement> list = driver.findElements(By.cssSelector(".img-fluid.w-100"));
        int i = (int) (Math.random() * list.size());
        list.get(i).click();

        isElementByDisplayed(By.xpath("//span[contains(text(),'Энерг. ценность')]"));
        isElementByDisplayed(By.xpath("//span[contains(text(),'Белки')]"));
        isElementByDisplayed(By.xpath("//span[contains(text(),'Жиры')]"));
        isElementByDisplayed(By.xpath("//span[contains(text(),'Углеводы')]"));
        isElementByDisplayed(By.xpath("//span[contains(text(),'Вес')]"));
        WebElement elementButton = driver.findElement(By.linkText("В корзину"));
        elementButton.click();
        return this;
    }
    public TaskSecondSendAnOrder ScrollMenuToProductCards(){
        JavascriptExecutor je = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("//body/main[@id='panel']/section[@id='full-content']/div[@id='catalog']/div[1]/div[4]"));
        je.executeScript("arguments[0].scrollIntoView(true);",element);
        return this;
    }

   /* public TaskSecondSendAnOrder ScrollToElement1(String element) {
        List<WebElement> list = driver.findElements(By.className("price"));
        int i = (int) (Math.random() * list.size());
        list.get(i).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // js.executeScript("arguments[0].click();",webElement);
        return this;
    }*/

    //Идём в корзину
    public TaskSecondSendAnOrder GoToFiledBasket() {
        WebElement webElement = driver.findElement(By.xpath("//body[1]/main[1]/h eader[1]/div[2]/div[1]/div[1]/div[2]/a[1]/span[1]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", webElement);
        return this;
    }

    public TaskSecondSendAnOrder FillInFields() {
        //Заполнить имя
        WebElement Name = driver.findElement(By.id("order_name"));
        Name.sendKeys(TestName);
        //Заполнить Тестовый телефон
        WebElement TestPhone = driver.findElement(By.id("order_phone"));
        TestPhone.sendKeys(TestPhoneNumberLogin);
        //Заполнить Тестовый email
        WebElement TestEmail = driver.findElement(By.id("order_email"));
        TestEmail.sendKeys(TestEmailAddress);
        //Заполнить Адрес (который располагается на карте)
        WebElement Address1 = driver.findElement(By.id("order_street"));
        Address1.sendKeys(AddressStreet);
        //Заполнить Номер дома( Который располагается на карте)
        WebElement Address2 = driver.findElement(By.id("order_house"));
        Address2.sendKeys(AddressHome);
        //Заполнить поле комментарий.
        WebElement Address3 = driver.findElement(By.id("order_comment"));
        Address3.sendKeys(OrderComment);
        return this;
    }

    public  TaskSecondSendAnOrder selectPayType(){

        WebElement paymentTitle = driver.findElement(By.cssSelector(".payment-title"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",paymentTitle);
        WebElement HowGetMoneyCourier = driver.findElement(By.cssSelector("#change"));
         HowGetMoneyCourier.click();
         HowGetMoneyCourier.clear();
        HowGetMoneyCourier.sendKeys(howMoneyToCourier);
        return this;
    }

    public TaskSecondSendAnOrder SendOrder() {
        WebElement GoSendOrder = driver.findElement(By.xpath("//button[@id='sendOrder']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",GoSendOrder);  /* .scrollIntoView(true)*/
        GoSendOrder.click();
        /*GoSendOrder.click();*/
        wait.until(ExpectedConditions.urlContains("https://nogai.ru/order/complete/"));
        return this;
    }

    public TaskSecondSendAnOrder FuckingClick(){
        WebElement FuckClick = driver.findElement(By.className("mfp-wrap mfp-close-btn-in mfp-auto-cursor my-mfp-zoom-in mfp-ready"));
        FuckClick.click();
        return this;
    }


    public void MathRandomHead (){
        List<WebElement> list = driver.findElements(By.className("scroll-nav_link"));
        int i = (int) (Math.random() * list.size());
        list.get(i).click();
    }


}
