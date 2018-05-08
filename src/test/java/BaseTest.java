import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    @BeforeTest
    public void openPage() {
        Configuration.browser = "chrome";
        open("https://github.com/");
    }
}
