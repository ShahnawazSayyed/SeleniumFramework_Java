package TestExecutor;

import com.phptravels.BaseClass.BaseClass;
import com.phptravels.Utils.InitializeBrowser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class TestNG_TestExecutor {

    private WebDriver driver = null;

    @BeforeTest
    public void setUpTest(){

        String browser;

        browser = "chrome";
        driver = InitializeBrowser.LaunchBrowser(browser);
        System.out.println("Launched the " + browser + " Browser Successfully");

    }

    @Test
    public void executeTests() throws InterruptedException {
        BaseClass b = new BaseClass(driver);
        b.Test1();
    }

    @AfterTest
    public void tearDownTest(){

        driver.close();
        System.out.println("Closed the Browser Successfully");
        driver.quit();

    }

}
