package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

    @FindBy(xpath = "//div[@id='mainContent']")
    private WebElement openAppleProductPage;



    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public WebElement openAppleProductPage() {
        return openAppleProductPage;
    }



}
