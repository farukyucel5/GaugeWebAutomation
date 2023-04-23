import org.assertj.core.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class N11Page {
    WebDriver driver;
    public N11Page(){
        PageFactory.initElements(DriverFactory.driver,this);
        this.driver= DriverFactory.driver;
    }

    @FindBy(id ="searchData")
    public WebElement searchBox;
    @FindBy(className = "resultText")
    public WebElement resultText;

    public void typeInTheElement(String text,String element){
        switch (element){
            case "search box"-> searchBox.sendKeys(text, Keys.ENTER);
        }
    }

    public  void verification(String element){

        switch (element){
            case "Monster notebook"-> Assertions.assertThat(resultText.getText()).
                    containsIgnoringCase(element);
        }
    }
}
