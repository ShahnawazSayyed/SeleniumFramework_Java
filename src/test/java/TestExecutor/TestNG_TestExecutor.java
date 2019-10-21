package TestExecutor;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.testSite.BaseClass.BaseClass;
import com.testSite.Utils.InitializeBrowser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;


public class TestNG_TestExecutor {

    private WebDriver driver = null;
    private ExtentHtmlReporter htmlreporter;
    private ExtentReports extent;

    @BeforeSuite
    public void setUpTest(){

        htmlreporter = new ExtentHtmlReporter("src/test/ExtentReports/extent.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlreporter);

        String browser;

        browser = "chrome";
        driver = InitializeBrowser.LaunchBrowser(browser);
        System.out.println("Launched the " + browser + " Browser Successfully");

    }

    @Test
    public void executeTests() throws InterruptedException {

        ExtentTest test = extent.createTest("My First Test", "Test Description");

        test.log(Status.INFO,"Starting the Execution log");
        test.info("This Step shows use age of info");

        BaseClass b = new BaseClass(driver);
        b.Test1();
        test.pass("The Test1 Execution is Pass");
    }

    @AfterSuite
    public void tearDownTest(){

        extent.flush();
        driver.close();
        System.out.println("Closed the Browser Successfully");
        driver.quit();

    }

}
