import com.codeborne.selenide.SelenideElement;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class AboutUsPage extends BasePage {

    @FindBy (css = "header[class='entry-header page-header']")
    private SelenideElement aboutUsArticle;

    public AboutUsPage validateAboutUsArticle() {
        Assertions.assertThat(aboutUsArticle.getText()).isEqualTo("About us");
        return this;
    }
}