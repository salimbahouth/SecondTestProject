package registerAndLogin;

import constant.Constants;
import bases.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
import static org.testng.Assert.assertEquals;



public class RegisterPage extends BasePage {
    private static WebDriver driver;

//    this class runs only the register page, i created a seprate class like this to make sure the project runs

    @BeforeClass
    public static void getDriverInstance(){
            System.setProperty("webdriver.chrome.driver", Constants.CROMEDRIVER_PATH);
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://buyme.co.il/");
        }

    @Test
    public static void registerUser() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.className("notSigned")).click();
        driver.findElement(By.className("text-link")).click();

//        insert details
        driver.findElement(By.id("ember1697")).sendKeys("salim");
        driver.findElement(By.id("ember1704")).sendKeys("salimbahouth@gmail.com");
        driver.findElement(By.id("valPass")).sendKeys("Salim123b");
        driver.findElement(By.id("ember1718")).sendKeys("Salim123b");

//        assert details
        String fName = driver.findElement(By.id("ember1697")).getText();
        String Email = driver.findElement(By.id("ember1704")).getText();
        String pss = driver.findElement(By.id("valPass")).getText();
        String vpss = driver.findElement(By.id("ember1718")).getText();
        assertEquals(fName,"salim");
        assertEquals(Email,"salimbahouth@gmail.com");
        assertEquals(pss,"Salim123b");
        assertEquals(vpss,"Salim123b");

//        driver.findElement(By.id("ember1724")).click();


    }
}
