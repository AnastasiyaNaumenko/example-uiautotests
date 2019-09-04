package steps;

import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class ViewOnboardingStep extends StepBase {

    public ViewOnboardingStep(AppiumDriver driver) {
        super(driver);
    }

    private By screenOneSelector = By.id("io.yammi.android:id/image");
    private By titleScreenOnboardingSelector = By.id("io.yammi.android:id/title");
    private By descriptionScreenOnboardingSelector = By.id("io.yammi.android:id/description");
    private By tab1OnboardingSelector = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/androidx.appcompat.app.ActionBar.Tab[1]");
    private By tab2OnboardingSelector = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/androidx.appcompat.app.ActionBar.Tab[2]");
    private By tab3OnboardingSelector = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/androidx.appcompat.app.ActionBar.Tab[3]");

    @Step
    public void titleFirstScreenOnboardingCheck(){
        waitElement(titleScreenOnboardingSelector).isEnabled();
        String titleScreenOnboardingText = waitElement(titleScreenOnboardingSelector).getText();
        assertThat("Проверка заголовка первого экрана onboarding", titleScreenOnboardingText, equalToIgnoringCase("Деньги всегда\nпод рукой"));
    }

    @Step
    public void descriptionFirstScreenOnboardingCheck() {
        waitElement(descriptionScreenOnboardingSelector).isEnabled();
        String descriptionScreenOnboardingText = waitElement(descriptionScreenOnboardingSelector).getText();
        assertThat("Проверка текста первого экрана onboarding", descriptionScreenOnboardingText, equalToIgnoringCase("Следите, как инвестирует ваш\nпомощник Yammi и как меняется\nбаланс портфеля"));
    }

    @Step
    public void screenOneSwipe() {
        swipeElementLeft(screenOneSelector);
    }

    @Step
    public void titleSecondScreenOnboardingCheck() {
        waitElement(titleScreenOnboardingSelector).isEnabled();
        String titleScreenOnboardingText = waitElement(titleScreenOnboardingSelector).getText();
        assertThat("Проверка заголовка второго экрана onboarding", titleScreenOnboardingText, equalToIgnoringCase("Деньги всегда\nпод рукой"));
    }

    @Step
    public void descriptionSecondScreenOnboardingCheck() {
        waitElement(descriptionScreenOnboardingSelector).isEnabled();
        String descriptionScreenOnboardingText = waitElement(descriptionScreenOnboardingSelector).getText();
        assertThat("Проверка текста второго экрана onboarding", descriptionScreenOnboardingText, equalToIgnoringCase("Кошелёк Яндекс.Денег — он даёт\nвозможность вводить и выводить деньги \nбесплатно в любой момент"));
    }

    @Step
    public void tab3OnboardingClick() {
        waitElement(tab3OnboardingSelector).click();
    }

    @Step
    public void titleThirdScreenOnboardingCheck() {
        waitElement(titleScreenOnboardingSelector).isEnabled();
        String titleScreenOnboardingText = waitElement(titleScreenOnboardingSelector).getText();
        assertThat("Проверка заголовка третьего экрана onboarding", titleScreenOnboardingText, equalToIgnoringCase("Вкладывать лучше,\nчем откладывать"));
    }

    @Step
    public void descriptionThirdScreenOnboardingCheck() {
        waitElement(descriptionScreenOnboardingSelector).isEnabled();
        String descriptionScreenOnboardingText = waitElement(descriptionScreenOnboardingSelector).getText();
        assertThat("Проверка текста третьего экрана onboarding", descriptionScreenOnboardingText, equalToIgnoringCase("Заполните небольшую анкету\nи подпишите документы для портфеля\nв онлайне"));
    }
}
