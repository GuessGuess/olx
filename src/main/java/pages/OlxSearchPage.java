package pages;

import managers.Element;
import org.openqa.selenium.By;

public class OlxSearchPage {
    private static OlxSearchPage instance;

    private Element search;
    private Element cityField;
    private Element serchButton;
    private Element searchResult;
    private Element highlight;



    public static OlxSearchPage get(){
        if(instance == null){
            instance = new OlxSearchPage().init();
        }
        return instance;
    }

    protected OlxSearchPage init(){
        search = new Element(By.id("headerSearch"));
        cityField = new Element(By.id("submit-searchmain"));
        serchButton = new Element(By.id("submit-searchmain"));
        searchResult = new Element(By.cssSelector(".promoted-list > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > h3:nth-child(1) > a:nth-child(1) > strong:nth-child(1)"));
        highlight = new Element(By.cssSelector(".highlight-close"));
        return this;
    }

    public void highlightOff(){
        if (highlight.isDisplayed()){
            highlight.click();
        }
    }

  /*  public OlxSearchPage(WebDriver driver){
        this.driver = driver;
    }

    public String getSearchResult(){
        return driver.findElement(searchResult).getText();
    }

    public void setHeaderSearch(String strHeaderSearch){
        this.driver.findElement(headerSearch).sendKeys(strHeaderSearch);
    }

    public void setCityField(String strCityField){
        this.driver.findElement(cityField).sendKeys(strCityField);
    }

    public void clickSerchButton(){
        this.driver.findElement(serchButton).click();
    }

    public void yourSearch(String strHeaderSearch, String strCityField){
        this.setHeaderSearch(strHeaderSearch);
        this.setCityField(strCityField);
        this.clickSerchButton();
    }

    public void yourSearch(String strHeaderSearch){
        this.setHeaderSearch(strHeaderSearch);

        this.clickSerchButton();
    }
 */
}
