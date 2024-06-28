import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MTSSiteTests {
    private static final By BLOK_TEXT = By.xpath("//section[@class = 'pay']//h2");
    private static final By ACCEPT_BUTTON = By.cssSelector("#cookie-agree");
    private static final By TELEPHONE_BUTTON = By.cssSelector("#connection-phone");
    private static final By SUMMA_BUTTON = By.cssSelector("#connection-sum");
    private static final By EMAIL_BUTTON = By.cssSelector("#connection-email");
    private static final By PAY_BUTTON = By.cssSelector("#pay-connection > button");
    private static final By IMG_VISA_FOUND = By.xpath("//div[@class='pay__partners']/ul/li/img[@alt='Visa']");
    private static final By IMG_VERIFIED_BY_VISA_FOUND = By.xpath("//div[@class='pay__partners']/ul/li/img[@alt='Verified By Visa']");
    private static final By IMG_MASTER_CARD_FOUND = By.cssSelector("#pay-section > div > div > div.col-12.col-xl-8 > section > div > div.pay__partners > ul > li:nth-child(3) > img");
    private static final By IMG_MASTER_CARD_SECURE_CODE_FOUND = By.cssSelector("#pay-section > div > div > div.col-12.col-xl-8 > section > div > div.pay__partners > ul > li:nth-child(4) > img");
    private static final By IMG_BELCARD_FOUND = By.cssSelector("#pay-section > div > div > div.col-12.col-xl-8 > section > div > div.pay__partners > ul > li:nth-child(5) > img");
    private static final By ABOUT_SERVICE_BUTTON = By.xpath("//div[@class='pay__wrapper']/a");
    private WebDriver driver;

    @Test
    void testOnlineReplenishmentBlock() {

        driver = new ChromeDriver();
        driver.get("https://mts.by"); // Открытие сайта
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(ACCEPT_BUTTON).click();
        WebElement text = driver.findElement(BLOK_TEXT);
        assertEquals("Онлайн пополнение" + "\n" + "без комиссии", text.getText());
        driver.quit();

    }
    @Test
    void testLogotipIsDisplayedVisa() {
        driver = new ChromeDriver();
        driver.get("https://mts.by"); // Открытие сайта
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(ACCEPT_BUTTON).click();
        boolean isDisplayed = driver.findElement(IMG_VISA_FOUND).isDisplayed();
        Assert.assertTrue(isDisplayed);
        driver.quit();
    }
    @Test
    void testLogotipIsDisplayedVerifiedByVisa() {
        driver = new ChromeDriver();
        driver.get("https://mts.by"); // Открытие сайта
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(ACCEPT_BUTTON).click();
        boolean isDisplayed = driver.findElement(IMG_VERIFIED_BY_VISA_FOUND).isDisplayed();
        Assert.assertTrue(isDisplayed);
        driver.quit();
    }
    @Test
    void testLogotipIsDisplayedMasterCard() {
        driver = new ChromeDriver();
        driver.get("https://mts.by"); // Открытие сайта
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(ACCEPT_BUTTON).click();
        boolean isDisplayed = driver.findElement(IMG_MASTER_CARD_FOUND).isDisplayed();
        Assert.assertTrue(isDisplayed);
        driver.quit();
    }
    @Test
    void testLogotipIsDisplayedMasterCardSecureCode() {
        driver = new ChromeDriver();
        driver.get("https://mts.by"); // Открытие сайта
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(ACCEPT_BUTTON).click();
        boolean isDisplayed = driver.findElement(IMG_MASTER_CARD_SECURE_CODE_FOUND).isDisplayed();
        Assert.assertTrue(isDisplayed);
        driver.quit();
    }
    @Test
    void testLogotipIsDisplayedBelcard() {
        driver = new ChromeDriver();
        driver.get("https://mts.by"); // Открытие сайта
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(ACCEPT_BUTTON).click();
        boolean isDisplayed = driver.findElement(IMG_BELCARD_FOUND).isDisplayed();
        Assert.assertTrue(isDisplayed);
        driver.quit();
    }

    @Test
    void testCheckAboutButton() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mts.by"); // Открытие сайта
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(ACCEPT_BUTTON).click();
        driver.findElement(ABOUT_SERVICE_BUTTON).click();
        String urlActual = driver.getCurrentUrl();
        System.out.println(urlActual);
        String urlExpected = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
        assertEquals(urlExpected, urlActual);
        driver.quit();
    }
    @Test
    void testContinueButton() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mts.by"); // Открытие сайта
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(ACCEPT_BUTTON).click();
        driver.findElement(TELEPHONE_BUTTON).clear();
        driver.findElement(TELEPHONE_BUTTON).sendKeys("297777777");
        driver.findElement(SUMMA_BUTTON).clear();
        driver.findElement(SUMMA_BUTTON).sendKeys("100");
        driver.findElement(EMAIL_BUTTON).clear();
        driver.findElement(EMAIL_BUTTON).sendKeys("email@yandex.ru");
        boolean isEnadled = driver.findElement(PAY_BUTTON).isEnabled();
        Assert.assertTrue(isEnadled);
        driver.quit();
    }

}