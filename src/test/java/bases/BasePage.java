package bases;

import drivers.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BasePage {
    public static ChromeDriver driver;


    public static void clickElement(By locator) throws Exception {
        getWebElement(locator).click();
    }

    public static void issDisplayed(By locator) throws Exception {
        getWebElement(locator).isDisplayed();
    }

    public static void sendKeysToElement(By locator, String text) throws Exception {
        getWebElement(locator).sendKeys(text);
    }

    private static WebElement getWebElement(By locator) throws Exception {
        return DriverSingleton.getDriverInstance().findElement(locator);
    }

//    private static void assertingUrl(String txt){
//        assertEquals(driver,txt);
//    }

}
