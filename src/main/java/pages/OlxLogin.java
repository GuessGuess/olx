package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OlxLogin {

//    private EditText  editText=new EditText("xpath");

    private By userName = By.id("userEmail");
    private By password = By.id("userPass");
    private By login = By.id("se_userLogin");
    //private By enter = By.xpath(".//*[@id='topLoginLink']/span/strong");


    WebDriver driver;

    public OlxLogin(WebDriver driver){
        this.driver = driver;
    }

    /*public void clickEnter(){
        driver.findElement(enter).click();
    }*/

    public void setUserName(String strUserName){
//        editText.setText(strUserName);
        driver.findElement(userName).sendKeys(strUserName);
    }

    public void setPassword(String strPassword){
        driver.findElement(password).sendKeys(strPassword);
    }

    public void clickLogin(){
        driver.findElement(login).click();
    }

    public void loginToOlx(String strUserName, String strPassword){
        //this.clickEnter();
        this.setUserName(strUserName);
        this.setPassword(strPassword);
        this.clickLogin();
    }

}
