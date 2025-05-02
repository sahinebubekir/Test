package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GoogleHomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class GoogleStepDefinitions {
    GoogleHomePage googleHomePage = new GoogleHomePage();
    String actualTitle;

    @Given("User goes to {string} page")
    public void userGoesToPage(String page) {
        Driver.getDriver().get(ConfigReader.getProperty(page));
    }

    @And("User gets the title of the page")
    public void userGetsTheTitleOfThePage() {
        actualTitle = Driver.getDriver().getTitle();
    }

    @Then("User validates the title {string}")
    public void userValidatesTheTitle(String expectedTitle) {
        Assert.assertEquals(ConfigReader.getProperty(expectedTitle), actualTitle);
    }

    @And("User clicks on Google Accept Cookies button")
    public void userClicksOnGoogleAcceptCookiesButton()  {
        googleHomePage.cookiesAccept.click();
    }

    @Then("User closes the Driver")
    public void userClosesTheDriver() {
        Driver.closeDriver();
    }

    @And("User searchs {string}")
    public void userSearchs(String searchObject) {
        googleHomePage.searchBox.sendKeys(searchObject);
    }
}
