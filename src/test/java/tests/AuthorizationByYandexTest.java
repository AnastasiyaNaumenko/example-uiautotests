package tests;

import org.junit.BeforeClass;
import org.junit.Test;
import steps.AuthorizationByYandexStep;

public class AuthorizationByYandexTest extends TestBase {
    protected AuthorizationByYandexStep authorizationByYandexStep = new AuthorizationByYandexStep(driver);

    @BeforeClass
    public static void beforeTest() {
    }

    @Test
    public void authorizationByYandexTest(){
        authorizationByYandexStep.authButtonClick();
        authorizationByYandexStep.acceptGoogleChromeClick();
        driver.resetApp();
        authorizationByYandexStep.authButtonClick();
        authorizationByYandexStep.loginFieldSendKeys();
        authorizationByYandexStep.authorizationButtonClick();
        authorizationByYandexStep.loginYandexCheck();
        authorizationByYandexStep.passwordFieldSendKeys();
        authorizationByYandexStep.authorizationPasswordButtonClick();
        authorizationByYandexStep.asseptYandexButtonClick();
        authorizationByYandexStep.openWithYammiClick();
        authorizationByYandexStep.justOnceButtonClick();
        authorizationByYandexStep.pinTitle1Check();
        authorizationByYandexStep.pinSendKeys();
        authorizationByYandexStep.pinTitle2Check();
        authorizationByYandexStep.pinSendKeys();
        authorizationByYandexStep.lkClick();
        authorizationByYandexStep.accountButtonClick();
        authorizationByYandexStep.emailFieldCheck();
    }
}