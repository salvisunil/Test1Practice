package Support;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;

public class StepDashBoardPage extends PageObject {

    public void loginVerify(){
    String dashboardTitle = $(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
        Assert.assertEquals(dashboardTitle,"DashBoard");

    }




}
