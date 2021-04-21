package test;

import org.junit.jupiter.api.Test;

public class FirstTest extends TestBase {

    @Test
    public void testHV() {
        main.goTo();
        taskSecondSendAnOrder.MathRandomHead();
        taskSecondSendAnOrder.ScrollMenuToProductCards();
        taskSecondSendAnOrder.GoClickRandomCard().FuckingClick().GoToFiledBasket();
        taskSecondSendAnOrder.FillInFields();
        taskSecondSendAnOrder.selectPayType();
/*        taskSecondSendAnOrder.SendOrder();*/


    }
}
