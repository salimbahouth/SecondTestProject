package pages;

import bases.BasePage;
import org.openqa.selenium.By;

public class PickBusiness extends BasePage {


    public void execute() throws Exception {
//        assertUrl();
        pickBusiness();
    }

//    public static void assertUrl(){
//        String url = "https://buyme.co.il/search?budget=2&category=204&query=%D7%90%D7%AA%D7%A8%20MISMAS%20%D7%9E%D7%A9%D7%A4%D7%98%20%D7%90%D7%97%D7%93%20%D7%91%D7%99%D7%95%D7%9D&region=9";
//        Assert.assertEquals(driver.getCurrentUrl(), url);
//
//    }

    public static void pickBusiness() throws Exception {
        clickElement(By.xpath("//*[@id=\"ember1733\"]"));
        sendKeysToElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/div/div[2]/div/ul/li/div/div/div[2]/form/div[1]/label/input"),"500");
        clickElement(By.xpath("//html/body/div[2]/div/div[2]/div[1]/div/div/div[2]/div/ul/li/div/div/div[2]/form/div[2]/button"));
    }
}
