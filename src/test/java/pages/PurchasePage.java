package pages;

import bases.BasePage;
import org.openqa.selenium.By;

public class PurchasePage extends BasePage {

    public void execute() throws Exception {
        whoToSend();
        howToSend();
    }

    public static void whoToSend() throws Exception {
        sendKeysToElement(By.xpath("//*[@id=\"ember1278\"]"),"גידאא");
        clickElement(By.cssSelector("span[class=\"selected-text\""));
        clickElement(By.className("ember-view"));
        sendKeysToElement(By.tagName("textarea"),"מזל טוב עד 120 ");
//        clickElement(By.className("media-circle-btn"));
//        sendKeysToElement(By.className("media-circle-btn"),("C:/Users/cupra/Desktop/Beige.png"));
        clickElement(By.id("ember1311"));
    }

    public static void howToSend() throws Exception {
        clickElement(By.className("circle"));
        issDisplayed(By.id("email"));
        clickElement(By.id("email"));
        sendKeysToElement(By.id("email"),"salimbahouth@gmail.com");
        clickElement(By.xpath("/html/body/div[2]/div/div/div[3]/div/div/div[1]/form/div[3]/div[2]/label/input"));
        sendKeysToElement(By.xpath("/html/body/div[2]/div/div/div[3]/div/div/div[1]/form/div[3]/div[2]/label/input"),"salim");
        clickElement(By.id("ember1671"));
    }

}
