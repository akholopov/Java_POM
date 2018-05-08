import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class HeaderTest extends BaseTest {

    @Test
    public void NavigateToFeaturesPage() {
        page(BasePage.class)
                .goToFeaturePage()
                .valideIfOpened("https://github.com/features");
    }

    @Test
    public void NavigateToBusinessPage() {
        page(BasePage.class)
                .goToBusinessPage()
                .valideIfOpened("https://github.com/business");
    }

    @Test
    public void NavigateToExplorePage() {
        page(BasePage.class)
                .goToExplorePage()
                .valideIfOpened("https://github.com/explore");
    }

    @Test
    public void NavigateToMarketplacePage() {
        page(BasePage.class)
                .goToMarketplacePage()
                .valideIfOpened("https://github.com/marketplace");
    }

    @Test
    public void NavigatePricingPage() {
        page(BasePage.class)
                .goToPricingPage()
                .valideIfOpened("https://github.com/pricing");

    }
}