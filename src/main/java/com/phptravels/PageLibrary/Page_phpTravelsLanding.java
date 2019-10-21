package com.phptravels.PageLibrary;

import com.phptravels.ObjectRepository.OR_phpLandingPage;
import org.openqa.selenium.WebDriver;

public class Page_phpTravelsLanding {

    private static WebDriver driver = null;

    public Page_phpTravelsLanding(WebDriver driver){
        this.driver = driver;
    }
    public void LaunchPhpDemo() throws InterruptedException {

        driver.get("https://phptravels.com/");
        Thread.sleep(3000);

        driver.findElement(OR_phpLandingPage.BTN_PHP_DEMO);

    }


}
