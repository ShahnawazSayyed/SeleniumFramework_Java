package com.testSite.BaseClass;

import com.testSite.PageLibrary.Page_TestSiteLandingPage;
import org.openqa.selenium.WebDriver;

public class BaseClass {

    private WebDriver driver;

    public BaseClass(WebDriver driver){

        this.driver = driver;
    }

    public void Test1() throws InterruptedException {

        Page_TestSiteLandingPage p = new Page_TestSiteLandingPage(driver);

        p.LaunchPhpDemo();

    }
}
