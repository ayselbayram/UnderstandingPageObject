package test.SmokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import test.TestBase;
import utils.Driver;

public class VerifyLogin extends TestBase {

    @Test(description="Verify Login Test ")
    public void loginTest(){
        LoginPage loginPage=new LoginPage();
        loginPage.login();
        String expectedTitle="Portal";
        String actualTitle= Driver.get().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Login verification failed");

    }
}
