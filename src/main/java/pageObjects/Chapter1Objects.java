package pageObjects;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;
import org.testng.Assert;


public class Chapter1Objects {
    private static String getResultText;
    private static String chapter1Text = "If you have arrived here then you have installed Selenium IDE and are ready to start recording your first test";
    public static String chapter1TextLoc = "/html/body/div[2]/p[1]";
    public static String HomePageLoc = "Home Page";

    public static void verifyChapter1PageText() {
        $(By.xpath(chapter1TextLoc)).shouldBe(Condition.visible);
        getResultText = $(By.xpath(chapter1TextLoc)).getText();
        Assert.assertTrue(getResultText.
                        contains(chapter1Text),
                "Chapter1 page text not found");
    }

    public static void navigateToHomePage() {
        $(By.linkText(HomePageLoc)).click();
    }
}
