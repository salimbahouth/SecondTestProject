package registerAndLogin;

import bases.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {



    public void login() throws Exception {;
        pressLogin();
        enterCredentials();
    }


    private void pressLogin() throws Exception {
        clickElement(By.xpath("//*[@id=\"ember985\"]/div/ul[1]/li[3]"));
    }

    private void enterCredentials() throws Exception {
        clickElement(By.id("ember1670"));
        sendKeysToElement(By.id("ember1669"),"salimbahouth@gmail.com");
        sendKeysToElement(By.id("ember1676"),"Salim123b");
        clickElement(By.id("ember1686"));
    }





//    @Test
//    public static void loginUser(){
//        driver.findElement(By.className("notSigned")).click();
//        driver.findElement(By.id("ember1669")).sendKeys("salimbahouth@gmail.com");
//        driver.findElement(By.id("ember1676")).sendKeys("Salim123b");
//        driver.findElement(By.id("ember1686")).click();
//    }
}
