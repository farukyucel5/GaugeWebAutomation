import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverFactory {
    public static WebDriver driver;

    @BeforeScenario
    public void setUp(){
        driver=new ChromeDriver();
        driver.get("https://www.n11.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterScenario
    public void tearDown(){
        driver.quit();
    }
}
