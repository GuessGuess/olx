package pages;

import managers.Element;
import org.openqa.selenium.By;

public class OlxHomePage {
    private static OlxHomePage instance;

    private Element enter;
    private Element mainOlx;
    private Element mainSearchButton;


    public static OlxHomePage get(){
        if (instance == null){
            instance = new OlxHomePage().init();
        }
        return instance;
    }

    protected OlxHomePage init(){
        enter = new Element(By.xpath(".//*[@id='topLoginLink']/span/strong"));
        mainOlx = new Element(By.id("headerLogo"));
        mainSearchButton = new Element(By.id("submit-searchmain"));
        return this;
    }

    public void clickEnter(){
        enter.click();
    }

    public void clickMainOlx(){
        mainOlx.click();
    }

    public void clickMainSearchButton(){
        mainSearchButton.click();
    }

    public String getOlxHomePageName(){
        return enter.getText();
    }
}
