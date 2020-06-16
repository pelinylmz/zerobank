package com.zerobank.stepdefinitions;
import com.zerobank.pages.LoginPage;
import com.zerobank.pages.MenuPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class Login  {

    @Given("the user is on URL")
    public void the_user_is_on_URL() {


        String url = ConfigurationReader.get("url");
            Driver.get().get(url);
        }


    @When("user logs in with valid credentials")
    public void user_logs_in_with_valid_credentials() {

        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");
        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);

    }
    @Then("the Account summary page should displayed")
    public void the_Account_summary_page_should_displayed() {

        MenuPage summaryTab1 = new MenuPage() ;
        Assert.assertTrue(summaryTab1.summaryTab.isDisplayed());

    }

    @When("user logs in with invalid credentials")
    public void user_logs_in_with_invalid_credentials() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the user gets an error message")
    public void the_user_gets_an_error_message() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @When("the user logs in with blank tabs")
    public void the_user_logs_in_with_blank_tabs() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the user get error message")
    public void the_user_get_error_message() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    //Credentials
   //InvalidCredentials
    //BlankTab






}
