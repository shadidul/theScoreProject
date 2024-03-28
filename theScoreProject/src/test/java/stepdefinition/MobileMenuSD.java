package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import framework.mobilePages.HomeScreen;

public class MobileMenuSD {

    private HomeScreen homeScreen = new HomeScreen();


    @Given("^I am on home page of the Score App$")
    public void iAmOnHomePage() {

        homeScreen.verifyHomePageScoreApp();
    }

    @When("^I tap on get started button$")
    public void clickOnSkipButton() throws InterruptedException {
        homeScreen.tapGetStarted();
    }


    @When("^I tap on Continue button$")
    public void clickContinueButton() throws InterruptedException {
        homeScreen.clickContinueBtn();
    }

    @When("^I tap on NY Knicks button$")
    public void tapOnNYKnicsBtn() throws InterruptedException {
        homeScreen.tapOnNYKnicksBtn();
    }

    @When("^I tap on Done button$")
    public void tapOnDoneBtn() throws InterruptedException {
        homeScreen.tapDone();
    }

    @When("^I tap on Leagues Icon$")
    public void tapLeaguesIcon() throws InterruptedException {
        homeScreen.tapLeaguesIcon();
    }

    @When("^I navigate to NBA section$")
    public void tapTeam() throws InterruptedException {
        homeScreen.tapTeam();
    }

    @When("^I select the date (.+)$")
    public void selectDate(String date) throws InterruptedException {
        homeScreen.selectDate(date);
    }

    @When("^I select the team Miami Heat$")
    public void selectTeamMiamiHeat() throws InterruptedException {
        homeScreen.selectTeamMiamiHeat();
    }

    @When("^I get the player Bam Adebayo pts, reb, ast, stl, and blk values from the Matchup Section$")
    public void getPlayerStatsFromMatchUpSection() throws InterruptedException {
        homeScreen.getPlayerStatsMatchUpTab();
    }

    @When("^I get the player Bam Adebayo pts, reb, ast, stl, and blk values from the Stats Section$")
    public void getPlayerStatsFromStatsSection() throws InterruptedException {
        homeScreen.getPlayerStatsFromStatsTab();
    }


    @When("^I verify that the Points, Reb, AST, STL and BLK values under the Match Up Tab matches the values in the Stats Section$")
    public void verifyPlayerStats() throws InterruptedException {
        homeScreen.verifyPlayerStats();
    }


    @When("^I tap on menu button$")
    public void clickOnMenuButton() throws InterruptedException {
        Thread.sleep(30000);
        homeScreen.tapOnMainMenuButton();
    }
}
