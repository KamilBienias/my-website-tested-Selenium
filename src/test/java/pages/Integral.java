package pages;

import config.WebDriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static utility.Screenshot.captureScreenshot;

public class Integral extends BasePage {

    public Integral(){
        super();
    }

    @FindBy(id="lewy koniec")
    private WebElement leftEndInput;

    @FindBy(id="prawy koniec")
    private WebElement rightEndInput;

    @FindBy(id="podział odcinka")
    private WebElement divisionOfRangeInput;

    @FindBy(id="stopień wielomianu")
    private WebElement degreeInput;

    @FindBy(id="zatwierdź stopień")
    private WebElement degreeConfirmButton;

    @FindBy(id="a6")
    private WebElement a6Input;

    @FindBy(id="a5")
    private WebElement a5Input;

    @FindBy(id="a4")
    private WebElement a4Input;

    @FindBy(id="a3")
    private WebElement a3Input;

    @FindBy(id="a2")
    private WebElement a2Input;

    @FindBy(id="a1")
    private WebElement a1Input;

    @FindBy(id="a0")
    private WebElement a0Input;

    @FindBy(id="oblicz")
    private WebElement computeButton;

    @FindBy(id="new-calculation")
    private WebElement newCalculationLink;

    @Step
    public void fillIntegralData(){

        Random random = new Random();

        int BOUND_OF_RANGE = 100;

        byte MAX_DEGREE = 6;

        int MIN_COEFFICIENT = -100;

        int MAX_COEFFICIENT = 100;

        int AMOUNT_OF_INTEGRALS = 10;

        for(int i = 1; i <= AMOUNT_OF_INTEGRALS; i++) {

            JavascriptExecutor js = (JavascriptExecutor) WebDriverSingleton.getDriver();
            js.executeScript("arguments[0].scrollIntoView();", leftEndInput);//scrolls to visible leftEndInput

            leftEndInput.sendKeys(String.valueOf(random.nextInt(BOUND_OF_RANGE + 1)*(-1)));//integer from -BOUND_OF_RANGE to 0

            rightEndInput.sendKeys(String.valueOf(random.nextInt(BOUND_OF_RANGE + 1)));//integer from 0 to BOUND_OF_RANGE

            divisionOfRangeInput.sendKeys("100000");

            int degreeInteger = random.nextInt(MAX_DEGREE + 1);

            String degreeString = String.valueOf(degreeInteger);

            degreeInput.sendKeys(degreeString);

            degreeConfirmButton.click();

            List<WebElement> listOfInputs = new ArrayList<WebElement>();

            listOfInputs.add(a0Input);
            listOfInputs.add(a1Input);
            listOfInputs.add(a2Input);
            listOfInputs.add(a3Input);
            listOfInputs.add(a4Input);
            listOfInputs.add(a5Input);
            listOfInputs.add(a6Input);

            for(int j = 0; j <= degreeInteger; j++){
                listOfInputs.get(j).sendKeys(String.valueOf(Math.round(100.0 * (MIN_COEFFICIENT + (MAX_COEFFICIENT - MIN_COEFFICIENT) * random.nextDouble()))/100.0));
            }

            computeButton.click();

            captureScreenshot();

            newCalculationLink.click();
        }
    }
}