import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    public static final String BASE_URL = "http://demoqa.com/";
    @BeforeTest
    public void openPage() {
        Configuration.browser = "chrome";
        open(BASE_URL);
    }
}
