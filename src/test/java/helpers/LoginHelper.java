package helpers;

import com.codeborne.selenide.SelenideElement;
import enums.Credentials;

import static com.codeborne.selenide.Selenide.$x;

public class LoginHelper {
    public static final SelenideElement USERNAME = $x("//input[@formcontrolname='username']");
    public static final SelenideElement PASSWORD = $x("//input[@formcontrolname='password']");
    public static final SelenideElement SUBMIT = $x("//button[@type='submit']");
    public static final SelenideElement MAIN_PAGE = $x("//div[contains(@title, 'Benchmark')]/../../../../../../../..");

    public static void authentication() {
        USERNAME.sendKeys(Credentials.LOGIN.getCredential());
        PASSWORD.sendKeys(Credentials.PASSWORD.getCredential());
        SUBMIT.click();
    }
}
