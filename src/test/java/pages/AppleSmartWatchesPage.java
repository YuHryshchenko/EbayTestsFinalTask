package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AppleSmartWatchesPage extends BasePage {

    @FindBy(xpath = "//div[@id='s0-29-13_2-0-1[1]-0-6-0-0[0]-multiselect[]_14']//span[@class='cbx x-refine__multi-select-cbx' and contains(.,'Apple Watch Series 5')] | //div[@id='mainContent']/descendant::p[@class='b-guidancecard__title' and contains(text(), 'Apple Watch Series 5')]")
    private WebElement chooseSeriesAppleSmartWatchesPage;

    @FindBy(xpath = "//li[@class='s-item' and position()=1]//h3[@class='s-item__title']")
    private WebElement chooseAppleProduct;

    @FindBy(xpath = "//div[@id='mainContent']")
    private WebElement appleSmartWatchesList;

    @FindBy(xpath = "//div[@id='s0-29-13_2-0-1[1]-0-6-0-0[0]-multiselect[]_14']//span[@class='cbx x-refine__multi-select-cbx' and contains(.,'Apple Watch Series 5')] | //div[@id='mainContent']/descendant::p[@class='b-guidancecard__title' and contains(text(), 'Apple Watch Series 5')]")
    private WebElement choiceSeries5AppleSmartWatchesList;

    @FindBy(xpath = "//ul[@class='b-list__items_nofooter srp-results srp-grid']")
    private WebElement openSeries5AppleSmartWatchesList;

    @FindBy(xpath = "//h3[@class='s-item__title' and contains(., '24k Gold Plated 40MM Apple Watch Series 5 ')]")
    private WebElement chooseAnotherAppleProduct;


    public AppleSmartWatchesPage(WebDriver driver) {
        super(driver);
    }

    public void clickChooseSeriesAppleSmartWatchesPage() {
        chooseSeriesAppleSmartWatchesPage.click();
    }

    public void clickChooseAppleProductPage() {
        chooseAppleProduct.click();
    }

    public WebElement openAppleSmartWatchesList() {
        return appleSmartWatchesList;
    }

    public WebElement openChoiceSeries5AppleSmartWatchesList() {
        return choiceSeries5AppleSmartWatchesList;
    }

    public WebElement openSeries5AppleSmartWatchesList() {
        return openSeries5AppleSmartWatchesList;
    }

    public void clickChooseAnotherAppleProductPage() {
        chooseAnotherAppleProduct.click();
    }

}
