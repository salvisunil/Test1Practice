package Support;

import Locators.LoginLocators;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class StepLoginInvalidCredentialsPage {
    LoginLocators loginLocators = new LoginLocators();


    @Step("Enter the Username")
    public void invalidinputUsername(String userName)
    {
        $(By.xpath("//input[@placeholder='Username']")).sendkeys((userName));

    }
    public void invalidinputPassword(){
        $
    }

}
