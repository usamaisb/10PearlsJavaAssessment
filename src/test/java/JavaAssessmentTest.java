import modules.Base;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.Chapter1Objects;
import pageObjects.LandingPageObjects;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class JavaAssessmentTest {
    private WebDriver driver;
    private String baseUrl;

    @BeforeTest(alwaysRun = true)
    public void setUp() {
        Base.Chrome_Driver();
    }

    @Test
    public void ExecuteAssessmentTest() {
        open(Base.getBaseUrl());
        LandingPageObjects.verifyBasePageText();
        LandingPageObjects.navigateToChapter1();
        Chapter1Objects.verifyChapter1PageText();
        Chapter1Objects.navigateToHomePage();
        LandingPageObjects.verifyBasePageText();
    }

    @AfterTest
    public void teardown() {
        getWebDriver().quit();
    }
}
