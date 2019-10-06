package pages;

import config.WebDriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

import static utility.Screenshot.captureScreenshot;

public class Home extends BasePage {

    public Home() {
        super();
    }

    @FindBy(id="java-projects")
    private WebElement javaProjectsLink;

    @FindBy(id="quiz")
    private WebElement quizLink;

    @Step
    public JavaProjects openJavaProjectsPage() {
        captureScreenshot();
        JavascriptExecutor js = (JavascriptExecutor) WebDriverSingleton.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", javaProjectsLink);//scrolls to visible javaProjectsLink
        javaProjectsLink.click();

        return new JavaProjects();//returns a new class
    }

    @Step
    public Quiz openQuizPage() {
        captureScreenshot();
        JavascriptExecutor js = (JavascriptExecutor) WebDriverSingleton.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", quizLink);//scrolls to visible quizLink
        quizLink.click();

        return new Quiz();//returns a new class
    }
}
