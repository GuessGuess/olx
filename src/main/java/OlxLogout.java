import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OlxLogout {
    private By logout = By.xpath(".//*[@id='login-box-logout']/span/span");

    WebDriver driver;

    public  OlxLogout(WebDriver driver){
        this.driver = driver;
    }

    public void clickLogout(){
        this.driver.findElement(logout).click();
    }
}
