package pages;

import bases.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {


    public void dropDowns() throws Exception {
        selectFromDropPrice();
        selectFromDropLocation();
        selectFromDropCategory();
//        whatGift();
        pressSearchButton();
    }


    public static void selectFromDropPrice() throws Exception {
        clickElement(By.className("selected-text"));
        clickElement(By.id("ember1057"));
    }

    public static void selectFromDropLocation() throws Exception {
        clickElement(By.xpath("//*[@id=\"ember1069\"]/div/div[1]"));
        clickElement(By.xpath("//*[@id=\"ember1093\"]"));
    }

    public static void selectFromDropCategory() throws Exception {
        clickElement(By.xpath("//*[@id=\"ember1101\"]/div/div[1]/span"));
        clickElement(By.xpath("//*[@id=\"ember1153\"]"));
    }

    public static void pressSearchButton() throws Exception {
        clickElement(By.id("ember1180"));
    }


}
