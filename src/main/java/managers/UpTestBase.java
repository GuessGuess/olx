package managers;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.OlxHomePage;
import pages.OlxLogin;

public class UpTestBase extends InitDriver{

    @BeforeTest
    public void setUp(){
        InitDriver.get();
        driver.get("https://www.olx.ua/");
        System.out.println(driver.getTitle());
    }

    @AfterTest
    public void Close(){
        driver.quit();
    }

    public OlxHomePage getOlxHomePage(){
        return OlxHomePage.get();
    }

    public OlxLogin getOlxLogin(){
        return OlxLogin.get();
    }
}
