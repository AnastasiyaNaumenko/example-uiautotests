package tests;

import org.junit.BeforeClass;
import org.junit.Test;
import steps.ViewOnboardingStep;

public class ViewOnboardingTest extends TestBase {
    protected ViewOnboardingStep viewOnboardingStep = new ViewOnboardingStep(driver);

    @BeforeClass
    public static void beforeTest() {
    }

    @Test
    public void viewOnboardingTest() {
        viewOnboardingStep.titleFirstScreenOnboardingCheck();
        viewOnboardingStep.descriptionFirstScreenOnboardingCheck();
        viewOnboardingStep.screenOneSwipe();
        viewOnboardingStep.titleSecondScreenOnboardingCheck();
        viewOnboardingStep.descriptionSecondScreenOnboardingCheck();
        viewOnboardingStep.tab3OnboardingClick();
        viewOnboardingStep.titleThirdScreenOnboardingCheck();
        viewOnboardingStep.descriptionThirdScreenOnboardingCheck();
    }

}
