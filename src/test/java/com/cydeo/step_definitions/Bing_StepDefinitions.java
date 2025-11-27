package com.cydeo.step_definitions;

import com.cydeo.pages.BingSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Bing_StepDefinitions {

    BingSearchPage bingSearchPage = new BingSearchPage();

    @Given("user is on theBing search page")
    public void user_is_on_the_bing_search_page() {
        Driver.getDriver().get("https://www.bing.com/?toWww=1&redig=D9BACB6AFD8A4F19ADDC773B7509D80B");

    }

    @When("user eneters orange in the Bing search box")
    public void user_eneters_orange_in_the_bing_search_box() {
        bingSearch



    }
    @Then("user should see orange in the title")
    public void user_should_see_orange_in_the_title() {

    }

    }
