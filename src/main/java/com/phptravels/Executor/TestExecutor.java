package com.phptravels.Executor;

import com.phptravels.PageLibrary.Page_phpTravelsLanding;
import org.openqa.selenium.WebDriver;

import com.phptravels.Utils.InitializeBrowser;

public class TestExecutor {

    public static void main(String[] args) throws InterruptedException {

        String browser;

        browser = "chrome";
        WebDriver driver = InitializeBrowser.LaunchBrowser(browser);

        Page_phpTravelsLanding p = new Page_phpTravelsLanding(driver);

        p.LaunchPhpDemo();

        driver.close();
    }


}
