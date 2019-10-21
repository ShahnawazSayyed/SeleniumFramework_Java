package com.phptravels.BaseClass;

import com.phptravels.PageLibrary.Page_phpTravelsLanding;
import org.openqa.selenium.WebDriver;

public class BaseClass {

    private WebDriver driver;

    public BaseClass(WebDriver driver){

        this.driver = driver;
    }

    public void Test1() throws InterruptedException {

        Page_phpTravelsLanding p = new Page_phpTravelsLanding(driver);

        p.LaunchPhpDemo();

    }
}
