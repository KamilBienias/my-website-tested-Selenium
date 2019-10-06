package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

import static utility.Screenshot.captureScreenshot;

public class QuizResults extends BasePage{

    public QuizResults(){
        super();
    }

    @FindBy(id="1a")
    private WebElement bad1aLink;

    @FindBy(id="1b")
    private WebElement good1bLink;

    @FindBy(id="1c")
    private WebElement bad1cLink;

    @FindBy(id="2a")
    private WebElement good2aLink;

    @FindBy(id="2b")
    private WebElement bad2bLink;

    @FindBy(id="2c")
    private WebElement bad2cLink;

    @FindBy(id="3a")
    private WebElement bad3aLink;

    @FindBy(id="3b")
    private WebElement good3bLink;

    @FindBy(id="3c")
    private WebElement bad3cLink;

    @FindBy(id="4a")
    private WebElement bad4aLink;

    @FindBy(id="4b")
    private WebElement bad4bLink;

    @FindBy(id="4c")
    private WebElement good4cLink;

    @Step
    public Quiz1 openQuiz1PageAfterBadAnswer1a() {
        bad1aLink.click();
        captureScreenshot();

        return new Quiz1();//returns a new class
    }

    @Step
    public Quiz2 openQuiz2PageAfterGoodAnswer1b() {
        captureScreenshot();
        good1bLink.click();

        return new Quiz2();//returns a new class
    }

    @Step
    public Quiz1 openQuiz1PageAfterBadAnswer1c() {
        captureScreenshot();
        bad1cLink.click();

        return new Quiz1();//returns a new class
    }

    @Step
    public Quiz3 openQuiz3PageAfterGoodAnswer2a() {
        captureScreenshot();
        good2aLink.click();

        return new Quiz3();//returns a new class
    }

    @Step
    public Quiz2 openQuiz2PageAfterBadAnswer2b() {
        captureScreenshot();
        bad2bLink.click();

        return new Quiz2();//returns a new class
    }

    @Step
    public Quiz2 openQuiz2PageAfterBadAnswer2c() {
        captureScreenshot();
        bad2cLink.click();

        return new Quiz2();//returns a new class
    }

    @Step
    public Quiz3 openQuiz3PageAfterBadAnswer3a() {
        captureScreenshot();
        bad3aLink.click();

        return new Quiz3();//returns a new class
    }

    @Step
    public Quiz4 openQuiz4PageAfterGoodAnswer3b() {
        captureScreenshot();
        good3bLink.click();

        return new Quiz4();//returns a new class
    }

    @Step
    public Quiz3 openQuiz3PageAfterBadAnswer3c() {
        captureScreenshot();
        bad3cLink.click();

        return new Quiz3();//returns a new class
    }

    @Step
    public Quiz4 openQuiz4PageAfterBadAnswer4a() {
        captureScreenshot();
        bad4aLink.click();

        return new Quiz4();//returns a new class
    }

    @Step
    public Quiz4 openQuiz4PageAfterBadAnswer4b() {
        captureScreenshot();
        bad4bLink.click();

        return new Quiz4();//returns a new class
    }

    @Step
    public Quiz openQuizPageAfterGoodAnswer4c() {
        captureScreenshot();
        good4cLink.click();

        return new Quiz();//returns a new class
    }
}
