package com.homePractice.pages;

import com.homePractice.utitlities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {

    public LibraryLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//label[@for='inputEmail']")
    public WebElement inputUsername;


    @FindBy(xpath = "//label[@for='inputPassword']")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[@class='btn btn-lg btn-primary btn-block']")
    public WebElement signInButton;




}
