package framework.mobilePages;

import framework.MobileBasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.testng.Assert;

public class HomeScreen extends MobileBasePage {
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@resource-id='com.fivemobile.thescore:id/btn_primary']")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement getStartedButton;


    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement nflFootballBtn;

    @AndroidFindBy(id = "com.fivemobile.thescore:id/btn_primary")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement continueBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, \"Knicks\")]")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement NYKNICKSBTN;


    @AndroidFindBy(id = "com.fivemobile.thescore:id/action_button_text")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement DoneBtn;


    @AndroidFindBy(accessibility = "Mar 15")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement Mar15Tab;


    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, \"Leagues\")]")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement LeaguesIcon;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='NBA']")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement NBA;


    @AndroidFindBy(id = "com.fivemobile.thescore:id/scores_container")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement clickBothTeams;


    @AndroidFindBy(xpath = "//android.webkit.WebView/android.view.View/android.widget.Button[1]")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement mainMenu;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Loïs Openda')]")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement LoisOpendaPlayer;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Simons')]")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement xaviSimonsPlayer;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Raum')]")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement davidRaumPlayer;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Edit')]")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement Edit;
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Done')]")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement Done;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Heat')]")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement miaHeat;

    @AndroidFindBy(xpath = "(//android.widget.TextView[contains(@text, 'Bam Adebayo')])[2]")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement BamAdebayoPlayer;


    @AndroidFindBy(xpath = "(//androidx.recyclerview.widget.RecyclerView//android.widget.TextView[contains(@text, '22')])[2]")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement PTS;

    ///hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.TextView[1]


    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.TextView[1]")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement REB;


    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.TextView[1]")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement AST;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.LinearLayout[4]/android.widget.TextView[1]")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement STL;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.LinearLayout[5]/android.widget.TextView[1]")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement BLK;

    @AndroidFindBy(accessibility = "Stats")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement Stats;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Adebayo')]/following-sibling::*[1]")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement statPoints;


    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[1]")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement BullshitButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Adebayo')]/following-sibling::androidx.recyclerview.widget.RecyclerView/android.widget.TextView[1]")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement AdebayoMinValue;


    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[2]")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement Pts_ValueStat;


    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[3]")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement Reb_ValueStat;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[4]")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement AST_ValueStat;


    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[5]")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement STL_ValueStat;


    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[6]")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement BLK_ValueStat;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, \"Time to experience\")]")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement WelcomeMessage;


    private String matchPointsValue = "";
    private String statsPointsValue = "";

    private String matchRebValue = "";
    private String statsRebValue = "";


    private String matchAstValue = "";
    private String statsAstValue = "";


    private String matchStlValue = "";
    private String statsStlValue = "";


    private String matchBlkValue = "";
    private String statsBlkValue = "";


    public void verifyHomePageScoreApp() {
        Assert.assertTrue(isElementDisplayed(WelcomeMessage));

    }


    public void tapGetStarted() throws InterruptedException {
        tapOn(getStartedButton);

    }

    public void clickContinueBtn() throws InterruptedException {
        tapOn(continueBtn);
    }

    public void tapOnNYKnicksBtn() throws InterruptedException {
        tapOn(NYKNICKSBTN);
    }

    public void tapDone() throws InterruptedException {
//        tapOn(continueBtn);
        tapOn(DoneBtn);

    }


    public void tapLeaguesIcon() throws InterruptedException {

        tapOn(LeaguesIcon);
    }

    public void tapTeam() {


        tapOn(Edit);
        tapOn(Done);
        tapOn(NBA);


    }


    public void selectDate(String date) throws InterruptedException {
        swipeRightToFindAndClick(date);
    }

    public void selectTeamMiamiHeat() {

        swipeDownToFindAndClickByXPath("//android.widget.TextView[contains(@text, 'Heat')]");
    }

    public void getPlayerStatsMatchUpTab() {
        swipeDownToViewElementByXPath("//android.widget.TextView[contains(@text, \"Top Performers\")]");
        matchPointsValue = getTextFromElement(PTS);
        matchRebValue = getTextFromElement(REB);
        matchAstValue = getTextFromElement(AST);
        matchStlValue = getTextFromElement(STL);
        matchBlkValue = getTextFromElement(BLK);
    }


    public void getPlayerStatsFromStatsTab() {
        tapOn(Stats);
    }


    public void verifyPlayerStats() {

        statsPointsValue = getTextFromElement(Pts_ValueStat);
        statsRebValue = getTextFromElement(Reb_ValueStat);
        statsAstValue = getTextFromElement(AST_ValueStat);
        statsStlValue = getTextFromElement(STL_ValueStat);
        statsBlkValue = getTextFromElement(BLK_ValueStat);


        Assert.assertEquals(matchPointsValue, statsPointsValue, "not equal");
        Assert.assertEquals(matchRebValue, statsRebValue);
        Assert.assertEquals(matchAstValue, statsAstValue);
        Assert.assertEquals(matchStlValue, statsStlValue);
        Assert.assertEquals(matchBlkValue, statsBlkValue);


    }

    public void tapOnMainMenuButton() {
        tapOn(mainMenu);
    }
}
