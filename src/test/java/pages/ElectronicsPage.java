package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElectronicsPage extends BasePage {

    @FindBy(xpath = "//div[@class='b-visualnav__title' and contains(.,'Cell Phones, Smart Watches & Accessories')]")
    private WebElement searchSubCategoryProductFromTopMenu;


    public ElectronicsPage(WebDriver driver) {
        super(driver);
    }

    public void openSubCategoryProductFromTopMenu() {
        searchSubCategoryProductFromTopMenu.click();
    }

}
