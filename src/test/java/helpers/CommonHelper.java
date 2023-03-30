package helpers;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.chrome.ChromeOptions;

public class CommonHelper {
    public static final int IMPLICIT_WAIT = 60_000;

    public static void setUpConfiguration() {
        Configuration.browserCapabilities = new ChromeOptions().addArguments("--remote-allow-origins=*");
        Configuration.timeout = IMPLICIT_WAIT;
    }

    public static void closeBrowser() {
        WebDriverRunner.getWebDriver().quit();
        Selenide.closeWebDriver();
    }
}
