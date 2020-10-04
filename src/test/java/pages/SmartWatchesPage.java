package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SmartWatchesPage extends BasePage {

    @FindBy(xpath = "//div[@id='mainContent']")
    private WebElement smartWatchesList;

    @FindBy(xpath = "//p[@class='b-guidancecard__title' and contains(.,'Apple')]")
    private WebElement searchAppleSmartWatchesPage;

    public SmartWatchesPage(WebDriver driver) {
        super(driver);
    }

    public void openAppleSmartWatchesPage() {
        searchAppleSmartWatchesPage.click();
    }

    public WebElement openSmartWatchesList() {
        return smartWatchesList;
    }

}
