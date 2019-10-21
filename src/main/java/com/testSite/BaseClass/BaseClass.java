package com.testSite.BaseClass;

import com.aventstack.extentreports.ExtentTest;
import com.testSite.PageLibrary.Page_TestSiteLandingPage;
import org.openqa.selenium.WebDriver;

public class BaseClass {

    private WebDriver driver;
    private Page_TestSiteLandingPage p;

    public BaseClass(WebDriver driver){

        this.driver = driver;
        p = new Page_TestSiteLandingPage(driver);
    }

    public void Test1() throws InterruptedException {

        p.LaunchPhpDemo();

    }

    public void Test2() throws InterruptedException {

        p.LaunchPhpDemo();

    }
}
