package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.*;

public class BaseTest {

    WebDriver driver;
    private static final String EBAY_URL = "https://www.ebay.com/";

    @BeforeTest
    public void profileSetUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\julia\\IdeaProjects\\EbayTestsFinalTask\\src\\main\\resources\\chromedriver.exe");
    }

    @BeforeMethod
    public void testsSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(EBAY_URL);
    }
    @AfterMethod
    public void tearDown() { driver.close(); }

    public WebDriver getDriver() {
        return driver;
    }

    public BasePage getBasePage() {
        return new BasePage(getDriver());
    }

    public HomePage getHomePage() {
        return new HomePage(getDriver());
    }

    public ElectronicsPage getElectronicsPage() {
        return new ElectronicsPage(getDriver());
    }

    public SubElectronicsPage getSubElectronicsPage() {
        return new SubElectronicsPage(getDriver());
    }

    public SmartWatchesPage getSmartWatchesPage() {
        return new SmartWatchesPage(getDriver());
    }

    public SearchResultsPage getSearchResultsPage() {
        return new SearchResultsPage(getDriver());
    }

    public AppleSmartWatchesPage getAppleSmartWatchesPage() {
        return new AppleSmartWatchesPage(getDriver());
    }

    public ProductPage getProductPage() {
        return new ProductPage(getDriver());
    }

    public SigninPage getSigninPage() {
        return new SigninPage(getDriver());
    }

    public AnotherProductPage getAnotherProductPage() {
        return new AnotherProductPage(getDriver());
    }

    public CartPage getCartPage() {
        return new CartPage(getDriver());
    }

}
