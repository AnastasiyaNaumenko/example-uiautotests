package steps;

import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class AuthorizationByYandexStep extends StepBase {
    public AuthorizationByYandexStep(AppiumDriver driver) {
        super(driver);
    }

    private By authButtonSelector = By.id("io.yammi.android:id/auth_button");
    private By aссeptGoogleChromeSelector = By.id("com.android.chrome:id/terms_accept");
    private By nextButtonGoogleChromeSelector = By.id("com.android.chrome:id/next_button");
    private By nothanksButtonGoogleChoromeSelector = By.id("com.android.chrome:id/negative_button");
    private By loginFieldTabSelector = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[1]");
    private By loginFieldSelector = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.widget.EditText");
    private By authorizationLoginButtonSelector = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.ToggleButton[1]");
    private By loginYandexSelector = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]");
    private By passwordFieldTabSelector = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[1]");
    private By passwordFieldSelector = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.widget.EditText");
    private By authorizationPasswordButtonSelector = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.widget.ToggleButton[1]");
    private By assertYandexButtonSelector = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[13]/android.view.View[8]/android.view.View/android.widget.Button");
    private By openWithYammiSelector = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.ListView/android.widget.LinearLayout[1]");
    private By justOnceButtonSelector = By.id("android:id/button_once");
    private By pinTitleSelector = By.id("io.yammi.android:id/pin_title");
    private By zeroButtonSelector = By.id("io.yammi.android:id/button_11");
    private By lkSelector = By.id("io.yammi.android:id/avatar");
    private By accountButtonSelector = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup");
    private By emailFieldSelector = By.id("io.yammi.android:id/email_edit_text");
    private int x;

    @Step
    public void authButtonClick() {
        waitElement(authButtonSelector).click();
    }

    @Step
    public void acceptGoogleChromeClick() {
        waitElement(aссeptGoogleChromeSelector).click();
        waitElement(nextButtonGoogleChromeSelector).click();
        waitElement(nothanksButtonGoogleChoromeSelector).click();
    }

    @Step
    public void loginFieldSendKeys() {
        waitElement(loginFieldTabSelector).click();
        waitElement(loginFieldSelector).sendKeys("test48a.qa");
    }

    @Step
    public void authorizationButtonClick() {
        waitElement(authorizationLoginButtonSelector).click();
    }

    @Step
    public void loginYandexCheck() {
        String loginYandexText = waitElement(loginYandexSelector).getText();
        assertThat("Проверка логина", loginYandexText,equalToIgnoringCase("test48a.qa"));
    }

    @Step
    public void passwordFieldSendKeys() {
        waitElement(passwordFieldTabSelector).click();
        waitElement(passwordFieldSelector).sendKeys("qwerty1234");
    }

    @Step
    public void authorizationPasswordButtonClick() {
        waitElement(authorizationPasswordButtonSelector).click();
    }

    @Step
    public void asseptYandexButtonClick() {
        waitElement(assertYandexButtonSelector).click();
    }

    @Step
    public void openWithYammiClick() {
        waitElement(openWithYammiSelector).click();
    }

    @Step
    public void justOnceButtonClick() {
        waitElement(justOnceButtonSelector).click();
    }

    @Step
    public void pinTitle1Check() {
        String pinTitleText = waitElement(pinTitleSelector).getText();
        assertThat("Проверка заголовка экрана", pinTitleText, equalToIgnoringCase("Осталось\nпридумать код"));
    }

    @Step
    public void pinTitle2Check() {
        String pinTitleText = waitElement(pinTitleSelector).getText();
        assertThat("", pinTitleText, equalToIgnoringCase("Повторите\nпридуманный код"));
    }

    @Step
    public void pinSendKeys() {
        waitElement(zeroButtonSelector).click();
        waitElement(zeroButtonSelector).click();
        waitElement(zeroButtonSelector).click();
        waitElement(zeroButtonSelector).click();
//        for (x = 0; x == 8; x++)
//        {
//            waitElement(zeroButtonSelector).click();
//        }
    }

    @Step
    public void lkClick() {
        waitElement(lkSelector).click();
    }

    @Step
    public void accountButtonClick() {
        waitElement(accountButtonSelector).click();
    }

    @Step
    public void emailFieldCheck() {
        String emailFieldText = waitElement(emailFieldSelector).getText();
        assertThat("Проверка e-mail", emailFieldText, equalToIgnoringCase("test6a.qa@yandex.ru"));
    }
}
