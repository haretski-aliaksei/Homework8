package helpers;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SummaryPageHelper {
    public static final SelenideElement DASHBOARD = $x("//div[contains(@class, 'summary-dashboard__totals')]");
    public static final SelenideElement WIDGETS = $x("//div[contains(@class, 'direction')]/../..");
    public static final SelenideElement TIMELINE_CONTAINER = $x("//div[@class='bar-chart-container']");
}
