package pages;

import managers.Element;
import org.openqa.selenium.By;

public class OlxMyProfile {
    private static OlxMyProfile instance;

    private Element profileMenu;
    private Element exit;

    public static OlxMyProfile get(){
        if(instance == null){
            instance = new OlxMyProfile().init();
        }
        return instance;
    }

    protected OlxMyProfile init(){
        profileMenu = new Element(By.xpath(".//*[@id='topLoginLink']/span/strong"));
        exit = new Element(By.xpath(".//*[@id='login-box-logout']/span/span"));
        return this;
    }
    public String getMyProfileMenuName(){
        return profileMenu.getText();
    }

    public void clickLogout(){
        profileMenu.moveToElement();
        exit.click();
    }
}
