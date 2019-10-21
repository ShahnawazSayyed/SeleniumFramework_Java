package com.testSite.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InitializeBrowser {

    public static WebDriver LaunchBrowser(String browser){

        String ProjectPath = System.getProperty("user.dir");
        String DriverPath = ProjectPath + "/src/main/resources/WebDrivers/";
        WebDriver driver = null;
        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver",DriverPath + "chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver",DriverPath + "geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        }
        if(browser.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver",DriverPath + "msedgedriver.exe");
            driver = new EdgeDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }
}
