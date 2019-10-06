package pages;

import config.WebDriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

import static utility.Screenshot.captureScreenshot;

public class Quiz extends BasePage {

    public Quiz(){
        super();
    }

    @FindBy(id="quiz1")
    private WebElement quiz1Link;

    @FindBy(id="java-projects")
    private WebElement javaProjectsLink;

    @Step
    public Quiz1 openQuiz1Page() {
        captureScreenshot();
        JavascriptExecutor js = (JavascriptExecutor) WebDriverSingleton.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", quiz1Link);//scrolls to visible quiz1Link
        quiz1Link.click();


        return new Quiz1();//returns a new class
    }

    @Step
    public JavaProjects openJavaProjectsPage() {
        captureScreenshot();
        JavascriptExecutor js = (JavascriptExecutor) WebDriverSingleton.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", javaProjectsLink);//scrolls to visible javaProjectsLink
        javaProjectsLink.click();


        return new JavaProjects();//returns a new class
    }
}
