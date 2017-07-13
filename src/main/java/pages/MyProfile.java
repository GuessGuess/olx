package pages;

import managers.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MyProfile {
    private Element logout = new Element(By.xpath(".//*[@id='login-box-logout']/span/span"));
    private Element exit = new Element(By.xpath(""));

    WebDriver driver;

    public MyProfile(WebDriver driver){
        this.driver = driver;
    }

    public void clickLogout(){
        logout.moveToElement();
        exit.click();

//        this.driver.findElement(logout).click();
    }
}
