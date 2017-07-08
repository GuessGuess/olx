import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OlxHomePage {
    WebDriver driver;
    private By homePageName = By.xpath(".//*[@id='topLoginLink']/span/strong");
    private By enter = By.xpath(".//*[@id='topLoginLink']/span/strong");
    private By mainOlx = By.id("headerLogo");


    public OlxHomePage(WebDriver driver){
        this.driver = driver;
        if (!"Доска объявлений OLX, раньше Slando: сайт частных объявлений в Украине - купля/продажа б/у товаров на OLX.ua".equals(driver.getTitle())) {
            throw new IllegalStateException("This is not the home page");
        }
    }

    public String getHomePageName(){
        return driver.findElement(homePageName).getText();
    }

    public void clickEnter(){
        driver.findElement(enter).click();
    }

    public void clickMainOlx(){
        driver.findElement(mainOlx).click();
    }

}
