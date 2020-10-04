package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//div[@id='gh-ac-box2']//input[@type='text']")
    private WebElement searchInputField;

    @FindBy(xpath = "//li[@class='hl-cat-nav__js-tab']//a[@href='https://www.ebay.com/b/Electronics/bn_7000259124']")
    private WebElement searchCategoryProductFromTopMenu;

    public HomePage(WebDriver driver) {
        super(driver);
    }


    public void enterWordSearchInputField(String keyword) {
        searchInputField.sendKeys(keyword, Keys.ENTER);
    }

    public void openCategoryProductFromTopMenu() {
        searchCategoryProductFromTopMenu.click();
    }

}
