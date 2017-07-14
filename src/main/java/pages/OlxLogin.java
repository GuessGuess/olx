package pages;

import managers.Element;
import org.openqa.selenium.By;

public class OlxLogin {
    private static OlxLogin instance;

//    private EditText  editText=new EditText("xpath");

    private Element userName;
    private Element password;
    private Element login;



    public static OlxLogin get(){
        if(instance == null){
            instance = new OlxLogin().init();
        }
        return instance;
    }

    protected OlxLogin init(){
        userName = new Element(By.id("userEmail"));
        password = new Element(By.id("userPass"));
        login = new Element(By.id("se_userLogin"));
        return this;
    }

  //  private By userName = By.id("userEmail");
  //  private By password = By.id("userPass");
  //  private By login = By.id("se_userLogin");
    //private By enter = By.xpath(".//*[@id='topLoginLink']/span/strong");


 //   WebDriver driver;

  //  public OlxLogin(WebDriver driver){
  //      this.driver = driver;
  //  }

    /*public void clickEnter(){
        driver.findElement(enter).click();
    }*/

    public void setUserName(String strUserName){
        userName.sendKeys(strUserName);
    }

    public void setPassword(String strPassword){
        password.sendKeys(strPassword);
    }

    public void clickLogin(){
        login.click();
    }

    public void loginToOlx(String strUserName, String strPassword){
        //this.clickEnter();
        this.setUserName(strUserName);
        this.setPassword(strPassword);
        this.clickLogin();
    }

}
