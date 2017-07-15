package pages;

import managers.Element;
import org.openqa.selenium.By;

public class MyProfile {
    private static MyProfile instance;

    private Element profileMenu;
    private Element exit;

    public static MyProfile get(){
        if(instance == null){
            instance = new MyProfile().init();
        }
        return instance;
    }

    protected MyProfile init(){
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
