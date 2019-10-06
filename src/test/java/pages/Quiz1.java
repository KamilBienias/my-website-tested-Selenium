package pages;

import config.WebDriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

import static utility.Screenshot.captureScreenshot;

public class Quiz1 extends BasePage {

    public Quiz1(){
        super();
    }

    @FindBy(id="a")
    private WebElement aRadio;

    @FindBy(id="b")
    private WebElement bRadio;

    @FindBy(id="c")
    private WebElement cRadio;

    @FindBy(id="submit-answer")
    private WebElement submitAnswerButton;

    @Step
    public QuizResults openQuizResultsPageWithBadAnswer1a() {
        captureScreenshot();
        JavascriptExecutor js = (JavascriptExecutor) WebDriverSingleton.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", aRadio);//scrolls to visible aRadio
        aRadio.click();
        captureScreenshot();
        submitAnswerButton.click();

        return new QuizResults();//returns a new class
    }

    @Step
    public QuizResults openQuizResultsPageWithGoodAnswer1b() {
        captureScreenshot();
        JavascriptExecutor js = (JavascriptExecutor) WebDriverSingleton.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", bRadio);//scrolls to visible bRadio
        bRadio.click();
        captureScreenshot();
        submitAnswerButton.click();

        return new QuizResults();//returns a new class
    }

    @Step
    public QuizResults openQuizResultsPageWithBadAnswer1c() {
        captureScreenshot();
        JavascriptExecutor js = (JavascriptExecutor) WebDriverSingleton.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", cRadio);//scrolls to visible cRadio
        cRadio.click();
        captureScreenshot();
        submitAnswerButton.click();

        return new QuizResults();//returns a new class
    }

}
