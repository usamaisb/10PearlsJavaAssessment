package pageObjects;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;

public class LandingPageObjects {
    public static String baseTextloc = "/html/body/div[1]";
    public static String chapter1Loc = "Chapter1";
    private static String HomePageText = "Selenium: Beginners Guide";
    private static String getResultText;

    public static void verifyBasePageText() {
        $(By.xpath(baseTextloc)).should(Condition.visible);
        getResultText = $(By.xpath(baseTextloc)).getText();
        Assert.assertTrue(getResultText.contains(HomePageText), "Home page text not found");
    }

    public static void navigateToChapter1() {
        $(By.linkText(chapter1Loc)).click();
    }
}
