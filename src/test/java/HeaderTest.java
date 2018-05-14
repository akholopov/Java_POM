import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class HeaderTest extends BaseTest {

    @Test
    public void NavigateToAboutUsPage() {
        page(BasePage.class)
                .goToAboutUsPage()
                .valideIfOpened("http://demoqa.com/about-us/");
        page(AboutUsPage.class)
                .validateAboutUsArticle();
    }

    @Test(enabled = false)
    public void NavigateToServicesPage() {
        page(BasePage.class)
                .goToServicesPage()
                .valideIfOpened("http://demoqa.com/services/");
    }

    @Test
    public void NavigateToBlogPage() {
        page(BasePage.class)
                .goToBlogPage()
                .valideIfOpened("http://demoqa.com/blog/");
    }

    @Test
    public void NavigateToContactPage() {
        page(BasePage.class)
                .goToContactPage()
                .valideIfOpened("http://demoqa.com/contact/");
    }
}