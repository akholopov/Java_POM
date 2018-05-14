import com.codeborne.selenide.SelenideElement;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.WebDriverRunner.url;

public class BasePage {

    @FindBy (css = "a[title='About us']")
    private SelenideElement aboutUsButton;

    @FindBy (css = "a[title='Services']")
    private SelenideElement servicesButton;

    @FindBy (css = "a[title='Blog']")
    private SelenideElement blogButton;

    @FindBy (css = "a[title='Contact']")
    private SelenideElement contactButton;

    @FindBy (css = "a[data-ga-click='Header, click, Nav menu - item:pricing']")
    private SelenideElement pricingButton;


    public AboutUsPage goToAboutUsPage() {
        aboutUsButton.click();
        return page(AboutUsPage.class);
    }

    public ServicesPage goToServicesPage() {
        servicesButton.click();;
        return page(ServicesPage.class);
    }

    public BlogPage goToBlogPage() {
        blogButton.click();
        return page(BlogPage.class);
    }

    public ContactPage goToContactPage() {
        contactButton.click();
        return page(ContactPage.class);
    }

    public PricingPage goToPricingPage() {
        pricingButton.click();
        return  page(PricingPage.class);
    }

    public BasePage valideIfOpened (String pageCodename) {
        Assertions.assertThat(url()).as("You're on the wrong page.").isEqualTo(pageCodename);
        return this;
    }
}
