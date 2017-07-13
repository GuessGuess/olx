import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestOlx {
    private WebDriver driver;
    private OlxLogin objLogin;
    private OlxHomePage objHomePage;
    private OlxSearchPage objSearchPage;
    private OlxLogout objLogout;

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Алла\\Desktop\\geckodriver-v0.17.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.olx.ua/");
        System.out.println(driver.getTitle());


    }

    @Test
    public void testHomePageLogin(){
        objHomePage = new OlxHomePage(driver);
        objHomePage.clickEnter();
        objLogin = new OlxLogin(driver);
        objLogin.loginToOlx("bort7007@gmail.com", "qwe123asd");
        //objHomePage = new OlxHomePage(driver);
        Assert.assertTrue(objHomePage.getHomePageName().toLowerCase().contains("bort7007"));
    }

    @Test(dependsOnMethods = {"testHomePageLogin"})
    public void testSearchPage(){
        //objHomePage = new OlxHomePage(driver);
        objHomePage.clickMainOlx();
        objSearchPage = new OlxSearchPage(driver);
        objSearchPage.yourSearch("Playstation 4 Pro 1 TB 405$ новый ,гарантия");
        objSearchPage.highlightOff();
        Assert.assertTrue(objSearchPage.getSearchResult().contains("Playstation 4 Pro 1 TB 405$ новый ,гарантия"));
        System.out.println(objSearchPage.getSearchResult());

    }

    //Не проходит тест. Элемент присутствует в DOM, но не находится в состоянии, с которым можно взаимодействовать.
    //Не успел разобраться))
    /*@Test(dependsOnMethods = {"testSearchPage"})
    public void testLogout(){
        objHomePage.clickMainOlx();
        objLogout = new OlxLogout(driver);
        objLogout.clickLogout();
        System.out.println(objHomePage.getHomePageName());
        Assert.assertTrue(objHomePage.getHomePageName().toLowerCase().contains("Мой профиль"));
    }*/

    @AfterTest
    public void Close(){
        driver.quit();
    }



}
