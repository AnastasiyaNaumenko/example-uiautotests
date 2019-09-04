package steps;

import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class TakeRiskProfileStep extends StepBase {
    public TakeRiskProfileStep(AppiumDriver driver) {
        super(driver);
    }


    private By createPortfolioButtonSelector = By.id("io.yammi.android:id/button_add_portfolio");
    private By retryButtonSelector = By.id("io.yammi.android:id/button_retry");
    private By closeSelector = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageButton");
    private By AresponseSelector = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]");
    private By BresponseSelector = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]");
    private By CresponseSelector = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]");
    private By DresponseSelector = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]");
    private By questionSelector = By.id("io.yammi.android:id/birthdate_label");
    private By resultTitleSelector = By.id("io.yammi.android:id/title");

    @Step
    public void createPortfolioButtonClick(){
        waitElement(createPortfolioButtonSelector).click();
        waitElement(retryButtonSelector).click();
        waitElement(closeSelector).click();
//        back();
        waitElement(createPortfolioButtonSelector).click();
        waitElement(retryButtonSelector).click();
    }

    @Step
    public void AresponseClick(){
        waitElement(AresponseSelector).click();
    }

    @Step
    public void BresponseClick() {
        waitElement(BresponseSelector).click();
    }

    @Step
    public void CresponseClick() {
        waitElement(CresponseSelector).click();
    }

    @Step
    public void DresponseClick() {
        waitElement(DresponseSelector).click();
    }

    @Step
    public void secondQuestionCheck() {
        String secondQuestionText = waitElement(questionSelector).getText().replace("\n", "");
        assertThat("Проверка второго вопроса", secondQuestionText, equalToIgnoringCase("Как характеризуют вас друзья?"));
    }

    @Step
    public void thirdQuestionCheck() {
        String thirdQuestionText = waitElement(questionSelector).getText().replace("\n", "");
        assertThat("Проверка третьего вопроса", thirdQuestionText, equalToIgnoringCase("При любых инвестициях бывают взлеты и падения стоимости активов. Что вы об этом думаете?"));
    }

    @Step
    public void fourthQuestionCheck() {
        String fourthQuestionText = waitElement(questionSelector).getText().replace("\n", "");
        assertThat("Проверка четвертого вопроса", fourthQuestionText, equalToIgnoringCase("Вы накопили на путешествие своей мечты, но за 2 недели до поездки потеряли работу. Как вы поступите?"));
    }

    @Step
    public void fifthQuestionCheck() {
        String fifthQuestionText = waitElement(questionSelector).getText().replace("\n", "");
        assertThat("Проверка пятого вопроса", fifthQuestionText, equalToIgnoringCase("Вы хотите получать высокий инвестиционный доход. Готовы ли вы принять возможные убытки?"));
    }

    @Step
    public void sixthQuestionCheck() {
        String sixQuestionText = waitElement(questionSelector).getText().replace("\n", "");
        assertThat("Проверка шестого вопроса", sixQuestionText, equalToIgnoringCase("Какую из двух альтернатив вы предпочтете?"));
    }

    @Step
    public void seventhQuestionCheck() {
        String seventhQuestionText = waitElement(questionSelector).getText().replace("\n", "");
        assertThat("Проверка седьмого вопроса", seventhQuestionText, equalToIgnoringCase("Мировой финансовый рынок имеет особенность расти и снижаться. Что вы будете делать, если стоимость вашего инвестиционного портфеля снизится на 10%?"));
    }

    @Step
    public void eighthQuestionCheck() {
        String eighthQuestionText = waitElement(questionSelector).getText().replace("\n", "");
        assertThat("Проверка восьмого вопроса", eighthQuestionText, equalToIgnoringCase("Увеличились ли ваши сбережения за последние 12 месяцев без учета крупных покупок и инвестиций?"));
    }

    @Step
    public void ninthQuestionCheck() {
        String ninthQuestionText = waitElement(questionSelector).getText().replace("\n", "");
        assertThat("Проверка девятого вопроса", ninthQuestionText, equalToIgnoringCase("Ваши сбережения превышают размер вложений, которые вы хотите инвестировать?"));
    }

    @Step
    public void tenthQuestionCheck() {
        String tenthQuestionText = waitElement(questionSelector).getText().replace("\n", "");
        assertThat("Проверка десятого вопроса", tenthQuestionText, equalToIgnoringCase("Какой у вас опыт инвестирования на фондовом рынке?"));
    }

    @Step
    public void eleventhQuestionCheck() {
        String eleventhQuestionText = waitElement(questionSelector).getText().replace("\n", "");
        assertThat("Проверка одинадцатого вопроса", eleventhQuestionText, equalToIgnoringCase("Какие ассоциации вызывает у вас слово «риск»?"));
    }

    @Step
    public void twelfthQuestionCheck() {
        String twelfthQuestionText = waitElement(questionSelector).getText().replace("\n", "");
        assertThat("Проверка двенадцатого вопроса", twelfthQuestionText, equalToIgnoringCase("У вас есть 250 000 руб. В какой вид активов вы вложите основную долю? Помните, что больший риск связан с возможностью получения большего дохода."));
    }

    @Step
    public void resultTitleCheck() {
        String resultTitleText = waitElement(resultTitleSelector).getText().replace("\n", "");
        assertThat("Проверка результата теста", resultTitleText, equalToIgnoringCase("Низкая склонность к риску"));
    }
}