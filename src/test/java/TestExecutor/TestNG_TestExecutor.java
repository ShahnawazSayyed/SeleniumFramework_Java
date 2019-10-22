package TestExecutor;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.testSite.BaseClass.BaseClass;
import com.testSite.Utils.InitializeBrowser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG_TestExecutor {

    private WebDriver driver = null;
    private ExtentHtmlReporter htmlreporters;
    private ExtentReports extent;
    public ExtentTest test;
    private Logger logger;

    @BeforeSuite
    public void setUpTest(){

        htmlreporters = new ExtentHtmlReporter("src/test/ExtentReports/extent.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlreporters);

        logger = LogManager.getLogger(TestNG_TestExecutor.class);
        //PropertyConfigurator.configure(path);

        String browser;

        browser = "chrome";
        driver = InitializeBrowser.LaunchBrowser(browser);
        System.out.println("Launched the " + browser + " Browser Successfully");

    }

    @Test
    public void executeTests() throws InterruptedException {

        ExtentTest test = extent.createTest("My First Test", "Test Description");
        test.log(Status.INFO,"Starting the Test Execution");
        test.info("Test Execution Started using TestNG Framework using Maven");

        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");

        BaseClass b = new BaseClass(driver);
        b.Test1();
    }

    @AfterSuite
    public void tearDownTest(){

        extent.flush();
        driver.close();
        System.out.println("Closed the Browser Successfully");
        driver.quit();

    }

}
