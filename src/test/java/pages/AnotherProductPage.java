package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AnotherProductPage extends BasePage {

    @FindBy(xpath = "//div[@id='mainContent']")
    private WebElement openAnotherAppleProductPage;

    @FindBy(xpath = "//div[@id='hero-item']//a[@class='btn btn--large btn--faux btn--fluid atc-link']")
    private WebElement buttonAddToCart;

    @FindBy(xpath = "//div[@id='hero-item']//a[@class='btn btn--large btn--faux btn--fluid atc-link']")
    private WebElement buttonViewToCart;

    @FindBy(xpath = "//div[@id='mainContent']//a[contains(text(), 'Place bid')]")
    private WebElement buttonPlaceBid;

    public AnotherProductPage(WebDriver driver) {
        super(driver);
    }

    public WebElement openAnotherAppleProductPage() {
        return openAnotherAppleProductPage;
    }

    public void clickButtonAddToCart() {
        buttonAddToCart.click();
    }

    public void clickButtonViewToCart() {
        buttonViewToCart.click();
    }

    public void clickButtonPlaceBid() {
        buttonPlaceBid.click();
    }
}
