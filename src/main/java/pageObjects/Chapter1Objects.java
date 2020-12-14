package pageObjects;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;
import org.testng.Assert;


public class Chapter1Objects {
    private static String getResultText;
    private static String chapter1Text = "Assert that this text is on the page";
    private static String chapter1TextLoc = "divontheleft";
    private static String HomePageLoc = "Home Page";

    public static void verifyChapter1PageText() {
        $(By.id(chapter1TextLoc)).shouldBe(Condition.visible);
        getResultText = $(By.id(chapter1TextLoc)).getText();
        Assert.assertEquals(getResultText, chapter1Text,
                "Chapter1 page text not found");
    }

    public static void navigateToHomePage() {
        $(By.linkText(HomePageLoc)).click();
    }
}
