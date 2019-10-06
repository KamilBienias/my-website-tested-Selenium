package pages;

import config.WebDriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

import static utility.Screenshot.captureScreenshot;

public class Quiz3 extends BasePage{

    public Quiz3(){
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
    public QuizResults openQuizResultsPageWithBadAnswer3a() {
        captureScreenshot();
        JavascriptExecutor js = (JavascriptExecutor) WebDriverSingleton.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", aRadio);//scrolls to visible aRadio
        aRadio.click();
        captureScreenshot();
        submitAnswerButton.click();

        return new QuizResults();//returns a new class
    }

    @Step
    public QuizResults openQuizResultsPageWithGoodAnswer3b() {
        captureScreenshot();
        JavascriptExecutor js = (JavascriptExecutor) WebDriverSingleton.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", bRadio);//scrolls to visible bRadio
        bRadio.click();
        captureScreenshot();
        submitAnswerButton.click();

        return new QuizResults();//returns a new class
    }

    @Step
    public QuizResults openQuizResultsPageWithBadAnswer3c() {
        captureScreenshot();
        JavascriptExecutor js = (JavascriptExecutor) WebDriverSingleton.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", cRadio);//scrolls to visible cRadio
        cRadio.click();
        captureScreenshot();
        submitAnswerButton.click();

        return new QuizResults();//returns a new class
    }
}
