package tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static helpers.LoginHelper.*;
import static helpers.CommonHelper.*;

public class LoginTests {
    private static final String BASE_URL = "http://app.tca.deltixuat.com";

    @BeforeEach
    public void initialization() {
        setUpConfiguration();
        Selenide.open(BASE_URL);
    }

    @Test
    public void loginWithCorrectCredentials() {
        authentication();
        MAIN_PAGE.shouldBe(visible);
    }

    //here we can add in the future additional tests

    @AfterEach
    public void completion() {
        closeBrowser();
    }
}
