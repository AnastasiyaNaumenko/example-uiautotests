package steps;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.util.function.Function;
import static java.util.concurrent.TimeUnit.SECONDS;

public class StepBase {
    private AppiumDriver driver;

    public StepBase(AppiumDriver driver)  {
        this.driver = driver;
    }


    public WebElement waitElement(By locatorName){
        Wait wait = new FluentWait(driver)
                .withTimeout(20, SECONDS)
                .pollingEvery(5, SECONDS)
                .ignoring(NoSuchElementException.class);
        return (WebElement) wait.until((Function) ExpectedConditions.elementToBeClickable(locatorName));
    }

    public WebElement swipeElementLeft(By locatorName) {
        new TouchAction(driver)
                    .press(1000, 1000)
                    .moveTo(0, 1000)
                    .release()
                    .perform();
        return waitElement(locatorName);
    }

    public WebElement swipeElementRight(By locatorName) {
            new TouchAction(driver)
                    .press(0, 600)
                    .moveTo(1000, 600)
                    .release()
                    .perform();
            return waitElement(locatorName);
    }

    public WebElement swipeDown(By locatorName) {
        (new TouchAction(driver)).press(600, 1000).moveTo(600, 0).release().perform();
        return waitElement(locatorName);
    }

    public void back() {
        driver.navigate().back();
    }
}
