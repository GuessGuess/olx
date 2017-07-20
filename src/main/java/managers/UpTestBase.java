package managers;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.OlxHomePage;
import pages.OlxLogin;
import pages.OlxMyProfile;
import pages.OlxSearchPage;

public class UpTestBase extends InitDriver{

    @BeforeTest
    public void setUp(){
        getInitDriver().getDriver().get("https://www.olx.ua/");
        System.out.println(getInitDriver().getDriver().getTitle());
    }

    @AfterTest
    public void Close(){
        getInitDriver().getDriver().quit();
    }

    public OlxHomePage getOlxHomePage(){
        return OlxHomePage.get();
    }

    public OlxLogin getOlxLogin(){
        return OlxLogin.get();
    }

    public OlxMyProfile getOlxMyProfile(){
        return OlxMyProfile.get();
    }

    public OlxSearchPage getOlxSearchPage(){
        return OlxSearchPage.get();
    }

    public InitDriver getInitDriver(){
        return InitDriver.get();
    }
}
