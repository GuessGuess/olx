package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OlxSearchPage {
    private By headerSearch = By.id("headerSearch");
    private By serchButton = By.id("submit-searchmain");
    private By cityField = By.xpath(".//*[@id='cityField']");
    private By searchResult = By.cssSelector(".promoted-list > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > h3:nth-child(1) > a:nth-child(1) > strong:nth-child(1)");
    private By highlight = By.cssSelector(".highlight-close");

    WebDriver driver;

    public void highlightOff(){
        if (this.driver.findElement(highlight).isDisplayed()){
            this.driver.findElement(highlight).click();
        }
    }

    public OlxSearchPage(WebDriver driver){
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
}
