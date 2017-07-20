package pages;

import managers.Element;
import org.openqa.selenium.By;

public class OlxSearchPage {
    private static OlxSearchPage instance;

    private Element searchText;
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
        searchText = new Element(By.id("search-text"));
        cityField = new Element(By.id("cityField"));
        serchButton = new Element(By.id("search-submit"));
        searchResult = new Element(By.cssSelector("a.marginright5 > strong:nth-child(1)"));
        highlight = new Element(By.cssSelector(".highlight-close"));
        return this;
    }

    public void highlightOff(){
        highlight.click();
    }

    public void setSearchText(String strSearchText){
        searchText.clear();
        searchText.sendKeys(strSearchText);
    }

    public void setCityField(String strCityField){
        cityField.clear();
        cityField.sendKeys(strCityField);
    }

    public void clickSerchButton(){
        serchButton.click();
    }

    public void yourSearch(String strSearchText, String strCityField){
        setSearchText(strSearchText);
        setCityField(strCityField);
        clickSerchButton();
    }

    public void yourSearch(String strSearchText){
        setSearchText(strSearchText);
        clickSerchButton();
    }

    public String getSearchResult(){
        return searchResult.getText();
    }





}
