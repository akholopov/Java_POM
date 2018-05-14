import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class ServicesTest extends BaseTest {

    @Test
    public void VerifyServicesPageTitle() {
        open(BASE_URL.concat("services/"));
        page(ServicesPage.class)
                .validateServicesArticle();
    }
}