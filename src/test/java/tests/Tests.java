package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Tests extends BaseTest {


    private static final String SEARCH_KEYWORD = "Computers";
    private static final String SEARCH_RESULT_LIST = "Computers&";
    private static final String SEARCH_SYMBOLS = "@@@";
    private static final String SEARCH_ALWAYS_RESULT = "all-categories";
    private static final String SEARCH_RESULT_PAGE = "Electronics";
    private static final String SEARCH_WORD = "Apple-Watches";
    private static final String COMPARE_WORDS = "Apple Watch Series 5";
    private static final String COMPARE_ITEM = "About this product";
    private static final String SEARCH_KEYWORD_URL = "signin.ebay.com";
    private static final int EXPECTED_PRODUCT_AMOUNT = 12;
    private static final String EXPECTED_AMOUNT_OF_PRODUCTS_IN_CART = "Qty 1";
    private static final String RESULT_WORDS = "You don't have any items in your cart.";


    @Test(priority = 1)
    public void searchResultsContainsSearchWord() {
        getHomePage().enterWordSearchInputField(SEARCH_KEYWORD);
        assertTrue(getDriver().getCurrentUrl().contains(SEARCH_RESULT_LIST));
    }

    @Test(priority = 2)
    public void searchResultsContainsSearchSymbols() {
        getHomePage().enterWordSearchInputField(SEARCH_SYMBOLS);
        assertTrue(getDriver().getCurrentUrl().contains(SEARCH_ALWAYS_RESULT));
    }

    @Test(priority = 3)
    public void openCategoryProductFromTopMenu() {
        getHomePage().openCategoryProductFromTopMenu();
        assertTrue(getDriver().getCurrentUrl().contains(SEARCH_RESULT_PAGE));
    }

    @Test(priority = 4)
    public void openAppleSmartWatchesFromTopMenu() {
        getHomePage().openCategoryProductFromTopMenu();
        getBasePage().implicitlyWait(30);
        getElectronicsPage().openSubCategoryProductFromTopMenu();
        getBasePage().waitForElementVisibility(60, getSubElectronicsPage().openCellPhonesSmartWatchesAccessoriesList());
        getSubElectronicsPage().openSmartWatchesCategoryProductFromElectronicsPage();
        getBasePage().waitForElementVisibility(60, getSmartWatchesPage().openSmartWatchesList());
        getSmartWatchesPage().openAppleSmartWatchesPage();
        getBasePage().waitForElementVisibility(160, getAppleSmartWatchesPage().openAppleSmartWatchesList());
        assertTrue(getDriver().getCurrentUrl().contains(SEARCH_WORD));
        for (WebElement webElement : getSearchResultsPage().getAppleSmartWatchesList()) {
            assertTrue(webElement.isEnabled());
        }
    }

    @Test(priority = 5)
    public void openSeries5AppleSmartWatchesFromTopMenu() {
        getHomePage().openCategoryProductFromTopMenu();
        getBasePage().implicitlyWait(30);
        getElectronicsPage().openSubCategoryProductFromTopMenu();
        getBasePage().waitForElementVisibility(60, getSubElectronicsPage().openCellPhonesSmartWatchesAccessoriesList());
        getSubElectronicsPage().openSmartWatchesCategoryProductFromElectronicsPage();
        getBasePage().waitForElementVisibility(60, getSmartWatchesPage().openSmartWatchesList());
        getSmartWatchesPage().openAppleSmartWatchesPage();
        getBasePage().waitForElementVisibility(160, getAppleSmartWatchesPage().openChoiceSeries5AppleSmartWatchesList());
        getAppleSmartWatchesPage().clickChooseSeriesAppleSmartWatchesPage();
        getBasePage().waitForElementVisibility(160, getAppleSmartWatchesPage().openSeries5AppleSmartWatchesList());
        for (WebElement webElement : getSearchResultsPage().getSeries5AppleSmartWatchesList()) {
            assertTrue(webElement.isDisplayed());
        }
    }

    @Test(priority = 6)
    public void checkElementsAmountOnListAppleSmartWatchesPage() {
        getHomePage().openCategoryProductFromTopMenu();
        getBasePage().implicitlyWait(30);
        getElectronicsPage().openSubCategoryProductFromTopMenu();
        getBasePage().waitForElementVisibility(60, getSubElectronicsPage().openCellPhonesSmartWatchesAccessoriesList());
        getSubElectronicsPage().openSmartWatchesCategoryProductFromElectronicsPage();
        getBasePage().waitForElementVisibility(60, getSmartWatchesPage().openSmartWatchesList());
        getSmartWatchesPage().openAppleSmartWatchesPage();
        getBasePage().waitForElementVisibility(160, getAppleSmartWatchesPage().openAppleSmartWatchesList());
        int actualElementsSize = getSearchResultsPage().getAppleSmartWatchesList().size();
        AssertJUnit.assertNotSame(actualElementsSize, EXPECTED_PRODUCT_AMOUNT);
        Assert.assertNotNull(actualElementsSize);
    }


    @Test(priority = 7)
    public void openAppleProductPage() {
        getHomePage().openCategoryProductFromTopMenu();
        getBasePage().implicitlyWait(60);
        getElectronicsPage().openSubCategoryProductFromTopMenu();
        getBasePage().waitForElementVisibility(60, getSubElectronicsPage().openCellPhonesSmartWatchesAccessoriesList());
        getSubElectronicsPage().openSmartWatchesCategoryProductFromElectronicsPage();
        getBasePage().waitForElementVisibility(60, getSmartWatchesPage().openSmartWatchesList());
        getSmartWatchesPage().openAppleSmartWatchesPage();
        getBasePage().waitForElementVisibility(160, getAppleSmartWatchesPage().openAppleSmartWatchesList());
        getAppleSmartWatchesPage().clickChooseSeriesAppleSmartWatchesPage();
        getBasePage().waitForElementVisibility(160, getAppleSmartWatchesPage().openSeries5AppleSmartWatchesList());
        getAppleSmartWatchesPage().clickChooseAppleProductPage();
        getBasePage().waitForElementVisibility(90, getProductPage().openAppleProductPage());
        assertTrue(getDriver().getPageSource().contains(COMPARE_WORDS));
    }


    @Test(priority = 8)
    public void openAppleProductPageItemSpecifics() {
        getHomePage().openCategoryProductFromTopMenu();
        getBasePage().implicitlyWait(60);
        getElectronicsPage().openSubCategoryProductFromTopMenu();
        getBasePage().waitForElementVisibility(60, getSubElectronicsPage().openCellPhonesSmartWatchesAccessoriesList());
        getSubElectronicsPage().openSmartWatchesCategoryProductFromElectronicsPage();
        getBasePage().waitForElementVisibility(60, getSmartWatchesPage().openSmartWatchesList());
        getSmartWatchesPage().openAppleSmartWatchesPage();
        getBasePage().waitForElementVisibility(160, getAppleSmartWatchesPage().openAppleSmartWatchesList());
        getAppleSmartWatchesPage().clickChooseSeriesAppleSmartWatchesPage();
        getBasePage().waitForElementVisibility(160, getAppleSmartWatchesPage().openSeries5AppleSmartWatchesList());
        getAppleSmartWatchesPage().clickChooseAppleProductPage();
        getBasePage().waitForElementVisibility(90, getProductPage().openAppleProductPage());
        assertTrue(getDriver().getPageSource().contains(COMPARE_ITEM));
    }

    @Test(priority = 9)
    public void clickPlaceBidAppleProductPage() {
        getHomePage().openCategoryProductFromTopMenu();
        getBasePage().implicitlyWait(60);
        getElectronicsPage().openSubCategoryProductFromTopMenu();
        getBasePage().waitForElementVisibility(60, getSubElectronicsPage().openCellPhonesSmartWatchesAccessoriesList());
        getSubElectronicsPage().openSmartWatchesCategoryProductFromElectronicsPage();
        getBasePage().waitForElementVisibility(60, getSmartWatchesPage().openSmartWatchesList());
        getSmartWatchesPage().openAppleSmartWatchesPage();
        getBasePage().waitForElementVisibility(160, getAppleSmartWatchesPage().openAppleSmartWatchesList());
        getAppleSmartWatchesPage().clickChooseSeriesAppleSmartWatchesPage();
        getBasePage().waitForElementVisibility(160, getAppleSmartWatchesPage().openSeries5AppleSmartWatchesList());
        getAppleSmartWatchesPage().clickChooseAnotherAppleProductPage();
        getBasePage().waitForElementVisibility(90, getAnotherProductPage().openAnotherAppleProductPage());
        getAnotherProductPage().clickButtonPlaceBid();
        getBasePage().implicitlyWait(90);
        assertTrue(getDriver().getCurrentUrl().contains(SEARCH_KEYWORD_URL));
    }

    @Test(priority = 10)
    public void clickAddToCartAppleProductPage() {
        getHomePage().openCategoryProductFromTopMenu();
        getBasePage().implicitlyWait(60);
        getElectronicsPage().openSubCategoryProductFromTopMenu();
        getBasePage().waitForElementVisibility(60, getSubElectronicsPage().openCellPhonesSmartWatchesAccessoriesList());
        getSubElectronicsPage().openSmartWatchesCategoryProductFromElectronicsPage();
        getBasePage().waitForElementVisibility(60, getSmartWatchesPage().openSmartWatchesList());
        getSmartWatchesPage().openAppleSmartWatchesPage();
        getBasePage().waitForElementVisibility(160, getAppleSmartWatchesPage().openAppleSmartWatchesList());
        getAppleSmartWatchesPage().clickChooseSeriesAppleSmartWatchesPage();
        getBasePage().waitForElementVisibility(160, getAppleSmartWatchesPage().openSeries5AppleSmartWatchesList());
        getAppleSmartWatchesPage().clickChooseAppleProductPage();
        getBasePage().waitForElementVisibility(90, getProductPage().openAppleProductPage());
        getAnotherProductPage().clickButtonAddToCart();
        getBasePage().implicitlyWait(160);
        getAnotherProductPage().clickButtonViewToCart();
        getBasePage().waitForElementVisibility(160, getCartPage().openCartPage());
        assertEquals(getCartPage().getTextOfAmountProductsInCart(), EXPECTED_AMOUNT_OF_PRODUCTS_IN_CART);
    }

    @Test(priority = 11)
    public void clickRemoveFromCartAppleProductPage() {
        getHomePage().openCategoryProductFromTopMenu();
        getBasePage().implicitlyWait(60);
        getElectronicsPage().openSubCategoryProductFromTopMenu();
        getBasePage().waitForElementVisibility(60, getSubElectronicsPage().openCellPhonesSmartWatchesAccessoriesList());
        getSubElectronicsPage().openSmartWatchesCategoryProductFromElectronicsPage();
        getBasePage().waitForElementVisibility(60, getSmartWatchesPage().openSmartWatchesList());
        getSmartWatchesPage().openAppleSmartWatchesPage();
        getBasePage().waitForElementVisibility(160, getAppleSmartWatchesPage().openAppleSmartWatchesList());
        getAppleSmartWatchesPage().clickChooseSeriesAppleSmartWatchesPage();
        getBasePage().waitForElementVisibility(160, getAppleSmartWatchesPage().openSeries5AppleSmartWatchesList());
        getAppleSmartWatchesPage().clickChooseAppleProductPage();
        getBasePage().waitForElementVisibility(90, getProductPage().openAppleProductPage());
        getAnotherProductPage().clickButtonAddToCart();
        getBasePage().implicitlyWait(160);
        getAnotherProductPage().clickButtonViewToCart();
        getBasePage().waitForElementVisibility(160, getCartPage().openCartPage());
        getCartPage().clickButtonRemoveProductsFromCart();
        getBasePage().implicitlyWait(160);
        assertEquals(getCartPage().findEmptyCart(), RESULT_WORDS);
    }



}
