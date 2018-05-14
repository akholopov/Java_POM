import com.codeborne.selenide.SelenideElement;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class ServicesPage extends BasePage {

    @FindBy (css = "header[class='entry-header page-header']")
    private SelenideElement servicesArticle;

    public ServicesPage validateServicesArticle() {
        Assertions.assertThat(servicesArticle.getText()).isEqualTo("Services");
        return this;
    }
}