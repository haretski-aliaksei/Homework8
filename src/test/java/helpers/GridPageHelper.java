package helpers;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class GridPageHelper {
    public static final SelenideElement GRID_CONTAINER = $x("//div[contains(@class, 'fullscreen')]");
    public static final SelenideElement CHART_CONTAINER = $x("//div[text()='Chart']/../../../..");
    public static final SelenideElement EXECUTIONS_CONTAINER = $x("//div[text()='Executions']/../../../..");
    public static final SelenideElement ORDER_STATS_CONTAINER = $x("//div[contains(text(), 'stats')]/../../../..");
    public static final SelenideElement ORDER_PARAM_CONTAINER = $x("//div[contains(text(), 'params')]/../../../..");
    public static final SelenideElement BACK_TO_ORDERS_BUTTON = $x("//div[contains(@title, 'Back')]/..");
    public static final SelenideElement PARAMETERS_MODAL_WINDOW = $x("//div[contains(@class, 'modal')]//div[contains(@class, 'text')]");
    public static final SelenideElement CLOSE_MODAL_WINDOW = $x("//button[@class='close']/span");
    public static final SelenideElement EXECUTION_REPORT_CONTAINER = $x("//div[contains(@class,'executions-grid')]/../..");
    public static final SelenideElement SUCCESS_MODAL_WINDOW = $x("//div[contains(@class, 'alert-success')]/..");
    public static final SelenideElement TOTAL_FIELD = $x("//div[@ref='eStatusBarLeft']//div[text()]");
}
