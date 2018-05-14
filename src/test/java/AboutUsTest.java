import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class AboutUsTest extends BaseTest {

    @Test
    public void VerifyAboutUsPageTitle() {
        open(BASE_URL.concat("about-us/"));
        page(AboutUsPage.class)
                .validateAboutUsArticle();
    }
}