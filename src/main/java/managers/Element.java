package managers;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Element {
    public By locator;
    private WebDriver driver;

    public Element(By locator){
        this.locator = locator;
        this.driver = InitDriver.get().getDriver();
    }

    public String getText(){
        if (isVisible())
            return driver.findElement(locator).getText();
        else
            throw new ElementNotFoundException("Element " + locator + " not found", "", "");
    }

    public void click(){
        if (isVisible())
            driver.findElement(locator).click();
        else
            throw new ElementNotFoundException("Element " + locator + " not found", "", "");
    }

    public void moveToElement(){
        WebElement element=driver.findElement(locator);
        Actions builder = new Actions(driver);
        builder.moveToElement(element).build().perform();
    }

    private boolean isVisible(){
        int size = driver.findElements(locator).size();
        return size == 0 ? false : true;
    }

}
