package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubElectronicsPage extends BasePage {

    @FindBy(xpath = "//p[@class='b-guidancecard__title' and contains(.,'Smart Watches')]")
    private WebElement searchSmartWatchesCategoryProductFromElectronicsPage;

    @FindBy(xpath = "//div[@id='mainContent']")
    private WebElement cellPhonesSmartWatchesAccessoriesList;

    public SubElectronicsPage(WebDriver driver) {
        super(driver);
    }

    public void openSmartWatchesCategoryProductFromElectronicsPage() {
        searchSmartWatchesCategoryProductFromElectronicsPage.click();
    }

    public WebElement openCellPhonesSmartWatchesAccessoriesList() {
        return cellPhonesSmartWatchesAccessoriesList;
    }


}
