package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends BasePage {

    @FindBy(xpath = "//h3[@class='s-item__title']")
    private List<WebElement> AppleSmartWatchesList;

    @FindBy(xpath = "//h3[@class='s-item__title']")
    private List<WebElement> Series5AppleSmartWatchesList;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getAppleSmartWatchesList() {
        return AppleSmartWatchesList;
    }

    public List<WebElement> getSeries5AppleSmartWatchesList() {
        return Series5AppleSmartWatchesList;
    }

}