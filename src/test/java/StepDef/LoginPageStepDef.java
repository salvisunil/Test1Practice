package StepDef;

import Locators.LoginLocators;
import Support.StepDashBoardPage;
import Support.StepLoginPage;
import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;

public class LoginPageStepDef {
    @Steps
    StepLoginPage loginPage;

    @Steps
    StepDashBoardPage dashPage;




    LoginLocators loginLocators = new LoginLocators();
    @When("user is open home page")
    public void openApplication() {
        loginPage.open();
        loginLocators.getatime();
        System.out.println("page is opened");


    }

    @When("User enters username as {string}")
    public void enterUsername(String userName) {
        System.out.println("Enter Username");
        loginPage.inputUserName(userName);

    }

    @When("User enters password as {string}")
    public void enterPassword(String password) {
        loginPage.inputPassword(password);
        loginPage.clickLogin();

    }

    @Then("User should be able to login successfully")
    public void clickOnLoginButton() {
    loginLocators.getatime();
    dashPage.loginVerify();

    }

    //--------------------------------------Scenario 2 started here-------------------------------------------

    @When("User will on homepage")
    public void user_will_on_homepage() {
        loginPage.open();
        loginLocators.getatime();


    }

    @Then("User will get an error message from this {string} and {string}")
    public void user_will_get_an_error_message_from_this_and(String string, String string2) {

    }

    @Given("User will get on homepage")
    public void user_will_get_on_homepage() {

    }

    @When("User will enters name as {string}")
    public void user_will_enters_name_as(String string) {

    }

    @When("User will enters password as {string}")
    public void user_will_enters_password_as(String string) {

    }

    @Then("User will get errors {string} and {string}")
    public void user_will_get_errors_and(String string, String string2) {

    }
}
