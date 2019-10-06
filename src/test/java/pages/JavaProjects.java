package pages;

import config.WebDriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

import static utility.Screenshot.captureScreenshot;

public class JavaProjects extends BasePage{

    public JavaProjects(){
        super();
    }

    @FindBy(id="integral")
    private WebElement integralLink;

    @Step
    public Integral openIntegralPage() {
        captureScreenshot();
        JavascriptExecutor js = (JavascriptExecutor) WebDriverSingleton.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", integralLink);//scrolls to visible quiz1Link
        integralLink.click();

        return new Integral();//returns a new class
    }
}
