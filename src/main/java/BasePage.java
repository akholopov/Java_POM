import com.codeborne.selenide.SelenideElement;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.WebDriverRunner.url;

public class BasePage {

    @FindBy (css = "a[data-ga-click='Header, click, Nav menu - item:features']")
    private SelenideElement featureButton;

    @FindBy (css = "a[data-ga-click='Header, click, Nav menu - item:business']")
    private SelenideElement businessButton;

    @FindBy (css = "a[data-ga-click='Header, click, Nav menu - item:explore']")
    private SelenideElement exploreButton;

    @FindBy (css = "a[data-ga-click='Header, click, Nav menu - item:marketplace']")
    private SelenideElement marketplaceButton;

    @FindBy (css = "a[data-ga-click='Header, click, Nav menu - item:pricing']")
    private SelenideElement pricingButton;


    public FeaturesPage goToFeaturePage() {
        featureButton.click();
        return page(FeaturesPage.class);
    }

    public BusinessPage goToBusinessPage() {
        businessButton.click();;
        return page(BusinessPage.class);
    }

    public ExplorePage goToExplorePage() {
        exploreButton.click();
        return page(ExplorePage.class);
    }

    public MarketplacePage goToMarketplacePage() {
        marketplaceButton.click();
        return page(MarketplacePage.class);
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
