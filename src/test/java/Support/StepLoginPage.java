package Support;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class StepLoginPage extends PageObject {


    @Step("Enter Username")
    public void inputUserName(String username){
      $(By.xpath("//input[@placeholder='Username']")).sendKeys((username));
    }
    @Step("Enter Password")
    public void inputPassword(String password)
    {
        $(By.xpath("//input[@placeholder='Password']")).sendKeys((password));
    }
    @Step("click submit button")
    public void clickLogin()
    {
        $(By.xpath("//button[@type='submit']")).click();
    }


}
