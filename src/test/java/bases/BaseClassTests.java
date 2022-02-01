package bases;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import constant.Constants;
import drivers.DriverSingleton;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.PurchasePage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseClassTests {
    private static ChromeDriver driver;
    private static ExtentReports extent;
    private static ExtentTest test;

    @BeforeClass
    public void beforeRun() throws Exception {
        String cwd = System.getProperty("user.dir");
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter(cwd + "\\extent.html");
        // attach reporter
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        // name your test and add description
        test = extent.createTest("MyFirstTest", "Sample description");

        // log results
        test.log(Status.INFO, "@Before class");


    }


//    login form test
//    @Test
//    public void loginTest(){
//        registerAndLogin.LoginPage loginPage = new registerAndLogin.LoginPage();
//        loginPage.login();
//    }


//    first page test
    @Test
    public void homePageTest() throws Exception {
        pages.HomePage home = new pages.HomePage();
        home.dropDowns();
    }

//    this function runs the pick business page test
    @Test
    public void pickBusinessTest() throws Exception {
        pages.PickBusiness business = new pages.PickBusiness();
        business.execute();
    }

//    this function runs the last page test
    @Test
    public void purchaseGift() throws Exception{
        try {
            PurchasePage purchase = new PurchasePage();
            purchase.execute();
            test.log(Status.PASS, "Driver established successfully");
        } catch (Exception e) {
            e.printStackTrace();
            test.log(Status.FAIL, "Driver connection failed! " + e.getMessage());
            throw new Exception("Driver failed");
        }
    }

//    private static String takeScreenShot(String ImagesPath) throws Exception{
//        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
//        File screenShotFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
//        File destinationFile = new File(ImagesPath + ".png");
//        try {
//            FileUtils.copyFile(screenShotFile, destinationFile);
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//        return ImagesPath + ".png";
//    }


//    close the popup ad
    @Test
    public void ClickToAdClose() throws Exception {
        Thread.sleep(4000);
        WebElement popup = DriverSingleton.getDriverInstance().findElement(By.xpath("/html/body/div[5]/div/div[2]"));
        if(popup.isDisplayed()){
            popup.click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
    }


    @AfterClass
    public static void afterClass() {
        test.log(Status.INFO, "@After test " + "After test method");
        driver.quit();
        // build and flush report
        extent.flush();
    }


}
