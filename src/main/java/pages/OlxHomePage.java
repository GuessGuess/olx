package pages;

import managers.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OlxHomePage {
    private static OlxHomePage instance;

    private Element homePageName;
    private Element enter;
    private Element mainOlx;


    public static OlxHomePage get(){
        if (instance == null){
            instance = new OlxHomePage().init();
        }
        return instance;
    }

    protected OlxHomePage init(){
        homePageName = new Element(By.xpath(".//*[@id='topLoginLink']/span/strong"));
        enter = new Element(By.xpath(".//*[@id='topLoginLink']/span/strong"));
        mainOlx = new Element(By.id("headerLogo"));
        return this;
    }


    public String getHomePageName(){
        return homePageName.getText();
    }

    public void clickEnter(){
        enter.click();
    }

    public void clickMainOlx(){
        mainOlx.click();
    }

}
