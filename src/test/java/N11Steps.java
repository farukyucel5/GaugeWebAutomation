import com.thoughtworks.gauge.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class N11Steps extends DriverFactory {

    N11Page n11Page = new N11Page();

    @Step("go to website and verify that page is accessable")
    public void implementation() {
        assertThat("https://www.n11.com/").isEqualTo(driver.getCurrentUrl());

    }

    @Step("type <Monster notebook>in the <search box> and hit enter")
    public void implementation1(String text, String element) {
        n11Page.typeInTheElement(text, element);

    }

    @Step("verify that search results are assoiciated with <Monster notebook>")
    public void implementation2(String element) {
        n11Page.verification(element);

    }
}
