package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    @FindBy(xpath = "//div[@id='mainContent']")
    private WebElement openCartPage;

    @FindBy(xpath = "//div[@class='grid__cell--one-half quantity-col']//span[@aria-hidden='true' and contains(.,'Qty 1')]")
    private WebElement amountOfProductsInCart;

    @FindBy(xpath = "//div[@class='cart-bucket-lineitem-foot']//button[@data-test-id='cart-remove-item']")
    private WebElement removeProductsFromCart;

    @FindBy(xpath = "//div[@class='empty-cart']//span[contains(.,\"You don't have any items in your cart\")]")
    private WebElement findEmptyCart;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public WebElement openCartPage() {
        return openCartPage;
    }

    public String getTextOfAmountProductsInCart() {
        return amountOfProductsInCart.getText();
    }

    public void clickButtonRemoveProductsFromCart() {
        removeProductsFromCart.click();
    }

    public String findEmptyCart() {
        return findEmptyCart.getText();
    }

}
