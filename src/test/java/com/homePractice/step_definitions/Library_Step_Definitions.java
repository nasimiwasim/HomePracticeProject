package com.homePractice.step_definitions;

import com.homePractice.pages.LibraryLoginPage;
import com.homePractice.utitlities.ConfigurationReader;
import com.homePractice.utitlities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class Library_Step_Definitions {

    LibraryLoginPage libraryLoginPage = new LibraryLoginPage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {

//        String libraryUrl = ConfigurationReader.getProperty("libraryUrl");
//        Driver.getDriver().get(libraryUrl);


    }

    @When("User enters librarian username")
    public void user_enters_librarian_username() {
//
//        String username = ConfigurationReader.getProperty("librarianUsername");
//        libraryLoginPage.inputUsername.sendKeys(username);

        System.out.println("User enters username");

    }


    @When("User enter librarian password")
    public void user_enter_librarian_password() {

//        String password = ConfigurationReader.getProperty("librarianPassword");
//        libraryLoginPage.inputPassword.sendKeys(password);
//
//        libraryLoginPage.signInButton.click();

        System.out.println("User enters password");

    }


    @Then("User should see librarian in the dashboard")
    public void user_should_see_librarian_in_the_dashboard() {

        System.out.println("User is on the Dashboard Page of Library App");

    }




}
