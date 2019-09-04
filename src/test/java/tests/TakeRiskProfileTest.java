package tests;

import org.junit.BeforeClass;
import org.junit.Test;
import steps.AuthorizationByYandexStep;
import steps.TakeRiskProfileStep;
import steps.ViewOnboardingStep;

public class TakeRiskProfileTest extends TestBase{

    protected ViewOnboardingStep viewOnboardingStep = new ViewOnboardingStep(driver);
    protected AuthorizationByYandexStep authorizationByYandexStep = new AuthorizationByYandexStep(driver);
    protected TakeRiskProfileStep takeRiskProfileStep = new TakeRiskProfileStep(driver);

    @BeforeClass
    public static void beforeTest() {
    }

    @Test
    public void takeRiskProfileTest() {
        authorizationByYandexStep.authButtonClick();
//        authorizationByYandexStep.acceptGoogleChromeClick(); //Для первого запуска
//        driver.resetApp();

//        Для первого запуска
//        authorizationByYandexStep.authButtonClick();
//        authorizationByYandexStep.loginFieldSendKeys();
//        authorizationByYandexStep.authorizationButtonClick();
//        authorizationByYandexStep.passwordFieldSendKeys();
//        authorizationByYandexStep.authorizationPasswordButtonClick();

        authorizationByYandexStep.asseptYandexButtonClick();
//        authorizationByYandexStep.openWithYammiClick(); //Для первого запуска
        authorizationByYandexStep.justOnceButtonClick();
        authorizationByYandexStep.pinSendKeys();
        authorizationByYandexStep.pinSendKeys();

        takeRiskProfileStep.createPortfolioButtonClick();
        takeRiskProfileStep.secondQuestionCheck();
        takeRiskProfileStep.AresponseClick();
        takeRiskProfileStep.thirdQuestionCheck();
        takeRiskProfileStep.AresponseClick();
        takeRiskProfileStep.fourthQuestionCheck();
        takeRiskProfileStep.AresponseClick();
        takeRiskProfileStep.fifthQuestionCheck();
        takeRiskProfileStep.AresponseClick();
        takeRiskProfileStep.sixthQuestionCheck();
        takeRiskProfileStep.AresponseClick();
        takeRiskProfileStep.seventhQuestionCheck();
        takeRiskProfileStep.AresponseClick();
        takeRiskProfileStep.eighthQuestionCheck();
        takeRiskProfileStep.AresponseClick();
        takeRiskProfileStep.ninthQuestionCheck();
        takeRiskProfileStep.AresponseClick();
        takeRiskProfileStep.tenthQuestionCheck();
        takeRiskProfileStep.AresponseClick();
        takeRiskProfileStep.eleventhQuestionCheck();
        takeRiskProfileStep.AresponseClick();
        takeRiskProfileStep.twelfthQuestionCheck();
        takeRiskProfileStep.AresponseClick();
    }

}
