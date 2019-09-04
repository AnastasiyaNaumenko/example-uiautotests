package tests;

import org.junit.BeforeClass;
import steps.AuthorizationByYandexStep;
import steps.PortfolioFormationStep;
import steps.ViewOnboardingStep;

public class PortfolioFormationTest extends TestBase {
    protected ViewOnboardingStep viewOnboardingStep = new ViewOnboardingStep(driver);
    protected AuthorizationByYandexStep authorizationByYandexStep = new AuthorizationByYandexStep(driver);
    protected PortfolioFormationStep portfolioFormationStep = new PortfolioFormationStep(driver);

    @BeforeClass
    public static void beforeTest() {
    }
}
