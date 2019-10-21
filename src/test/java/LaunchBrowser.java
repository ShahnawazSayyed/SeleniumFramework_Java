import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

    public static void main(String[] args) {

        String ProjectPath = System.getProperty("user.dir");
        String DriverPath = ProjectPath + "/src/main/resources/WebDrivers/";

        System.setProperty("webdriver.chrome.driver",DriverPath + "chromedriver.exe");
        System.setProperty("webdriver.gecko.driver",DriverPath + "geckodriver.exe");
        System.setProperty("webdriver.edge.driver",DriverPath + "msedgedriver.exe");
        //WebDriver driver = new ChromeDriver();
        //WebDriver driver = new FirefoxDriver();
        WebDriver driver = new EdgeDriver();

        driver.get("https://phptravels.com/demo/");
        //driver.get("https://phptravels.com/demo/");

        driver.close();
    }
}
