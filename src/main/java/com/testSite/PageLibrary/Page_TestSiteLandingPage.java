package com.testSite.PageLibrary;

import com.testSite.ObjectRepository.OR_TestSiteLandingPage;
import org.openqa.selenium.WebDriver;

public class Page_TestSiteLandingPage {

    private WebDriver driver;

    public Page_TestSiteLandingPage(WebDriver driver){
        this.driver = driver;
    }
    public void LaunchPhpDemo() throws InterruptedException {

        driver.get("http://automationpractice.com/");
        Thread.sleep(10000);

    }

    public void Login() {

        driver.findElement(OR_TestSiteLandingPage.BTN_SIGN_IN).click();
    }

}
