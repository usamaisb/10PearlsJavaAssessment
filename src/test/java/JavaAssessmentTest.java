import modules.Base;

import org.testng.annotations.Test;
import pageObjects.Chapter1Objects;
import pageObjects.LandingPageObjects;

import static com.codeborne.selenide.Selenide.open;


public class JavaAssessmentTest {

    @Test
    public void executeAssessmentTest() {
        open(Base.getBaseUrl());
        LandingPageObjects.verifyBasePageText();
        LandingPageObjects.navigateToChapter1();
        Chapter1Objects.verifyChapter1PageText();
        Chapter1Objects.navigateToHomePage();
        LandingPageObjects.verifyBasePageText();
    }

}
