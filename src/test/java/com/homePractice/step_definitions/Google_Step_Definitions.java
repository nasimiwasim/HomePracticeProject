package com.homePractice.step_definitions;

import com.homePractice.pages.GoogleSearchPage;
import com.homePractice.utitlities.ConfigurationReader;
import com.homePractice.utitlities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;


public class Google_Step_Definitions {

    @Given("User in on google home page")
    public void user_in_on_google_home_page() {

        String url = ConfigurationReader.getProperty("googleUrl");
        Driver.getDriver().get(url);

    }



    @When("User searches for apple")
    public void user_searches_for_apple() {

        GoogleSearchPage googleSearchPage = new GoogleSearchPage();
        googleSearchPage.searchBar.sendKeys("apple" + Keys.ENTER);

    }


    @Then("User should see apple in the title")
    public void user_should_see_apple_in_the_title() {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedInTitle = "apple";
        Assert.assertTrue(actualTitle.contains(expectedInTitle));

    }

    




}
